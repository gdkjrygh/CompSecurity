// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.text.ClipboardManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.client.android.camera.CameraManager;
import com.google.zxing.client.android.history.HistoryActivity;
import com.google.zxing.client.android.history.HistoryItem;
import com.google.zxing.client.android.history.HistoryManager;
import com.google.zxing.client.android.result.ResultButtonListener;
import com.google.zxing.client.android.result.ResultHandler;
import com.google.zxing.client.android.result.ResultHandlerFactory;
import com.google.zxing.client.android.result.supplement.SupplementalInfoRetriever;
import com.google.zxing.client.android.share.ShareActivity;
import com.google.zxing.client.result.ParsedResultType;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.zxing.client.android:
//            IntentSource, CaptureActivityHandler, FinishListener, ViewfinderView, 
//            ScanFromWebPageManager, InactivityTimer, BeepManager, AmbientLightManager, 
//            PreferencesActivity, HelpActivity, DecodeFormatManager, DecodeHintManager

public class CaptureActivity extends Activity
    implements android.view.SurfaceHolder.Callback
{

    private static int $SWITCH_TABLE$com$google$zxing$client$android$IntentSource[];
    private static final long BULK_MODE_SCAN_DELAY_MS = 1000L;
    private static final long DEFAULT_INTENT_RESULT_DURATION_MS = 1500L;
    private static final Set DISPLAYABLE_METADATA_TYPES;
    public static final int HISTORY_REQUEST_CODE = 47820;
    private static final String PACKAGE_NAME = "com.google.zxing.client.android";
    private static final String PRODUCT_SEARCH_URL_PREFIX = "http://www.google";
    private static final String PRODUCT_SEARCH_URL_SUFFIX = "/m/products/scan";
    private static final String TAG = com/google/zxing/client/android/CaptureActivity.getSimpleName();
    private static final String ZXING_URLS[] = {
        "http://zxing.appspot.com/scan", "zxing://scan/"
    };
    private AmbientLightManager ambientLightManager;
    private BeepManager beepManager;
    private CameraManager cameraManager;
    private String characterSet;
    private boolean copyToClipboard;
    private Collection decodeFormats;
    private Map decodeHints;
    private CaptureActivityHandler handler;
    private boolean hasSurface;
    private HistoryManager historyManager;
    private InactivityTimer inactivityTimer;
    private Result lastResult;
    private View resultView;
    private Result savedResultToShow;
    private ScanFromWebPageManager scanFromWebPageManager;
    private IntentSource source;
    private String sourceUrl;
    private TextView statusView;
    private ViewfinderView viewfinderView;

    static int[] $SWITCH_TABLE$com$google$zxing$client$android$IntentSource()
    {
        int ai[] = $SWITCH_TABLE$com$google$zxing$client$android$IntentSource;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[IntentSource.values().length];
        try
        {
            ai[IntentSource.NATIVE_APP_INTENT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[IntentSource.NONE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[IntentSource.PRODUCT_SEARCH_LINK.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[IntentSource.ZXING_LINK.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$google$zxing$client$android$IntentSource = ai;
        return ai;
    }

    public CaptureActivity()
    {
    }

    private void decodeOrStoreSavedBitmap(Bitmap bitmap, Result result)
    {
        if (handler == null)
        {
            savedResultToShow = result;
            return;
        }
        if (result != null)
        {
            savedResultToShow = result;
        }
        if (savedResultToShow != null)
        {
            bitmap = Message.obtain(handler, R.id.decode_succeeded, savedResultToShow);
            handler.sendMessage(bitmap);
        }
        savedResultToShow = null;
    }

    private void displayFrameworkBugMessageAndExit()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle(getString(R.string.app_name));
        builder.setMessage(getString(R.string.msg_camera_framework_bug));
        builder.setPositiveButton(R.string.button_ok, new FinishListener(this));
        builder.setOnCancelListener(new FinishListener(this));
        builder.show();
    }

    private static void drawLine(Canvas canvas, Paint paint, ResultPoint resultpoint, ResultPoint resultpoint1, float f)
    {
        if (resultpoint != null && resultpoint1 != null)
        {
            canvas.drawLine(f * resultpoint.getX(), f * resultpoint.getY(), f * resultpoint1.getX(), f * resultpoint1.getY(), paint);
        }
    }

    private void drawResultPoints(Bitmap bitmap, float f, Result result)
    {
        int i = 0;
        ResultPoint aresultpoint[] = result.getResultPoints();
        if (aresultpoint != null && aresultpoint.length > 0)
        {
            bitmap = new Canvas(bitmap);
            Paint paint = new Paint();
            paint.setColor(getResources().getColor(R.color.result_points));
            if (aresultpoint.length == 2)
            {
                paint.setStrokeWidth(4F);
                drawLine(bitmap, paint, aresultpoint[0], aresultpoint[1], f);
            } else
            {
                if (aresultpoint.length == 4 && (result.getBarcodeFormat() == BarcodeFormat.UPC_A || result.getBarcodeFormat() == BarcodeFormat.EAN_13))
                {
                    drawLine(bitmap, paint, aresultpoint[0], aresultpoint[1], f);
                    drawLine(bitmap, paint, aresultpoint[2], aresultpoint[3], f);
                    return;
                }
                paint.setStrokeWidth(10F);
                int j = aresultpoint.length;
                while (i < j) 
                {
                    result = aresultpoint[i];
                    bitmap.drawPoint(result.getX() * f, result.getY() * f, paint);
                    i++;
                }
            }
        }
    }

    private void handleDecodeExternally(Result result, ResultHandler resulthandler, Bitmap bitmap)
    {
        int i;
        long l;
        if (bitmap != null)
        {
            viewfinderView.drawResultBitmap(bitmap);
        }
        if (getIntent() == null)
        {
            l = 1500L;
        } else
        {
            l = getIntent().getLongExtra("RESULT_DISPLAY_DURATION_MS", 1500L);
        }
        if (l > 0L)
        {
            String s = String.valueOf(result);
            bitmap = s;
            if (s.length() > 32)
            {
                bitmap = (new StringBuilder(String.valueOf(s.substring(0, 32)))).append(" ...").toString();
            }
            statusView.setText((new StringBuilder(String.valueOf(getString(resulthandler.getDisplayTitle())))).append(" : ").append(bitmap).toString());
        }
        if (copyToClipboard && !resulthandler.areContentsSecure())
        {
            bitmap = (ClipboardManager)getSystemService("clipboard");
            CharSequence charsequence = resulthandler.getDisplayContents();
            if (charsequence != null)
            {
                try
                {
                    bitmap.setText(charsequence);
                }
                // Misplaced declaration of an exception variable
                catch (Bitmap bitmap)
                {
                    Log.w(TAG, "Clipboard bug", bitmap);
                }
            }
        }
        if (source != IntentSource.NATIVE_APP_INTENT) goto _L2; else goto _L1
_L1:
        resulthandler = new Intent(getIntent().getAction());
        resulthandler.addFlags(0x80000);
        resulthandler.putExtra("SCAN_RESULT", result.toString());
        resulthandler.putExtra("SCAN_RESULT_FORMAT", result.getBarcodeFormat().toString());
        bitmap = result.getRawBytes();
        if (bitmap != null && bitmap.length > 0)
        {
            resulthandler.putExtra("SCAN_RESULT_BYTES", bitmap);
        }
        result = result.getResultMetadata();
        if (result == null) goto _L4; else goto _L3
_L3:
        if (result.containsKey(ResultMetadataType.UPC_EAN_EXTENSION))
        {
            resulthandler.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", result.get(ResultMetadataType.UPC_EAN_EXTENSION).toString());
        }
        bitmap = (Integer)result.get(ResultMetadataType.ORIENTATION);
        if (bitmap != null)
        {
            resulthandler.putExtra("SCAN_RESULT_ORIENTATION", bitmap.intValue());
        }
        bitmap = (String)result.get(ResultMetadataType.ERROR_CORRECTION_LEVEL);
        if (bitmap != null)
        {
            resulthandler.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", bitmap);
        }
        result = (Iterable)result.get(ResultMetadataType.BYTE_SEGMENTS);
        if (result == null) goto _L4; else goto _L5
_L5:
        i = 0;
        result = result.iterator();
_L10:
        if (result.hasNext()) goto _L6; else goto _L4
_L4:
        sendReplyMessage(R.id.return_scan_result, resulthandler, l);
_L8:
        return;
_L6:
        bitmap = (byte[])result.next();
        resulthandler.putExtra((new StringBuilder("SCAN_RESULT_BYTE_SEGMENTS_")).append(i).toString(), bitmap);
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (source == IntentSource.PRODUCT_SEARCH_LINK)
        {
            int j = sourceUrl.lastIndexOf("/scan");
            result = (new StringBuilder(String.valueOf(sourceUrl.substring(0, j)))).append("?q=").append(resulthandler.getDisplayContents()).append("&source=zxing").toString();
            sendReplyMessage(R.id.launch_product_query, result, l);
            return;
        }
        if (source != IntentSource.ZXING_LINK || scanFromWebPageManager == null || !scanFromWebPageManager.isScanFromWebPage()) goto _L8; else goto _L7
_L7:
        result = scanFromWebPageManager.buildReplyURL(result, resulthandler);
        sendReplyMessage(R.id.launch_product_query, result, l);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void handleDecodeInternally(Result result, ResultHandler resulthandler, Bitmap bitmap)
    {
        Object obj1;
        int i;
        int j;
        statusView.setVisibility(8);
        viewfinderView.setVisibility(8);
        resultView.setVisibility(0);
        Object obj = (ImageView)findViewById(R.id.barcode_image_view);
        if (bitmap == null)
        {
            ((ImageView) (obj)).setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.launcher_icon));
        } else
        {
            ((ImageView) (obj)).setImageBitmap(bitmap);
        }
        ((TextView)findViewById(R.id.format_text_view)).setText(result.getBarcodeFormat().toString());
        ((TextView)findViewById(R.id.type_text_view)).setText(resulthandler.getType().toString());
        bitmap = DateFormat.getDateTimeInstance(3, 3).format(new Date(result.getTimestamp()));
        ((TextView)findViewById(R.id.time_text_view)).setText(bitmap);
        bitmap = (TextView)findViewById(R.id.meta_text_view);
        obj = findViewById(R.id.meta_text_view_label);
        bitmap.setVisibility(8);
        ((View) (obj)).setVisibility(8);
        obj1 = result.getResultMetadata();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        result = new StringBuilder(20);
        obj1 = ((Map) (obj1)).entrySet().iterator();
_L10:
        if (((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        if (result.length() > 0)
        {
            result.setLength(result.length() - 1);
            bitmap.setText(result);
            bitmap.setVisibility(0);
            ((View) (obj)).setVisibility(0);
        }
_L2:
        bitmap = (TextView)findViewById(R.id.contents_text_view);
        result = resulthandler.getDisplayContents();
        bitmap.setText(result);
        bitmap.setTextSize(2, Math.max(22, 32 - result.length() / 4));
        bitmap = (TextView)findViewById(R.id.contents_supplement_text_view);
        bitmap.setText("");
        bitmap.setOnClickListener(null);
        if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean("preferences_supplemental", true))
        {
            SupplementalInfoRetriever.maybeInvokeRetrieval(bitmap, resulthandler.getResult(), historyManager, this);
        }
        j = resulthandler.getButtonCount();
        bitmap = (ViewGroup)findViewById(R.id.result_button_view);
        bitmap.requestFocus();
        i = 0;
_L8:
        if (i < 4) goto _L6; else goto _L5
_L5:
        if (!copyToClipboard || resulthandler.areContentsSecure())
        {
            break MISSING_BLOCK_LABEL_402;
        }
        resulthandler = (ClipboardManager)getSystemService("clipboard");
        if (result == null)
        {
            break MISSING_BLOCK_LABEL_402;
        }
        resulthandler.setText(result);
        return;
_L4:
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
        if (DISPLAYABLE_METADATA_TYPES.contains(entry.getKey()))
        {
            result.append(entry.getValue()).append('\n');
        }
        continue; /* Loop/switch isn't completed */
_L6:
        TextView textview = (TextView)bitmap.getChildAt(i);
        if (i < j)
        {
            textview.setVisibility(0);
            textview.setText(resulthandler.getButtonText(i));
            textview.setOnClickListener(new ResultButtonListener(resulthandler, i));
        } else
        {
            textview.setVisibility(8);
        }
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        result;
        Log.w(TAG, "Clipboard bug", result);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void initCamera(SurfaceHolder surfaceholder)
    {
        if (surfaceholder == null)
        {
            throw new IllegalStateException("No SurfaceHolder provided");
        }
        if (cameraManager.isOpen())
        {
            Log.w(TAG, "initCamera() while already open -- late SurfaceView callback?");
            return;
        }
        try
        {
            cameraManager.openDriver(surfaceholder);
            if (handler == null)
            {
                handler = new CaptureActivityHandler(this, decodeFormats, decodeHints, characterSet, cameraManager);
            }
            decodeOrStoreSavedBitmap(null, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            Log.w(TAG, surfaceholder);
            displayFrameworkBugMessageAndExit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            Log.w(TAG, "Unexpected error initializing camera", surfaceholder);
        }
        displayFrameworkBugMessageAndExit();
    }

    protected static boolean isZXingURL(String s)
    {
        if (s != null)
        {
            String as[] = ZXING_URLS;
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                if (s.startsWith(as[i]))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    private void resetStatusView()
    {
        resultView.setVisibility(8);
        statusView.setText(R.string.msg_default_status);
        statusView.setVisibility(0);
        viewfinderView.setVisibility(0);
        lastResult = null;
    }

    private void sendReplyMessage(int i, Object obj, long l)
    {
        obj = Message.obtain(handler, i, obj);
        if (l > 0L)
        {
            handler.sendMessageDelayed(((Message) (obj)), l);
            return;
        } else
        {
            handler.sendMessage(((Message) (obj)));
            return;
        }
    }

    private boolean showHelpOnFirstLaunch()
    {
        return false;
    }

    public void drawViewfinder()
    {
        viewfinderView.drawViewfinder();
    }

    protected CameraManager getCameraManager()
    {
        return cameraManager;
    }

    public Handler getHandler()
    {
        return handler;
    }

    ViewfinderView getViewfinderView()
    {
        return viewfinderView;
    }

    public void handleDecode(Result result, Bitmap bitmap, float f)
    {
        inactivityTimer.onActivity();
        lastResult = result;
        ResultHandler resulthandler = ResultHandlerFactory.makeResultHandler(this, result);
        boolean flag;
        if (bitmap != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            historyManager.addHistoryItem(result, resulthandler);
            beepManager.playBeepSoundAndVibrate();
            drawResultPoints(bitmap, f, result);
        }
        SharedPreferences sharedpreferences;
        switch ($SWITCH_TABLE$com$google$zxing$client$android$IntentSource()[source.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            handleDecodeExternally(result, resulthandler, bitmap);
            return;

        case 3: // '\003'
            if (scanFromWebPageManager == null || !scanFromWebPageManager.isScanFromWebPage())
            {
                handleDecodeInternally(result, resulthandler, bitmap);
                return;
            } else
            {
                handleDecodeExternally(result, resulthandler, bitmap);
                return;
            }

        case 4: // '\004'
            sharedpreferences = PreferenceManager.getDefaultSharedPreferences(this);
            break;
        }
        if (flag && sharedpreferences.getBoolean("preferences_bulk_mode", false))
        {
            result = (new StringBuilder(String.valueOf(getResources().getString(R.string.msg_bulk_mode_scanned)))).append(" (").append(result.getText()).append(')').toString();
            Toast.makeText(getApplicationContext(), result, 0).show();
            restartPreviewAfterDelay(1000L);
            return;
        } else
        {
            handleDecodeInternally(result, resulthandler, bitmap);
            return;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (j == -1 && i == 47820)
        {
            i = intent.getIntExtra("ITEM_NUMBER", -1);
            if (i >= 0)
            {
                decodeOrStoreSavedBitmap(null, historyManager.buildHistoryItem(i).getResult());
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(R.layout.capture);
        hasSurface = false;
        historyManager = new HistoryManager(this);
        historyManager.trimHistory();
        inactivityTimer = new InactivityTimer(this);
        beepManager = new BeepManager(this);
        ambientLightManager = new AmbientLightManager(this);
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
        showHelpOnFirstLaunch();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.capture, menu);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        inactivityTimer.shutdown();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        boolean flag = true;
        i;
        JVM INSTR lookupswitch 5: default 52
    //                   4: 61
    //                   24: 126
    //                   25: 116
    //                   27: 59
    //                   80: 59;
           goto _L1 _L2 _L3 _L4 _L5 _L5
_L1:
        flag = super.onKeyDown(i, keyevent);
_L5:
        return flag;
_L2:
        if (source == IntentSource.NATIVE_APP_INTENT)
        {
            setResult(0);
            finish();
            return true;
        }
        if ((source == IntentSource.NONE || source == IntentSource.ZXING_LINK) && lastResult != null)
        {
            restartPreviewAfterDelay(0L);
            return true;
        }
          goto _L1
_L4:
        cameraManager.setTorch(false);
        return true;
_L3:
        cameraManager.setTorch(true);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(0x80000);
        if (menuitem.getItemId() == R.id.menu_share)
        {
            intent.setClassName(this, com/google/zxing/client/android/share/ShareActivity.getName());
            startActivity(intent);
        }
        if (menuitem.getItemId() == R.id.menu_history)
        {
            intent.setClassName(this, com/google/zxing/client/android/history/HistoryActivity.getName());
            startActivityForResult(intent, 47820);
        }
        if (menuitem.getItemId() == R.id.menu_settings)
        {
            intent.setClassName(this, com/google/zxing/client/android/PreferencesActivity.getName());
            startActivity(intent);
        }
        if (menuitem.getItemId() == R.id.menu_help)
        {
            intent.setClassName(this, com/google/zxing/client/android/HelpActivity.getName());
            startActivity(intent);
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPause()
    {
        if (handler != null)
        {
            handler.quitSynchronously();
            handler = null;
        }
        inactivityTimer.onPause();
        ambientLightManager.stop();
        cameraManager.closeDriver();
        if (!hasSurface)
        {
            ((SurfaceView)findViewById(R.id.preview_view)).getHolder().removeCallback(this);
        }
        super.onPause();
    }

    protected void onResume()
    {
        String s1;
        super.onResume();
        cameraManager = new CameraManager(getApplication());
        viewfinderView = (ViewfinderView)findViewById(R.id.viewfinder_view);
        viewfinderView.setCameraManager(cameraManager);
        resultView = findViewById(R.id.result_view);
        statusView = (TextView)findViewById(R.id.status_view);
        handler = null;
        lastResult = null;
        Object obj = ((SurfaceView)findViewById(R.id.preview_view)).getHolder();
        String s;
        int i;
        int j;
        boolean flag;
        if (hasSurface)
        {
            initCamera(((SurfaceHolder) (obj)));
        } else
        {
            ((SurfaceHolder) (obj)).addCallback(this);
            ((SurfaceHolder) (obj)).setType(3);
        }
        beepManager.updatePrefs();
        ambientLightManager.start(cameraManager);
        inactivityTimer.onResume();
        obj = getIntent();
        if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean("preferences_copy_to_clipboard", true) && (obj == null || ((Intent) (obj)).getBooleanExtra("SAVE_HISTORY", true)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        copyToClipboard = flag;
        source = IntentSource.NONE;
        decodeFormats = null;
        characterSet = null;
        if (obj == null) goto _L2; else goto _L1
_L1:
        s = ((Intent) (obj)).getAction();
        s1 = ((Intent) (obj)).getDataString();
        if (!"com.google.zxing.client.android.SCAN".equals(s)) goto _L4; else goto _L3
_L3:
        source = IntentSource.NATIVE_APP_INTENT;
        decodeFormats = DecodeFormatManager.parseDecodeFormats(((Intent) (obj)));
        decodeHints = DecodeHintManager.parseDecodeHints(((Intent) (obj)));
        if (((Intent) (obj)).hasExtra("SCAN_WIDTH") && ((Intent) (obj)).hasExtra("SCAN_HEIGHT"))
        {
            i = ((Intent) (obj)).getIntExtra("SCAN_WIDTH", 0);
            j = ((Intent) (obj)).getIntExtra("SCAN_HEIGHT", 0);
            if (i > 0 && j > 0)
            {
                cameraManager.setManualFramingRect(i, j);
            }
        }
        s = ((Intent) (obj)).getStringExtra("PROMPT_MESSAGE");
        if (s != null)
        {
            statusView.setText(s);
        }
_L6:
        characterSet = ((Intent) (obj)).getStringExtra("CHARACTER_SET");
_L2:
        return;
_L4:
        if (s1 != null && s1.contains("http://www.google") && s1.contains("/m/products/scan"))
        {
            source = IntentSource.PRODUCT_SEARCH_LINK;
            sourceUrl = s1;
            decodeFormats = DecodeFormatManager.PRODUCT_FORMATS;
        } else
        if (isZXingURL(s1))
        {
            source = IntentSource.ZXING_LINK;
            sourceUrl = s1;
            Uri uri = Uri.parse(s1);
            scanFromWebPageManager = new ScanFromWebPageManager(uri);
            decodeFormats = DecodeFormatManager.parseDecodeFormats(uri);
            decodeHints = DecodeHintManager.parseDecodeHints(uri);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void restartPreviewAfterDelay(long l)
    {
        if (handler != null)
        {
            handler.sendEmptyMessageDelayed(R.id.restart_preview, l);
        }
        resetStatusView();
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        if (surfaceholder == null)
        {
            Log.e(TAG, "*** WARNING *** surfaceCreated() gave us a null surface!");
        }
        if (!hasSurface)
        {
            hasSurface = true;
            initCamera(surfaceholder);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        hasSurface = false;
    }

    static 
    {
        DISPLAYABLE_METADATA_TYPES = EnumSet.of(ResultMetadataType.ISSUE_NUMBER, ResultMetadataType.SUGGESTED_PRICE, ResultMetadataType.ERROR_CORRECTION_LEVEL, ResultMetadataType.POSSIBLE_COUNTRY);
    }
}

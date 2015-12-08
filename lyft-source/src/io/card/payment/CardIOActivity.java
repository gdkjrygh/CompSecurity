// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import io.card.payment.i18n.LocalizedStrings;
import io.card.payment.i18n.StringKey;
import io.card.payment.ui.ActivityHelper;
import io.card.payment.ui.ViewUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import java.util.Date;

// Referenced classes of package io.card.payment:
//            CameraUnavailableException, Util, CardScanner, DataEntryActivity, 
//            OverlayView, Preview, DetectionInfo, CreditCard

public final class CardIOActivity extends Activity
{

    static final boolean $assertionsDisabled;
    public static final String EXTRA_CAPTURED_CARD_IMAGE = "io.card.payment.capturedCardImage";
    public static final String EXTRA_GUIDE_COLOR = "io.card.payment.guideColor";
    public static final String EXTRA_HIDE_CARDIO_LOGO = "io.card.payment.hideLogo";
    public static final String EXTRA_KEEP_APPLICATION_THEME = "io.card.payment.keepApplicationTheme";
    public static final String EXTRA_LANGUAGE_OR_LOCALE = "io.card.payment.languageOrLocale";
    public static final String EXTRA_NO_CAMERA = "io.card.payment.noCamera";
    public static final String EXTRA_REQUIRE_CVV = "io.card.payment.requireCVV";
    public static final String EXTRA_REQUIRE_EXPIRY = "io.card.payment.requireExpiry";
    public static final String EXTRA_REQUIRE_POSTAL_CODE = "io.card.payment.requirePostalCode";
    public static final String EXTRA_RETURN_CARD_IMAGE = "io.card.payment.returnCardImage";
    public static final String EXTRA_SCAN_EXPIRY = "io.card.payment.scanExpiry";
    public static final String EXTRA_SCAN_INSTRUCTIONS = "io.card.payment.scanInstructions";
    public static final String EXTRA_SCAN_OVERLAY_LAYOUT_ID = "io.card.payment.scanOverlayLayoutId";
    public static final String EXTRA_SCAN_RESULT = "io.card.payment.scanResult";
    public static final String EXTRA_SUPPRESS_CONFIRMATION = "io.card.payment.suppressConfirmation";
    public static final String EXTRA_SUPPRESS_MANUAL_ENTRY = "io.card.payment.suppressManual";
    public static final String EXTRA_SUPPRESS_SCAN = "io.card.payment.suppressScan";
    public static final String EXTRA_USE_CARDIO_LOGO = "io.card.payment.useCardIOLogo";
    public static final String EXTRA_USE_PAYPAL_ACTIONBAR_ICON = "io.card.payment.intentSenderIsPayPal";
    private static final int REQUEST_DATA_ENTRY;
    public static final int RESULT_CARD_INFO;
    public static final int RESULT_CONFIRMATION_SUPPRESSED;
    public static final int RESULT_ENTRY_CANCELED;
    public static final int RESULT_SCAN_NOT_AVAILABLE;
    public static final int RESULT_SCAN_SUPPRESSED;
    private static final String TAG = io/card/payment/CardIOActivity.getSimpleName();
    private static final long VIBRATE_PATTERN[] = {
        0L, 70L, 10L, 40L
    };
    private static int lastResult;
    static Bitmap markedCardImage = null;
    private static int numActivityAllocations = 0;
    private static int uniqueOMatic;
    private LinearLayout customOverlayLayout;
    private CardScanner mCardScanner;
    private boolean mDetectOnly;
    private CreditCard mDetectedCard;
    private int mFrameOrientation;
    private Rect mGuideFrame;
    private int mLastDegrees;
    private FrameLayout mMainLayout;
    private OverlayView mOverlay;
    Preview mPreview;
    private RelativeLayout mUIBar;
    private boolean manualEntryFallbackOrForced;
    private OrientationEventListener orientationListener;
    private boolean suppressManualEntry;
    private boolean useApplicationTheme;

    public CardIOActivity()
    {
        suppressManualEntry = false;
        mDetectOnly = false;
        manualEntryFallbackOrForced = false;
    }

    public static boolean canReadCardWithCamera()
    {
        boolean flag;
        try
        {
            flag = Util.hardwareSupported();
        }
        catch (CameraUnavailableException cameraunavailableexception)
        {
            return false;
        }
        catch (RuntimeException runtimeexception)
        {
            Log.w(TAG, "RuntimeException accessing Util.hardwareSupported()");
            return false;
        }
        return flag;
    }

    private void doOrientationChange(int i)
    {
        if (i >= 0 && mCardScanner != null)
        {
            int j = getRotationalOffset() + i;
            if (j > 360)
            {
                j -= 360;
            }
            byte byte0 = -1;
            if (j < 15 || j > 345)
            {
                i = 0;
                mFrameOrientation = 1;
            } else
            if (j > 75 && j < 105)
            {
                mFrameOrientation = 4;
                i = 90;
            } else
            if (j > 165 && j < 195)
            {
                i = 180;
                mFrameOrientation = 2;
            } else
            {
                i = byte0;
                if (j > 255)
                {
                    i = byte0;
                    if (j < 285)
                    {
                        mFrameOrientation = 3;
                        i = 270;
                    }
                }
            }
            if (i >= 0 && i != mLastDegrees)
            {
                Log.d(TAG, (new StringBuilder()).append("onOrientationChanged(").append(i).append(") calling setDeviceOrientation(").append(mFrameOrientation).append(")").toString());
                mCardScanner.setDeviceOrientation(mFrameOrientation);
                setDeviceDegrees(i);
                if (i == 90)
                {
                    rotateCustomOverlay(270F);
                    return;
                }
                if (i == 270)
                {
                    rotateCustomOverlay(90F);
                    return;
                } else
                {
                    rotateCustomOverlay(i);
                    return;
                }
            }
        }
    }

    public static Bitmap getCapturedCardImage(Intent intent)
    {
        if (intent == null || !intent.hasExtra("io.card.payment.capturedCardImage"))
        {
            return null;
        } else
        {
            return BitmapFactory.decodeStream(new ByteArrayInputStream(intent.getByteArrayExtra("io.card.payment.capturedCardImage")), null, new android.graphics.BitmapFactory.Options());
        }
    }

    private int getRotationalOffset()
    {
        int i = ((WindowManager)getSystemService("window")).getDefaultDisplay().getRotation();
        if (i == 0)
        {
            return 0;
        }
        if (i == 1)
        {
            return 90;
        }
        if (i == 2)
        {
            return 180;
        }
        return i != 3 ? 0 : 270;
    }

    private void handleGeneralExceptionError(Exception exception)
    {
        String s = LocalizedStrings.getString(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL);
        Log.e("card.io", "Unkown exception - please send the stack trace to support@card.io", exception);
        exception = Toast.makeText(this, s, 1);
        exception.setGravity(17, 0, -75);
        exception.show();
        manualEntryFallbackOrForced = true;
    }

    private void nextActivity()
    {
        Log.d(TAG, "CardIOActivity.nextActivity()");
        Intent intent1 = getIntent();
        if (intent1 != null && intent1.getBooleanExtra("io.card.payment.suppressConfirmation", false))
        {
            Intent intent = new Intent(this, io/card/payment/DataEntryActivity);
            intent.putExtra("io.card.payment.scanResult", mDetectedCard);
            mDetectedCard = null;
            if (intent1.getBooleanExtra("io.card.payment.returnCardImage", false) && mOverlay != null && mOverlay.getBitmap() != null)
            {
                ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                mOverlay.getBitmap().compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, bytearrayoutputstream);
                intent.putExtra("io.card.payment.capturedCardImage", bytearrayoutputstream.toByteArray());
            }
            setResultAndFinish(RESULT_CONFIRMATION_SUPPRESSED, intent);
            return;
        } else
        {
            (new Handler()).post(new Runnable() {

                final CardIOActivity this$0;

                public void run()
                {
                    Log.d(CardIOActivity.TAG, "CardIOActivity.nextActivity().post(Runnable)");
                    getWindow().clearFlags(1024);
                    getWindow().addFlags(512);
                    Intent intent2 = new Intent(CardIOActivity.this, io/card/payment/DataEntryActivity);
                    if (mOverlay != null)
                    {
                        mOverlay.markupCard();
                        if (CardIOActivity.markedCardImage != null && !CardIOActivity.markedCardImage.isRecycled())
                        {
                            CardIOActivity.markedCardImage.recycle();
                        }
                        CardIOActivity.markedCardImage = mOverlay.getCardImage();
                    }
                    if (mDetectedCard != null)
                    {
                        intent2.putExtra("io.card.payment.scanResult", mDetectedCard);
                        mDetectedCard = null;
                    } else
                    {
                        intent2.putExtra("io.card.payment.manualEntryScanResult", true);
                    }
                    intent2.putExtras(getIntent());
                    intent2.addFlags(0x40810000);
                    startActivityForResult(intent2, CardIOActivity.REQUEST_DATA_ENTRY);
                }

            
            {
                this$0 = CardIOActivity.this;
                super();
            }
            });
            return;
        }
    }

    private boolean restartPreview()
    {
        Log.d(TAG, "restartPreview()");
        mDetectedCard = null;
        if (!$assertionsDisabled && mPreview == null)
        {
            throw new AssertionError();
        }
        boolean flag = mCardScanner.resumeScanning(mPreview.getSurfaceHolder());
        if (flag)
        {
            mUIBar.setVisibility(0);
        }
        return flag;
    }

    private void rotateCustomOverlay(float f)
    {
        if (customOverlayLayout != null)
        {
            RotateAnimation rotateanimation = new RotateAnimation(0.0F, f, customOverlayLayout.getWidth() / 2, customOverlayLayout.getHeight() / 2);
            rotateanimation.setDuration(0L);
            rotateanimation.setRepeatCount(0);
            rotateanimation.setFillAfter(true);
            customOverlayLayout.setAnimation(rotateanimation);
        }
    }

    public static Date sdkBuildDate()
    {
        return new Date("06/04/2015 17:39:33 -0500");
    }

    public static String sdkVersion()
    {
        return "5.0.1";
    }

    private void setDeviceDegrees(int i)
    {
        SurfaceView surfaceview = mPreview.getSurfaceView();
        if (surfaceview == null)
        {
            Log.wtf("card.io", "surface view is null.. recovering... rotation might be weird.");
            return;
        } else
        {
            mGuideFrame = mCardScanner.getGuideFrame(surfaceview.getWidth(), surfaceview.getHeight());
            Rect rect = mGuideFrame;
            rect.top = rect.top + surfaceview.getTop();
            rect = mGuideFrame;
            int j = rect.bottom;
            rect.bottom = surfaceview.getTop() + j;
            mOverlay.setGuideAndRotation(mGuideFrame, i);
            mLastDegrees = i;
            return;
        }
    }

    private void setPreviewLayout()
    {
        mMainLayout = new FrameLayout(this);
        mMainLayout.setBackgroundColor(0xff000000);
        mMainLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        Object obj = new FrameLayout(this);
        ((FrameLayout) (obj)).setId(1);
        mCardScanner.getClass();
        mCardScanner.getClass();
        mPreview = new Preview(this, null, 640, 480);
        mPreview.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1, 48));
        ((FrameLayout) (obj)).addView(mPreview);
        mOverlay = new OverlayView(this, null, Util.deviceSupportsTorch(this));
        mOverlay.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        if (getIntent() != null)
        {
            boolean flag = getIntent().getBooleanExtra("io.card.payment.useCardIOLogo", false);
            mOverlay.setUseCardIOLogo(flag);
            int i = getIntent().getIntExtra("io.card.payment.guideColor", 0);
            Object obj1;
            if (i != 0)
            {
                int j = 0xff000000 | i;
                if (i != j)
                {
                    Log.w("card.io", "Removing transparency from provided guide color.");
                }
                mOverlay.setGuideColor(j);
            } else
            {
                mOverlay.setGuideColor(0xff00ff00);
            }
            flag = getIntent().getBooleanExtra("io.card.payment.hideLogo", false);
            mOverlay.setHideCardIOLogo(flag);
            obj1 = getIntent().getStringExtra("io.card.payment.scanInstructions");
            if (obj1 != null)
            {
                mOverlay.setScanInstructions(((String) (obj1)));
            }
        }
        ((FrameLayout) (obj)).addView(mOverlay);
        obj1 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(2, 2);
        mMainLayout.addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (obj1)));
        mUIBar = new RelativeLayout(this);
        mUIBar.setGravity(80);
        obj = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        mUIBar.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        mUIBar.setId(2);
        mUIBar.setGravity(85);
        if (!suppressManualEntry)
        {
            obj = new Button(this);
            ((Button) (obj)).setId(3);
            ((Button) (obj)).setText(LocalizedStrings.getString(StringKey.KEYBOARD));
            ((Button) (obj)).setTextSize(12F);
            ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

                final CardIOActivity this$0;

                public void onClick(View view)
                {
                    nextActivity();
                }

            
            {
                this$0 = CardIOActivity.this;
                super();
            }
            });
            mUIBar.addView(((View) (obj)));
            ViewUtil.styleAsButton(((View) (obj)), false, this);
            ((Button) (obj)).setTextSize(14F);
            ((Button) (obj)).setMinimumHeight(ViewUtil.typedDimensionValueToPixelsInt("42dip", this));
            obj1 = (android.widget.RelativeLayout.LayoutParams)((Button) (obj)).getLayoutParams();
            obj1.width = -2;
            obj1.height = -2;
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
            ViewUtil.setPadding(((View) (obj)), "16dip", null, "16dip", null);
            ViewUtil.setMargins(((View) (obj)), "4dip", "4dip", "4dip", "4dip");
        }
        obj = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(12);
        i = (int)(getResources().getDisplayMetrics().density * 15F + 0.5F);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(0, i, 0, i);
        mMainLayout.addView(mUIBar, ((android.view.ViewGroup.LayoutParams) (obj)));
        if (getIntent() != null)
        {
            if (customOverlayLayout != null)
            {
                mMainLayout.removeView(customOverlayLayout);
                customOverlayLayout = null;
            }
            i = getIntent().getIntExtra("io.card.payment.scanOverlayLayoutId", -1);
            if (i != -1)
            {
                customOverlayLayout = new LinearLayout(this);
                customOverlayLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
                getLayoutInflater().inflate(i, customOverlayLayout);
                mMainLayout.addView(customOverlayLayout);
            }
        }
        setContentView(mMainLayout);
    }

    private void setResultAndFinish(int i, Intent intent)
    {
        setResult(i, intent);
        markedCardImage = null;
        finish();
    }

    private void showErrorMessage(String s)
    {
        Log.e("card.io", (new StringBuilder()).append("error display: ").append(s).toString());
        Toast.makeText(this, s, 1).show();
    }

    public Rect getTorchRect()
    {
        if (mOverlay == null)
        {
            return null;
        } else
        {
            return mOverlay.getTorchRect();
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        Log.d(TAG, String.format("onActivityResult(requestCode:%d, resultCode:%d, ...", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        }));
        if (j == RESULT_CARD_INFO || j == RESULT_ENTRY_CANCELED || manualEntryFallbackOrForced)
        {
            if (intent != null && intent.hasExtra("io.card.payment.scanResult"))
            {
                Log.v(TAG, (new StringBuilder()).append("data entry result: ").append(intent.getParcelableExtra("io.card.payment.scanResult")).toString());
            }
            setResultAndFinish(j, intent);
        } else
        if (mUIBar != null)
        {
            mUIBar.setVisibility(0);
            return;
        }
    }

    public void onBackPressed()
    {
        Log.d(TAG, "CardIOActivity.onBackPressed()");
        if (manualEntryFallbackOrForced || !mOverlay.isAnimating())
        {
            break MISSING_BLOCK_LABEL_62;
        }
        restartPreview();
_L1:
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w(TAG, (new StringBuilder()).append("*** could not return to preview: ").append(runtimeexception).toString());
        return;
        if (mCardScanner != null)
        {
            super.onBackPressed();
            return;
        }
          goto _L1
    }

    void onCardDetected(Bitmap bitmap, DetectionInfo detectioninfo)
    {
        Log.d(TAG, "processDetections");
        float f;
        try
        {
            ((Vibrator)getSystemService("vibrator")).vibrate(VIBRATE_PATTERN, -1);
        }
        catch (SecurityException securityexception)
        {
            Log.e("card.io", "Could not activate vibration feedback. Please add <uses-permission android:name=\"android.permission.VIBRATE\" /> to your application's manifest.");
        }
        catch (Exception exception)
        {
            Log.w("card.io", "Exception while attempting to vibrate: ", exception);
        }
        mCardScanner.pauseScanning();
        mUIBar.setVisibility(4);
        if (detectioninfo.predicted())
        {
            mDetectedCard = detectioninfo.creditCard();
            mOverlay.setDetectedCard(mDetectedCard);
        }
        if (mFrameOrientation == 1 || mFrameOrientation == 2)
        {
            f = ((float)mGuideFrame.right / 428F) * 0.95F;
        } else
        {
            f = ((float)mGuideFrame.right / 428F) * 1.15F;
        }
        detectioninfo = new Matrix();
        Log.d(TAG, (new StringBuilder()).append("Scale factor: ").append(f).toString());
        detectioninfo.postScale(f, f);
        detectioninfo = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), detectioninfo, false);
        mOverlay.setBitmap(detectioninfo);
        if (mDetectOnly)
        {
            bitmap = new ByteArrayOutputStream();
            detectioninfo.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, bitmap);
            detectioninfo = new Intent();
            if (getIntent() != null && getIntent().getBooleanExtra("io.card.payment.returnCardImage", false))
            {
                detectioninfo.putExtra("io.card.payment.capturedCardImage", bitmap.toByteArray());
            }
            setResultAndFinish(RESULT_SCAN_SUPPRESSED, detectioninfo);
            return;
        } else
        {
            nextActivity();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Log.i(TAG, "onCreate() ================================================================");
        numActivityAllocations++;
        if (numActivityAllocations != 1)
        {
            Log.i(TAG, String.format("INTERNAL WARNING: There are %d (not 1) CardIOActivity allocations!", new Object[] {
                Integer.valueOf(numActivityAllocations)
            }));
        }
        bundle = getIntent();
        useApplicationTheme = bundle.getBooleanExtra("io.card.payment.keepApplicationTheme", false);
        LocalizedStrings.setLanguage(bundle);
        mDetectOnly = bundle.getBooleanExtra("io.card.payment.suppressScan", false);
        String s = Util.manifestHasConfigChange(getPackageManager().resolveActivity(bundle, 0x10000), io/card/payment/CardIOActivity);
        if (s != null)
        {
            throw new RuntimeException(s);
        }
        suppressManualEntry = bundle.getBooleanExtra("io.card.payment.suppressManual", false);
        if (!bundle.getBooleanExtra("io.card.payment.noCamera", false)) goto _L2; else goto _L1
_L1:
        Log.i("card.io", "EXTRA_NO_CAMERA set to true. Skipping camera.");
        manualEntryFallbackOrForced = true;
_L7:
        if (manualEntryFallbackOrForced) goto _L4; else goto _L3
_L3:
        requestWindowFeature(1);
        mGuideFrame = new Rect();
        mFrameOrientation = 1;
        if (!bundle.getBooleanExtra("io.card.payment.cameraBypassTestMode", false))
        {
            break MISSING_BLOCK_LABEL_500;
        }
        if (!getPackageName().contentEquals("io.card.development"))
        {
            Log.e(TAG, (new StringBuilder()).append(getPackageName()).append(" is not correct").toString());
            throw new IllegalStateException("illegal access of private extra");
        }
          goto _L5
        bundle;
        handleGeneralExceptionError(bundle);
_L4:
        if (manualEntryFallbackOrForced && suppressManualEntry)
        {
            Log.i("card.io", "Camera not available and manual entry suppressed.");
            setResultAndFinish(RESULT_SCAN_NOT_AVAILABLE, null);
        }
        return;
_L2:
        if (Util.hardwareSupported()) goto _L7; else goto _L6
_L6:
        StringKey stringkey = StringKey.ERROR_NO_DEVICE_SUPPORT;
        String s1 = LocalizedStrings.getString(stringkey);
        Log.w("card.io", (new StringBuilder()).append(stringkey).append(": ").append(s1).toString());
        manualEntryFallbackOrForced = true;
          goto _L7
        Object obj;
        obj;
        Object obj1 = StringKey.ERROR_CAMERA_CONNECT_FAIL;
        String s2 = LocalizedStrings.getString(((StringKey) (obj1)));
        Log.e("card.io", (new StringBuilder()).append(obj1).append(": ").append(s2).toString());
        obj1 = Toast.makeText(this, s2, 1);
        ((Toast) (obj1)).setGravity(17, 0, -75);
        ((Toast) (obj1)).show();
        manualEntryFallbackOrForced = true;
          goto _L7
        obj1;
        handleGeneralExceptionError(((Exception) (obj1)));
          goto _L7
_L5:
        mCardScanner = (CardScanner)Class.forName("io.card.payment.CardScannerTester").getConstructor(new Class[] {
            getClass(), Integer.TYPE
        }).newInstance(new Object[] {
            this, Integer.valueOf(mFrameOrientation)
        });
_L8:
        mCardScanner.prepareScanner();
        setPreviewLayout();
        orientationListener = new OrientationEventListener(this, 2) {

            final CardIOActivity this$0;

            public void onOrientationChanged(int i)
            {
                doOrientationChange(i);
            }

            
            {
                this$0 = CardIOActivity.this;
                super(context, i);
            }
        };
          goto _L4
        mCardScanner = new CardScanner(this, mFrameOrientation);
          goto _L8
    }

    protected void onDestroy()
    {
        Log.d(TAG, "onDestroy()");
        mOverlay = null;
        numActivityAllocations--;
        if (mCardScanner != null)
        {
            mCardScanner.endScanning();
            mCardScanner = null;
        }
        super.onDestroy();
    }

    void onEdgeUpdate(DetectionInfo detectioninfo)
    {
        mOverlay.setDetectionInfo(detectioninfo);
    }

    void onFirstFrame(int i)
    {
        Log.d(TAG, "mFirstPreviewFrame");
        SurfaceView surfaceview = mPreview.getSurfaceView();
        if (mOverlay != null)
        {
            mOverlay.setCameraPreviewRect(new Rect(surfaceview.getLeft(), surfaceview.getTop(), surfaceview.getRight(), surfaceview.getBottom()));
        }
        mFrameOrientation = 1;
        setDeviceDegrees(0);
        if (i != mFrameOrientation)
        {
            Log.wtf("card.io", "the orientation of the scanner doesn't match the orientation of the activity");
        }
        onEdgeUpdate(new DetectionInfo());
    }

    protected void onPause()
    {
        super.onPause();
        Log.i(TAG, "onPause() xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        if (orientationListener != null)
        {
            orientationListener.disable();
        }
        setFlashOn(false);
        if (mCardScanner != null)
        {
            mCardScanner.pauseScanning();
        } else
        if (!manualEntryFallbackOrForced)
        {
            Log.wtf("card.io", "cardScanner is null in onPause()");
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        Log.i(TAG, "onResume() ----------------------------------------------------------");
        if (manualEntryFallbackOrForced)
        {
            nextActivity();
            return;
        }
        Util.logNativeMemoryStats();
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
        ActivityHelper.setFlagSecure(this);
        setRequestedOrientation(1);
        orientationListener.enable();
        if (!restartPreview())
        {
            Log.e(TAG, "Could not connect to camera.");
            showErrorMessage(LocalizedStrings.getString(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL));
            nextActivity();
        } else
        {
            setFlashOn(false);
        }
        doOrientationChange(mLastDegrees);
    }

    void setFlashOn(boolean flag)
    {
        boolean flag1;
        if (mPreview != null && mOverlay != null && mCardScanner.setFlashOn(flag))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            mOverlay.setTorchOn(flag);
        }
    }

    void toggleFlash()
    {
        boolean flag;
        if (!mCardScanner.isFlashOn())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setFlashOn(flag);
    }

    void triggerAutoFocus()
    {
        mCardScanner.triggerAutoFocus(true);
    }

    static 
    {
        int i;
        boolean flag;
        if (!io/card/payment/CardIOActivity.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
        lastResult = 0xca8d10;
        i = lastResult;
        lastResult = i + 1;
        RESULT_CARD_INFO = i;
        i = lastResult;
        lastResult = i + 1;
        RESULT_ENTRY_CANCELED = i;
        i = lastResult;
        lastResult = i + 1;
        RESULT_SCAN_NOT_AVAILABLE = i;
        i = lastResult;
        lastResult = i + 1;
        RESULT_SCAN_SUPPRESSED = i;
        i = lastResult;
        lastResult = i + 1;
        RESULT_CONFIRMATION_SUPPRESSED = i;
        uniqueOMatic = 10;
        i = uniqueOMatic;
        uniqueOMatic = i + 1;
        REQUEST_DATA_ENTRY = i;
    }






/*
    static CreditCard access$302(CardIOActivity cardioactivity, CreditCard creditcard)
    {
        cardioactivity.mDetectedCard = creditcard;
        return creditcard;
    }

*/


}

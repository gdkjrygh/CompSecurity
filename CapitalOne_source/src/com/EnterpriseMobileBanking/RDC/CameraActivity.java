// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.RDC;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.Camera;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.EnterpriseMobileBanking.Utils.Log;
import com.capitalone.mobile.banking.session.TimeoutBroadcastReceiver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class CameraActivity extends Activity
    implements android.view.SurfaceHolder.Callback
{

    private static final double ASPECT_TOLERANCE = 0.10000000000000001D;
    private static final Pattern COMMA_PATTERN = Pattern.compile(",");
    public static final int ERROR_BAD_SURFACE_VIEW = -3002;
    public static final int ERROR_CAMERA = -3003;
    private static final String TAG = "CameraActivity";
    private static final int TARGET_HEIGHT = 1200;
    private static final int TARGET_WIDTH = 1600;
    private static final int TEN_DESIRED_ZOOM = 27;
    private static RelativeLayout mOuterRL;
    private String callBackId;
    private Camera camera;
    private byte compressedImage[];
    private LayoutInflater controlInflater;
    private boolean hasAutoFocus;
    private String label;
    private long lastFocused;
    private android.view.View.OnClickListener mAutoFocusImage;
    private TextView mLabel;
    private View mOverlayTake;
    private View mOverlayUseRetake;
    private Button mRetake;
    private android.view.View.OnClickListener mRetakePictureAction;
    private ImageButton mTakePicture;
    private android.view.View.OnClickListener mTakePictureAction;
    private Button mUsePicture;
    private android.view.View.OnClickListener mUsePictureAction;
    private LinearLayout mUseRetakeLayout;
    private android.hardware.Camera.PictureCallback rawCallback;
    private SurfaceHolder surfaceHolder;
    private SurfaceView surfaceView;
    private boolean takingPicture;
    private View viewControl;

    public CameraActivity()
    {
        controlInflater = null;
        compressedImage = null;
        callBackId = "";
        label = "";
        takingPicture = false;
        lastFocused = 0L;
        hasAutoFocus = true;
        viewControl = null;
        mTakePictureAction = new android.view.View.OnClickListener() {

            final CameraActivity this$0;

            public void onClick(View view)
            {
label0:
                {
                    Log.d("CameraActivity", "mTakePictureAction.onClick():");
                    sendTimerReset();
                    mTakePicture.setEnabled(false);
                    if (camera != null)
                    {
                        if (!hasAutoFocus || System.currentTimeMillis() - lastFocused <= 2000L)
                        {
                            break label0;
                        }
                        camera.autoFocus(new android.hardware.Camera.AutoFocusCallback() {

                            final _cls1 this$1;

                            public void onAutoFocus(boolean flag, Camera camera1)
                            {
                                camera1.takePicture(null, null, rawCallback);
                            }

            
            {
                this$1 = _cls1.this;
                super();
            }
                        });
                    }
                    return;
                }
                camera.takePicture(null, null, rawCallback);
            }

            
            {
                this$0 = CameraActivity.this;
                super();
            }
        };
        mRetakePictureAction = new android.view.View.OnClickListener() {

            final CameraActivity this$0;

            public void onClick(View view)
            {
                Log.d("CameraActivity", "mRetakePictureAction.onClick()");
                sendTimerReset();
                CameraActivity.mOuterRL.setBackgroundDrawable(null);
                surfaceView.setVisibility(0);
                camera.startPreview();
                compressedImage = null;
                mUseRetakeLayout.setVisibility(8);
                mOverlayUseRetake.setVisibility(8);
                mOverlayTake.setVisibility(0);
                mTakePicture.setVisibility(0);
                mLabel.setText(label);
                lastFocused = 0L;
                mTakePicture.setEnabled(true);
                camera.cancelAutoFocus();
                takingPicture = false;
            }

            
            {
                this$0 = CameraActivity.this;
                super();
            }
        };
        mAutoFocusImage = new android.view.View.OnClickListener() {

            final CameraActivity this$0;

            public void onClick(View view)
            {
                Log.d("CameraActivity", "mAutoFocusImage.onClick()");
                sendTimerReset();
                if (camera == null || !hasAutoFocus)
                {
                    break MISSING_BLOCK_LABEL_62;
                }
                camera.cancelAutoFocus();
                camera.autoFocus(new android.hardware.Camera.AutoFocusCallback() {

                    final _cls3 this$1;

                    public void onAutoFocus(boolean flag, Camera camera1)
                    {
                        Log.d("CameraActivity", "Autofocusing image.");
                        lastFocused = System.currentTimeMillis();
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                });
                return;
                view;
                Log.d("CameraActivity", (new StringBuilder()).append("Auto focus exception caught: ").append(view).toString());
                return;
            }

            
            {
                this$0 = CameraActivity.this;
                super();
            }
        };
        mUsePictureAction = new android.view.View.OnClickListener() {

            final CameraActivity this$0;

            public void onClick(View view)
            {
                view = new Intent();
                view.putExtra("RDCImage", compressedImage);
                view.putExtra("callbackId", callBackId);
                setResult(-1, view);
                compressedImage = null;
                takingPicture = false;
                finish();
            }

            
            {
                this$0 = CameraActivity.this;
                super();
            }
        };
        rawCallback = new android.hardware.Camera.PictureCallback() {

            final CameraActivity this$0;

            public void onPictureTaken(byte abyte0[], Camera camera1)
            {
                Log.d("CameraActivity", "onPictureTaken()");
                if (camera1 != null)
                {
                    camera1.stopPreview();
                }
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inTempStorage = new byte[16384];
                camera1 = camera1.getParameters().getPictureSize();
                int i = ((android.hardware.Camera.Size) (camera1)).height;
                float f = (float)(((android.hardware.Camera.Size) (camera1)).width * i * 3) / 1024000F;
                if (f > 4F)
                {
                    options.inSampleSize = 4;
                } else
                if (f > 3F)
                {
                    options.inSampleSize = 2;
                } else
                {
                    options.inSampleSize = 1;
                }
                camera1 = decodeByteArrayMemCheck(abyte0, 0, abyte0.length, options);
                if (camera1 == null)
                {
                    return;
                } else
                {
                    camera1 = new BitmapDrawable(getResources(), camera1);
                    CameraActivity.mOuterRL.setBackgroundDrawable(camera1);
                    mUseRetakeLayout.setVisibility(0);
                    mTakePicture.setVisibility(8);
                    mOverlayUseRetake.setVisibility(0);
                    mOverlayTake.setVisibility(8);
                    mLabel.setText("PREVIEW");
                    compressImage(abyte0);
                    return;
                }
            }

            
            {
                this$0 = CameraActivity.this;
                super();
            }
        };
    }

    private void compressImage(byte abyte0[])
    {
        ByteArrayOutputStream bytearrayoutputstream;
        Log.d("CameraActivity", "Compress Image");
        bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inTempStorage = new byte[16384];
            abyte0 = decodeByteArrayMemCheck(abyte0, 0, abyte0.length, options);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            try
            {
                bytearrayoutputstream.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                return;
            }
        }
        finally { }
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        abyte0.compress(android.graphics.Bitmap.CompressFormat.JPEG, 30, bytearrayoutputstream);
        compressedImage = bytearrayoutputstream.toByteArray();
        try
        {
            bytearrayoutputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return;
        }
        try
        {
            bytearrayoutputstream.close();
        }
        catch (IOException ioexception) { }
        throw abyte0;
    }

    private Bitmap decodeByteArrayMemCheck(byte abyte0[], int i, int j, android.graphics.BitmapFactory.Options options)
    {
        try
        {
            abyte0 = BitmapFactory.decodeByteArray(abyte0, i, j, options);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            (new android.app.AlertDialog.Builder(this)).setTitle(getString(0x7f09014c)).setMessage(getString(0x7f09014e)).setCancelable(false).setNeutralButton("OK", new android.content.DialogInterface.OnClickListener() {

                final CameraActivity this$0;

                public void onClick(DialogInterface dialoginterface, int k)
                {
                    finish();
                }

            
            {
                this$0 = CameraActivity.this;
                super();
            }
            }).show();
            return null;
        }
        return abyte0;
    }

    private void doFinishWithError(int i)
    {
        Intent intent = new Intent();
        intent.putExtra("callbackId", callBackId);
        intent.putExtra("errorCode", i);
        setResult(0, intent);
        compressedImage = null;
        takingPicture = false;
        finish();
    }

    private static int findBestMotZoomValue(CharSequence charsequence, int i)
    {
        int k = 0;
        charsequence = COMMA_PATTERN.split(charsequence);
        int j1 = charsequence.length;
        int j = 0;
        while (j < j1) 
        {
            String s = charsequence[j].trim();
            double d;
            int l;
            int i1;
            try
            {
                d = Double.parseDouble(s);
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                return i;
            }
            i1 = (int)(10D * d);
            l = k;
            if (Math.abs((double)i - d) < (double)Math.abs(i - k))
            {
                l = i1;
            }
            j++;
            k = l;
        }
        return k;
    }

    private android.hardware.Camera.Size getOptimalSize(List list, int i, int j, android.hardware.Camera.Size size)
    {
        if (list != null) goto _L2; else goto _L1
_L1:
        android.hardware.Camera.Size size1 = null;
_L4:
        return size1;
_L2:
        if (size == null)
        {
            break; /* Loop/switch isn't completed */
        }
        size1 = size;
        if (list.contains(size)) goto _L4; else goto _L3
_L3:
        double d1 = (double)i / (double)j;
        size = null;
        double d = 1.7976931348623157E+308D;
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            android.hardware.Camera.Size size2 = (android.hardware.Camera.Size)iterator.next();
            Log.d("CameraActivity", (new StringBuilder()).append("Preview supported w: ").append(size2.width).append(" h: ").append(size2.height).toString());
            if (Math.abs((double)size2.width / (double)size2.height - d1) <= 0.10000000000000001D && (double)Math.abs(size2.width - i) < d)
            {
                size = size2;
                d = Math.abs(size2.width - i);
            }
        } while (true);
        android.hardware.Camera.Size size3 = size;
        if (size == null)
        {
            Iterator iterator1 = list.iterator();
            do
            {
                size3 = size;
                if (!iterator1.hasNext())
                {
                    break;
                }
                list = (android.hardware.Camera.Size)iterator1.next();
                if ((double)Math.abs(((android.hardware.Camera.Size) (list)).width - i) < d)
                {
                    size = list;
                    d = Math.abs(((android.hardware.Camera.Size) (list)).width - i);
                }
            } while (true);
        }
        return size3;
    }

    private void sendTimerReset()
    {
        Intent intent = new Intent(getBaseContext(), com/capitalone/mobile/banking/session/TimeoutBroadcastReceiver);
        intent.putExtra("opCode", 2112);
        getBaseContext().sendBroadcast(intent);
    }

    private void setFlash(android.hardware.Camera.Parameters parameters)
    {
        if (Build.MODEL.contains("Behold II"))
        {
            parameters.set("flash-value", 1);
        } else
        {
            parameters.set("flash-value", 2);
        }
        parameters.set("flash-mode", "off");
    }

    private void setZoom(android.hardware.Camera.Parameters parameters)
    {
        Object obj = parameters.get("zoom-supported");
        if (obj == null || Boolean.parseBoolean(((String) (obj)))) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s3;
        int i;
        int j;
        j = 27;
        s3 = parameters.get("max-zoom");
        i = j;
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        double d = Double.parseDouble(s3);
        int k = (int)(10D * d);
        i = j;
        if (27 > k)
        {
            i = k;
        }
_L3:
        String s4;
        s4 = parameters.get("taking-picture-zoom-max");
        j = i;
        if (s4 == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        int l = Integer.parseInt(s4);
        j = i;
        if (i > l)
        {
            j = l;
        }
_L4:
        Object obj1;
        String s;
        String s5;
        s5 = parameters.get("mot-zoom-values");
        i = j;
        if (s5 != null)
        {
            i = findBestMotZoomValue(s5, j);
        }
        s = parameters.get("mot-zoom-step");
        j = i;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_404;
        }
        String s1 = parameters.get("mot-continuous-zoom-step-values");
        obj = s;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        Log.d("CameraActivity", s1);
        obj1 = s1;
        String as[] = s1.split(",");
        if (as.length > 0)
        {
            obj = String.valueOf(1.7976931348623157E+308D);
            l = as.length;
            j = 0;
            do
            {
                obj1 = obj;
                if (j >= l)
                {
                    break;
                }
                String s2 = as[j];
                obj1 = obj;
                if (Double.parseDouble(s2) < Double.parseDouble(((String) (obj))))
                {
                    obj1 = s2;
                }
                j++;
                obj = obj1;
            } while (true);
        }
        break MISSING_BLOCK_LABEL_342;
        obj;
        Log.w("CameraActivity", (new StringBuilder()).append("Bad max-zoom: ").append(s3).toString());
        i = j;
          goto _L3
        obj;
        Log.w("CameraActivity", (new StringBuilder()).append("Bad taking-picture-zoom-max: ").append(s4).toString());
        j = i;
          goto _L4
        obj = s;
        if (!s.equals(obj1))
        {
            obj = obj1;
            parameters.set("mot-zoom-step", ((String) (obj1)));
        }
        l = (int)(10D * Double.parseDouble(((String) (obj)).trim()));
        j = i;
        if (l > 1)
        {
            j = i - i % l;
        }
_L6:
        if (s3 != null || s5 != null)
        {
            parameters.set("zoom", String.valueOf((double)j / 10D));
        }
        if (s4 != null)
        {
            parameters.set("taking-picture-zoom", j);
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
        NumberFormatException numberformatexception;
        numberformatexception;
        j = i;
          goto _L6
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(0x7f030004);
        setRequestedOrientation(0);
        getWindow().setFormat(0);
        surfaceView = (SurfaceView)findViewById(0x7f08002f);
        surfaceHolder = surfaceView.getHolder();
        surfaceHolder.addCallback(this);
        surfaceHolder.setType(3);
        controlInflater = LayoutInflater.from(getBaseContext());
        viewControl = controlInflater.inflate(0x7f030007, null);
        bundle = new android.view.ViewGroup.LayoutParams(-1, -1);
        viewControl.setOnClickListener(mAutoFocusImage);
        addContentView(viewControl, bundle);
        mUseRetakeLayout = (LinearLayout)findViewById(0x7f080053);
        mTakePicture = (ImageButton)findViewById(0x7f080051);
        mTakePicture.setOnClickListener(mTakePictureAction);
        mUsePicture = (Button)findViewById(0x7f080055);
        mUsePicture.setOnClickListener(mUsePictureAction);
        mRetake = (Button)findViewById(0x7f080054);
        mRetake.setOnClickListener(mRetakePictureAction);
        callBackId = getIntent().getStringExtra("callbackId");
        label = getIntent().getStringExtra("label");
        mLabel = (TextView)findViewById(0x7f080050);
        mLabel.setText(label);
        mOverlayTake = findViewById(0x7f080052);
        mOverlayUseRetake = findViewById(0x7f080056);
        mOuterRL = (RelativeLayout)findViewById(0x7f08004f);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        boolean flag1 = false;
        boolean flag;
        if (takingPicture || i == 27 || i == 80)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Log.d("CameraActivity", (new StringBuilder()).append("Got keycode: ").append(i).toString());
        if (!flag) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR lookupswitch 2: default 80
    //                   27: 104
    //                   80: 139;
           goto _L2 _L3 _L4
_L2:
        if (flag || super.onKeyDown(i, keyevent))
        {
            flag1 = true;
        }
        return flag1;
_L3:
        if (!takingPicture && mTakePicture.isEnabled())
        {
            takingPicture = true;
            mTakePictureAction.onClick(null);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!takingPicture && mTakePicture.isEnabled())
        {
            mAutoFocusImage.onClick(null);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected void onPause()
    {
        if (camera != null)
        {
            camera.stopPreview();
            camera.release();
            camera = null;
        }
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        Log.d("CameraActivity", "SurfaceChanged()");
        if (camera == null)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        surfaceholder = camera.getParameters();
        Object obj = surfaceholder.getSupportedPictureSizes();
        Camera camera1 = camera;
        camera1.getClass();
        obj = getOptimalSize(((List) (obj)), 1600, 1200, new android.hardware.Camera.Size(camera1, 1600, 1200));
        surfaceholder.setPictureFormat(256);
        surfaceholder.setPictureSize(((android.hardware.Camera.Size) (obj)).width, ((android.hardware.Camera.Size) (obj)).height);
        surfaceholder.setJpegQuality(100);
        surfaceholder.setFocusMode("auto");
        surfaceholder.setJpegThumbnailSize(0, 0);
        surfaceholder.remove("gps-latitude");
        surfaceholder.remove("gps-longitude");
        surfaceholder.remove("gps-altitude");
        surfaceholder.remove("gps-timestamp");
        camera.setParameters(surfaceholder);
        try
        {
            surfaceholder = camera.getParameters();
            setFlash(surfaceholder);
            setZoom(surfaceholder);
            camera.setParameters(surfaceholder);
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            try
            {
                Log.d("CameraActivity", surfaceholder.toString());
            }
            // Misplaced declaration of an exception variable
            catch (SurfaceHolder surfaceholder)
            {
                Log.d("CameraActivity", surfaceholder.toString());
            }
        }
        camera.startPreview();
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        Log.d("CameraActivity", "SurfaceCreated()");
        camera = Camera.open();
        surfaceholder = camera;
        if (surfaceholder == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        android.hardware.Camera.Size size;
        surfaceholder = camera.getParameters();
        size = getOptimalSize(surfaceholder.getSupportedPreviewSizes(), 1600, 1200, null);
        if (size == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        Log.d("CameraActivity", (new StringBuilder()).append("Set Preview Size width: ").append(size.width).append(" height: ").append(size.height).toString());
        surfaceholder.setPreviewSize(size.width, size.height);
        camera.setParameters(surfaceholder);
        camera.setPreviewDisplay(surfaceHolder);
_L1:
        if (getPackageManager().hasSystemFeature("android.hardware.camera.autofocus"))
        {
            hasAutoFocus = true;
            return;
        }
        break MISSING_BLOCK_LABEL_199;
        surfaceholder;
        Log.e("CameraActivity", (new StringBuilder()).append("Exception in surfaceChanged(): ").append(surfaceholder.toString()).toString());
        doFinishWithError(-3002);
          goto _L1
        surfaceholder;
        Log.e("CameraActivity", surfaceholder.toString());
        doFinishWithError(-3003);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        Log.d("CameraActivity", "SurfaceDestroyed()");
        if (camera != null)
        {
            camera.stopPreview();
            camera.release();
            camera = null;
        }
    }









/*
    static boolean access$1402(CameraActivity cameraactivity, boolean flag)
    {
        cameraactivity.takingPicture = flag;
        return flag;
    }

*/








/*
    static long access$402(CameraActivity cameraactivity, long l)
    {
        cameraactivity.lastFocused = l;
        return l;
    }

*/






/*
    static byte[] access$802(CameraActivity cameraactivity, byte abyte0[])
    {
        cameraactivity.compressedImage = abyte0;
        return abyte0;
    }

*/

}

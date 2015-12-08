// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package io.card.payment:
//            CardIOActivity, DetectionInfo

class CardScanner
    implements android.hardware.Camera.AutoFocusCallback, android.hardware.Camera.PreviewCallback, android.view.SurfaceHolder.Callback
{

    static final boolean $assertionsDisabled;
    private static final String TAG;
    private static boolean manualFallbackForError;
    private static boolean processingInProgress;
    private long captureStart;
    private Bitmap detectedBitmap;
    private int frameCount;
    private boolean isSurfaceValid;
    private long mAutoFocusCompletedAt;
    private long mAutoFocusStartedAt;
    private Camera mCamera;
    private boolean mFirstPreviewFrame;
    private int mFrameOrientation;
    private byte mPreviewBuffer[];
    final int mPreviewHeight = 480;
    final int mPreviewWidth = 640;
    protected WeakReference mScanActivityRef;
    private boolean mScanExpiry;
    private boolean mSuppressScan;
    private int numAutoRefocus;
    private int numFramesSkipped;
    private int numManualRefocus;
    private int numManualTorchChange;
    protected boolean useCamera;

    CardScanner(CardIOActivity cardioactivity, int i)
    {
        boolean flag = true;
        super();
        mSuppressScan = false;
        mFrameOrientation = 1;
        mFirstPreviewFrame = true;
        mAutoFocusStartedAt = 0L;
        mAutoFocusCompletedAt = 0L;
        mCamera = null;
        useCamera = true;
        isSurfaceValid = false;
        frameCount = 0;
        Intent intent = cardioactivity.getIntent();
        if (intent != null)
        {
            mSuppressScan = intent.getBooleanExtra("io.card.payment.suppressScan", false);
            if (!intent.getBooleanExtra("io.card.payment.requireExpiry", false) || !intent.getBooleanExtra("io.card.payment.scanExpiry", true))
            {
                flag = false;
            }
            mScanExpiry = flag;
        }
        mScanActivityRef = new WeakReference(cardioactivity);
        mFrameOrientation = i;
        nSetup(mSuppressScan, 6F);
    }

    private Camera connectToCamera(int i, int j)
    {
        long l = System.currentTimeMillis();
        if (!useCamera) goto _L2; else goto _L1
_L1:
        Camera camera = Camera.open();
        return camera;
        Object obj;
        obj;
        Log.w("card.io", "Wasn't able to connect to camera service. Waiting and trying again...");
        Thread.sleep(i);
        int k = j;
_L3:
        j = k;
        if (System.currentTimeMillis() - l < (long)k) goto _L1; else goto _L2
_L2:
        Log.w(TAG, "camera connect timeout");
        return null;
        obj;
        Log.e("card.io", "Interrupted while waiting for camera", ((Throwable) (obj)));
        k = j;
          goto _L3
        obj;
        Log.e("card.io", "Unexpected exception. Please report it to support@card.io", ((Throwable) (obj)));
        k = 0;
          goto _L3
    }

    private boolean makePreviewGo(SurfaceHolder surfaceholder)
    {
        if (!$assertionsDisabled && surfaceholder == null)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && surfaceholder.getSurface() == null)
        {
            throw new AssertionError();
        }
        Log.d(TAG, (new StringBuilder()).append("surfaceFrame: ").append(String.valueOf(surfaceholder.getSurfaceFrame())).toString());
        mFirstPreviewFrame = true;
        if (useCamera)
        {
            try
            {
                mCamera.setPreviewDisplay(surfaceholder);
            }
            // Misplaced declaration of an exception variable
            catch (SurfaceHolder surfaceholder)
            {
                Log.e("card.io", "can't set preview display", surfaceholder);
                return false;
            }
            try
            {
                mCamera.startPreview();
                mCamera.autoFocus(this);
                Log.d(TAG, "startPreview success");
            }
            // Misplaced declaration of an exception variable
            catch (SurfaceHolder surfaceholder)
            {
                Log.e("card.io", "startPreview failed on camera. Error: ", surfaceholder);
                return false;
            }
        }
        return true;
    }

    private native void nCleanup();

    private native void nGetGuideFrame(int i, int j, int k, Rect rect);

    private native int nGetNumFramesScanned();

    private native void nResetAnalytics();

    private native void nScanFrame(byte abyte0[], int i, int j, int k, DetectionInfo detectioninfo, Bitmap bitmap, boolean flag);

    private native void nSetup(boolean flag, float f);

    public static native boolean nUseNeon();

    public static native boolean nUseTegra();

    static boolean processorSupported()
    {
        return !manualFallbackForError && (nUseNeon() || nUseTegra());
    }

    public void endScanning()
    {
        if (mCamera != null)
        {
            pauseScanning();
        }
        nCleanup();
        mPreviewBuffer = null;
    }

    Rect getGuideFrame(int i, int j)
    {
        return getGuideFrame(mFrameOrientation, i, j);
    }

    Rect getGuideFrame(int i, int j, int k)
    {
        Rect rect = null;
        if (processorSupported())
        {
            rect = new Rect();
            nGetGuideFrame(i, j, k, rect);
        }
        return rect;
    }

    boolean isAutoFocusing()
    {
        return mAutoFocusCompletedAt < mAutoFocusStartedAt;
    }

    public boolean isFlashOn()
    {
        if (!useCamera)
        {
            return false;
        } else
        {
            return mCamera.getParameters().getFlashMode().equals("torch");
        }
    }

    public void onAutoFocus(boolean flag, Camera camera)
    {
        mAutoFocusCompletedAt = System.currentTimeMillis();
    }

    void onEdgeUpdate(DetectionInfo detectioninfo)
    {
        ((CardIOActivity)mScanActivityRef.get()).onEdgeUpdate(detectioninfo);
    }

    public void onPreviewFrame(byte abyte0[], Camera camera)
    {
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        Log.w(TAG, "frame is null! skipping");
_L4:
        return;
_L2:
        if (!processingInProgress)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.e(TAG, "processing in progress.... dropping frame");
        numFramesSkipped = numFramesSkipped + 1;
        if (camera != null)
        {
            camera.addCallbackBuffer(abyte0);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        DetectionInfo detectioninfo;
        processingInProgress = true;
        if (mFirstPreviewFrame)
        {
            Log.d(TAG, "mFirstPreviewFrame");
            mFirstPreviewFrame = false;
            mFrameOrientation = 1;
            ((CardIOActivity)mScanActivityRef.get()).onFirstFrame(1);
        }
        detectioninfo = new DetectionInfo();
        nScanFrame(abyte0, 640, 480, mFrameOrientation, detectioninfo, detectedBitmap, mScanExpiry);
        boolean flag;
        if (detectioninfo.focusScore >= 6F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L6; else goto _L5
_L5:
        triggerAutoFocus(false);
_L8:
        if (camera != null)
        {
            camera.addCallbackBuffer(abyte0);
        }
        processingInProgress = false;
        return;
_L6:
        if (detectioninfo.predicted() || mSuppressScan && detectioninfo.detected())
        {
            Log.d(TAG, (new StringBuilder()).append("detected card: ").append(detectioninfo.creditCard()).toString());
            ((CardIOActivity)mScanActivityRef.get()).onCardDetected(detectedBitmap, detectioninfo);
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void pauseScanning()
    {
        setFlashOn(false);
        if (mCamera != null)
        {
            try
            {
                mCamera.stopPreview();
                mCamera.setPreviewDisplay(null);
            }
            catch (IOException ioexception)
            {
                Log.w("card.io", "can't stop preview display", ioexception);
            }
            mCamera.setPreviewCallback(null);
            mCamera.release();
            mPreviewBuffer = null;
            Log.d(TAG, "- released camera");
            mCamera = null;
        }
        Log.i(TAG, "scan paused");
    }

    void prepareScanner()
    {
        Log.v(TAG, "prepareScanner()");
        mFirstPreviewFrame = true;
        mAutoFocusStartedAt = 0L;
        mAutoFocusCompletedAt = 0L;
        numManualRefocus = 0;
        numAutoRefocus = 0;
        numManualTorchChange = 0;
        numFramesSkipped = 0;
        if (!useCamera || mCamera != null) goto _L2; else goto _L1
_L1:
        mCamera = connectToCamera(50, 5000);
        if (mCamera != null) goto _L4; else goto _L3
_L3:
        Log.e("card.io", "prepare scanner couldn't connect to camera!");
_L8:
        return;
_L4:
        android.hardware.Camera.Parameters parameters;
        List list;
        Log.v(TAG, "camera is connected");
        mCamera.setDisplayOrientation(90);
        parameters = mCamera.getParameters();
        list = parameters.getSupportedPreviewSizes();
        if (list == null) goto _L6; else goto _L5
_L5:
        android.hardware.Camera.Size size;
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_341;
            }
            size = (android.hardware.Camera.Size)iterator.next();
        } while (size.width != 640 || size.height != 480);
_L10:
        if (size == null)
        {
            Log.w("card.io", "Didn't find a supported 640x480 resolution, so forcing");
            size = (android.hardware.Camera.Size)list.get(0);
            size.width = 640;
            size.height = 480;
        }
_L6:
        Log.d(TAG, (new StringBuilder()).append("- parameters: ").append(parameters).toString());
        parameters.setPreviewSize(640, 480);
        mCamera.setParameters(parameters);
_L9:
        if (detectedBitmap != null) goto _L8; else goto _L7
_L7:
        detectedBitmap = Bitmap.createBitmap(428, 270, android.graphics.Bitmap.Config.ARGB_8888);
        return;
_L2:
        if (!useCamera)
        {
            Log.w(TAG, "useCamera is false!");
        } else
        if (mCamera != null)
        {
            Log.v(TAG, (new StringBuilder()).append("we already have a camera instance: ").append(mCamera).toString());
        }
          goto _L9
          goto _L8
        size = null;
          goto _L10
    }

    boolean resumeScanning(SurfaceHolder surfaceholder)
    {
        Log.v(TAG, (new StringBuilder()).append("resumeScanning(").append(surfaceholder).append(")").toString());
        if (mCamera == null)
        {
            Log.v(TAG, "preparing the scanner...");
            prepareScanner();
            Log.v(TAG, "preparations complete");
        }
        if (useCamera && mCamera == null)
        {
            Log.i(TAG, "null camera. failure");
            return false;
        }
        if (!$assertionsDisabled && surfaceholder == null)
        {
            throw new AssertionError();
        }
        if (useCamera && mPreviewBuffer == null)
        {
            Log.v(TAG, (new StringBuilder()).append("- mCamera:").append(mCamera).toString());
            int i = mCamera.getParameters().getPreviewFormat();
            Log.v(TAG, (new StringBuilder()).append("- preview format: ").append(i).toString());
            i = ImageFormat.getBitsPerPixel(i) / 8;
            Log.v(TAG, (new StringBuilder()).append("- bytes per pixel: ").append(i).toString());
            i = i * 0x4b000 * 3;
            Log.v(TAG, (new StringBuilder()).append("- buffer size: ").append(i).toString());
            mPreviewBuffer = new byte[i];
            mCamera.addCallbackBuffer(mPreviewBuffer);
        }
        surfaceholder.addCallback(this);
        surfaceholder.setType(3);
        if (useCamera)
        {
            mCamera.setPreviewCallbackWithBuffer(this);
        }
        if (isSurfaceValid)
        {
            makePreviewGo(surfaceholder);
        }
        setFlashOn(false);
        captureStart = System.currentTimeMillis();
        nResetAnalytics();
        return true;
    }

    void setDeviceOrientation(int i)
    {
        mFrameOrientation = i;
    }

    public boolean setFlashOn(boolean flag)
    {
        if (mCamera == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        Log.d(TAG, (new StringBuilder()).append("setFlashOn: ").append(flag).toString());
        android.hardware.Camera.Parameters parameters = mCamera.getParameters();
        String s;
        if (flag)
        {
            s = "torch";
        } else
        {
            s = "off";
        }
        parameters.setFlashMode(s);
        mCamera.setParameters(parameters);
        numManualTorchChange = numManualTorchChange + 1;
        return true;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w(TAG, (new StringBuilder()).append("Could not set flash mode: ").append(runtimeexception).toString());
        return false;
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        String s = TAG;
        boolean flag;
        if (surfaceholder != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Log.d(s, String.format("Preview.surfaceChanged(holder?:%b, f:%d, w:%d, h:%d )", new Object[] {
            Boolean.valueOf(flag), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k)
        }));
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        Log.d(TAG, "Preview.surfaceCreated()");
        if (mCamera != null || !useCamera)
        {
            isSurfaceValid = true;
            makePreviewGo(surfaceholder);
            Log.d(TAG, "Preview.surfaceCreated(), surface is valid");
            return;
        } else
        {
            Log.wtf("card.io", "CardScanner.surfaceCreated() - camera is null!");
            return;
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        Log.d(TAG, "Preview.surfaceDestroyed()");
        if (mCamera != null)
        {
            try
            {
                mCamera.stopPreview();
            }
            // Misplaced declaration of an exception variable
            catch (SurfaceHolder surfaceholder)
            {
                Log.e("card.io", "error stopping camera", surfaceholder);
            }
        }
        isSurfaceValid = false;
    }

    void triggerAutoFocus(boolean flag)
    {
        if (!useCamera || isAutoFocusing())
        {
            break MISSING_BLOCK_LABEL_83;
        }
        mAutoFocusStartedAt = System.currentTimeMillis();
        mCamera.autoFocus(this);
        if (flag)
        {
            try
            {
                numManualRefocus = numManualRefocus + 1;
                return;
            }
            catch (RuntimeException runtimeexception)
            {
                Log.w(TAG, (new StringBuilder()).append("could not trigger auto focus: ").append(runtimeexception).toString());
            }
            break MISSING_BLOCK_LABEL_83;
        }
        numAutoRefocus = numAutoRefocus + 1;
        return;
    }

    static 
    {
        boolean flag;
        if (!io/card/payment/CardScanner.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
        TAG = io/card/payment/CardScanner.getSimpleName();
        manualFallbackForError = false;
        Log.i("card.io", "card.io 5.0.1 06/04/2015 17:39:33 -0500");
        System.loadLibrary("cardioDecider");
        Log.d("card.io", (new StringBuilder()).append("Loaded card.io decider library.  nUseNeon():").append(nUseNeon()).append(",nUseTegra():").append(nUseTegra()).toString());
        if (nUseNeon() || nUseTegra())
        {
            System.loadLibrary("opencv_core");
            Log.d("card.io", "Loaded opencv core library");
            System.loadLibrary("opencv_imgproc");
            Log.d("card.io", "Loaded opencv imgproc library");
        }
        if (!nUseNeon()) goto _L2; else goto _L1
_L1:
        System.loadLibrary("cardioRecognizer");
        Log.i("card.io", "Loaded card.io NEON library");
_L4:
        processingInProgress = false;
        return;
_L2:
        UnsatisfiedLinkError unsatisfiedlinkerror;
        if (nUseTegra())
        {
            System.loadLibrary("cardioRecognizer_tegra2");
            Log.i("card.io", "Loaded card.io Tegra2 library");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            Log.w("card.io", "unsupported processor - card.io scanning requires ARMv7 architecture");
            manualFallbackForError = true;
        }
        // Misplaced declaration of an exception variable
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            Log.e("card.io", (new StringBuilder()).append("Failed to load native library: ").append(unsatisfiedlinkerror.getMessage()).toString());
            manualFallbackForError = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}

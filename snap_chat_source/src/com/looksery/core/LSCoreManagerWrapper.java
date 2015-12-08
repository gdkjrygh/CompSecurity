// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.looksery.core;

import android.content.Context;
import android.content.res.AssetManager;
import android.opengl.GLES20;
import fN;
import fO;
import fP;
import fQ;
import fR;
import fS;
import java.lang.ref.WeakReference;

public class LSCoreManagerWrapper
{

    private static final boolean DEBUG = false;
    public static final String RESOURCE_SOURCE_ASSET = "asset:";
    public static final String RESOURCE_SOURCE_FILE = "file:";
    private static final String TAG = com/looksery/core/LSCoreManagerWrapper.getName();
    private static AssetManager sAssets;
    private static WeakReference sEmotionListenerWeakReference = new WeakReference(null);
    private static WeakReference sFaceDetectionListenerWeakReference = new WeakReference(null);
    private static boolean sNativeLibLoadedSuccessfully = false;
    private static WeakReference sPhotoCaptureListenerWeakReference;

    public LSCoreManagerWrapper()
    {
    }

    public static void addFilter(String s)
    {
        nativeAddFilter(s);
    }

    public static void applySoundEffectsToInt16Data(byte abyte0[], int i, int j)
    {
        nativeApplySoundEffectsToInt16Data(abyte0, i, j);
    }

    public static void checkIfPointAtFace(int i, int j, fP fp)
    {
        sFaceDetectionListenerWeakReference = new WeakReference(fp);
        nativeCheckIfPointAtFace(i, j);
    }

    public static int createCameraTexture()
    {
        return nativeCreateTexture();
    }

    public static void deinitializeUnusedFilters()
    {
        nativeDeinitializeUnusedFilters();
    }

    public static void drawCameraImage()
    {
        nativeDrawCameraImage();
    }

    public static void drawRecorderTexture()
    {
        nativeDrawRecorderTexture();
    }

    public static void emotionEvent(int i)
    {
        if ((fO)sEmotionListenerWeakReference.get() != null)
        {
            fN.a(i);
        }
    }

    static AssetManager getAssetsManger()
    {
        return sAssets;
    }

    public static int getRecorderTextureId()
    {
        return nativeGetRecorderTextureId();
    }

    public static void init(Context context)
    {
        context = context.getAssets();
        sAssets = context;
        nativeInit(context);
    }

    public static boolean isNativeLibLoadedSuccessfully()
    {
        return sNativeLibLoadedSuccessfully;
    }

    private static native String jniCheckString();

    private static native void nativeAddFilter(String s);

    private static native void nativeApplySoundEffectsToInt16Data(byte abyte0[], int i, int j);

    public static native void nativeCheckIfPointAtFace(int i, int j);

    private static native int nativeCreateTexture();

    private static native void nativeDeinitializeUnusedFilters();

    private static native void nativeDrawCameraImage();

    private static native void nativeDrawRecorderTexture();

    public static native long nativeGetMetadataFileLength();

    private static native int nativeGetRecorderTextureId();

    private static native void nativeInit(AssetManager assetmanager);

    private static native void nativeProcessImage();

    private static native void nativeProcessImageFromYUV(byte abyte0[]);

    public static native void nativeReadPreviousProcessedFrame(byte abyte0[], int i);

    public static native void nativeReadPreviousProcessedFrameAsNV21Array(byte abyte0[]);

    private static native void nativeRelease();

    private static native void nativeRemoveAllFilters();

    private static native void nativeRemoveFilter(String s);

    public static native void nativeRenderFileFrame();

    private static native void nativeRequestSaveFrame();

    private static native void nativeRestartTracking(boolean flag, int i, int j);

    private static native void nativeSetCameraTextureId(int i);

    public static native void nativeSetFileDataSource(String s);

    private static native void nativeSetFilterParam(String s, String s1, String s2);

    private static native void nativeSetInputImageRotation(int i);

    private static native void nativeSetInputImageSize(int i, int j);

    private static native void nativeSetProcessingSize(int i, int j);

    private static native void nativeSetRecorderImageSize(int i, int j);

    public static native void nativeSetRecording(boolean flag);

    private static native void nativeSetResourcePath(String s, String s1, String s2);

    private static native void nativeSetScreenSize(int i, int j);

    private static native void nativeSetTextureTransform(float af[]);

    private static native void nativeSetUseWatermark(boolean flag);

    private static native void nativeSetWatermarkSettings(String s, double d);

    public static void onFaceDetectionResult(boolean flag)
    {
        fP fp = (fP)sFaceDetectionListenerWeakReference.get();
        if (fp != null)
        {
            fp.a(flag);
        }
    }

    public static void printOpenGLVersion()
    {
        String s = GLES20.glGetString(7938);
        String s1 = GLES20.glGetString(7937);
        String s2 = GLES20.glGetString(7936);
        String s3 = GLES20.glGetString(35724);
        String s4 = GLES20.glGetString(7939);
        (new StringBuilder("glVersion ")).append(s).append(" glRenderer ").append(s1).append(" glVendor ").append(s2).append(" glShadingLanguageVersion ").append(s3).append(" glExtensions ").append(s4);
        (new StringBuilder("Shader version: ")).append(GLES20.glGetString(35724));
        jniCheckString();
    }

    public static void processImage()
    {
        nativeProcessImage();
    }

    public static void processImage(byte abyte0[])
    {
        nativeProcessImageFromYUV(abyte0);
    }

    public static void readPreviousProcessedFrame(byte abyte0[], int i)
    {
        nativeReadPreviousProcessedFrame(abyte0, i);
    }

    public static void readPreviousProcessedFrameAsNV21Array(byte abyte0[])
    {
        nativeReadPreviousProcessedFrameAsNV21Array(abyte0);
    }

    public static void release()
    {
        nativeRelease();
        sAssets = null;
    }

    public static void removeAllFilters()
    {
        nativeRemoveAllFilters();
    }

    public static void removeFilter(String s)
    {
        nativeRemoveFilter(s);
    }

    public static void requestSaveFrame(fS fs)
    {
        sPhotoCaptureListenerWeakReference = new WeakReference(fs);
        nativeRequestSaveFrame();
    }

    public static void restartTracking(int i, int j)
    {
        nativeRestartTracking(true, i, j);
    }

    public static void restartTrackingWithoutVisualisation()
    {
        nativeRestartTracking(false, 0, 0);
    }

    public static void saveFrame(int i, int j, int k, int ai[])
    {
        fS fs = (fS)sPhotoCaptureListenerWeakReference.get();
        if (fs != null)
        {
            fs.a(new fR(ai, i, j, k));
        }
    }

    public static void setCameraTextureId(int i)
    {
        nativeSetCameraTextureId(i);
    }

    public static void setEmotionListener(fO fo)
    {
        sEmotionListenerWeakReference = new WeakReference(fo);
    }

    public static void setFileDataSource(String s)
    {
        nativeSetFileDataSource(s);
    }

    public static void setFilterParam(String s, String s1, String s2)
    {
        nativeSetFilterParam(s, s1, s2);
    }

    public static void setInputImageRotation(int i)
    {
        nativeSetInputImageRotation(i);
    }

    public static void setInputImageSize(fQ fq)
    {
        nativeSetInputImageSize(fq.b, fq.c);
    }

    public static void setProcessingSize(fQ fq)
    {
        nativeSetProcessingSize(fq.b, fq.c);
    }

    public static void setRecorderImageSize(fQ fq)
    {
        nativeSetRecorderImageSize(fq.b, fq.c);
    }

    public static void setResourcePath(String s, String s1, String s2)
    {
        nativeSetResourcePath(s, s1, s2);
    }

    public static void setScreenSize(fQ fq)
    {
        nativeSetScreenSize(fq.b, fq.c);
    }

    public static void setTextureTransform(float af[])
    {
        nativeSetTextureTransform(af);
    }

    public static void setUseWatermark(boolean flag)
    {
        nativeSetUseWatermark(flag);
    }

    public static void setWatermarkSettings(String s, double d)
    {
        nativeSetWatermarkSettings(s, d);
    }

    static 
    {
        try
        {
            System.loadLibrary("c++_shared");
            System.loadLibrary("opencv");
            System.loadLibrary("looksery");
            sNativeLibLoadedSuccessfully = true;
            setResourcePath("asset:looksery/core", "dummyResourcesPath", "dummyDocumentsPath");
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            (new StringBuilder("UnsatisfiedLinkError: ")).append(unsatisfiedlinkerror.getMessage());
            sNativeLibLoadedSuccessfully = false;
        }
    }
}

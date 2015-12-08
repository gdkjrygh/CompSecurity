// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.consumerphotoeditor.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;

// Referenced classes of package com.google.android.apps.consumerphotoeditor.core:
//            PipelineParams, Look, EditProcessorInitializationResult

public class Renderer
{

    private long editProcessorHandle;
    private boolean isNDEEnabled;

    public Renderer()
    {
        editProcessorHandle = 0L;
        allocate();
    }

    private native void allocate();

    public static native PipelineParams computeEndPipelineParamsForResetRotateAnimation(PipelineParams pipelineparams, float f, boolean flag, PipelineParams pipelineparams1);

    public static native PipelineParams computeRotationAnimationPipelineParams(PipelineParams pipelineparams, PipelineParams pipelineparams1, float f, float af[], PipelineParams pipelineparams2);

    public static native float[] computeSmoothFactorForResetRotateAnimation(PipelineParams pipelineparams, PipelineParams pipelineparams1);

    public static native RectF getImageScreenRect(PipelineParams pipelineparams);

    public static native RectF getUserFriendlyCropCoordinates(PipelineParams pipelineparams);

    public static native boolean isCropWidthConstrained(PipelineParams pipelineparams, float f, float f1, float f2, float f3);

    public static native PipelineParams magicMove(PipelineParams pipelineparams, float f, int i, float f1, boolean flag, float f2, float f3, float f4, 
            float f5);

    public static native PipelineParams magicPinch(PipelineParams pipelineparams, float f, float f1, float f2, float f3, float f4);

    public static native PipelineParams magicStraighten(PipelineParams pipelineparams, float f, float f1);

    public static native PipelineParams zoomCenterForMove(PipelineParams pipelineparams);

    public native void cancelComputeEditingData();

    public native boolean computeEditingData(boolean flag);

    public native Bitmap computeResultImage(PipelineParams pipelineparams, boolean flag);

    public native void dispose();

    public native boolean drawFrame();

    public native PipelineParams getAdjustmentsAutoParams(PipelineParams pipelineparams);

    public native PipelineParams getCropAndRotateAutoParams(PipelineParams pipelineparams);

    public native byte[] getEditListBytes();

    public native Look[] getLooks(int i);

    public native PipelineParams getPipelineParams();

    public native Bitmap getScreenShot();

    public native EditProcessorInitializationResult initialize(Context context, Bitmap bitmap, byte abyte0[], boolean flag);

    public native boolean loadLookupTable();

    public native boolean loadPopImageTexture();

    public native void markProcessorInitialized(boolean flag);

    public native boolean setGPUInputImage(Bitmap bitmap, Bitmap bitmap1, float f);

    public native boolean setPipelineParams(PipelineParams pipelineparams);

    public native boolean surfaceChanged(int i, int j);

    public native int surfaceCreated(Context context);

    static 
    {
        System.loadLibrary("consumerphotoeditor_native");
    }
}

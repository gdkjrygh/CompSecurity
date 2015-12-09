// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.View;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode;
import com.google.android.libraries.commerce.ocr.capture.processors.GatingProcessor;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.android.libraries.commerce.ocr.cv.ResourcePool;
import com.google.android.libraries.commerce.ocr.util.ExecutorServiceFactory;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ui:
//            CameraPreviewView

public final class CameraPreviewPresenterImpl
    implements CameraPreviewView.Presenter
{

    private final boolean cachePreviewImage;
    private volatile OcrImage cachedPreviewImage;
    private final ExecutorService cameraExecutorService;
    private final CameraManager cameraManager;
    private volatile GatingProcessor gatingProcessor;
    private final boolean killFrameProcessorsOnSurfaceDestroy;
    private final ResourcePool ocrImagePool;
    private CameraPreviewView.OnErrorCallback onErrorCallback;
    private CameraPreviewView.OnPreviewLayoutFinalizedCallback onPreviewLayoutFinalizedCallback;
    private com.google.android.libraries.commerce.ocr.capture.CameraManager.OnFinishCallback onPreviewReadyCallback;
    private volatile PipelineNode pipelineProcessor;
    private boolean previewing;
    private boolean startPreviewOnResume;
    private CameraPreviewView view;

    public CameraPreviewPresenterImpl(ExecutorServiceFactory executorservicefactory, CameraManager cameramanager, ResourcePool resourcepool, PipelineNode pipelinenode, GatingProcessor gatingprocessor, boolean flag, boolean flag1)
    {
        this(executorservicefactory.create(1, 1, 0L, 1), cameramanager, resourcepool, pipelinenode, gatingprocessor, flag, flag1);
    }

    private CameraPreviewPresenterImpl(ExecutorService executorservice, CameraManager cameramanager, ResourcePool resourcepool, PipelineNode pipelinenode, GatingProcessor gatingprocessor, boolean flag, boolean flag1)
    {
        previewing = false;
        startPreviewOnResume = true;
        cachedPreviewImage = null;
        cameraExecutorService = executorservice;
        cameraManager = cameramanager;
        ocrImagePool = resourcepool;
        pipelineProcessor = pipelinenode;
        gatingProcessor = gatingprocessor;
        if (gatingprocessor != null)
        {
            gatingprocessor.block();
        }
        cachePreviewImage = flag1;
        killFrameProcessorsOnSurfaceDestroy = flag;
    }

    private void handleCameraException(Exception exception)
    {
        Log.e("CameraPreviewPresenterImpl", exception.toString());
        if (onErrorCallback != null)
        {
            onErrorCallback.onError();
        }
    }

    public final void enableImageProcessing()
    {
        if (gatingProcessor != null)
        {
            gatingProcessor.allow();
        }
    }

    public final void onPreviewLayoutFinalized(Rect rect, Point point)
    {
        onPreviewLayoutFinalizedCallback.onFinalized(rect, point);
    }

    public final void setOnErrorCallback(CameraPreviewView.OnErrorCallback onerrorcallback)
    {
        onErrorCallback = onerrorcallback;
    }

    public final void setOnPreviewLayoutFinalizedCallback(CameraPreviewView.OnPreviewLayoutFinalizedCallback onpreviewlayoutfinalizedcallback)
    {
        onPreviewLayoutFinalizedCallback = onpreviewlayoutfinalizedcallback;
    }

    public final void setOnPreviewReadyCallback(com.google.android.libraries.commerce.ocr.capture.CameraManager.OnFinishCallback onfinishcallback)
    {
        onPreviewReadyCallback = onfinishcallback;
    }

    public final void setPipelineNodeAndGate(PipelineNode pipelinenode, GatingProcessor gatingprocessor)
    {
        if (pipelineProcessor != null)
        {
            pipelineProcessor.shutdown();
        }
        if (gatingProcessor != null)
        {
            gatingProcessor.block();
        }
        gatingProcessor = gatingprocessor;
        pipelineProcessor = pipelinenode;
    }

    public final void setStartPreviewOnResume(boolean flag)
    {
        startPreviewOnResume = flag;
    }

    public final void setView(CameraPreviewView camerapreviewview)
    {
        view = camerapreviewview;
    }

    public final void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        Log.d("CameraPreviewPresenterImpl", (new StringBuilder(47)).append("Camera surface changed: ").append(j).append(",").append(k).toString());
    }

    public final void surfaceCreated(final SurfaceHolder holder)
    {
        Log.d("CameraPreviewPresenterImpl", "Camera surface created");
        if (previewing)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        Point point = new Point(view.toView().getWidth(), view.toView().getHeight());
        String s = String.valueOf(point);
        Log.d("CameraPreviewPresenterImpl", (new StringBuilder(String.valueOf(s).length() + 23)).append("Camera container size: ").append(s).toString());
        cameraManager.openDriver(point, holder, new com.google.android.libraries.commerce.ocr.capture.CameraManager.OnFinishCallback() {

            final CameraPreviewPresenterImpl this$0;
            final SurfaceHolder val$holder;

            public final void onFinish()
            {
                boolean flag = false;
                Object obj = cameraManager.getPreviewSize();
                view.setPreviewPadding(((Point) (obj)).x, ((Point) (obj)).y);
                if (onPreviewReadyCallback != null)
                {
                    onPreviewReadyCallback.onFinish();
                }
                cameraManager.addContinuousPreviewImageCallback(new com.google.android.libraries.commerce.ocr.capture.CameraManager.ImageCallback() {

                    final _cls1 this$1;

                    public final void onImage(OcrImage ocrimage)
                    {
                        if (cachePreviewImage)
                        {
                            if (cachedPreviewImage == null || !cachedPreviewImage.isSameType(ocrimage))
                            {
                                cachedPreviewImage = new OcrImage(ocrimage);
                            } else
                            {
                                cachedPreviewImage.copyFrom(ocrimage);
                            }
                        }
                        pipelineProcessor.process(ocrimage);
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
                if (startPreviewOnResume || cachedPreviewImage == null)
                {
                    cameraExecutorService.execute(new Runnable() {

                        final _cls1 this$1;

                        public final void run()
                        {
                            cameraManager.startPreview(null);
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                    return;
                }
                obj = holder.getSurfaceFrame();
                Canvas canvas = holder.lockCanvas();
                new ImageUtil();
                Bitmap bitmap = ImageUtil.convertPreviewToBitmap(cachedPreviewImage.getData(), cachedPreviewImage.getResolution(), cachedPreviewImage.getFormat(), new Rect(0, 0, cachedPreviewImage.getWidth(), cachedPreviewImage.getHeight()));
                if (cachedPreviewImage.getOrientation() % 180 == 0)
                {
                    flag = true;
                }
                Matrix matrix;
                int i;
                int j;
                if (flag)
                {
                    i = bitmap.getWidth();
                } else
                {
                    i = bitmap.getHeight();
                }
                if (flag)
                {
                    j = bitmap.getHeight();
                } else
                {
                    j = bitmap.getWidth();
                }
                matrix = new Matrix();
                matrix.postRotate(cachedPreviewImage.getOrientation());
                matrix.postTranslate(i, 0.0F);
                matrix.postScale((float)((Rect) (obj)).right / (float)i, (float)((Rect) (obj)).bottom / (float)j);
                canvas.drawBitmap(bitmap, matrix, null);
                holder.unlockCanvasAndPost(canvas);
            }

            
            {
                this$0 = CameraPreviewPresenterImpl.this;
                holder = surfaceholder;
                super();
            }
        });
        previewing = true;
        return;
        holder;
        holder.printStackTrace();
        handleCameraException(holder);
        return;
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        cameraManager.stopPreview();
        if (killFrameProcessorsOnSurfaceDestroy && pipelineProcessor != null)
        {
            pipelineProcessor.shutdown();
        }
        Log.d("CameraPreviewPresenterImpl", "Camera surface destroyed");
        cameraManager.closeDriver();
        ocrImagePool.close();
        previewing = false;
    }







/*
    static OcrImage access$402(CameraPreviewPresenterImpl camerapreviewpresenterimpl, OcrImage ocrimage)
    {
        camerapreviewpresenterimpl.cachedPreviewImage = ocrimage;
        return ocrimage;
    }

*/



}

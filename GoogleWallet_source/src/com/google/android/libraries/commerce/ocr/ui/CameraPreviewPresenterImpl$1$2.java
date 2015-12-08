// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.SurfaceHolder;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ui:
//            CameraPreviewPresenterImpl, CameraPreviewView

final class this._cls1
    implements Runnable
{

    final back this$1;

    public final void run()
    {
        CameraPreviewPresenterImpl.access$000(_fld0).startPreview(null);
    }

    l.holder()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/android/libraries/commerce/ocr/ui/CameraPreviewPresenterImpl$1

/* anonymous class */
    final class CameraPreviewPresenterImpl._cls1
        implements com.google.android.libraries.commerce.ocr.capture.CameraManager.OnFinishCallback
    {

        final CameraPreviewPresenterImpl this$0;
        final SurfaceHolder val$holder;

        public final void onFinish()
        {
            boolean flag = false;
            Object obj = CameraPreviewPresenterImpl.access$000(CameraPreviewPresenterImpl.this).getPreviewSize();
            CameraPreviewPresenterImpl.access$100(CameraPreviewPresenterImpl.this).setPreviewPadding(((Point) (obj)).x, ((Point) (obj)).y);
            if (CameraPreviewPresenterImpl.access$200(CameraPreviewPresenterImpl.this) != null)
            {
                CameraPreviewPresenterImpl.access$200(CameraPreviewPresenterImpl.this).onFinish();
            }
            CameraPreviewPresenterImpl.access$000(CameraPreviewPresenterImpl.this).addContinuousPreviewImageCallback(new CameraPreviewPresenterImpl._cls1._cls1());
            if (CameraPreviewPresenterImpl.access$600(CameraPreviewPresenterImpl.this) || CameraPreviewPresenterImpl.access$400(CameraPreviewPresenterImpl.this) == null)
            {
                CameraPreviewPresenterImpl.access$700(CameraPreviewPresenterImpl.this).execute(new CameraPreviewPresenterImpl._cls1._cls2());
                return;
            }
            obj = holder.getSurfaceFrame();
            Canvas canvas = holder.lockCanvas();
            new ImageUtil();
            Bitmap bitmap = ImageUtil.convertPreviewToBitmap(CameraPreviewPresenterImpl.access$400(CameraPreviewPresenterImpl.this).getData(), CameraPreviewPresenterImpl.access$400(CameraPreviewPresenterImpl.this).getResolution(), CameraPreviewPresenterImpl.access$400(CameraPreviewPresenterImpl.this).getFormat(), new Rect(0, 0, CameraPreviewPresenterImpl.access$400(CameraPreviewPresenterImpl.this).getWidth(), CameraPreviewPresenterImpl.access$400(CameraPreviewPresenterImpl.this).getHeight()));
            if (CameraPreviewPresenterImpl.access$400(CameraPreviewPresenterImpl.this).getOrientation() % 180 == 0)
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
            matrix.postRotate(CameraPreviewPresenterImpl.access$400(CameraPreviewPresenterImpl.this).getOrientation());
            matrix.postTranslate(i, 0.0F);
            matrix.postScale((float)((Rect) (obj)).right / (float)i, (float)((Rect) (obj)).bottom / (float)j);
            canvas.drawBitmap(bitmap, matrix, null);
            holder.unlockCanvasAndPost(canvas);
        }

            
            {
                this$0 = final_camerapreviewpresenterimpl;
                holder = SurfaceHolder.this;
                super();
            }

        // Unreferenced inner class com/google/android/libraries/commerce/ocr/ui/CameraPreviewPresenterImpl$1$1

/* anonymous class */
        final class CameraPreviewPresenterImpl._cls1._cls1
            implements com.google.android.libraries.commerce.ocr.capture.CameraManager.ImageCallback
        {

            final CameraPreviewPresenterImpl._cls1 this$1;

            public final void onImage(OcrImage ocrimage)
            {
                if (CameraPreviewPresenterImpl.access$300(this$0))
                {
                    if (CameraPreviewPresenterImpl.access$400(this$0) == null || !CameraPreviewPresenterImpl.access$400(this$0).isSameType(ocrimage))
                    {
                        CameraPreviewPresenterImpl.access$402(this$0, new OcrImage(ocrimage));
                    } else
                    {
                        CameraPreviewPresenterImpl.access$400(this$0).copyFrom(ocrimage);
                    }
                }
                CameraPreviewPresenterImpl.access$500(this$0).process(ocrimage);
            }

                    
                    {
                        this$1 = CameraPreviewPresenterImpl._cls1.this;
                        super();
                    }
        }

    }

}

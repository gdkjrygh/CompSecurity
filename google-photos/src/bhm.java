// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Handler;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;
import com.google.android.apps.consumerphotoeditor.core.Renderer;
import com.google.android.apps.consumerphotoeditor.fragments.ConsumerPhotoEditorActivity;
import com.google.android.apps.consumerphotoeditor.views.CropOverlayView;

public final class bhm
    implements Runnable
{

    private CropOverlayView a;

    public bhm(CropOverlayView cropoverlayview)
    {
        a = cropoverlayview;
        super();
    }

    public final void run()
    {
        if (!CropOverlayView.m(a))
        {
            return;
        }
        float f = Math.min(1.0F, Math.max(0.0F, (float)(System.currentTimeMillis() - CropOverlayView.n(a)) / 300F));
        f = CropOverlayView.o(a).getInterpolation(f);
        Object obj = CropOverlayView.f(a).f();
        if (f >= 0.999F)
        {
            obj.rotateAngle = CropOverlayView.p(a).rotateAngle;
            obj.straightenAngle = CropOverlayView.p(a).straightenAngle;
            obj.zoomScale = CropOverlayView.p(a).zoomScale;
            obj.zoomCenterX = CropOverlayView.p(a).zoomCenterX;
            obj.zoomCenterY = CropOverlayView.p(a).zoomCenterY;
            Matrix matrix = new Matrix();
            matrix.setRotate(-90F, 0.5F, 0.5F);
            matrix.mapRect(a.a);
            matrix.mapRect(CropOverlayView.g(a));
            CropOverlayView.q(a).set(Renderer.getImageScreenRect(((PipelineParams) (obj))));
            CropOverlayView.h(a);
            CropOverlayView.a(a, ((PipelineParams) (obj)));
            CropOverlayView.a(a, ((PipelineParams) (obj)).cropLeft, ((PipelineParams) (obj)).cropTop, ((PipelineParams) (obj)).cropRight, ((PipelineParams) (obj)).cropBottom, ((PipelineParams) (obj)), false);
            obj.cropAngle = 0.0F;
            CropOverlayView.f(a).a(((PipelineParams) (obj)));
            obj = (bee)((ConsumerPhotoEditorActivity)((olq)a.getContext()).getBaseContext()).c().a("CropToolbarFragment");
            if (obj != null)
            {
                ((bee) (obj)).a(false);
            }
            CropOverlayView.r(a);
            if (CropOverlayView.s(a) > 1)
            {
                CropOverlayView.a(a, 1);
            }
            CropOverlayView.t(a);
            return;
        } else
        {
            obj.zoomCenterX = (CropOverlayView.p(a).zoomCenterX - CropOverlayView.u(a).zoomCenterX) * f + CropOverlayView.u(a).zoomCenterX;
            obj.zoomCenterY = (CropOverlayView.p(a).zoomCenterY - CropOverlayView.u(a).zoomCenterY) * f + CropOverlayView.u(a).zoomCenterY;
            obj = Renderer.computeRotationAnimationPipelineParams(CropOverlayView.u(a), CropOverlayView.p(a), f, CropOverlayView.v(a), ((PipelineParams) (obj)));
            CropOverlayView.a(a, ((PipelineParams) (obj)).cropLeft, ((PipelineParams) (obj)).cropTop, ((PipelineParams) (obj)).cropRight, ((PipelineParams) (obj)).cropBottom, ((PipelineParams) (obj)), true);
            CropOverlayView.f(a).a(((PipelineParams) (obj)));
            CropOverlayView.w(a).postDelayed(this, 25L);
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.RectF;
import android.os.Handler;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;
import com.google.android.apps.consumerphotoeditor.core.Renderer;
import com.google.android.apps.consumerphotoeditor.views.CropOverlayView;

public final class bhl
    implements Runnable
{

    private CropOverlayView a;

    public bhl(CropOverlayView cropoverlayview)
    {
        a = cropoverlayview;
        super();
    }

    public final void run()
    {
        if (!CropOverlayView.x(a))
        {
            return;
        }
        float f = Math.min(1.0F, Math.max(0.0F, (float)(System.currentTimeMillis() - CropOverlayView.y(a)) / 300F));
        f = CropOverlayView.z(a).getInterpolation(f);
        if (f >= 0.999F)
        {
            CropOverlayView.c(a, false);
            a.a.left = CropOverlayView.A(a).cropLeft;
            a.a.top = CropOverlayView.A(a).cropTop;
            a.a.right = CropOverlayView.A(a).cropRight;
            a.a.bottom = CropOverlayView.A(a).cropBottom;
            CropOverlayView.q(a).set(Renderer.getImageScreenRect(CropOverlayView.A(a)));
            CropOverlayView.a(a, CropOverlayView.A(a).cropLeft, CropOverlayView.A(a).cropTop, CropOverlayView.A(a).cropRight, CropOverlayView.A(a).cropBottom, CropOverlayView.A(a), true);
            CropOverlayView.f(a).a(CropOverlayView.A(a));
            CropOverlayView.g(a).set(CropOverlayView.A(a).cropLeft, CropOverlayView.A(a).cropTop, CropOverlayView.A(a).cropRight, CropOverlayView.A(a).cropBottom);
            a.c();
            return;
        }
        PipelineParams pipelineparams = CropOverlayView.f(a).f();
        pipelineparams.zoomCenterX = (CropOverlayView.A(a).zoomCenterX - CropOverlayView.B(a).zoomCenterX) * f + CropOverlayView.B(a).zoomCenterX;
        pipelineparams.zoomCenterY = (CropOverlayView.A(a).zoomCenterY - CropOverlayView.B(a).zoomCenterY) * f + CropOverlayView.B(a).zoomCenterY;
        if (CropOverlayView.D(a) == 90)
        {
            pipelineparams = Renderer.computeRotationAnimationPipelineParams(CropOverlayView.B(a), CropOverlayView.A(a), f, CropOverlayView.E(a), pipelineparams);
        } else
        if (CropOverlayView.D(a) == 180)
        {
            if (f <= 0.5F)
            {
                pipelineparams = Renderer.computeRotationAnimationPipelineParams(CropOverlayView.F(a), CropOverlayView.B(a), 1.0F - f * 2.0F, CropOverlayView.E(a), pipelineparams);
            } else
            {
                pipelineparams = Renderer.computeRotationAnimationPipelineParams(CropOverlayView.A(a), CropOverlayView.F(a), 1.0F - (f - 0.5F) * 2.0F, CropOverlayView.G(a), pipelineparams);
            }
        } else
        {
            pipelineparams = Renderer.computeRotationAnimationPipelineParams(CropOverlayView.A(a), CropOverlayView.B(a), 1.0F - f, CropOverlayView.E(a), pipelineparams);
        }
        CropOverlayView.a(a, pipelineparams.cropLeft, pipelineparams.cropTop, pipelineparams.cropRight, pipelineparams.cropBottom, pipelineparams, true);
        CropOverlayView.f(a).a(pipelineparams);
        CropOverlayView.C(a).postDelayed(this, 25L);
    }
}

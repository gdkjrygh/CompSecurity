// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.RectF;
import android.os.Handler;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;
import com.google.android.apps.consumerphotoeditor.core.Renderer;
import com.google.android.apps.consumerphotoeditor.views.CropOverlayView;

public final class bhk
    implements Runnable
{

    private CropOverlayView a;

    public bhk(CropOverlayView cropoverlayview)
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
            CropOverlayView.q(a).set(Renderer.getImageScreenRect(CropOverlayView.A(a)));
            CropOverlayView.a(a, CropOverlayView.A(a).cropLeft, CropOverlayView.A(a).cropTop, CropOverlayView.A(a).cropRight, CropOverlayView.A(a).cropBottom, CropOverlayView.A(a), true);
            CropOverlayView.f(a).a(CropOverlayView.A(a));
            a.c();
            return;
        } else
        {
            PipelineParams pipelineparams = CropOverlayView.f(a).f();
            pipelineparams.cropLeft = (CropOverlayView.A(a).cropLeft - CropOverlayView.B(a).cropLeft) * f + CropOverlayView.B(a).cropLeft;
            pipelineparams.cropTop = (CropOverlayView.A(a).cropTop - CropOverlayView.B(a).cropTop) * f + CropOverlayView.B(a).cropTop;
            pipelineparams.cropRight = (CropOverlayView.A(a).cropRight - CropOverlayView.B(a).cropRight) * f + CropOverlayView.B(a).cropRight;
            pipelineparams.cropBottom = (CropOverlayView.A(a).cropBottom - CropOverlayView.B(a).cropBottom) * f + CropOverlayView.B(a).cropBottom;
            pipelineparams.straightenAngle = (1.0F - f) * CropOverlayView.B(a).straightenAngle;
            CropOverlayView.a(a, pipelineparams.cropLeft, pipelineparams.cropTop, pipelineparams.cropRight, pipelineparams.cropBottom, pipelineparams, false);
            CropOverlayView.f(a).a(pipelineparams);
            CropOverlayView.C(a).postDelayed(this, 25L);
            return;
        }
    }
}

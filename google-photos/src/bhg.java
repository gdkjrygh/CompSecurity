// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.RectF;
import android.os.Handler;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;
import com.google.android.apps.consumerphotoeditor.core.Renderer;
import com.google.android.apps.consumerphotoeditor.views.CropOverlayView;

public final class bhg
    implements Runnable
{

    public final PipelineParams a;
    public long b;
    public int c;
    public final PipelineParams d;
    public PipelineParams e;
    public float f[];
    public float g[];
    public final CropOverlayView h;
    private final msy i = new msy(0.52F, 0.3F, 0.12F, 1.0F);

    public bhg(CropOverlayView cropoverlayview, PipelineParams pipelineparams, PipelineParams pipelineparams1)
    {
        h = cropoverlayview;
        super();
        b = 0L;
        c = 0;
        a = pipelineparams;
        d = pipelineparams1;
    }

    public final void run()
    {
        if (!CropOverlayView.I(h))
        {
            return;
        }
        float f1 = Math.min(1.0F, Math.max(0.0F, (float)(System.currentTimeMillis() - b) / 300F));
        f1 = i.getInterpolation(f1);
        if (f1 >= 0.999F)
        {
            CropOverlayView.d(h, false);
            h.a.left = d.cropLeft;
            h.a.top = d.cropTop;
            h.a.right = d.cropRight;
            h.a.bottom = d.cropBottom;
            CropOverlayView.q(h).set(Renderer.getImageScreenRect(d));
            CropOverlayView.a(h, d.cropLeft, d.cropTop, d.cropRight, d.cropBottom, d, true);
            CropOverlayView.f(h).a(d);
            CropOverlayView.g(h).set(d.cropLeft, d.cropTop, d.cropRight, d.cropBottom);
            h.a(d);
            return;
        }
        PipelineParams pipelineparams = CropOverlayView.f(h).f();
        pipelineparams.zoomCenterX = (d.zoomCenterX - a.zoomCenterX) * f1 + a.zoomCenterX;
        pipelineparams.zoomCenterY = (d.zoomCenterY - a.zoomCenterY) * f1 + a.zoomCenterY;
        if (c == 90)
        {
            pipelineparams = Renderer.computeRotationAnimationPipelineParams(d, a, 1.0F - f1, f, pipelineparams);
        } else
        if (c == 180)
        {
            if (f1 <= 0.5F)
            {
                pipelineparams = Renderer.computeRotationAnimationPipelineParams(a, e, f1 * 2.0F, f, pipelineparams);
            } else
            {
                pipelineparams = Renderer.computeRotationAnimationPipelineParams(e, d, (f1 - 0.5F) * 2.0F, g, pipelineparams);
            }
        } else
        {
            pipelineparams = Renderer.computeRotationAnimationPipelineParams(a, d, f1, f, pipelineparams);
        }
        CropOverlayView.a(h, pipelineparams.cropLeft, pipelineparams.cropTop, pipelineparams.cropRight, pipelineparams.cropBottom, pipelineparams, true);
        CropOverlayView.f(h).a(pipelineparams);
        CropOverlayView.J(h).postDelayed(this, 25L);
    }
}

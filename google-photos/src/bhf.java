// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.RectF;
import android.os.Handler;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;
import com.google.android.apps.consumerphotoeditor.core.Renderer;
import com.google.android.apps.consumerphotoeditor.views.CropOverlayView;

public final class bhf
    implements Runnable
{

    public long a;
    public final CropOverlayView b;
    private final PipelineParams c;
    private final PipelineParams d;
    private final msy e = new msy(0.52F, 0.3F, 0.12F, 1.0F);

    public bhf(CropOverlayView cropoverlayview, PipelineParams pipelineparams, PipelineParams pipelineparams1)
    {
        b = cropoverlayview;
        super();
        a = 0L;
        c = pipelineparams;
        d = pipelineparams1;
    }

    public final void run()
    {
        if (!CropOverlayView.I(b))
        {
            return;
        }
        float f = Math.min(1.0F, Math.max(0.0F, (float)(System.currentTimeMillis() - a) / 300F));
        f = e.getInterpolation(f);
        if (f >= 0.999F)
        {
            CropOverlayView.d(b, false);
            CropOverlayView.q(b).set(Renderer.getImageScreenRect(d));
            CropOverlayView.a(b, d.cropLeft, d.cropTop, d.cropRight, d.cropBottom, d, false);
            CropOverlayView.f(b).a(d);
            b.a(d);
            return;
        } else
        {
            PipelineParams pipelineparams = CropOverlayView.f(b).f();
            pipelineparams.cropLeft = (d.cropLeft - c.cropLeft) * f + c.cropLeft;
            pipelineparams.cropTop = (d.cropTop - c.cropTop) * f + c.cropTop;
            pipelineparams.cropRight = (d.cropRight - c.cropRight) * f + c.cropRight;
            pipelineparams.cropBottom = (d.cropBottom - c.cropBottom) * f + c.cropBottom;
            pipelineparams.straightenAngle = f * d.straightenAngle;
            CropOverlayView.a(b, pipelineparams.cropLeft, pipelineparams.cropTop, pipelineparams.cropRight, pipelineparams.cropBottom, pipelineparams, false);
            CropOverlayView.f(b).a(pipelineparams);
            CropOverlayView.H(b).postDelayed(this, 25L);
            return;
        }
    }
}

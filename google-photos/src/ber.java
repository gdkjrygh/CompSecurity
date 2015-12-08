// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLSurfaceView;
import android.view.ScaleGestureDetector;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;

final class ber extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
{

    private bem a;

    ber(bem bem1)
    {
        a = bem1;
        super();
    }

    public final boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        if (a.f.isEmpty() || bem.m(a) != bfa.c)
        {
            return false;
        }
        PipelineParams pipelineparams = bem.n(a).f();
        float f = pipelineparams.zoomScale;
        pipelineparams.zoomScale = Math.max(1.0F, scalegesturedetector.getScaleFactor() * f);
        if (f < pipelineparams.zoomScale && bem.o(a) != bey.b)
        {
            bem.a(a, bey.b);
            mry.a(bem.p(a), 13, (new msn()).a(new msm(pwu.A)).a(bem.q(a)));
        } else
        if (f > pipelineparams.zoomScale && bem.o(a) != bey.c)
        {
            bem.a(a, bey.c);
            mry.a(bem.r(a), 14, (new msn()).a(new msm(pwu.A)).a(bem.s(a)));
        }
        if (pipelineparams.zoomScale == 1.0F)
        {
            pipelineparams.zoomCenterX = 0.5F;
            pipelineparams.zoomCenterY = 0.5F;
        } else
        {
            float f1 = a.f.width() / f;
            float f2 = ((float)bem.c(a).getWidth() - f1) / 2.0F;
            float f3 = bem.t(a).x;
            float f4 = a.f.left;
            pipelineparams.zoomCenterX = (bem.t(a).x - ((f3 - f4) / f) * pipelineparams.zoomScale - f2) / f1 / (1.0F - pipelineparams.zoomScale);
            pipelineparams.zoomCenterX = Math.min(1.0F, Math.max(0.0F, pipelineparams.zoomCenterX));
            f1 = a.f.height() / f;
            f2 = ((float)bem.c(a).getHeight() - f1) / 2.0F;
            f3 = bem.t(a).y;
            f4 = a.f.top;
            pipelineparams.zoomCenterY = (bem.t(a).y - ((f3 - f4) / f) * pipelineparams.zoomScale - f2) / f1 / (1.0F - pipelineparams.zoomScale);
            pipelineparams.zoomCenterY = Math.min(1.0F, Math.max(0.0F, pipelineparams.zoomCenterY));
        }
        bem.n(a).a(pipelineparams);
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        bem.l(a);
        bem.a(a, bfa.c);
        bem.a(a, 0L);
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
        bem.a(a, bfa.a);
        bem.a(a, bey.a);
    }
}

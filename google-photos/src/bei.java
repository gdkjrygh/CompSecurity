// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.RectF;
import android.os.Handler;
import android.view.View;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;
import com.google.android.apps.consumerphotoeditor.core.Renderer;
import com.google.android.apps.consumerphotoeditor.views.CropOverlayView;

final class bei
    implements android.view.View.OnClickListener
{

    private bee a;

    bei(bee bee1)
    {
        a = bee1;
        super();
    }

    public final void onClick(View view)
    {
        if (bee.a(a).g || bee.a(a).p || bee.a(a).q)
        {
            return;
        }
        if (bee.d(a) == 1)
        {
            view = bee.a(a);
            if (((CropOverlayView) (view)).c != null && !((CropOverlayView) (view)).p)
            {
                view.p = true;
                PipelineParams pipelineparams = ((CropOverlayView) (view)).c.f();
                view.i = new PipelineParams(pipelineparams);
                pipelineparams.rotateAngle = 0.0F;
                pipelineparams.straightenAngle = 0.0F;
                pipelineparams.zoomScale = 1.0F;
                pipelineparams.cropAngle = 0.0F;
                pipelineparams.cropLeft = ((CropOverlayView) (view)).c.p.left;
                pipelineparams.cropTop = ((CropOverlayView) (view)).c.p.top;
                pipelineparams.cropRight = ((CropOverlayView) (view)).c.p.right;
                pipelineparams.cropBottom = ((CropOverlayView) (view)).c.p.bottom;
                pipelineparams.ruleOfThirdsOpacity = 0.0F;
                view.l = new PipelineParams(pipelineparams);
                if (((CropOverlayView) (view)).i.rotateAngle != 0.0F && (((CropOverlayView) (view)).i.straightenAngle != 0.0F || ((CropOverlayView) (view)).i.cropLeft != ((CropOverlayView) (view)).c.p.left || ((CropOverlayView) (view)).i.cropTop != ((CropOverlayView) (view)).c.p.top || ((CropOverlayView) (view)).i.cropRight != ((CropOverlayView) (view)).c.p.right || ((CropOverlayView) (view)).i.cropBottom != ((CropOverlayView) (view)).c.p.bottom))
                {
                    ((CropOverlayView) (view)).c.a(((CropOverlayView) (view)).l);
                    view.c();
                    view.p = false;
                } else
                if (((CropOverlayView) (view)).i.rotateAngle != 0.0F)
                {
                    view.k = (int)(((CropOverlayView) (view)).i.rotateAngle / 1.570796F + 0.5F) * 90;
                    view.m = new PipelineParams(((CropOverlayView) (view)).l);
                    if (((CropOverlayView) (view)).k == 90)
                    {
                        view.m = Renderer.computeEndPipelineParamsForResetRotateAnimation(((CropOverlayView) (view)).i, 0.0F, false, ((CropOverlayView) (view)).m);
                        view.n = Renderer.computeSmoothFactorForResetRotateAnimation(((CropOverlayView) (view)).i, ((CropOverlayView) (view)).m);
                    } else
                    if (((CropOverlayView) (view)).k == 180)
                    {
                        view.m = Renderer.computeEndPipelineParamsForResetRotateAnimation(((CropOverlayView) (view)).i, 4.712389F, true, ((CropOverlayView) (view)).m);
                        view.n = Renderer.computeSmoothFactorForResetRotateAnimation(((CropOverlayView) (view)).i, ((CropOverlayView) (view)).m);
                        CropOverlayView.a(((CropOverlayView) (view)).n);
                        PipelineParams pipelineparams1 = new PipelineParams(((CropOverlayView) (view)).l);
                        pipelineparams1 = Renderer.computeEndPipelineParamsForResetRotateAnimation(((CropOverlayView) (view)).m, 0.0F, true, pipelineparams1);
                        view.o = Renderer.computeSmoothFactorForResetRotateAnimation(((CropOverlayView) (view)).m, pipelineparams1);
                        CropOverlayView.a(((CropOverlayView) (view)).o);
                    } else
                    {
                        view.m = Renderer.computeEndPipelineParamsForResetRotateAnimation(((CropOverlayView) (view)).i, 0.0F, true, ((CropOverlayView) (view)).m);
                        view.n = Renderer.computeSmoothFactorForResetRotateAnimation(((CropOverlayView) (view)).i, ((CropOverlayView) (view)).m);
                        CropOverlayView.a(((CropOverlayView) (view)).n);
                    }
                    view.j = System.currentTimeMillis();
                    ((CropOverlayView) (view)).h.postDelayed(new bhl(view), 25L);
                } else
                {
                    view.j = System.currentTimeMillis();
                    ((CropOverlayView) (view)).h.postDelayed(new bhk(view), 25L);
                }
            }
            b.a(bee.e(a), bee.f(a), a.a(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_reset_done));
            return;
        }
        view = bee.b(a).f();
        PipelineParams pipelineparams3 = bee.b(a).c(view);
        view = bee.a(a);
        if (((CropOverlayView) (view)).c != null && !((CropOverlayView) (view)).q)
        {
            PipelineParams pipelineparams2 = new PipelineParams(((CropOverlayView) (view)).c.f());
            pipelineparams3 = new PipelineParams(pipelineparams3);
            if (pipelineparams3.rotateAngle != 0.0F && (pipelineparams3.straightenAngle != 0.0F || pipelineparams3.cropLeft != ((CropOverlayView) (view)).c.p.left || pipelineparams3.cropTop != ((CropOverlayView) (view)).c.p.top || pipelineparams3.cropRight != ((CropOverlayView) (view)).c.p.right || pipelineparams3.cropBottom != ((CropOverlayView) (view)).c.p.bottom))
            {
                ((CropOverlayView) (view)).c.a(pipelineparams3);
                view.a(pipelineparams3);
            } else
            {
                view.q = true;
                if (pipelineparams3.rotateAngle != 0.0F)
                {
                    view = new bhg(view, pipelineparams2, pipelineparams3);
                    view.b = System.currentTimeMillis();
                    view.c = (int)(((bhg) (view)).d.rotateAngle / 1.570796F + 0.5F) * 90;
                    view.e = new PipelineParams(((bhg) (view)).d);
                    if (((bhg) (view)).c == 90)
                    {
                        view.e = Renderer.computeEndPipelineParamsForResetRotateAnimation(((bhg) (view)).a, 1.570796F, false, ((bhg) (view)).e);
                        view.f = Renderer.computeSmoothFactorForResetRotateAnimation(((bhg) (view)).a, ((bhg) (view)).e);
                        CropOverlayView.a(((bhg) (view)).h, ((bhg) (view)).f);
                    } else
                    if (((bhg) (view)).c == 180)
                    {
                        view.e = Renderer.computeEndPipelineParamsForResetRotateAnimation(((bhg) (view)).a, 4.712389F, false, ((bhg) (view)).e);
                        view.f = Renderer.computeSmoothFactorForResetRotateAnimation(((bhg) (view)).a, ((bhg) (view)).e);
                        pipelineparams2 = new PipelineParams(((bhg) (view)).d);
                        pipelineparams2 = Renderer.computeEndPipelineParamsForResetRotateAnimation(((bhg) (view)).e, 3.141593F, false, pipelineparams2);
                        view.g = Renderer.computeSmoothFactorForResetRotateAnimation(((bhg) (view)).e, pipelineparams2);
                    } else
                    {
                        view.e = Renderer.computeEndPipelineParamsForResetRotateAnimation(((bhg) (view)).a, 4.712389F, true, ((bhg) (view)).e);
                        view.f = Renderer.computeSmoothFactorForResetRotateAnimation(((bhg) (view)).a, ((bhg) (view)).e);
                    }
                    CropOverlayView.J(((bhg) (view)).h).postDelayed(view, 25L);
                } else
                {
                    view = new bhf(view, pipelineparams2, pipelineparams3);
                    view.a = System.currentTimeMillis();
                    CropOverlayView.H(((bhf) (view)).b).postDelayed(view, 25L);
                }
            }
        }
        b.a(bee.g(a), bee.f(a), a.a(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_auto_done));
    }
}

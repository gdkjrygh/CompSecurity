// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;
import com.google.android.apps.consumerphotoeditor.fragments.ConsumerPhotoEditorActivity;
import com.google.android.apps.consumerphotoeditor.views.CropOverlayView;
import com.google.android.apps.consumerphotoeditor.views.StraightenSliderView;

public final class bee extends omp
    implements bhp
{

    private CropOverlayView a;
    private StraightenSliderView ag;
    private boolean ah;
    private PipelineParams ai;
    private Animation aj;
    private Animation ak;
    private Handler al;
    private bdo b;
    private boolean c;
    private int d;
    private TextView e;
    private View f;
    private View g;
    private View h;

    public bee()
    {
        c = false;
        d = 1;
        ah = false;
        al = new Handler();
        (new msi(pwu.m)).a(ae);
        new msh(af, (byte)0);
    }

    static CropOverlayView a(bee bee1)
    {
        return bee1.a;
    }

    private void a(View view)
    {
        view.clearAnimation();
        view.startAnimation(ak);
        view.setVisibility(0);
    }

    static bdo b(bee bee1)
    {
        return bee1.b;
    }

    private void b(View view)
    {
        view.clearAnimation();
        view.startAnimation(aj);
        view.setVisibility(4);
    }

    static bem c(bee bee1)
    {
        return bee1.v();
    }

    static int d(bee bee1)
    {
        return bee1.d;
    }

    static olq e(bee bee1)
    {
        return bee1.ad;
    }

    static TextView f(bee bee1)
    {
        return bee1.e;
    }

    static olq g(bee bee1)
    {
        return bee1.ad;
    }

    private bem v()
    {
        return (bem)super.B.a("EditorFragment");
    }

    private bfk w()
    {
        return (bfk)super.B.a("StrengthToolbarFragment");
    }

    private void x()
    {
        PipelineParams pipelineparams = b.f();
        PipelineParams pipelineparams1 = new PipelineParams();
        if (c || !b.a(pipelineparams.straightenAngle, pipelineparams1.straightenAngle, 0.01F) || !b.a(pipelineparams.rotateAngle, pipelineparams1.rotateAngle, 0.01F) || !b.a(pipelineparams.cropLeft, pipelineparams1.cropLeft, 0.01F) || !b.a(pipelineparams.cropTop, pipelineparams1.cropTop, 0.01F) || !b.a(pipelineparams.cropRight, pipelineparams1.cropRight, 0.01F) || !b.a(pipelineparams.cropBottom, pipelineparams1.cropBottom, 0.01F) || !b.a(b.m, 0.0F))
        {
            d = 1;
            e.setText(a(com.google.android.apps.consumerphotoeditor.R.string.cpe_crop_and_rotate_reset));
            e.setContentDescription(a(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_reset));
            b.a(e, new msm(pwu.n));
            e.setEnabled(true);
            return;
        } else
        {
            d = 0;
            e.setText(a(com.google.android.apps.consumerphotoeditor.R.string.cpe_crop_and_rotate_auto));
            e.setContentDescription(a(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_crop_auto));
            b.a(e, new msm(pwu.l));
            return;
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        b = ((ConsumerPhotoEditorActivity)O_()).j();
        a = v().e;
        bundle = b.f();
        layoutinflater = layoutinflater.inflate(com.google.android.apps.consumerphotoeditor.R.layout.cpe_crop_toolbar_fragment, viewgroup, false);
        if (layoutinflater == null)
        {
            throw new IllegalStateException("Failed to inflate the crop toolbar fragment");
        }
        int i = g().getColor(com.google.android.apps.consumerphotoeditor.R.color.cpe_action_panel_background);
        layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_crop_and_rotate_container).setBackgroundColor(i);
        aj = AnimationUtils.loadAnimation(ad, 0x10a0001);
        ak = AnimationUtils.loadAnimation(ad, 0x10a0000);
        ag = (StraightenSliderView)layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_straighten_slider);
        ag.a(((PipelineParams) (bundle)).straightenAngle);
        ag.a = this;
        g = layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_cancel_button);
        if (g != null)
        {
            g.setOnClickListener(new msj(new bef(this)));
            b.a(g, new msm(pwu.b));
        }
        h = layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_save_button);
        if (h != null)
        {
            h.setOnClickListener(new msj(new beg(this)));
            b.a(h, new msm(pwu.I));
        }
        f = layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_rotate_90);
        f.setOnClickListener(new msj(new beh(this)));
        if (b.a(guc.a))
        {
            f.setVisibility(4);
        }
        b.a(f, new msm(pwu.H));
        e = (TextView)layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_crop_and_rotate_reset);
        e.setOnClickListener(new msj(new bei(this)));
        r();
        bgb.a(layoutinflater);
        return layoutinflater;
    }

    public final void a(float f1)
    {
        ag.a(f1);
    }

    public final void a(boolean flag)
    {
        x();
        if (!ah)
        {
            ah = true;
            boolean flag1;
            if (g().getConfiguration().orientation == 2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag1)
            {
                if (flag)
                {
                    v().e(17);
                } else
                {
                    v().e(1);
                }
            }
            b.a(bdp.d);
        }
    }

    public final void b(float f1)
    {
        PipelineParams pipelineparams1 = b.f();
        if (pipelineparams1.straightenAngle != f1)
        {
            PipelineParams pipelineparams = pipelineparams1;
            if (ai != null)
            {
                ai.a(pipelineparams1);
                pipelineparams = ai;
            }
            a.a(f1, pipelineparams, 0.7F);
            x();
            al.removeCallbacksAndMessages(null);
        }
    }

    public final void r()
    {
        PipelineParams pipelineparams = b.c(b.f());
        boolean flag;
        if (pipelineparams == null || b.a(pipelineparams.rotateAngle, 0.0F) && b.a(pipelineparams.straightenAngle, 0.0F) && b.a(pipelineparams.cropLeft, 0.0F) && b.a(pipelineparams.cropRight, 1.0F) && b.a(pipelineparams.cropTop, 0.0F) && b.a(pipelineparams.cropBottom, 1.0F))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        x();
    }

    public final void t()
    {
        PipelineParams pipelineparams = b.f();
        pipelineparams.ruleOfThirdsCount = 3;
        b.a(pipelineparams);
        a(f);
        a(e);
        bfk bfk1 = w();
        if (g != null)
        {
            a(g);
        }
        if (h != null)
        {
            a(h);
        }
        if (bfk1 != null)
        {
            bfk1.s();
        }
        if ((double)Math.abs(pipelineparams.straightenAngle) > 0.78539816339744828D)
        {
            Object obj = b.f();
            pipelineparams = ((PipelineParams) (obj));
            if (ai != null)
            {
                ai.a(((PipelineParams) (obj)));
                ai.ruleOfThirdsOpacity = ((PipelineParams) (obj)).ruleOfThirdsOpacity;
                ai.ruleOfThirdsCount = ((PipelineParams) (obj)).ruleOfThirdsCount;
                pipelineparams = ai;
            }
            obj = a;
            ((CropOverlayView) (obj)).d.removeCallbacksAndMessages(null);
            Object obj1 = new bhn(((CropOverlayView) (obj)));
            obj1.d = pipelineparams;
            obj1.a = System.currentTimeMillis();
            CropOverlayView.L(((bhn) (obj1)).e).postDelayed(((Runnable) (obj1)), 25L);
            PipelineParams pipelineparams2 = CropOverlayView.f(((bhn) (obj1)).e).f();
            obj1.b = pipelineparams2.straightenAngle;
            float f1;
            if (pipelineparams2.straightenAngle < 0.0F)
            {
                f1 = -1F;
            } else
            {
                f1 = 1.0F;
            }
            obj1.c = (f1 * 3.141593F) / 4F;
            obj1 = new PipelineParams(pipelineparams);
            pipelineparams = new PipelineParams(pipelineparams);
            pipelineparams.ruleOfThirdsOpacity = 0.0F;
            ((CropOverlayView) (obj)).e.post(new bgf(((PipelineParams) (obj1)), pipelineparams, ((CropOverlayView) (obj)).c, ((CropOverlayView) (obj)).e));
        } else
        {
            PipelineParams pipelineparams1 = new PipelineParams(pipelineparams);
            pipelineparams1.ruleOfThirdsOpacity = 0.0F;
            al.post(new bgf(pipelineparams, pipelineparams1, b, al));
        }
        ai = null;
    }

    public final boolean u()
    {
        return a.g || a.p || a.q;
    }

    public final void u_()
    {
        a(true);
        Object obj = b.f();
        PipelineParams pipelineparams = new PipelineParams(((PipelineParams) (obj)));
        pipelineparams.ruleOfThirdsOpacity = 0.7F;
        al.post(new bgf(((PipelineParams) (obj)), pipelineparams, b, al));
        obj.ruleOfThirdsCount = 9;
        b.a(((PipelineParams) (obj)));
        ai = new PipelineParams(((PipelineParams) (obj)));
        b(f);
        b(e);
        if (g != null)
        {
            b(g);
        }
        if (h != null)
        {
            b(h);
        }
        obj = w();
        if (obj != null)
        {
            ((bfk) (obj)).t();
        }
        mry.a(ad, 30, (new msn()).a(new msm(pwu.K)).a(ad));
    }
}

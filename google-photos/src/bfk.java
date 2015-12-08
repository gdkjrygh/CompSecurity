// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.SeekBar;
import com.google.android.apps.consumerphotoeditor.core.Look;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;
import com.google.android.apps.consumerphotoeditor.fragments.ConsumerPhotoEditorActivity;
import com.google.android.apps.consumerphotoeditor.views.CropOverlayView;
import com.google.android.apps.consumerphotoeditor.widgets.RelativeSeekBar;
import java.util.HashMap;

public final class bfk extends omp
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    private CropOverlayView a;
    private SeekBar b;
    private bdo c;
    private View d;
    private View e;
    private View f;
    private Animation g;
    private Animation h;

    public bfk()
    {
        new msh(af, (byte)0);
    }

    static bfk a(boolean flag)
    {
        bfk bfk1 = new bfk();
        Bundle bundle = new Bundle();
        bundle.putBoolean("hideCancelAndAccept", flag);
        bfk1.f(bundle);
        return bfk1;
    }

    static CropOverlayView a(bfk bfk1)
    {
        return bfk1.a;
    }

    private void a(View view)
    {
        view.clearAnimation();
        view.startAnimation(h);
        view.setVisibility(0);
    }

    private void a(msp msp)
    {
        mry.a(ad, 4, (new msn()).a(new msm(msp)).a(new msm(pwu.z)).a(ad));
    }

    private static boolean a(float f1, boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        if (Math.abs(0.5F - f1) >= 0.05F) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (f1 != 0.0F)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    static olq b(bfk bfk1)
    {
        return bfk1.ad;
    }

    private void b(View view)
    {
        view.clearAnimation();
        view.startAnimation(g);
        view.setVisibility(4);
    }

    static olq c(bfk bfk1)
    {
        return bfk1.ad;
    }

    static bdo d(bfk bfk1)
    {
        return bfk1.c;
    }

    static am e(bfk bfk1)
    {
        return bfk1.v();
    }

    static bem f(bfk bfk1)
    {
        return bfk1.u();
    }

    static olq g(bfk bfk1)
    {
        return bfk1.ad;
    }

    static olq h(bfk bfk1)
    {
        return bfk1.ad;
    }

    private bem u()
    {
        return (bem)super.B.a("EditorFragment");
    }

    private am v()
    {
        am am1 = null;
        Object obj = c.a;
        if (obj == bdp.b)
        {
            obj = "LooksToolbarFragment";
        } else
        if (obj == bdp.f || obj == bdp.g || obj == bdp.h || obj == bdp.i)
        {
            obj = "AdjustmentsToolbarFragment";
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            am1 = super.B.a(((String) (obj)));
        }
        return am1;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        c = ((ConsumerPhotoEditorActivity)O_()).j();
        a = u().e;
        f = layoutinflater.inflate(com.google.android.apps.consumerphotoeditor.R.layout.cpe_strength_toolbar_fragment, viewgroup, false);
        if (f == null)
        {
            throw new IllegalStateException("Failed to inflate strength/intensity fragment");
        }
        f.setOnTouchListener(new bfl(this));
        g = AnimationUtils.loadAnimation(ad, 0x10a0001);
        h = AnimationUtils.loadAnimation(ad, 0x10a0000);
        boolean flag = super.q.getBoolean("hideCancelAndAccept");
        b = (SeekBar)f.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_strength_seek_bar);
        b.setMax(1000);
        r();
        b.setOnSeekBarChangeListener(this);
        d = f.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_strength_cancel);
        d.setOnClickListener(new bfm(this));
        e = f.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_strength_accept);
        e.setOnClickListener(new bfn(this));
        if (flag)
        {
            d.setVisibility(4);
            e.setVisibility(4);
        }
        return f;
    }

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (c == null) goto _L2; else goto _L1
_L1:
        float f1;
        Object obj;
        PipelineParams pipelineparams;
        obj = c.a;
        pipelineparams = c.f();
        f1 = (float)i / 1000F;
        if (obj != bdp.b) goto _L4; else goto _L3
_L3:
        pipelineparams.lookIntensity = f1;
        c.y.put(Integer.valueOf(pipelineparams.look), Float.valueOf(f1));
_L6:
        c.a(pipelineparams);
        if (obj != bdp.b)
        {
            obj = v();
            if (obj != null)
            {
                ((bdx)obj).r();
            }
        }
        ((RelativeSeekBar)seekbar).b = a(f1, ((RelativeSeekBar)seekbar).a);
_L2:
        return;
_L4:
        if (obj == bdp.f)
        {
            pipelineparams.lightStrength = f1 * 2.0F - 1.0F;
        } else
        if (obj == bdp.g)
        {
            pipelineparams.colorStrength = f1 * 2.0F - 1.0F;
        } else
        if (obj == bdp.h)
        {
            pipelineparams.popStrength = f1;
        } else
        if (obj == bdp.i)
        {
            pipelineparams.vignetteStrength = -f1;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
        ((bec)O_()).b(this);
        t();
        if (c != null)
        {
            seekbar = c.a;
            if (seekbar == bdp.b || seekbar == bdp.f || seekbar == bdp.g || seekbar == bdp.h || seekbar == bdp.i)
            {
                mry.a(ad, 30, (new msn()).a(new msm(pwu.K)).a(new msm(pwu.r)).a(ad));
            }
        }
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        String s1 = a(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_filter_slider_value, new Object[] {
            Integer.valueOf((seekbar.getProgress() * 100) / 1000)
        });
        b.a(ad, s1, seekbar);
        ((bec)O_()).c(this);
        s();
    }

    public final void r()
    {
        bdp bdp1;
        int j;
label0:
        {
            j = 0;
            if (b != null && c != null)
            {
                bdp1 = c.a;
                if (bdp1 != bdp.c && bdp1 != bdp.d)
                {
                    break label0;
                }
                b.setVisibility(4);
            }
            return;
        }
        b.setVisibility(0);
        PipelineParams pipelineparams = c.f();
        float f1;
        RelativeSeekBar relativeseekbar;
        int i;
        boolean flag;
        if (bdp1 != bdp.b)
        {
            ((RelativeSeekBar)b).a(g().getColor(com.google.android.apps.consumerphotoeditor.R.color.cpe_inset_thumb_color));
        } else
        {
            Object obj = c;
            if (((bdo) (obj)).x == null || ((bdo) (obj)).e.look < 0 || ((bdo) (obj)).e.look >= ((bdo) (obj)).x.length)
            {
                obj = null;
            } else
            {
                obj = ((bdo) (obj)).x[((bdo) (obj)).e.look];
            }
            if (obj != null)
            {
                ((RelativeSeekBar)b).a(((Look) (obj)).c | 0xff000000);
            }
        }
        if (bdp1 == bdp.b)
        {
            i = (int)(pipelineparams.lookIntensity * 1000F);
            c.y.put(Integer.valueOf(pipelineparams.look), Float.valueOf(pipelineparams.lookIntensity));
            flag = true;
        } else
        if (bdp1 == bdp.f)
        {
            i = (int)(((pipelineparams.lightStrength + 1.0F) / 2.0F) * 1000F);
            a(pwu.u);
            flag = true;
        } else
        if (bdp1 == bdp.g)
        {
            i = (int)(((pipelineparams.colorStrength + 1.0F) / 2.0F) * 1000F);
            a(pwu.t);
            flag = true;
        } else
        if (bdp1 == bdp.h)
        {
            i = (int)(pipelineparams.popStrength * 1000F);
            a(pwu.v);
            flag = false;
        } else
        if (bdp1 == bdp.i)
        {
            i = (int)(-pipelineparams.vignetteStrength * 1000F);
            a(pwu.x);
            flag = false;
        } else
        {
            i = 0;
            flag = false;
        }
        relativeseekbar = (RelativeSeekBar)b;
        relativeseekbar.a = flag;
        if (flag)
        {
            j = relativeseekbar.getMax() / 2;
        }
        relativeseekbar.setProgress(j);
        relativeseekbar.postInvalidate();
        b.setProgress(i);
        f1 = (float)i / 1000F;
        ((RelativeSeekBar)b).b = a(f1, flag);
    }

    public final void s()
    {
        a(d);
        a(e);
    }

    public final void t()
    {
        b(d);
        b(e);
    }
}

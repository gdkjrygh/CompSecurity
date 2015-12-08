// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;
import com.google.android.apps.consumerphotoeditor.fragments.ConsumerPhotoEditorActivity;
import java.util.ArrayList;
import java.util.List;

public final class bdx extends omp
    implements android.view.View.OnClickListener, bdr
{

    private bdo a;
    private beb ag;
    private final List b = new ArrayList(36);
    private final List c = new ArrayList(36);
    private int d;
    private TextView e;
    private RadioGroup f;
    private Handler g;
    private beb h;

    public bdx()
    {
        d = 1;
        g = new Handler();
        (new msi(pwu.z)).a(ae);
        new msh(af, (byte)0);
    }

    private void a(int i, List list)
    {
        Bitmap bitmap = BitmapFactory.decodeResource(g(), i);
        for (i = 0; i < 35; i++)
        {
            Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap1);
            canvas.rotate((35 - i) * 10, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
            canvas.drawBitmap(bitmap, 0.0F, 0.0F, null);
            list.add(new BitmapDrawable(g(), bitmap1));
        }

        list.add(new BitmapDrawable(g(), bitmap));
    }

    private void a(View view)
    {
        Object obj = g();
        int i = ((Resources) (obj)).getInteger(com.google.android.apps.consumerphotoeditor.R.integer.cpe_adjustments_select_duration);
        obj = new bdw(((Resources) (obj)).getColor(com.google.android.apps.consumerphotoeditor.R.color.cpe_adjustments_item_selected), bgb.a);
        view = (RadioButton)view;
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            view.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
        } else
        {
            view.setBackground(((android.graphics.drawable.Drawable) (obj)));
        }
        view.addOnLayoutChangeListener(new bdy(this, ((bdw) (obj))));
        view.setOnCheckedChangeListener(new bdz(this, ((bdw) (obj)), i));
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = b(bundle);
        a = ((ConsumerPhotoEditorActivity)O_()).j();
        layoutinflater = layoutinflater.inflate(com.google.android.apps.consumerphotoeditor.R.layout.cpe_adjustments_toolbar_fragment, viewgroup, false);
        e = (TextView)layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_adjustments_reset);
        e.setTag(bdp.e);
        e.setOnClickListener(new msj(this));
        if (b.isEmpty())
        {
            a(com.google.android.apps.consumerphotoeditor.R.drawable.quantum_ic_replay_white_24, b);
        }
        h = new beb(this, e, g, b);
        if (c.isEmpty())
        {
            a(com.google.android.apps.consumerphotoeditor.R.drawable.quantum_ic_auto_fix_white_24, c);
        }
        ag = new beb(this, e, g, c);
        viewgroup = layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_adjustments_light);
        viewgroup.setTag(bdp.f);
        viewgroup.setOnClickListener(this);
        a(((View) (viewgroup)));
        bundle = layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_adjustments_color);
        bundle.setTag(bdp.g);
        bundle.setOnClickListener(this);
        a(((View) (bundle)));
        View view = layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_adjustments_pop);
        view.setTag(bdp.h);
        view.setOnClickListener(this);
        a(view);
        View view1 = layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_adjustments_vignette);
        view1.setTag(bdp.i);
        view1.setOnClickListener(this);
        a(view1);
        f = (RadioGroup)layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_adjustments_group);
        d = 0;
        e.setText(a(com.google.android.apps.consumerphotoeditor.R.string.cpe_adjustments_auto));
        e.setContentDescription(a(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_enhance_auto));
        b.a(e, new msm(pwu.s));
        android.graphics.drawable.Drawable drawable = g().getDrawable(com.google.android.apps.consumerphotoeditor.R.drawable.quantum_ic_auto_fix_white_24);
        e.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            View aview[] = new View[6];
            aview[0] = layoutinflater;
            aview[1] = e;
            aview[2] = viewgroup;
            aview[3] = bundle;
            aview[4] = view;
            aview[5] = view1;
            for (int i = 0; i < 6; i++)
            {
                aview[i].setAlpha(0.0F);
            }

            layoutinflater.post(new bea(this, aview));
        }
        return layoutinflater;
    }

    public final void a_(int i)
    {
        bem bem1 = (bem)super.B.a("EditorFragment");
        if (i == 2)
        {
            a.a(bdp.h);
            bem1.e(1);
        } else
        {
            if (i == 3)
            {
                PipelineParams pipelineparams = a.f();
                PipelineParams pipelineparams2 = a.b(pipelineparams);
                pipelineparams.vignetteCenterX = pipelineparams2.vignetteCenterX;
                pipelineparams.vignetteCenterY = pipelineparams2.vignetteCenterY;
                a.a(pipelineparams);
                a.a(bdp.i);
                bem1.e(1);
                return;
            }
            if (i == 1)
            {
                PipelineParams pipelineparams1 = a.f();
                a.a(a.b(pipelineparams1));
                a.g();
                r();
                if (a.a != bdp.e)
                {
                    bem1.e(0);
                    return;
                }
            }
        }
    }

    public final void onClick(View view)
    {
        Object obj;
        view = ((View) (view.getTag()));
        obj = (bem)super.B.a("EditorFragment");
        if (view != bdp.e) goto _L2; else goto _L1
_L1:
        if (d != 1) goto _L4; else goto _L3
_L3:
        view = a.f();
        view.lightStrength = 0.0F;
        view.colorStrength = 0.0F;
        view.popStrength = 0.0F;
        view.vignetteStrength = 0.0F;
        a.a(view);
        a.g();
        r();
        if (a.a != bdp.e)
        {
            ((bem) (obj)).e(0);
        }
_L6:
        return;
_L4:
        ((bej)super.B.a("EditSessionFragment")).a("AdjustmentsToolbarFragment", 1);
        return;
_L2:
        if (view != null)
        {
            if (view != a.a)
            {
                if (view == bdp.h || view == bdp.i)
                {
                    obj = (bej)super.B.a("EditSessionFragment");
                    byte byte0;
                    if (view == bdp.h)
                    {
                        byte0 = 2;
                    } else
                    {
                        byte0 = 3;
                    }
                    ((bej) (obj)).a("AdjustmentsToolbarFragment", byte0);
                    return;
                } else
                {
                    a.a((bdp)view);
                    ((bem) (obj)).e(1);
                    return;
                }
            } else
            {
                r_();
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    void r()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        PipelineParams pipelineparams = a.f();
        PipelineParams pipelineparams1 = new PipelineParams();
        if (b.a(pipelineparams.lightStrength, pipelineparams1.lightStrength, 0.01F) && b.a(pipelineparams.colorStrength, pipelineparams1.colorStrength, 0.01F) && b.a(pipelineparams.popStrength, pipelineparams1.popStrength, 0.01F) && b.a(pipelineparams.vignetteStrength, pipelineparams1.vignetteStrength, 0.01F))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (d == 1) goto _L1; else goto _L3
_L3:
        d = 1;
        e.setText(a(com.google.android.apps.consumerphotoeditor.R.string.cpe_adjustments_reset));
        e.setContentDescription(a(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_enhance_reset));
        b.a(e, new msm(pwu.w));
        h.a = System.currentTimeMillis();
        g.post(h);
        return;
        if (d == 0) goto _L1; else goto _L4
_L4:
        d = 0;
        e.setText(a(com.google.android.apps.consumerphotoeditor.R.string.cpe_adjustments_auto));
        e.setContentDescription(a(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_enhance_auto));
        b.a(e, new msm(pwu.s));
        ag.a = System.currentTimeMillis();
        g.post(ag);
        return;
    }

    public final void r_()
    {
        bem bem1 = (bem)super.B.a("EditorFragment");
        f.clearCheck();
        a.a(bdp.e);
        bem1.r();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.consumerphotoeditor.fragments;

import am;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import ay;
import bdo;
import bec;
import bed;
import bej;
import bem;
import bp;
import msp;
import msy;
import pwu;

public class ConsumerPhotoEditorActivity extends bec
{

    private bej d;
    private int e;
    private int h;

    public ConsumerPhotoEditorActivity()
    {
    }

    private void a(View view, long l1)
    {
        bed bed1 = new bed(this, view);
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            view.postDelayed(bed1, l1);
            return;
        } else
        {
            view.animate().withEndAction(bed1);
            return;
        }
    }

    public final void b(am am1)
    {
        super.b(am1);
        Object obj1 = c();
        Object obj = ((ay) (obj1)).a(com.google.android.apps.consumerphotoeditor.R.id.cpe_upper_toolbar);
        obj1 = ((ay) (obj1)).a(com.google.android.apps.consumerphotoeditor.R.id.cpe_lower_toolbar);
        if (obj != null)
        {
            obj = ((am) (obj)).R;
            ((View) (obj)).animate().setDuration(e).alpha(0.0F);
            a(((View) (obj)), e);
        }
        if (obj1 != null && obj1 != am1)
        {
            am1 = ((am) (obj1)).R;
            am1.animate().setDuration(e).alpha(0.0F);
            a(am1, e);
            am1 = findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_lower_toolbar).getBackground();
            if (am1 != null)
            {
                am1 = ObjectAnimator.ofInt(am1, "alpha", new int[] {
                    255, 0
                });
                am1.setDuration(e);
                am1.start();
            }
        }
    }

    public final void c(am am1)
    {
        super.c(am1);
        Object obj = c();
        Object obj1 = ((ay) (obj)).a(com.google.android.apps.consumerphotoeditor.R.id.cpe_upper_toolbar);
        am am2 = ((ay) (obj)).a(com.google.android.apps.consumerphotoeditor.R.id.cpe_lower_toolbar);
        obj = new msy(0.0F, 0.0F, 0.6F, 1.0F);
        if (obj1 != null)
        {
            obj1 = ((am) (obj1)).R;
            ((View) (obj1)).clearAnimation();
            ((View) (obj1)).animate().setDuration(h).setInterpolator(((android.animation.TimeInterpolator) (obj))).alpha(1.0F);
            ((View) (obj1)).setVisibility(0);
        }
        if (am2 != null && am2 != am1)
        {
            am1 = am2.R;
            am1.clearAnimation();
            am1.animate().setDuration(h).setInterpolator(((android.animation.TimeInterpolator) (obj))).alpha(1.0F);
            am1.setVisibility(0);
            am1 = findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_lower_toolbar).getBackground();
            if (am1 != null)
            {
                am1 = ObjectAnimator.ofInt(am1, "alpha", new int[] {
                    0, 255
                });
                am1.setDuration(h);
                am1.setInterpolator(((android.animation.TimeInterpolator) (obj)));
                am1.start();
            }
        }
    }

    public final void f()
    {
        bem bem1 = (bem)c().a("EditorFragment");
        if (j().r && bem1 != null)
        {
            bem1.b = true;
            bem1.d.requestRender();
        }
    }

    public final boolean g()
    {
        return j() != null && j().c();
    }

    public final int h()
    {
        return 1;
    }

    protected final msp i()
    {
        return pwu.c;
    }

    public final bdo j()
    {
        if (d == null)
        {
            return null;
        } else
        {
            return d.b;
        }
    }

    public final void k()
    {
        msy msy1 = new msy(0.0F, 0.0F, 0.6F, 1.0F);
        int i1 = getResources().getIdentifier("action_bar_container", "id", getPackageName());
        View view = getWindow().getDecorView().findViewById(i1);
        view.clearAnimation();
        view.animate().setDuration(h).setInterpolator(msy1).alpha(1.0F);
        view.setVisibility(0);
    }

    public final void l()
    {
        int i1 = getResources().getIdentifier("action_bar_container", "id", getPackageName());
        View view = getWindow().getDecorView().findViewById(i1);
        view.animate().setDuration(e).alpha(0.0F);
        a(view, e);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        e = getResources().getInteger(com.google.android.apps.consumerphotoeditor.R.integer.cpe_toolbar_hide_duration);
        h = getResources().getInteger(com.google.android.apps.consumerphotoeditor.R.integer.cpe_toolbar_show_duration);
        setContentView(com.google.android.apps.consumerphotoeditor.R.layout.cpe_editor_activity);
        ay ay1 = c();
        d = (bej)ay1.a("EditSessionFragment");
        if (d == null)
        {
            d = new bej();
            d.c(true);
            bundle = ay1.a();
            bundle.a(d, "EditSessionFragment");
            bundle.b();
            d.b.w = getResources().getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_image_preview_margins);
            int i1 = getResources().getIdentifier("action_bar_container", "id", getPackageName());
            getWindow().getDecorView().findViewById(i1).setVisibility(4);
        }
        bem bem1 = (bem)ay1.a("EditorFragment");
        bundle = bem1;
        if (bem1 == null)
        {
            bundle = new bem();
            bp bp1 = ay1.a();
            bp1.a(com.google.android.apps.consumerphotoeditor.R.id.cpe_content_container, bundle, "EditorFragment");
            bp1.b();
        }
        j().f = bundle;
    }
}

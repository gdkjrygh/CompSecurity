// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.nux;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import com.facebook.i;
import com.facebook.k;

// Referenced classes of package com.facebook.orca.nux:
//            e, g

public class NuxScrimView extends e
{

    private View d;
    private View e;

    public NuxScrimView(Context context)
    {
        super(context);
    }

    public NuxScrimView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public NuxScrimView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
    }

    private boolean a(MotionEvent motionevent)
    {
        if (e != null)
        {
            e.dispatchTouchEvent(motionevent);
            return false;
        } else
        {
            return true;
        }
    }

    static boolean a(NuxScrimView nuxscrimview, MotionEvent motionevent)
    {
        return nuxscrimview.a(motionevent);
    }

    protected void a()
    {
        setContentView(k.orca_nux_scrim);
        d = getView(i.nux_scrim_title_bar_button);
        d.setOnTouchListener(new g(this));
    }

    public void b()
    {
        if (e != null)
        {
            e = null;
            AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
            alphaanimation.setDuration(250L);
            alphaanimation.setFillAfter(true);
            alphaanimation.setFillEnabled(true);
            alphaanimation.setInterpolator(new LinearInterpolator());
            d.startAnimation(alphaanimation);
        }
    }

    public void setOnTitleBarButtonClickListener(android.view.View.OnClickListener onclicklistener)
    {
        d.setOnClickListener(onclicklistener);
    }
}

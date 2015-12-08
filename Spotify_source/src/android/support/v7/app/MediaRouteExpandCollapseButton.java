// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import ct;
import sp;

public class MediaRouteExpandCollapseButton extends ImageButton
{

    private final AnimationDrawable a;
    private final AnimationDrawable b;
    private final String c;
    private final String d;
    private boolean e;
    private android.view.View.OnClickListener f;

    public MediaRouteExpandCollapseButton(Context context)
    {
        this(context, null);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = (AnimationDrawable)ct.a(context, 0x7f0201cd);
        b = (AnimationDrawable)ct.a(context, 0x7f0201bc);
        attributeset = new PorterDuffColorFilter(sp.c(context), android.graphics.PorterDuff.Mode.SRC_IN);
        a.setColorFilter(attributeset);
        b.setColorFilter(attributeset);
        c = context.getString(0x7f080039);
        d = context.getString(0x7f080037);
        setImageDrawable(a.getFrame(0));
        setContentDescription(c);
        super.setOnClickListener(new android.view.View.OnClickListener() {

            private MediaRouteExpandCollapseButton a;

            public final void onClick(View view)
            {
                MediaRouteExpandCollapseButton mediarouteexpandcollapsebutton = a;
                boolean flag;
                if (!MediaRouteExpandCollapseButton.a(a))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                MediaRouteExpandCollapseButton.a(mediarouteexpandcollapsebutton, flag);
                if (MediaRouteExpandCollapseButton.a(a))
                {
                    a.setImageDrawable(MediaRouteExpandCollapseButton.b(a));
                    MediaRouteExpandCollapseButton.b(a).start();
                    a.setContentDescription(MediaRouteExpandCollapseButton.c(a));
                } else
                {
                    a.setImageDrawable(MediaRouteExpandCollapseButton.d(a));
                    MediaRouteExpandCollapseButton.d(a).start();
                    a.setContentDescription(MediaRouteExpandCollapseButton.e(a));
                }
                if (MediaRouteExpandCollapseButton.f(a) != null)
                {
                    MediaRouteExpandCollapseButton.f(a).onClick(view);
                }
            }

            
            {
                a = MediaRouteExpandCollapseButton.this;
                super();
            }
        });
    }

    static boolean a(MediaRouteExpandCollapseButton mediarouteexpandcollapsebutton)
    {
        return mediarouteexpandcollapsebutton.e;
    }

    static boolean a(MediaRouteExpandCollapseButton mediarouteexpandcollapsebutton, boolean flag)
    {
        mediarouteexpandcollapsebutton.e = flag;
        return flag;
    }

    static AnimationDrawable b(MediaRouteExpandCollapseButton mediarouteexpandcollapsebutton)
    {
        return mediarouteexpandcollapsebutton.a;
    }

    static String c(MediaRouteExpandCollapseButton mediarouteexpandcollapsebutton)
    {
        return mediarouteexpandcollapsebutton.d;
    }

    static AnimationDrawable d(MediaRouteExpandCollapseButton mediarouteexpandcollapsebutton)
    {
        return mediarouteexpandcollapsebutton.b;
    }

    static String e(MediaRouteExpandCollapseButton mediarouteexpandcollapsebutton)
    {
        return mediarouteexpandcollapsebutton.c;
    }

    static android.view.View.OnClickListener f(MediaRouteExpandCollapseButton mediarouteexpandcollapsebutton)
    {
        return mediarouteexpandcollapsebutton.f;
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        f = onclicklistener;
    }
}

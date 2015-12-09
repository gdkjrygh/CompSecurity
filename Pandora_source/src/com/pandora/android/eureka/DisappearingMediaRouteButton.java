// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.eureka;

import android.content.Context;
import android.support.v7.app.MediaRouteButton;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import p.bz.e;

public class DisappearingMediaRouteButton extends MediaRouteButton
{
    public static interface a
    {

        public abstract void a(View view, int i);

        public abstract void a(boolean flag);
    }


    private boolean a;
    private a b;

    public DisappearingMediaRouteButton(Context context)
    {
        super(new ContextThemeWrapper(context, 0x7f0d0060));
        a = false;
        b = null;
    }

    public DisappearingMediaRouteButton(Context context, AttributeSet attributeset)
    {
        super(new ContextThemeWrapper(context, 0x7f0d0060), attributeset);
        a = false;
        b = null;
    }

    public DisappearingMediaRouteButton(Context context, AttributeSet attributeset, int i)
    {
        super(new ContextThemeWrapper(context, 0x7f0d0060), attributeset, i);
        a = false;
        b = null;
    }

    private void a(boolean flag)
    {
        a = flag;
        if (b != null)
        {
            b.a(flag);
        }
    }

    public void a(e e1)
    {
        if (e1.a > 1)
        {
            a(true);
        } else
        if (e1.a == 1)
        {
            a(false);
            return;
        }
    }

    public boolean b()
    {
        return a;
    }

    protected void onVisibilityChanged(View view, int i)
    {
        super.onVisibilityChanged(view, i);
        if (b != null)
        {
            b.a(view, i);
        }
    }

    public void setEnabledListener(a a1)
    {
        b = a1;
    }
}

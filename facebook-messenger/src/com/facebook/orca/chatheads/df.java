// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.bb;
import android.support.v4.app.q;
import com.facebook.i;
import com.facebook.widget.d;

public class df extends d
{

    private final bb a = new bb(this);

    public df(Context context)
    {
        super(context);
        setId(i.emoji_custom_keyboard_container);
        a.k();
    }

    private q getSupportFragmentManager()
    {
        return a.r();
    }

    public void a()
    {
        q q1 = a.r();
        Fragment fragment = q1.a(i.emoji_custom_keyboard_container);
        if (fragment != null)
        {
            ad ad1 = q1.a();
            ad1.a(fragment);
            ad1.a();
            q1.b();
        }
    }

    public void a(Fragment fragment, String s)
    {
        ad ad1 = getSupportFragmentManager().a();
        ad1.a(i.emoji_custom_keyboard_container, fragment, s);
        ad1.a();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (a != null)
        {
            a.l();
        }
    }

    protected void onDetachedFromWindow()
    {
        if (a != null)
        {
            a.q();
        }
        super.onDetachedFromWindow();
    }
}

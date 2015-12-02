// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.support.b;

public class k extends Toast
{

    private static k a;
    private final d b = com.qihoo.security.locale.d.a();
    private View c;
    private LocaleTextView d;
    private LocaleTextView e;

    private k(Context context)
    {
        super(context);
        a(context);
    }

    public static k a()
    {
        if (a == null)
        {
            a = new k(SecurityApplication.a());
        }
        return a;
    }

    private void a(Context context)
    {
        setGravity(48, 0, context.getResources().getDimensionPixelOffset(0x7f090002));
        setDuration(1);
        c = LayoutInflater.from(context).inflate(0x7f030089, null);
        e = (LocaleTextView)c.findViewById(0x7f0b01c3);
        d = (LocaleTextView)c.findViewById(0x7f0b01c5);
        setView(c);
    }

    private void a(Context context, CharSequence charsequence, CharSequence charsequence1)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            e.setLocalText(charsequence);
        }
        if (!TextUtils.isEmpty(charsequence1))
        {
            d.setLocalText(charsequence1);
        }
        show();
        com.qihoo.security.support.b.c(17027);
    }

    public void a(Context context, int i, int j)
    {
        a(context, ((CharSequence) (b.a(i))), ((CharSequence) (b.a(j))));
    }
}

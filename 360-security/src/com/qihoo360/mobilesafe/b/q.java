// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;

public class q extends Toast
{

    private static q a;
    private final d b = com.qihoo.security.locale.d.a();
    private final Context c;
    private View d;
    private LocaleTextView e;
    private ImageView f;

    private q(Context context)
    {
        super(context);
        c = context;
        a(context);
    }

    public static q a()
    {
        if (a == null)
        {
            a = new q(SecurityApplication.a());
        }
        return a;
    }

    private void a(Context context)
    {
        d = View.inflate(c, 0x7f0300a1, null);
        f = (ImageView)d.findViewById(0x7f0b0217);
        e = (LocaleTextView)d.findViewById(0x7f0b0218);
        setView(d);
    }

    private void b(CharSequence charsequence, int i)
    {
        if (i > 0)
        {
            f.setVisibility(0);
            f.setImageResource(i);
        } else
        {
            f.setVisibility(8);
        }
        if (!TextUtils.isEmpty(charsequence))
        {
            e.setLocalText(charsequence);
        }
        setDuration(0);
        show();
    }

    public void a(int i)
    {
        a(((CharSequence) (b.a(i))));
    }

    public void a(int i, int j)
    {
        a(((CharSequence) (b.a(i))), j);
    }

    public void a(CharSequence charsequence)
    {
        b(charsequence, 0);
    }

    public void a(CharSequence charsequence, int i)
    {
        b(charsequence, i);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;

// Referenced classes of package com.qihoo.security.dialog:
//            a

public class k extends a
{

    public k(Context context, int i, int j)
    {
        this(context, ((CharSequence) (d.a().a(i))), ((CharSequence) (d.a().a(j))));
    }

    public k(Context context, CharSequence charsequence, CharSequence charsequence1)
    {
        super(context);
        setDialogMessage(charsequence1);
        setDialogTitle(charsequence);
    }

    protected View a()
    {
        return LayoutInflater.from(getContext()).inflate(0x7f0300a3, null, false);
    }

    public void a(int i)
    {
        a(a.a(i));
    }

    public void a(String s)
    {
        setDialogMessage("");
        ((LocaleTextView)findViewById(0x7f0b017e)).setLocalText(s);
    }
}

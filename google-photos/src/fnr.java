// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class fnr
    implements android.view.View.OnClickListener
{

    private fnl a;
    private fnp b;

    fnr(fnp fnp1, fnl fnl)
    {
        b = fnp1;
        a = fnl;
        super();
    }

    public final void onClick(View view)
    {
        fnp.a(b).a(a);
    }
}

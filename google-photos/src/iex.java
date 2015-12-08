// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

final class iex
    implements android.view.View.OnClickListener
{

    private Context a;
    private ifa b;
    private iew c;

    iex(iew iew1, Context context, ifa ifa1)
    {
        c = iew1;
        a = context;
        b = ifa1;
        super();
    }

    public final void onClick(View view)
    {
        ((iez)olm.a(a, iez)).a(b.a, c.a);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class frk
    implements android.view.View.OnClickListener
{

    private frm a;
    private fro b;
    private frj c;

    frk(frj frj1, frm frm1, fro fro1)
    {
        c = frj1;
        a = frm1;
        b = fro1;
        super();
    }

    public final void onClick(View view)
    {
        a.a(b.o, frj.a(c));
    }
}

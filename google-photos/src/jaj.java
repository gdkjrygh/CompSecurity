// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class jaj extends hgu
{

    private final dum a;
    private dwa b;

    public jaj(Context context, dum dum1)
    {
        a = dum1;
        dwh dwh1 = new dwh();
        dwh1.a = dum1.e;
        dwh1.c = context.getString(u.w);
        dwh1.i = b.BA;
        dwh1.d = context.getString(u.u);
        b = dwh1.b(u.t, new jal(this, dum1), pws.i).a(u.v, new jak(this, dum1), pws.j).a();
    }

    public final int a()
    {
        return b.a();
    }

    public final void a(afn afn)
    {
        b.a((dwk)afn);
    }

    public final long b()
    {
        return a.c;
    }
}

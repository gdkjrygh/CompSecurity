// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dwq extends hgu
{

    private dwa a;
    private final dum b;

    public dwq(Context context, dum dum1)
    {
        b = dum1;
        dwh dwh1 = new dwh();
        dwh1.a = dum1.e;
        dwh1.c = context.getString(b.ks);
        dwh1.i = b.kp;
        dwh1.d = context.getString(b.kq);
        a = dwh1.b(b.kt, new dws(this, dum1), pws.i).a(b.kr, new dwr(this, dum1), pws.h).a();
    }

    public final int a()
    {
        return a.a();
    }

    public final void a(afn afn)
    {
        a.a((dwk)afn);
    }

    public final long b()
    {
        return b.c;
    }
}

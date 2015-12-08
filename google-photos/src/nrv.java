// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nrv
{

    static final String a = ntn.a(nrv);
    final Context b;

    public nrv(Context context)
    {
        b = context;
    }

    static qqj a(Context context, nqk nqk, byte abyte0[])
    {
        ntl ntl1 = ntl.a(context);
        qqj qqj1 = new qqj();
        qqj1.a = ntl1.a();
        qqj1.b = (new ntk(context)).a();
        qqj1.c = Integer.valueOf(50);
        qqj1.d = ntl.a(nqk);
        qqj1.e = abyte0;
        return qqj1;
    }

}

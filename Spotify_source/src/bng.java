// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bng
{

    final Context a;
    final Context b;

    public bng(Context context)
    {
        btl.a(context);
        context = context.getApplicationContext();
        btl.a(context, "Application context can't be null");
        a = context;
        b = context;
    }

    protected static bno a(bnf bnf)
    {
        return new bno(bnf);
    }

    protected static bns b(bnf bnf)
    {
        return new bns(bnf);
    }

    public static bni d(bnf bnf)
    {
        return new bni(bnf);
    }

    public static bnw e(bnf bnf)
    {
        return new bnw(bnf);
    }

    public static bmt f(bnf bnf)
    {
        return new bmt(bnf);
    }

    final bnn c(bnf bnf)
    {
        return new bnn(bnf, this);
    }
}

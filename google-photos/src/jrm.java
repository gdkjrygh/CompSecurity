// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class jrm
{

    final Context a;
    final Context b;

    public jrm(Context context)
    {
        b.d(context);
        context = context.getApplicationContext();
        b.f(context, "Application context can't be null");
        a = context;
        b = context;
    }

    protected static jsc a(jrk jrk)
    {
        return new jsc(jrk);
    }

    protected static jsh b(jrk jrk)
    {
        return new jsh(jrk);
    }

    public static jro d(jrk jrk)
    {
        return new jro(jrk);
    }

    public static jsj e(jrk jrk)
    {
        return new jsj(jrk);
    }

    public static jss f(jrk jrk)
    {
        return new jss(jrk);
    }

    final jrw c(jrk jrk)
    {
        return new jrw(jrk, this);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

public final class adr extends aiw
{

    final akk a;
    final adt b;
    private final String c;

    adr(akk akk, String s)
    {
        a = akk;
        b = new adt(akk);
        c = s;
        ot.p().a(this);
    }

    public final void a()
    {
        b.a(c);
        ajc.a.post(new _cls1());
        return;
        Exception exception;
        exception;
        ajc.a.post(new _cls1());
        throw exception;
    }

    public final void b()
    {
        b.a();
    }

    /* member class not found */
    class _cls1 {}

}

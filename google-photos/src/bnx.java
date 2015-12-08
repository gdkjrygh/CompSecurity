// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

final class bnx
    implements Callable
{

    private final cjs a;
    private final nny b;
    private final int c;

    public bnx(cjs cjs1, nny nny, int i)
    {
        a = cjs1;
        b = nny;
        c = i;
    }

    private cql a()
    {
        cjv cjv1;
        cjv cjv2;
        cjv1 = null;
        cjv2 = null;
        Object obj = a.a(b, c);
        cjv2 = ((cjv) (obj));
        cjv1 = ((cjv) (obj));
        Object obj1 = (cql)((cjv) (obj)).i();
        dee.a(((ded) (obj)));
        return ((cql) (obj1));
        IOException ioexception;
        ioexception;
        cjv1 = cjv2;
        obj1 = bnu.a;
        cjv1 = cjv2;
        String s = String.valueOf(b);
        cjv1 = cjv2;
        Log.w(((String) (obj1)), (new StringBuilder(String.valueOf(s).length() + 77)).append("Video header parse failure. Possibly corrupt video cache (attempting retry): ").append(s).toString(), ioexception);
        cjv1 = cjv2;
        dee.a(cjv2);
        cjv1 = cjv2;
        cjv2 = a.a(b, c);
        cjv1 = cjv2;
        cjv2.j();
        cjv1 = cjv2;
        ioexception = (cql)cjv2.i();
        dee.a(cjv2);
        return ioexception;
        Exception exception;
        exception;
        dee.a(cjv1);
        throw exception;
    }

    public final Object call()
    {
        return a();
    }
}

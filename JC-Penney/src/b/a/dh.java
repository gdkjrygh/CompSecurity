// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import com.crittercism.error.CRXMLHttpRequestException;

public final class dh extends Enum
{

    public static final dh a;
    public static final dh b;
    public static final dh c;
    public static final dh d;
    public static final dh e;
    private static final dh f[];

    private dh(String s, int i)
    {
        super(s, i);
    }

    public static int a(Throwable throwable)
    {
        int i = d.ordinal();
        if (throwable instanceof CRXMLHttpRequestException)
        {
            i = e.ordinal();
        }
        return i;
    }

    public static dh valueOf(String s)
    {
        return (dh)Enum.valueOf(b/a/dh, s);
    }

    public static dh[] values()
    {
        return (dh[])f.clone();
    }

    static 
    {
        a = new dh("Generic", 0);
        b = new dh("NSURLConnection", 1);
        c = new dh("ASI", 2);
        d = new dh("Android", 3);
        e = new dh("XMLHttpRequest", 4);
        f = (new dh[] {
            a, b, c, d, e
        });
    }
}

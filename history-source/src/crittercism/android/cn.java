// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import com.crittercism.error.CRXMLHttpRequestException;

public final class cn extends Enum
{

    public static final cn a;
    public static final cn b;
    public static final cn c;
    public static final cn d;
    public static final cn e;
    private static final cn f[];

    private cn(String s, int i)
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

    public static cn valueOf(String s)
    {
        return (cn)Enum.valueOf(crittercism/android/cn, s);
    }

    public static cn[] values()
    {
        return (cn[])f.clone();
    }

    static 
    {
        a = new cn("Generic", 0);
        b = new cn("NSURLConnection", 1);
        c = new cn("ASI", 2);
        d = new cn("Android", 3);
        e = new cn("XMLHttpRequest", 4);
        f = (new cn[] {
            a, b, c, d, e
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;


// Referenced classes of package com.fasterxml.jackson.core:
//            Base64Variant

public final class a
{

    static final String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    public static final Base64Variant b;
    public static final Base64Variant c;
    public static final Base64Variant d;
    public static final Base64Variant e;

    public a()
    {
    }

    public static Base64Variant a()
    {
        return c;
    }

    public static Base64Variant a(String s)
        throws IllegalArgumentException
    {
        if (b._name.equals(s))
        {
            return b;
        }
        if (c._name.equals(s))
        {
            return c;
        }
        if (d._name.equals(s))
        {
            return d;
        }
        if (e._name.equals(s))
        {
            return e;
        }
        if (s == null)
        {
            s = "<null>";
        } else
        {
            s = (new StringBuilder()).append("'").append(s).append("'").toString();
        }
        throw new IllegalArgumentException((new StringBuilder()).append("No Base64Variant with name ").append(s).toString());
    }

    static 
    {
        b = new Base64Variant("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        c = new Base64Variant(b, "MIME-NO-LINEFEEDS", 0x7fffffff);
        d = new Base64Variant(b, "PEM", true, '=', 64);
        StringBuffer stringbuffer = new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        stringbuffer.setCharAt(stringbuffer.indexOf("+"), '-');
        stringbuffer.setCharAt(stringbuffer.indexOf("/"), '_');
        e = new Base64Variant("MODIFIED-FOR-URL", stringbuffer.toString(), false, '\0', 0x7fffffff);
    }
}

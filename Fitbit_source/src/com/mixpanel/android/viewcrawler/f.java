// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;


// Referenced classes of package com.mixpanel.android.viewcrawler:
//            a

class f
{

    public final String a;
    public final Class b;
    public final a c;
    private final String d;

    public f(String s, Class class1, a a1, String s1)
    {
        a = s;
        b = class1;
        c = a1;
        d = s1;
    }

    public a a(Object aobj[])
        throws NoSuchMethodException
    {
        if (d == null)
        {
            return null;
        } else
        {
            return new a(b, d, aobj, Void.TYPE);
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("[PropertyDescription ").append(a).append(",").append(b).append(", ").append(c).append("/").append(d).append("]").toString();
    }
}

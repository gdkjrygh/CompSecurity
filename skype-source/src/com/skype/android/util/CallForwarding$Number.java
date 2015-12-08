// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;


// Referenced classes of package com.skype.android.util:
//            CallForwarding

public static class <init>
{

    public final int a;
    public final int b;
    public final String c;

    public boolean equals(Object obj)
    {
        return obj != null && toString().equals(obj.toString());
    }

    public int hashCode()
    {
        return toString().hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append(a).append(",").append(b).append(",").append(c).toString();
    }

    public (int i, int j, String s)
    {
        a = i;
        b = j;
        c = s;
    }

    public c(String s)
    {
        this(0, 60, s);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;


// Referenced classes of package com.a.a.a:
//            c, d

public final class o extends c
{

    final String c;

    public o(String s)
    {
        c = a.a(s);
    }

    public final String toString()
    {
        return (new StringBuilder("{eventName:\"")).append(c).append('"').append(", customAttributes:").append(b).append("}").toString();
    }
}

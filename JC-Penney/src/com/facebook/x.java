// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            m, o

public class x extends m
{

    private final o a;

    public x(o o1, String s)
    {
        super(s);
        a = o1;
    }

    public final o a()
    {
        return a;
    }

    public final String toString()
    {
        return (new StringBuilder()).append("{FacebookServiceException: ").append("httpResponseCode: ").append(a.a()).append(", facebookErrorCode: ").append(a.b()).append(", facebookErrorType: ").append(a.c()).append(", message: ").append(a.d()).append("}").toString();
    }
}

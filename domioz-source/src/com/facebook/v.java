// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            l, n

public final class v extends l
{

    private final n a;

    public v(n n1, String s)
    {
        super(s);
        a = n1;
    }

    public final n a()
    {
        return a;
    }

    public final String toString()
    {
        return (new StringBuilder("{FacebookServiceException: httpResponseCode: ")).append(a.a()).append(", facebookErrorCode: ").append(a.b()).append(", facebookErrorType: ").append(a.c()).append(", message: ").append(a.d()).append("}").toString();
    }
}

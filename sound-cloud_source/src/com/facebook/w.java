// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            p, r

public final class w extends p
{

    public final r a;

    public w(r r1, String s)
    {
        super(s);
        a = r1;
    }

    public final String toString()
    {
        return (new StringBuilder("{FacebookServiceException: httpResponseCode: ")).append(a.b).append(", facebookErrorCode: ").append(a.c).append(", facebookErrorType: ").append(a.d).append(", message: ").append(a.a()).append("}").toString();
    }
}

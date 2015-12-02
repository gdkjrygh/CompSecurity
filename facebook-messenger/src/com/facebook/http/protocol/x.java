// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;


// Referenced classes of package com.facebook.http.protocol:
//            e, ApiErrorResult

public class x extends e
{

    public x(String s)
    {
        super(new ApiErrorResult(-1, "Batch method not executed", s));
    }
}

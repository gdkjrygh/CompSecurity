// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;


// Referenced classes of package com.facebook.fbservice.service:
//            e, ad, OperationResult, FutureOperationResult

public class ai
    implements e
{

    public ai()
    {
    }

    public OperationResult a(ad ad1)
    {
        return b(ad1);
    }

    public FutureOperationResult b(ad ad1)
    {
        throw new IllegalStateException((new StringBuilder()).append("Unhandled type: ").append(ad1.a()).toString());
    }
}

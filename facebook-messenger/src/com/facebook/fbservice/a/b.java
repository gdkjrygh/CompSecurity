// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.a;

import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.f;

public class b
    implements f
{

    public b()
    {
    }

    public OperationResult a(ad ad1, e e1)
    {
        return e1.a(new ad(ad1.a().c(), ad1.b()));
    }
}

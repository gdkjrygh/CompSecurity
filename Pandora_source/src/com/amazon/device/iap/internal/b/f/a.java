// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.f;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.i;
import com.amazon.venezia.command.SuccessResult;

abstract class a extends i
{

    a(e e, String s)
    {
        super(e, "response_received", s);
        b(false);
    }

    protected boolean a(SuccessResult successresult)
        throws Exception
    {
        return true;
    }
}

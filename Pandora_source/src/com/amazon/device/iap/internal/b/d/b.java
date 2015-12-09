// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.d;

import com.amazon.android.framework.exception.KiwiException;
import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.h;
import com.amazon.device.iap.internal.b.i;

abstract class b extends i
{

    protected final boolean a;

    b(e e1, String s, boolean flag)
    {
        super(e1, "purchase_updates", s);
        a = flag;
    }

    protected void preExecution()
        throws KiwiException
    {
        super.preExecution();
        String s = (String)b().d().a("userId");
        if (a)
        {
            s = null;
        } else
        {
            s = com.amazon.device.iap.internal.util.b.a(s);
        }
        a("cursor", s);
    }
}

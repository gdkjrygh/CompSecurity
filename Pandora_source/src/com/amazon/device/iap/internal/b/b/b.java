// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.b;

import com.amazon.android.framework.exception.KiwiException;
import com.amazon.device.iap.internal.b.e;

// Referenced classes of package com.amazon.device.iap.internal.b.b:
//            a

public final class b extends a
{

    public b(e e, String s)
    {
        super(e, "1.0", s);
    }

    protected void preExecution()
        throws KiwiException
    {
        super.preExecution();
        com.amazon.device.iap.internal.c.b.a().b(c());
    }
}

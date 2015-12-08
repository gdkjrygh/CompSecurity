// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.c.a.e;
import com.ford.syncV4.e.c.a.k;
import com.ford.syncV4.e.d;
import java.util.Hashtable;

public final class al extends d
{

    public al()
    {
        super("OnLockScreenStatus");
    }

    public final void a(e e)
    {
        if (e != null)
        {
            b.put("hmiLevel", e);
        } else
        if (b.contains("hmiLevel"))
        {
            b.remove("hmiLevel");
            return;
        }
    }

    public final void a(k k1)
    {
        if (k1 != null)
        {
            b.put("showLockScreen", k1);
        } else
        if (b.contains("showLockScreen"))
        {
            b.remove("showLockScreen");
            return;
        }
    }

    public final void a(Boolean boolean1)
    {
        if (boolean1 == null)
        {
            b.put("driverDistraction", "notSet");
            return;
        } else
        {
            b.put("driverDistraction", boolean1.toString());
            return;
        }
    }

    public final void b(Boolean boolean1)
    {
        if (boolean1 != null)
        {
            b.put("userSelected", boolean1);
        } else
        if (b.contains("userSelected"))
        {
            b.remove("userSelected");
            return;
        }
    }

    public final k c()
    {
        return (k)b.get("showLockScreen");
    }
}

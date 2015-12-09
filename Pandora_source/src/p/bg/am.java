// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.d;
import p.bh.i;
import p.bh.p;

public class am extends d
{

    public am()
    {
        super("OnLockScreenStatus");
    }

    public void a(Boolean boolean1)
    {
        if (boolean1 != null)
        {
            b.put("driverDistraction", boolean1);
            return;
        } else
        {
            b.remove("driverDistraction");
            return;
        }
    }

    public void a(i i)
    {
        if (i != null)
        {
            b.put("hmiLevel", i);
            return;
        } else
        {
            b.remove("hmiLevel");
            return;
        }
    }

    public void a(p p)
    {
        if (p != null)
        {
            b.put("showLockScreen", p);
            return;
        } else
        {
            b.remove("showLockScreen");
            return;
        }
    }

    public void b(Boolean boolean1)
    {
        if (boolean1 != null)
        {
            b.put("userSelected", boolean1);
            return;
        } else
        {
            b.remove("userSelected");
            return;
        }
    }
}

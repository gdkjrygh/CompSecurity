// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.analytics;

import android.content.Context;
import android.util.SparseIntArray;
import com.fitbit.FitBitApplication;
import com.fitbit.config.BuildType;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;

public class b
    implements com.fitbit.analytics.google.ga.b
{

    private final FitBitApplication a;

    public b(FitBitApplication fitbitapplication)
    {
        a = fitbitapplication;
    }

    public Context a()
    {
        return a;
    }

    public String b()
    {
        Profile profile = an.a().b();
        if (profile != null)
        {
            return profile.F();
        } else
        {
            return null;
        }
    }

    public SparseIntArray c()
    {
        SparseIntArray sparseintarray = new SparseIntArray();
        int i;
        if (com.fitbit.config.b.a.b())
        {
            i = 0x7f06000a;
        } else
        {
            i = 0x7f060006;
        }
        sparseintarray.put(0x7f11000b, i);
        if (com.fitbit.config.b.a.b())
        {
            i = 0x7f06000b;
        } else
        {
            i = 0x7f060007;
        }
        sparseintarray.put(0x7f11000c, i);
        if (com.fitbit.config.b.a.b())
        {
            i = 0x7f06000c;
        } else
        {
            i = 0x7f060008;
        }
        sparseintarray.put(0x7f11000d, i);
        if (com.fitbit.config.b.a.b())
        {
            i = 0x7f060009;
        } else
        {
            i = 0x7f060005;
        }
        sparseintarray.put(0x7f11000a, i);
        return sparseintarray;
    }

    public String d()
    {
        if ("release".equalsIgnoreCase("googlebeta"))
        {
            return "BETA:";
        } else
        {
            return "";
        }
    }
}

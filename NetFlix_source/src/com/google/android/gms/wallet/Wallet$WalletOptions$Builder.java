// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import java.util.Locale;

// Referenced classes of package com.google.android.gms.wallet:
//            Wallet

public static final class mTheme
{

    private int acq;
    private int mTheme;

    static int a(mTheme mtheme)
    {
        return mtheme.acq;
    }

    static int b(acq acq1)
    {
        return acq1.mTheme;
    }

    public mTheme build()
    {
        return new mTheme(this, null);
    }

    public mTheme setEnvironment(int i)
    {
        if (i == 0 || i == 2 || i == 1)
        {
            acq = i;
            return this;
        } else
        {
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", new Object[] {
                Integer.valueOf(i)
            }));
        }
    }

    public acq setTheme(int i)
    {
        if (i == 0 || i == 1)
        {
            mTheme = i;
            return this;
        } else
        {
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid theme value %d", new Object[] {
                Integer.valueOf(i)
            }));
        }
    }

    public ()
    {
        acq = 0;
        mTheme = 0;
    }
}

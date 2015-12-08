// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;


// Referenced classes of package com.google.android.gms.wallet:
//            Wallet

public static final class mTheme
{

    private int aUz;
    private int mTheme;

    static int a(mTheme mtheme)
    {
        return mtheme.aUz;
    }

    static int b(aUz auz)
    {
        return auz.mTheme;
    }

    public final mTheme build()
    {
        return new mTheme(this, null);
    }

    public final mTheme setEnvironmentUnchecked(int i)
    {
        aUz = i;
        return this;
    }

    public ()
    {
        aUz = 0;
        mTheme = 0;
    }
}

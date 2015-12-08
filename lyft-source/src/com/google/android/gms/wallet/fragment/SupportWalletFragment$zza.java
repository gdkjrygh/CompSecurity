// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            SupportWalletFragment

class b extends com.google.android.gms.internal.nt.zza
{

    private ateChangedListener a;
    private final SupportWalletFragment b;

    public void a(int i, int j, Bundle bundle)
    {
        if (a != null)
        {
            a.a(b, i, j, bundle);
        }
    }

    ateChangedListener(SupportWalletFragment supportwalletfragment)
    {
        b = supportwalletfragment;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.os.Bundle;
import com.google.android.gms.wallet.MaskedWallet;
import org.androidannotations.api.a.d;

// Referenced classes of package com.dominos.fragments:
//            GoogleWalletFragment_, GoogleWalletFragment

public class  extends d
{

    public GoogleWalletFragment build()
    {
        GoogleWalletFragment_ googlewalletfragment_ = new GoogleWalletFragment_();
        googlewalletfragment_.setArguments(args);
        return googlewalletfragment_;
    }

    public volatile Object build()
    {
        return build();
    }

    public build mCanShowWalletErrorDialog(boolean flag)
    {
        args.putBoolean("ShowWalletError", flag);
        return this;
    }

    public args mMaskedWallet(MaskedWallet maskedwallet)
    {
        args.putParcelable("MaskedWallet", maskedwallet);
        return this;
    }

    public ()
    {
    }
}

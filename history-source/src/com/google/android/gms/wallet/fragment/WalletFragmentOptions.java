// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            b, WalletFragmentStyle

public final class WalletFragmentOptions
    implements SafeParcelable
{
    public final class Builder
    {

        final WalletFragmentOptions awx;

        public WalletFragmentOptions build()
        {
            return awx;
        }

        public Builder setEnvironment(int i)
        {
            WalletFragmentOptions.a(awx, i);
            return this;
        }

        public Builder setFragmentStyle(int i)
        {
            WalletFragmentOptions.a(awx, (new WalletFragmentStyle()).setStyleResourceId(i));
            return this;
        }

        public Builder setFragmentStyle(WalletFragmentStyle walletfragmentstyle)
        {
            WalletFragmentOptions.a(awx, walletfragmentstyle);
            return this;
        }

        public Builder setMode(int i)
        {
            WalletFragmentOptions.c(awx, i);
            return this;
        }

        public Builder setTheme(int i)
        {
            WalletFragmentOptions.b(awx, i);
            return this;
        }

        private Builder()
        {
            awx = WalletFragmentOptions.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new b();
    final int CK;
    private int Oi;
    private int avV;
    private WalletFragmentStyle aww;
    private int mTheme;

    private WalletFragmentOptions()
    {
        CK = 1;
    }

    WalletFragmentOptions(int i, int j, int k, WalletFragmentStyle walletfragmentstyle, int l)
    {
        CK = i;
        avV = j;
        mTheme = k;
        aww = walletfragmentstyle;
        Oi = l;
    }

    static int a(WalletFragmentOptions walletfragmentoptions, int i)
    {
        walletfragmentoptions.avV = i;
        return i;
    }

    public static WalletFragmentOptions a(Context context, AttributeSet attributeset)
    {
        attributeset = context.obtainStyledAttributes(attributeset, com.google.android.gms.R.styleable.WalletFragmentOptions);
        int i = attributeset.getInt(com.google.android.gms.R.styleable.WalletFragmentOptions_appTheme, 0);
        int j = attributeset.getInt(com.google.android.gms.R.styleable.WalletFragmentOptions_environment, 1);
        int k = attributeset.getResourceId(com.google.android.gms.R.styleable.WalletFragmentOptions_fragmentStyle, 0);
        int l = attributeset.getInt(com.google.android.gms.R.styleable.WalletFragmentOptions_fragmentMode, 1);
        attributeset.recycle();
        attributeset = new WalletFragmentOptions();
        attributeset.mTheme = i;
        attributeset.avV = j;
        attributeset.aww = (new WalletFragmentStyle()).setStyleResourceId(k);
        ((WalletFragmentOptions) (attributeset)).aww.ab(context);
        attributeset.Oi = l;
        return attributeset;
    }

    static WalletFragmentStyle a(WalletFragmentOptions walletfragmentoptions, WalletFragmentStyle walletfragmentstyle)
    {
        walletfragmentoptions.aww = walletfragmentstyle;
        return walletfragmentstyle;
    }

    static int b(WalletFragmentOptions walletfragmentoptions, int i)
    {
        walletfragmentoptions.mTheme = i;
        return i;
    }

    static int c(WalletFragmentOptions walletfragmentoptions, int i)
    {
        walletfragmentoptions.Oi = i;
        return i;
    }

    public static Builder newBuilder()
    {
        WalletFragmentOptions walletfragmentoptions = new WalletFragmentOptions();
        walletfragmentoptions.getClass();
        return walletfragmentoptions. new Builder();
    }

    public void ab(Context context)
    {
        if (aww != null)
        {
            aww.ab(context);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public int getEnvironment()
    {
        return avV;
    }

    public WalletFragmentStyle getFragmentStyle()
    {
        return aww;
    }

    public int getMode()
    {
        return Oi;
    }

    public int getTheme()
    {
        return mTheme;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.fragment.b.a(this, parcel, i);
    }

}

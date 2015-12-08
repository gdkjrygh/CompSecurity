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

        final WalletFragmentOptions aun;

        public WalletFragmentOptions build()
        {
            return aun;
        }

        public Builder setEnvironment(int i)
        {
            WalletFragmentOptions.a(aun, i);
            return this;
        }

        public Builder setFragmentStyle(int i)
        {
            WalletFragmentOptions.a(aun, (new WalletFragmentStyle()).setStyleResourceId(i));
            return this;
        }

        public Builder setFragmentStyle(WalletFragmentStyle walletfragmentstyle)
        {
            WalletFragmentOptions.a(aun, walletfragmentstyle);
            return this;
        }

        public Builder setMode(int i)
        {
            WalletFragmentOptions.c(aun, i);
            return this;
        }

        public Builder setTheme(int i)
        {
            WalletFragmentOptions.b(aun, i);
            return this;
        }

        private Builder()
        {
            aun = WalletFragmentOptions.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new b();
    final int BR;
    private int MV;
    private int atL;
    private WalletFragmentStyle aum;
    private int mTheme;

    private WalletFragmentOptions()
    {
        BR = 1;
    }

    WalletFragmentOptions(int i, int j, int k, WalletFragmentStyle walletfragmentstyle, int l)
    {
        BR = i;
        atL = j;
        mTheme = k;
        aum = walletfragmentstyle;
        MV = l;
    }

    static int a(WalletFragmentOptions walletfragmentoptions, int i)
    {
        walletfragmentoptions.atL = i;
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
        attributeset.atL = j;
        attributeset.aum = (new WalletFragmentStyle()).setStyleResourceId(k);
        ((WalletFragmentOptions) (attributeset)).aum.aa(context);
        attributeset.MV = l;
        return attributeset;
    }

    static WalletFragmentStyle a(WalletFragmentOptions walletfragmentoptions, WalletFragmentStyle walletfragmentstyle)
    {
        walletfragmentoptions.aum = walletfragmentstyle;
        return walletfragmentstyle;
    }

    static int b(WalletFragmentOptions walletfragmentoptions, int i)
    {
        walletfragmentoptions.mTheme = i;
        return i;
    }

    static int c(WalletFragmentOptions walletfragmentoptions, int i)
    {
        walletfragmentoptions.MV = i;
        return i;
    }

    public static Builder newBuilder()
    {
        WalletFragmentOptions walletfragmentoptions = new WalletFragmentOptions();
        walletfragmentoptions.getClass();
        return walletfragmentoptions. new Builder();
    }

    public void aa(Context context)
    {
        if (aum != null)
        {
            aum.aa(context);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public int getEnvironment()
    {
        return atL;
    }

    public WalletFragmentStyle getFragmentStyle()
    {
        return aum;
    }

    public int getMode()
    {
        return MV;
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

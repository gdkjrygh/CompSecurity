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

        final WalletFragmentOptions akA;

        public WalletFragmentOptions build()
        {
            return akA;
        }

        public Builder setEnvironment(int i)
        {
            WalletFragmentOptions.a(akA, i);
            return this;
        }

        public Builder setFragmentStyle(int i)
        {
            WalletFragmentOptions.a(akA, (new WalletFragmentStyle()).setStyleResourceId(i));
            return this;
        }

        public Builder setFragmentStyle(WalletFragmentStyle walletfragmentstyle)
        {
            WalletFragmentOptions.a(akA, walletfragmentstyle);
            return this;
        }

        public Builder setMode(int i)
        {
            WalletFragmentOptions.c(akA, i);
            return this;
        }

        public Builder setTheme(int i)
        {
            WalletFragmentOptions.b(akA, i);
            return this;
        }

        private Builder()
        {
            akA = WalletFragmentOptions.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new b();
    private int Hv;
    private int ajY;
    private WalletFragmentStyle akz;
    private int mTheme;
    final int xJ;

    private WalletFragmentOptions()
    {
        xJ = 1;
    }

    WalletFragmentOptions(int i, int j, int k, WalletFragmentStyle walletfragmentstyle, int l)
    {
        xJ = i;
        ajY = j;
        mTheme = k;
        akz = walletfragmentstyle;
        Hv = l;
    }

    static int a(WalletFragmentOptions walletfragmentoptions, int i)
    {
        walletfragmentoptions.ajY = i;
        return i;
    }

    public static WalletFragmentOptions a(Context context, AttributeSet attributeset)
    {
        attributeset = context.obtainStyledAttributes(attributeset, com.google.android.gms.R.styleable.WalletFragmentOptions);
        int i = attributeset.getInt(0, 0);
        int j = attributeset.getInt(1, 1);
        int k = attributeset.getResourceId(2, 0);
        int l = attributeset.getInt(3, 1);
        attributeset.recycle();
        attributeset = new WalletFragmentOptions();
        attributeset.mTheme = i;
        attributeset.ajY = j;
        attributeset.akz = (new WalletFragmentStyle()).setStyleResourceId(k);
        ((WalletFragmentOptions) (attributeset)).akz.N(context);
        attributeset.Hv = l;
        return attributeset;
    }

    static WalletFragmentStyle a(WalletFragmentOptions walletfragmentoptions, WalletFragmentStyle walletfragmentstyle)
    {
        walletfragmentoptions.akz = walletfragmentstyle;
        return walletfragmentstyle;
    }

    static int b(WalletFragmentOptions walletfragmentoptions, int i)
    {
        walletfragmentoptions.mTheme = i;
        return i;
    }

    static int c(WalletFragmentOptions walletfragmentoptions, int i)
    {
        walletfragmentoptions.Hv = i;
        return i;
    }

    public static Builder newBuilder()
    {
        WalletFragmentOptions walletfragmentoptions = new WalletFragmentOptions();
        walletfragmentoptions.getClass();
        return walletfragmentoptions. new Builder();
    }

    public void N(Context context)
    {
        if (akz != null)
        {
            akz.N(context);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public int getEnvironment()
    {
        return ajY;
    }

    public WalletFragmentStyle getFragmentStyle()
    {
        return akz;
    }

    public int getMode()
    {
        return Hv;
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

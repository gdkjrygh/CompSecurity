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

        final WalletFragmentOptions akD;

        public WalletFragmentOptions build()
        {
            return akD;
        }

        public Builder setEnvironment(int i)
        {
            WalletFragmentOptions.a(akD, i);
            return this;
        }

        public Builder setFragmentStyle(int i)
        {
            WalletFragmentOptions.a(akD, (new WalletFragmentStyle()).setStyleResourceId(i));
            return this;
        }

        public Builder setFragmentStyle(WalletFragmentStyle walletfragmentstyle)
        {
            WalletFragmentOptions.a(akD, walletfragmentstyle);
            return this;
        }

        public Builder setMode(int i)
        {
            WalletFragmentOptions.c(akD, i);
            return this;
        }

        public Builder setTheme(int i)
        {
            WalletFragmentOptions.b(akD, i);
            return this;
        }

        private Builder()
        {
            akD = WalletFragmentOptions.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new b();
    private int Hy;
    private WalletFragmentStyle akC;
    private int akb;
    private int mTheme;
    final int xM;

    private WalletFragmentOptions()
    {
        xM = 1;
    }

    WalletFragmentOptions(int i, int j, int k, WalletFragmentStyle walletfragmentstyle, int l)
    {
        xM = i;
        akb = j;
        mTheme = k;
        akC = walletfragmentstyle;
        Hy = l;
    }

    static int a(WalletFragmentOptions walletfragmentoptions, int i)
    {
        walletfragmentoptions.akb = i;
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
        attributeset.akb = j;
        attributeset.akC = (new WalletFragmentStyle()).setStyleResourceId(k);
        ((WalletFragmentOptions) (attributeset)).akC.Q(context);
        attributeset.Hy = l;
        return attributeset;
    }

    static WalletFragmentStyle a(WalletFragmentOptions walletfragmentoptions, WalletFragmentStyle walletfragmentstyle)
    {
        walletfragmentoptions.akC = walletfragmentstyle;
        return walletfragmentstyle;
    }

    static int b(WalletFragmentOptions walletfragmentoptions, int i)
    {
        walletfragmentoptions.mTheme = i;
        return i;
    }

    static int c(WalletFragmentOptions walletfragmentoptions, int i)
    {
        walletfragmentoptions.Hy = i;
        return i;
    }

    public static Builder newBuilder()
    {
        WalletFragmentOptions walletfragmentoptions = new WalletFragmentOptions();
        walletfragmentoptions.getClass();
        return walletfragmentoptions. new Builder();
    }

    public void Q(Context context)
    {
        if (akC != null)
        {
            akC.Q(context);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public int getEnvironment()
    {
        return akb;
    }

    public WalletFragmentStyle getFragmentStyle()
    {
        return akC;
    }

    public int getMode()
    {
        return Hy;
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

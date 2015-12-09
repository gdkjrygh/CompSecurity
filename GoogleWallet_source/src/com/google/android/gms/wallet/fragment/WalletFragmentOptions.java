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

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private int Ya;
    private int aUz;
    private WalletFragmentStyle aVc;
    private int mTheme;
    final int mVersionCode;

    private WalletFragmentOptions()
    {
        mVersionCode = 1;
    }

    WalletFragmentOptions(int i, int j, int k, WalletFragmentStyle walletfragmentstyle, int l)
    {
        mVersionCode = i;
        aUz = j;
        mTheme = k;
        aVc = walletfragmentstyle;
        Ya = l;
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
        attributeset.aUz = j;
        attributeset.aVc = (new WalletFragmentStyle()).setStyleResourceId(k);
        ((WalletFragmentOptions) (attributeset)).aVc.ah(context);
        attributeset.Ya = l;
        return attributeset;
    }

    public final void ah(Context context)
    {
        if (aVc != null)
        {
            aVc.ah(context);
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getEnvironment()
    {
        return aUz;
    }

    public final WalletFragmentStyle getFragmentStyle()
    {
        return aVc;
    }

    public final int getMode()
    {
        return Ya;
    }

    public final int getTheme()
    {
        return mTheme;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}

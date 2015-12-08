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
//            zzb, WalletFragmentStyle

public final class WalletFragmentOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    final int a;
    private int b;
    private int c;
    private WalletFragmentStyle d;
    private int e;

    private WalletFragmentOptions()
    {
        a = 1;
    }

    WalletFragmentOptions(int i, int j, int k, WalletFragmentStyle walletfragmentstyle, int l)
    {
        a = i;
        b = j;
        c = k;
        d = walletfragmentstyle;
        e = l;
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
        attributeset.c = i;
        attributeset.b = j;
        attributeset.d = (new WalletFragmentStyle()).a(k);
        ((WalletFragmentOptions) (attributeset)).d.a(context);
        attributeset.e = l;
        return attributeset;
    }

    public int a()
    {
        return b;
    }

    public void a(Context context)
    {
        if (d != null)
        {
            d.a(context);
        }
    }

    public int b()
    {
        return c;
    }

    public WalletFragmentStyle c()
    {
        return d;
    }

    public int d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.a(this, parcel, i);
    }

}

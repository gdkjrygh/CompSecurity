// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            zzc, Dimension

public final class WalletFragmentStyle
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    final int a;
    Bundle b;
    int c;

    public WalletFragmentStyle()
    {
        a = 1;
        b = new Bundle();
    }

    WalletFragmentStyle(int i, Bundle bundle, int j)
    {
        a = i;
        b = bundle;
        c = j;
    }

    private void a(TypedArray typedarray, int i, String s)
    {
        if (!b.containsKey(s))
        {
            if ((typedarray = typedarray.peekValue(i)) != null)
            {
                b.putLong(s, Dimension.a(typedarray));
                return;
            }
        }
    }

    private void a(TypedArray typedarray, int i, String s, String s1)
    {
        if (!b.containsKey(s) && !b.containsKey(s1))
        {
            if ((typedarray = typedarray.peekValue(i)) != null)
            {
                if (((TypedValue) (typedarray)).type >= 28 && ((TypedValue) (typedarray)).type <= 31)
                {
                    b.putInt(s, ((TypedValue) (typedarray)).data);
                    return;
                } else
                {
                    b.putInt(s1, ((TypedValue) (typedarray)).resourceId);
                    return;
                }
            }
        }
    }

    private void b(TypedArray typedarray, int i, String s)
    {
        if (!b.containsKey(s))
        {
            if ((typedarray = typedarray.peekValue(i)) != null)
            {
                b.putInt(s, ((TypedValue) (typedarray)).data);
                return;
            }
        }
    }

    public int a(String s, DisplayMetrics displaymetrics, int i)
    {
        if (b.containsKey(s))
        {
            i = Dimension.a(b.getLong(s), displaymetrics);
        }
        return i;
    }

    public WalletFragmentStyle a(int i)
    {
        c = i;
        return this;
    }

    public void a(Context context)
    {
        int i;
        if (c <= 0)
        {
            i = com.google.android.gms.R.style.WalletFragmentDefaultStyle;
        } else
        {
            i = c;
        }
        context = context.obtainStyledAttributes(i, com.google.android.gms.R.styleable.WalletFragmentStyle);
        a(((TypedArray) (context)), com.google.android.gms.R.styleable.WalletFragmentStyle_buyButtonWidth, "buyButtonWidth");
        a(((TypedArray) (context)), com.google.android.gms.R.styleable.WalletFragmentStyle_buyButtonHeight, "buyButtonHeight");
        b(context, com.google.android.gms.R.styleable.WalletFragmentStyle_buyButtonText, "buyButtonText");
        b(context, com.google.android.gms.R.styleable.WalletFragmentStyle_buyButtonAppearance, "buyButtonAppearance");
        b(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsTextAppearance, "maskedWalletDetailsTextAppearance");
        b(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance, "maskedWalletDetailsHeaderTextAppearance");
        a(((TypedArray) (context)), com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsBackground, "maskedWalletDetailsBackgroundColor", "maskedWalletDetailsBackgroundResource");
        b(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance, "maskedWalletDetailsButtonTextAppearance");
        a(((TypedArray) (context)), com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonBackground, "maskedWalletDetailsButtonBackgroundColor", "maskedWalletDetailsButtonBackgroundResource");
        b(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoTextColor, "maskedWalletDetailsLogoTextColor");
        b(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoImageType, "maskedWalletDetailsLogoImageType");
        context.recycle();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.a(this, parcel, i);
    }

}

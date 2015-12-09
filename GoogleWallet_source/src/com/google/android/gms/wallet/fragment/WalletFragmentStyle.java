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
//            c, Dimension

public final class WalletFragmentStyle
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    Bundle aVe;
    int aVf;
    final int mVersionCode;

    public WalletFragmentStyle()
    {
        mVersionCode = 1;
        aVe = new Bundle();
    }

    WalletFragmentStyle(int i, Bundle bundle, int j)
    {
        mVersionCode = i;
        aVe = bundle;
        aVf = j;
    }

    private void a(TypedArray typedarray, int i, String s)
    {
        if (!aVe.containsKey(s))
        {
            if ((typedarray = typedarray.peekValue(i)) != null)
            {
                aVe.putLong(s, Dimension.a(typedarray));
                return;
            }
        }
    }

    private void a(TypedArray typedarray, int i, String s, String s1)
    {
        if (!aVe.containsKey(s) && !aVe.containsKey(s1))
        {
            if ((typedarray = typedarray.peekValue(i)) != null)
            {
                if (((TypedValue) (typedarray)).type >= 28 && ((TypedValue) (typedarray)).type <= 31)
                {
                    aVe.putInt(s, ((TypedValue) (typedarray)).data);
                    return;
                } else
                {
                    aVe.putInt(s1, ((TypedValue) (typedarray)).resourceId);
                    return;
                }
            }
        }
    }

    private void b(TypedArray typedarray, int i, String s)
    {
        if (!aVe.containsKey(s))
        {
            if ((typedarray = typedarray.peekValue(i)) != null)
            {
                aVe.putInt(s, ((TypedValue) (typedarray)).data);
                return;
            }
        }
    }

    public final int a(String s, DisplayMetrics displaymetrics, int i)
    {
        if (aVe.containsKey(s))
        {
            i = Dimension.a(aVe.getLong(s), displaymetrics);
        }
        return i;
    }

    public final void ah(Context context)
    {
        int i;
        if (aVf <= 0)
        {
            i = com.google.android.gms.R.style.WalletFragmentDefaultStyle;
        } else
        {
            i = aVf;
        }
        context = context.obtainStyledAttributes(i, com.google.android.gms.R.styleable.WalletFragmentStyle);
        a(context, com.google.android.gms.R.styleable.WalletFragmentStyle_buyButtonWidth, "buyButtonWidth");
        a(context, com.google.android.gms.R.styleable.WalletFragmentStyle_buyButtonHeight, "buyButtonHeight");
        b(context, com.google.android.gms.R.styleable.WalletFragmentStyle_buyButtonText, "buyButtonText");
        b(context, com.google.android.gms.R.styleable.WalletFragmentStyle_buyButtonAppearance, "buyButtonAppearance");
        b(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsTextAppearance, "maskedWalletDetailsTextAppearance");
        b(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance, "maskedWalletDetailsHeaderTextAppearance");
        a(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsBackground, "maskedWalletDetailsBackgroundColor", "maskedWalletDetailsBackgroundResource");
        b(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance, "maskedWalletDetailsButtonTextAppearance");
        a(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonBackground, "maskedWalletDetailsButtonBackgroundColor", "maskedWalletDetailsButtonBackgroundResource");
        b(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoTextColor, "maskedWalletDetailsLogoTextColor");
        b(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoImageType, "maskedWalletDetailsLogoImageType");
        context.recycle();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final WalletFragmentStyle setStyleResourceId(int i)
    {
        aVf = i;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}

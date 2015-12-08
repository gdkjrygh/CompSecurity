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
    Bundle acT;
    int acU;
    final int xH;

    public WalletFragmentStyle()
    {
        xH = 1;
        acT = new Bundle();
    }

    WalletFragmentStyle(int i, Bundle bundle, int j)
    {
        xH = i;
        acT = bundle;
        acU = j;
    }

    private void a(TypedArray typedarray, int i, String s)
    {
        if (!acT.containsKey(s))
        {
            if ((typedarray = typedarray.peekValue(i)) != null)
            {
                acT.putLong(s, Dimension.a(typedarray));
                return;
            }
        }
    }

    private void a(TypedArray typedarray, int i, String s, String s1)
    {
        if (!acT.containsKey(s) && !acT.containsKey(s1))
        {
            if ((typedarray = typedarray.peekValue(i)) != null)
            {
                if (((TypedValue) (typedarray)).type >= 28 && ((TypedValue) (typedarray)).type <= 31)
                {
                    acT.putInt(s, ((TypedValue) (typedarray)).data);
                    return;
                } else
                {
                    acT.putInt(s1, ((TypedValue) (typedarray)).resourceId);
                    return;
                }
            }
        }
    }

    private void b(TypedArray typedarray, int i, String s)
    {
        if (!acT.containsKey(s))
        {
            if ((typedarray = typedarray.peekValue(i)) != null)
            {
                acT.putInt(s, ((TypedValue) (typedarray)).data);
                return;
            }
        }
    }

    public void I(Context context)
    {
        int i;
        if (acU <= 0)
        {
            i = com.google.android.gms.R.style.WalletFragmentDefaultStyle;
        } else
        {
            i = acU;
        }
        context = context.obtainStyledAttributes(i, com.google.android.gms.R.styleable.WalletFragmentStyle);
        a(context, 1, "buyButtonWidth");
        a(context, 0, "buyButtonHeight");
        b(context, 2, "buyButtonText");
        b(context, 3, "buyButtonAppearance");
        b(context, 4, "maskedWalletDetailsTextAppearance");
        b(context, 5, "maskedWalletDetailsHeaderTextAppearance");
        a(context, 6, "maskedWalletDetailsBackgroundColor", "maskedWalletDetailsBackgroundResource");
        b(context, 7, "maskedWalletDetailsButtonTextAppearance");
        a(context, 8, "maskedWalletDetailsButtonBackgroundColor", "maskedWalletDetailsButtonBackgroundResource");
        b(context, 9, "maskedWalletDetailsLogoTextColor");
        b(context, 10, "maskedWalletDetailsLogoImageType");
        context.recycle();
    }

    public int a(String s, DisplayMetrics displaymetrics, int i)
    {
        if (acT.containsKey(s))
        {
            i = Dimension.a(acT.getLong(s), displaymetrics);
        }
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public WalletFragmentStyle setBuyButtonAppearance(int i)
    {
        acT.putInt("buyButtonAppearance", i);
        return this;
    }

    public WalletFragmentStyle setBuyButtonHeight(int i)
    {
        acT.putLong("buyButtonHeight", Dimension.cz(i));
        return this;
    }

    public WalletFragmentStyle setBuyButtonHeight(int i, float f)
    {
        acT.putLong("buyButtonHeight", Dimension.a(i, f));
        return this;
    }

    public WalletFragmentStyle setBuyButtonText(int i)
    {
        acT.putInt("buyButtonText", i);
        return this;
    }

    public WalletFragmentStyle setBuyButtonWidth(int i)
    {
        acT.putLong("buyButtonWidth", Dimension.cz(i));
        return this;
    }

    public WalletFragmentStyle setBuyButtonWidth(int i, float f)
    {
        acT.putLong("buyButtonWidth", Dimension.a(i, f));
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsBackgroundColor(int i)
    {
        acT.remove("maskedWalletDetailsBackgroundResource");
        acT.putInt("maskedWalletDetailsBackgroundColor", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsBackgroundResource(int i)
    {
        acT.remove("maskedWalletDetailsBackgroundColor");
        acT.putInt("maskedWalletDetailsBackgroundResource", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundColor(int i)
    {
        acT.remove("maskedWalletDetailsButtonBackgroundResource");
        acT.putInt("maskedWalletDetailsButtonBackgroundColor", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundResource(int i)
    {
        acT.remove("maskedWalletDetailsButtonBackgroundColor");
        acT.putInt("maskedWalletDetailsButtonBackgroundResource", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonTextAppearance(int i)
    {
        acT.putInt("maskedWalletDetailsButtonTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsHeaderTextAppearance(int i)
    {
        acT.putInt("maskedWalletDetailsHeaderTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsLogoImageType(int i)
    {
        acT.putInt("maskedWalletDetailsLogoImageType", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsLogoTextColor(int i)
    {
        acT.putInt("maskedWalletDetailsLogoTextColor", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsTextAppearance(int i)
    {
        acT.putInt("maskedWalletDetailsTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle setStyleResourceId(int i)
    {
        acU = i;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}

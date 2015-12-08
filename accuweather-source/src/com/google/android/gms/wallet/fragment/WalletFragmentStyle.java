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
    Bundle akB;
    int akC;
    final int xJ;

    public WalletFragmentStyle()
    {
        xJ = 1;
        akB = new Bundle();
    }

    WalletFragmentStyle(int i, Bundle bundle, int j)
    {
        xJ = i;
        akB = bundle;
        akC = j;
    }

    private void a(TypedArray typedarray, int i, String s)
    {
        if (!akB.containsKey(s))
        {
            if ((typedarray = typedarray.peekValue(i)) != null)
            {
                akB.putLong(s, Dimension.a(typedarray));
                return;
            }
        }
    }

    private void a(TypedArray typedarray, int i, String s, String s1)
    {
        if (!akB.containsKey(s) && !akB.containsKey(s1))
        {
            if ((typedarray = typedarray.peekValue(i)) != null)
            {
                if (((TypedValue) (typedarray)).type >= 28 && ((TypedValue) (typedarray)).type <= 31)
                {
                    akB.putInt(s, ((TypedValue) (typedarray)).data);
                    return;
                } else
                {
                    akB.putInt(s1, ((TypedValue) (typedarray)).resourceId);
                    return;
                }
            }
        }
    }

    private void b(TypedArray typedarray, int i, String s)
    {
        if (!akB.containsKey(s))
        {
            if ((typedarray = typedarray.peekValue(i)) != null)
            {
                akB.putInt(s, ((TypedValue) (typedarray)).data);
                return;
            }
        }
    }

    public void N(Context context)
    {
        int i;
        if (akC <= 0)
        {
            i = com.google.android.gms.R.style.WalletFragmentDefaultStyle;
        } else
        {
            i = akC;
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
        if (akB.containsKey(s))
        {
            i = Dimension.a(akB.getLong(s), displaymetrics);
        }
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public WalletFragmentStyle setBuyButtonAppearance(int i)
    {
        akB.putInt("buyButtonAppearance", i);
        return this;
    }

    public WalletFragmentStyle setBuyButtonHeight(int i)
    {
        akB.putLong("buyButtonHeight", Dimension.dM(i));
        return this;
    }

    public WalletFragmentStyle setBuyButtonHeight(int i, float f)
    {
        akB.putLong("buyButtonHeight", Dimension.a(i, f));
        return this;
    }

    public WalletFragmentStyle setBuyButtonText(int i)
    {
        akB.putInt("buyButtonText", i);
        return this;
    }

    public WalletFragmentStyle setBuyButtonWidth(int i)
    {
        akB.putLong("buyButtonWidth", Dimension.dM(i));
        return this;
    }

    public WalletFragmentStyle setBuyButtonWidth(int i, float f)
    {
        akB.putLong("buyButtonWidth", Dimension.a(i, f));
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsBackgroundColor(int i)
    {
        akB.remove("maskedWalletDetailsBackgroundResource");
        akB.putInt("maskedWalletDetailsBackgroundColor", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsBackgroundResource(int i)
    {
        akB.remove("maskedWalletDetailsBackgroundColor");
        akB.putInt("maskedWalletDetailsBackgroundResource", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundColor(int i)
    {
        akB.remove("maskedWalletDetailsButtonBackgroundResource");
        akB.putInt("maskedWalletDetailsButtonBackgroundColor", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundResource(int i)
    {
        akB.remove("maskedWalletDetailsButtonBackgroundColor");
        akB.putInt("maskedWalletDetailsButtonBackgroundResource", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonTextAppearance(int i)
    {
        akB.putInt("maskedWalletDetailsButtonTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsHeaderTextAppearance(int i)
    {
        akB.putInt("maskedWalletDetailsHeaderTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsLogoImageType(int i)
    {
        akB.putInt("maskedWalletDetailsLogoImageType", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsLogoTextColor(int i)
    {
        akB.putInt("maskedWalletDetailsLogoTextColor", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsTextAppearance(int i)
    {
        akB.putInt("maskedWalletDetailsTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle setStyleResourceId(int i)
    {
        akC = i;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}

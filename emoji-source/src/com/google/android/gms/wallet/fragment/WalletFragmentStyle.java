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
    Bundle akE;
    int akF;
    final int xM;

    public WalletFragmentStyle()
    {
        xM = 1;
        akE = new Bundle();
    }

    WalletFragmentStyle(int i, Bundle bundle, int j)
    {
        xM = i;
        akE = bundle;
        akF = j;
    }

    private void a(TypedArray typedarray, int i, String s)
    {
        if (!akE.containsKey(s))
        {
            if ((typedarray = typedarray.peekValue(i)) != null)
            {
                akE.putLong(s, Dimension.a(typedarray));
                return;
            }
        }
    }

    private void a(TypedArray typedarray, int i, String s, String s1)
    {
        if (!akE.containsKey(s) && !akE.containsKey(s1))
        {
            if ((typedarray = typedarray.peekValue(i)) != null)
            {
                if (((TypedValue) (typedarray)).type >= 28 && ((TypedValue) (typedarray)).type <= 31)
                {
                    akE.putInt(s, ((TypedValue) (typedarray)).data);
                    return;
                } else
                {
                    akE.putInt(s1, ((TypedValue) (typedarray)).resourceId);
                    return;
                }
            }
        }
    }

    private void b(TypedArray typedarray, int i, String s)
    {
        if (!akE.containsKey(s))
        {
            if ((typedarray = typedarray.peekValue(i)) != null)
            {
                akE.putInt(s, ((TypedValue) (typedarray)).data);
                return;
            }
        }
    }

    public void Q(Context context)
    {
        int i;
        if (akF <= 0)
        {
            i = com.google.android.gms.R.style.WalletFragmentDefaultStyle;
        } else
        {
            i = akF;
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
        if (akE.containsKey(s))
        {
            i = Dimension.a(akE.getLong(s), displaymetrics);
        }
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public WalletFragmentStyle setBuyButtonAppearance(int i)
    {
        akE.putInt("buyButtonAppearance", i);
        return this;
    }

    public WalletFragmentStyle setBuyButtonHeight(int i)
    {
        akE.putLong("buyButtonHeight", Dimension.dM(i));
        return this;
    }

    public WalletFragmentStyle setBuyButtonHeight(int i, float f)
    {
        akE.putLong("buyButtonHeight", Dimension.a(i, f));
        return this;
    }

    public WalletFragmentStyle setBuyButtonText(int i)
    {
        akE.putInt("buyButtonText", i);
        return this;
    }

    public WalletFragmentStyle setBuyButtonWidth(int i)
    {
        akE.putLong("buyButtonWidth", Dimension.dM(i));
        return this;
    }

    public WalletFragmentStyle setBuyButtonWidth(int i, float f)
    {
        akE.putLong("buyButtonWidth", Dimension.a(i, f));
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsBackgroundColor(int i)
    {
        akE.remove("maskedWalletDetailsBackgroundResource");
        akE.putInt("maskedWalletDetailsBackgroundColor", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsBackgroundResource(int i)
    {
        akE.remove("maskedWalletDetailsBackgroundColor");
        akE.putInt("maskedWalletDetailsBackgroundResource", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundColor(int i)
    {
        akE.remove("maskedWalletDetailsButtonBackgroundResource");
        akE.putInt("maskedWalletDetailsButtonBackgroundColor", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundResource(int i)
    {
        akE.remove("maskedWalletDetailsButtonBackgroundColor");
        akE.putInt("maskedWalletDetailsButtonBackgroundResource", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonTextAppearance(int i)
    {
        akE.putInt("maskedWalletDetailsButtonTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsHeaderTextAppearance(int i)
    {
        akE.putInt("maskedWalletDetailsHeaderTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsLogoImageType(int i)
    {
        akE.putInt("maskedWalletDetailsLogoImageType", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsLogoTextColor(int i)
    {
        akE.putInt("maskedWalletDetailsLogoTextColor", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsTextAppearance(int i)
    {
        akE.putInt("maskedWalletDetailsTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle setStyleResourceId(int i)
    {
        akF = i;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}

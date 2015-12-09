// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.xm;

// Referenced classes of package com.google.android.gms.wallet.shared:
//            c, ApplicationParameters

public final class BuyFlowConfig
    implements SafeParcelable
{
    public final class a
    {

        final BuyFlowConfig aVG;

        public final a a(ApplicationParameters applicationparameters)
        {
            aVG.aVC = applicationparameters;
            return this;
        }

        public final a ei(String s)
        {
            aVG.aVD = s;
            return this;
        }

        public final a ej(String s)
        {
            aVG.aVE = s;
            return this;
        }

        public final BuyFlowConfig va()
        {
            if (aVG.aVB == null)
            {
                aVG.aVB = xm.uW();
            }
            return aVG;
        }

        private a()
        {
            aVG = BuyFlowConfig.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new c();
    String aVB;
    ApplicationParameters aVC;
    String aVD;
    String aVE;
    String aVF;
    final int mVersionCode;

    BuyFlowConfig()
    {
        mVersionCode = 2;
    }

    BuyFlowConfig(int i, String s, ApplicationParameters applicationparameters, String s1, String s2, String s3)
    {
        mVersionCode = i;
        aVB = s;
        aVC = applicationparameters;
        aVD = s1;
        aVE = s2;
        aVF = s3;
    }

    public static a newBuilder()
    {
        BuyFlowConfig buyflowconfig = new BuyFlowConfig();
        buyflowconfig.getClass();
        return buyflowconfig. new a();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final ApplicationParameters getApplicationParams()
    {
        return aVC;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}

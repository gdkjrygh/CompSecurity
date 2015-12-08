// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.wallet.wobs.add.LinkPromptConverter;
import com.google.android.apps.wallet.wobs.add.Program;
import com.google.android.apps.wallet.wobs.add.UserDataPrompt;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            LoyaltyCardInfo

public final class LoyaltyProgram
    implements Parcelable, Program
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static LoyaltyProgram createFromParcel(Parcel parcel)
        {
            boolean flag = true;
            int i = 0;
            ClassLoader classloader = com/google/android/apps/wallet/loyalty/LoyaltyCardInfo.getClassLoader();
            String s = parcel.readString();
            String s1 = parcel.readString();
            String s2 = parcel.readString();
            String s3 = parcel.readString();
            int j = parcel.readInt();
            String s4;
            String s5;
            com.google.common.collect.ImmutableList.Builder builder;
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            s4 = parcel.readString();
            s5 = parcel.readString();
            builder = ImmutableList.builder();
            parcel = parcel.readParcelableArray(classloader);
            for (int k = parcel.length; i < k; i++)
            {
                builder.add((UserDataPrompt)parcel[i]);
            }

            return new LoyaltyProgram(s, s1, s2, s3, j, builder.build(), flag, s4, s5);
        }

        private static LoyaltyProgram[] newArray(int i)
        {
            return new LoyaltyProgram[i];
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final String discoverableId;
    private final int discoverableStatus;
    private final ImmutableList form;
    private final String logoImageUrl;
    private final boolean marketingOptInDefault;
    private final String merchantName;
    private final String privacyUrl;
    private final String programName;
    private final String tosUrl;

    public LoyaltyProgram(com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram discoverableloyaltyprogram, ImmutableList immutablelist)
    {
        if (discoverableloyaltyprogram != null)
        {
            discoverableId = discoverableloyaltyprogram.programId;
            merchantName = discoverableloyaltyprogram.nativeRenderingInfo.merchantName;
            programName = discoverableloyaltyprogram.nativeRenderingInfo.programName;
            logoImageUrl = discoverableloyaltyprogram.nativeRenderingInfo.logoImageUrl;
            discoverableStatus = ((Integer)Preconditions.checkNotNull(discoverableloyaltyprogram.status)).intValue();
            boolean flag;
            if (discoverableloyaltyprogram.signupInfo != null && discoverableloyaltyprogram.signupInfo.marketingOptInDefault != null)
            {
                flag = discoverableloyaltyprogram.signupInfo.marketingOptInDefault.booleanValue();
            } else
            {
                flag = false;
            }
            marketingOptInDefault = flag;
            tosUrl = discoverableloyaltyprogram.tosUrl;
            privacyUrl = discoverableloyaltyprogram.privacyUrl;
        } else
        {
            discoverableId = null;
            merchantName = null;
            programName = null;
            logoImageUrl = null;
            discoverableStatus = 0x80000000;
            marketingOptInDefault = false;
            tosUrl = null;
            privacyUrl = null;
        }
        form = immutablelist;
    }

    public LoyaltyProgram(com.google.wallet.proto.api.NanoWalletLoyalty.LoyaltyForm loyaltyform, Context context)
    {
        if (loyaltyform.loyaltyProgramInfo != null)
        {
            discoverableId = loyaltyform.loyaltyProgramInfo.discoverableProgramId;
            merchantName = loyaltyform.loyaltyProgramInfo.merchantName;
            programName = loyaltyform.loyaltyProgramInfo.programName;
            logoImageUrl = loyaltyform.loyaltyProgramInfo.logoImageUrl;
            discoverableStatus = 0x80000000;
            marketingOptInDefault = false;
            tosUrl = null;
            privacyUrl = null;
        } else
        {
            discoverableId = null;
            merchantName = null;
            programName = null;
            logoImageUrl = null;
            discoverableStatus = 0x80000000;
            marketingOptInDefault = false;
            tosUrl = null;
            privacyUrl = null;
        }
        form = LinkPromptConverter.convert(loyaltyform.loyaltyForm.linkPrompts, context);
    }

    LoyaltyProgram(String s, String s1, String s2, String s3, int i, ImmutableList immutablelist, boolean flag, 
            String s4, String s5)
    {
        discoverableId = s;
        merchantName = s1;
        programName = s2;
        logoImageUrl = s3;
        discoverableStatus = i;
        form = immutablelist;
        marketingOptInDefault = flag;
        tosUrl = s4;
        privacyUrl = s5;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getDiscoverableId()
    {
        return discoverableId;
    }

    public final int getDiscoverableStatus()
    {
        return discoverableStatus;
    }

    public final ImmutableList getForm()
    {
        return form;
    }

    public final String getLogoImageUrl()
    {
        return logoImageUrl;
    }

    public final boolean getMarketingOptInDefault()
    {
        return marketingOptInDefault;
    }

    public final String getMerchantName()
    {
        return merchantName;
    }

    public final String getPrivacyUrl()
    {
        return privacyUrl;
    }

    public final String getProgramName()
    {
        return programName;
    }

    public final String getTosUrl()
    {
        return tosUrl;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(discoverableId);
        parcel.writeString(merchantName);
        parcel.writeString(programName);
        parcel.writeString(logoImageUrl);
        parcel.writeInt(discoverableStatus);
        int j;
        if (marketingOptInDefault)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        parcel.writeString(tosUrl);
        parcel.writeString(privacyUrl);
        parcel.writeParcelableArray((Parcelable[])form.toArray(new Parcelable[form.size()]), i);
    }

}

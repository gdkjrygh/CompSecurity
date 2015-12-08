// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.api;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.wallet.base.entitymanager.EntityId;
import com.google.android.apps.wallet.creditcard.CreditCardUtil;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.base.Strings;
import com.google.common.base.Throwables;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.wallet.paymentcard.api:
//            CardColor

public class PaymentCard
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static PaymentCard createFromParcel(Parcel parcel)
        {
            try
            {
                parcel = new PaymentCard((com.google.wallet.proto.NanoWalletEntities.Credential)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.Credential(), parcel.createByteArray()));
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                throw Throwables.propagate(parcel);
            }
            return parcel;
        }

        private static PaymentCard[] newArray(int i)
        {
            return new PaymentCard[i];
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
    private final com.google.wallet.proto.NanoWalletEntities.Credential credential;

    public PaymentCard(com.google.wallet.proto.NanoWalletEntities.Credential credential1)
    {
        credential = credential1;
    }

    private static com.google.wallet.proto.NanoWalletEntities.CdpIdData emptyCdpIdData()
    {
        com.google.wallet.proto.NanoWalletEntities.CdpIdData cdpiddata = new com.google.wallet.proto.NanoWalletEntities.CdpIdData();
        cdpiddata.subId = "";
        return cdpiddata;
    }

    private static com.google.wallet.proto.NanoWalletEntities.EntityIdentifier emptyId()
    {
        com.google.wallet.proto.NanoWalletEntities.EntityIdentifier entityidentifier = new com.google.wallet.proto.NanoWalletEntities.EntityIdentifier();
        entityidentifier.localId = "";
        entityidentifier.originatorId = "";
        return entityidentifier;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof PaymentCard))
        {
            return false;
        } else
        {
            obj = (PaymentCard)obj;
            return MessageNano.messageNanoEquals(credential, ((PaymentCard) (obj)).credential);
        }
    }

    public final CardColor getCardColor()
    {
        int ai[] = credential.cardColor;
        if (ai.length == 2)
        {
            return CardColor.create(ai[0], ai[1]);
        } else
        {
            return CardColor.getDefaultColor();
        }
    }

    public final String getCardHolderName()
    {
        return Strings.nullToEmpty(credential.nameOnCard);
    }

    public final String getCardNumberLast4()
    {
        return Strings.nullToEmpty(credential.cardNumberLast4);
    }

    public final com.google.wallet.proto.NanoWalletEntities.CdpIdData getCdpId()
    {
        if (credential.cdpInstrumentId != null)
        {
            return credential.cdpInstrumentId;
        } else
        {
            return emptyCdpIdData();
        }
    }

    protected final com.google.wallet.proto.NanoWalletEntities.Credential getCredential()
    {
        return credential;
    }

    public final Uri getCustomizedImageUri()
    {
        if (!Strings.isNullOrEmpty(credential.cardFrontImageUrl))
        {
            return Uri.parse(credential.cardFrontImageUrl);
        }
        if (credential.credentialTemplate != null && !Strings.isNullOrEmpty(credential.credentialTemplate.frontImage))
        {
            return Uri.parse(credential.credentialTemplate.frontImage);
        } else
        {
            return null;
        }
    }

    public final String getExpirationMonth()
    {
        return Strings.nullToEmpty(credential.expirationMonth);
    }

    public final String getExpirationYear()
    {
        return Strings.nullToEmpty(credential.expirationYear);
    }

    public final EntityId getId()
    {
        com.google.wallet.proto.NanoWalletEntities.EntityIdentifier entityidentifier;
        if (credential.id != null)
        {
            entityidentifier = credential.id;
        } else
        {
            entityidentifier = emptyId();
        }
        return new EntityId(entityidentifier);
    }

    public final String getMaskedCardNumber()
    {
        return CreditCardUtil.mask(getNetwork(), getCardNumberLast4());
    }

    public final Integer getNetwork()
    {
        return Integer.valueOf(Protos.valueWithDefault(credential.network, 1));
    }

    public final String getNickname()
    {
        return Strings.nullToEmpty(credential.nickname);
    }

    public final String getPaymentsSdkId()
    {
        return credential.paymentsSdkInstrumentId;
    }

    public final com.google.wallet.proto.NanoWalletEntities.RestrictedInstrumentUse getRestrictedUse(int i)
    {
        com.google.wallet.proto.NanoWalletEntities.RestrictedInstrumentUse arestrictedinstrumentuse[] = credential.restrictedUses;
        int k = arestrictedinstrumentuse.length;
        for (int j = 0; j < k; j++)
        {
            com.google.wallet.proto.NanoWalletEntities.RestrictedInstrumentUse restrictedinstrumentuse = arestrictedinstrumentuse[j];
            if (restrictedinstrumentuse.use.use.intValue() == i)
            {
                return restrictedinstrumentuse;
            }
        }

        return null;
    }

    public final String getTwoDigitExpirationYear()
    {
        String s1 = getExpirationYear();
        String s = s1;
        if (s1.length() == 4)
        {
            s = s1.substring(2);
        }
        return s;
    }

    public final int getType()
    {
        if (getCredential().type == null)
        {
            return 0;
        } else
        {
            return getCredential().type.intValue();
        }
    }

    public int hashCode()
    {
        return Arrays.hashCode(MessageNano.toByteArray(credential));
    }

    public final boolean isDeclined()
    {
        return Protos.valuesEqual(credential.status, 4);
    }

    public final boolean isExpired()
    {
        return Protos.valueWithDefaultFalse(credential.isExpired);
    }

    public final boolean isInapplicableForUse(int i)
    {
        boolean flag1 = false;
        com.google.wallet.proto.NanoWalletEntities.RestrictedInstrumentUse arestrictedinstrumentuse[] = credential.restrictedUses;
        int k = arestrictedinstrumentuse.length;
        int j = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j < k)
                {
                    if (arestrictedinstrumentuse[j].use.use.intValue() != i)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j++;
        } while (true);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeByteArray(MessageNano.toByteArray(credential));
    }

}

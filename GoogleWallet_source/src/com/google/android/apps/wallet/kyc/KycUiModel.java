// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.wallet.kyc.api.KycUserFlow;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.collect.Lists;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycWalletBalanceUserEvent, KycClaimMoneyUserEvent, KycUserEvent

public class KycUiModel
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static KycUiModel createFromParcel(Parcel parcel)
        {
            boolean flag1 = true;
            KycUiModel kycuimodel = new KycUiModel();
            kycuimodel.setUserFlow(KycUiModel.parseUserFlow(parcel));
            kycuimodel.setPreviousNavState(KycUiModel.parseNavState(parcel));
            kycuimodel.setCurrentNavState(KycUiModel.parseNavState(parcel));
            kycuimodel.setFirstName(parcel.readString());
            kycuimodel.setLastName(parcel.readString());
            kycuimodel.setAddress(KycUiModel.parseAddress(parcel));
            kycuimodel.setAddressList(KycUiModel.parseAddressList(parcel));
            kycuimodel.setSelectedAddressIndex(parcel.readInt());
            kycuimodel.setDateOfBirth(KycUiModel.parseDateOfBirth(parcel));
            kycuimodel.setWalletLegalDocument(KycUiModel.parseLatestLegalDocument(parcel));
            kycuimodel.setEsignLegalDocument(KycUiModel.parseLatestLegalDocument(parcel));
            kycuimodel.setSsnLast4(parcel.readString());
            kycuimodel.setSsnFull9(parcel.readString());
            boolean flag;
            if (parcel.readByte() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            kycuimodel.setIsRetryMode(flag);
            if (parcel.readByte() == 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            kycuimodel.setIsAllLegalDocumentsAccepted(flag);
            kycuimodel.setReferralQuestions(KycUiModel.parseReferralQuestions(parcel));
            kycuimodel.setReferralAnswers(KycUiModel.parseReferralAnswers(parcel));
            kycuimodel.setCurrentQuestionIndex(parcel.readInt());
            kycuimodel.setOowQuizStartTimeMillis(parcel.readLong());
            kycuimodel.setOowQuizDurationAllowedMillis(parcel.readLong());
            return kycuimodel;
        }

        private static KycUiModel[] newArray(int i)
        {
            return new KycUiModel[i];
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
    private static final String TAG = com/google/android/apps/wallet/kyc/KycUiModel.getSimpleName();
    private com.google.wallet.proto.NanoWalletEntities.Address address;
    private List addressList;
    private KycNavListener.NavState currentNavState;
    private int currentQuestionIndex;
    private com.google.wallet.proto.features.NanoWalletKyc.DateOfBirth dateOfBirth;
    private com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument esignLegalDocument;
    private String firstName;
    private boolean isAlllegalDocumentsAccepted;
    private boolean isRetryMode;
    private String lastName;
    private long oowQuizDurationAllowedMillis;
    private long oowQuizStartTimeMillis;
    private KycNavListener.NavState previousNavState;
    private List referralAnswers;
    private List referralQuestions;
    private int selectedAddressIndex;
    private String ssnFull9;
    private String ssnLast4;
    private KycUserFlow userFlow;
    private com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument walletLegalDocument;

    public KycUiModel()
    {
        userFlow = KycUserFlow.SETUP_WALLET_BALANCE;
        previousNavState = KycNavListener.NavState.UNINITIALIZED;
        currentNavState = KycNavListener.NavState.UNINITIALIZED;
        isAlllegalDocumentsAccepted = false;
        isRetryMode = false;
    }

    private static com.google.wallet.proto.NanoWalletEntities.Address parseAddress(Parcel parcel)
    {
        if (parcel.readByte() == 0)
        {
            return null;
        }
        try
        {
            parcel = (com.google.wallet.proto.NanoWalletEntities.Address)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.Address(), parcel.createByteArray());
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            WLog.e(TAG, "Unable to parse Address from parcel.");
            return null;
        }
        return parcel;
    }

    private static List parseAddressList(Parcel parcel)
    {
        int j = parcel.readInt();
        java.util.ArrayList arraylist = Lists.newArrayListWithCapacity(j);
        int i = 0;
        while (i < j) 
        {
            try
            {
                arraylist.add(MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.Address(), parcel.createByteArray()));
            }
            catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
            {
                WLog.e(TAG, "Unable to parse Address from Parcel");
            }
            i++;
        }
        return arraylist;
    }

    private static com.google.wallet.proto.features.NanoWalletKyc.DateOfBirth parseDateOfBirth(Parcel parcel)
    {
        if (parcel.readByte() == 0)
        {
            return null;
        }
        try
        {
            parcel = (com.google.wallet.proto.features.NanoWalletKyc.DateOfBirth)MessageNano.mergeFrom(new com.google.wallet.proto.features.NanoWalletKyc.DateOfBirth(), parcel.createByteArray());
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            WLog.e(TAG, "Unable to parse DateOfBirth from parcel.");
            return null;
        }
        return parcel;
    }

    private static com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument parseLatestLegalDocument(Parcel parcel)
    {
        if (parcel.readByte() == 0)
        {
            return null;
        }
        try
        {
            parcel = (com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument(), parcel.createByteArray());
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            WLog.e(TAG, "Unable to parse LatestLegalDocument from parcel.");
            return null;
        }
        return parcel;
    }

    private static KycNavListener.NavState parseNavState(Parcel parcel)
    {
        return KycNavListener.NavState.values()[parcel.readInt()];
    }

    private static List parseReferralAnswers(Parcel parcel)
    {
        int j = parcel.readInt();
        java.util.ArrayList arraylist = Lists.newArrayListWithCapacity(j);
        int i = 0;
        while (i < j) 
        {
            try
            {
                arraylist.add(MessageNano.mergeFrom(new com.google.wallet.proto.features.NanoWalletKyc.ReferralAnswer(), parcel.createByteArray()));
            }
            catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
            {
                WLog.e(TAG, "Unable to parse ReferralAnswer from Parcel");
            }
            i++;
        }
        return arraylist;
    }

    private static List parseReferralQuestions(Parcel parcel)
    {
        int j = parcel.readInt();
        java.util.ArrayList arraylist = Lists.newArrayListWithCapacity(j);
        int i = 0;
        while (i < j) 
        {
            try
            {
                arraylist.add(MessageNano.mergeFrom(new com.google.wallet.proto.features.NanoWalletKyc.ReferralQuestion(), parcel.createByteArray()));
            }
            catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
            {
                WLog.e(TAG, "Unable to parse ReferralQuestion from Parcel");
            }
            i++;
        }
        return arraylist;
    }

    private static KycUserFlow parseUserFlow(Parcel parcel)
    {
        return KycUserFlow.values()[parcel.readInt()];
    }

    private static void writeAddressListToParcel(Parcel parcel, List list)
    {
        int i;
        if (list == null)
        {
            i = 0;
        } else
        {
            i = list.size();
        }
        parcel.writeInt(i);
        if (list != null)
        {
            for (list = list.iterator(); list.hasNext(); parcel.writeByteArray(MessageNano.toByteArray((com.google.wallet.proto.NanoWalletEntities.Address)list.next()))) { }
        }
    }

    private static void writeNavStateToParcel(Parcel parcel, KycNavListener.NavState navstate)
    {
        parcel.writeInt(navstate.ordinal());
    }

    private static void writeProtoToParcel(Parcel parcel, MessageNano messagenano)
    {
        int i;
        if (messagenano != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        if (messagenano != null)
        {
            parcel.writeByteArray(MessageNano.toByteArray(messagenano));
        }
    }

    private static void writeReferralAnswersToParcel(Parcel parcel, List list)
    {
        int i;
        if (list == null)
        {
            i = 0;
        } else
        {
            i = list.size();
        }
        parcel.writeInt(i);
        if (list != null)
        {
            for (list = list.iterator(); list.hasNext(); parcel.writeByteArray(MessageNano.toByteArray((com.google.wallet.proto.features.NanoWalletKyc.ReferralAnswer)list.next()))) { }
        }
    }

    private static void writeReferralQuestionsToParcel(Parcel parcel, List list)
    {
        int i;
        if (list == null)
        {
            i = 0;
        } else
        {
            i = list.size();
        }
        parcel.writeInt(i);
        if (list != null)
        {
            for (list = list.iterator(); list.hasNext(); parcel.writeByteArray(MessageNano.toByteArray((com.google.wallet.proto.features.NanoWalletKyc.ReferralQuestion)list.next()))) { }
        }
    }

    private static void writeUserFlowToParcel(Parcel parcel, KycUserFlow kycuserflow)
    {
        parcel.writeInt(kycuserflow.ordinal());
    }

    public final void addAddressToList(com.google.wallet.proto.NanoWalletEntities.Address address1)
    {
        addressList.add(address1);
    }

    public int describeContents()
    {
        return 0;
    }

    public final com.google.wallet.proto.NanoWalletEntities.Address getAddress()
    {
        return address;
    }

    public final List getAddressList()
    {
        return addressList;
    }

    public final com.google.wallet.proto.features.NanoWalletKyc.ReferralAnswer getCurrentAnswer()
    {
        if (referralAnswers == null || currentQuestionIndex > referralAnswers.size() - 1)
        {
            return null;
        } else
        {
            return (com.google.wallet.proto.features.NanoWalletKyc.ReferralAnswer)referralAnswers.get(currentQuestionIndex);
        }
    }

    public final KycNavListener.NavState getCurrentNavState()
    {
        return currentNavState;
    }

    public final com.google.wallet.proto.features.NanoWalletKyc.ReferralQuestion getCurrentQuestion()
    {
        return (com.google.wallet.proto.features.NanoWalletKyc.ReferralQuestion)referralQuestions.get(currentQuestionIndex);
    }

    public final int getCurrentQuestionIndex()
    {
        return currentQuestionIndex;
    }

    public final com.google.wallet.proto.features.NanoWalletKyc.DateOfBirth getDateOfBirth()
    {
        return dateOfBirth;
    }

    public final com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument getEsignLegalDocument()
    {
        return esignLegalDocument;
    }

    public final String getFirstName()
    {
        return firstName;
    }

    public final KycUserEvent getKycUserEvent()
    {
        static final class _cls2
        {

            static final int $SwitchMap$com$google$android$apps$wallet$kyc$api$KycUserFlow[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$kyc$api$KycUserFlow = new int[KycUserFlow.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$kyc$api$KycUserFlow[KycUserFlow.SETUP_WALLET_BALANCE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$kyc$api$KycUserFlow[KycUserFlow.P2P_CLAIM.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$kyc$api$KycUserFlow[KycUserFlow.PLASTIC_CARD.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2..SwitchMap.com.google.android.apps.wallet.kyc.api.KycUserFlow[userFlow.ordinal()])
        {
        default:
            String s = String.valueOf(userFlow);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 18)).append("Unknown userFlow: ").append(s).toString());

        case 1: // '\001'
            return new KycWalletBalanceUserEvent();

        case 2: // '\002'
        case 3: // '\003'
            return new KycClaimMoneyUserEvent();
        }
    }

    public final String getLastName()
    {
        return lastName;
    }

    public final long getOowQuizDurationAllowedMillis()
    {
        return oowQuizDurationAllowedMillis;
    }

    public final long getOowQuizStartTimeMillis()
    {
        return oowQuizStartTimeMillis;
    }

    public final KycNavListener.NavState getPreviousNavState()
    {
        return previousNavState;
    }

    public final List getReferralAnswers()
    {
        return referralAnswers;
    }

    public final List getReferralQuestions()
    {
        return referralQuestions;
    }

    public final int getSelectedAddressIndex()
    {
        return selectedAddressIndex;
    }

    public final String getSsnFull9()
    {
        return ssnFull9;
    }

    public final String getSsnLast4()
    {
        return ssnLast4;
    }

    public final com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument getWalletLegalDocument()
    {
        return walletLegalDocument;
    }

    public final boolean hasMultipleAddresses()
    {
        return addressList != null && !addressList.isEmpty();
    }

    public final boolean hasReferralQuestions()
    {
        return referralQuestions != null && !referralQuestions.isEmpty();
    }

    public final boolean isAllLegalDocumentsAccepted()
    {
        return isAlllegalDocumentsAccepted;
    }

    public final boolean isRetryMode()
    {
        return isRetryMode;
    }

    public final void populateModel(com.google.wallet.proto.api.NanoWalletKyc.GetKycDataResponse getkycdataresponse, List list)
    {
        if (getkycdataresponse.firstName != null)
        {
            setFirstName(getkycdataresponse.firstName);
        }
        if (getkycdataresponse.lastName != null)
        {
            setLastName(getkycdataresponse.lastName);
        }
        if (getkycdataresponse.address != null)
        {
            setAddress(getkycdataresponse.address);
        }
        if (getkycdataresponse.walletLegalDocument != null && getkycdataresponse.esignLegalDocument != null)
        {
            setWalletLegalDocument(getkycdataresponse.walletLegalDocument);
            setEsignLegalDocument(getkycdataresponse.esignLegalDocument);
            isAlllegalDocumentsAccepted = false;
        } else
        {
            isAlllegalDocumentsAccepted = true;
        }
        setAddressList(list);
        getkycdataresponse = getkycdataresponse.address;
        if (getkycdataresponse != null && ((com.google.wallet.proto.NanoWalletEntities.Address) (getkycdataresponse)).cdpAddressId != null && !list.isEmpty())
        {
            getkycdataresponse = ((com.google.wallet.proto.NanoWalletEntities.Address) (getkycdataresponse)).cdpAddressId.subId;
            for (int i = 0; i < list.size(); i++)
            {
                if (((com.google.wallet.proto.NanoWalletEntities.Address)list.get(i)).cdpAddressId != null && getkycdataresponse.equals(((com.google.wallet.proto.NanoWalletEntities.Address)list.get(i)).cdpAddressId.subId))
                {
                    setSelectedAddressIndex(i);
                    return;
                }
            }

        }
        byte byte0;
        if (list.isEmpty())
        {
            byte0 = -1;
        } else
        {
            byte0 = 0;
        }
        setSelectedAddressIndex(byte0);
    }

    public final void populateModel(com.google.wallet.proto.api.NanoWalletKyc.VerifyIdentityResponse verifyidentityresponse)
    {
        setReferralQuestions(Arrays.asList(verifyidentityresponse.referralQuestion));
        setOowQuizDurationAllowedMillis(Protos.valueWithDefault(verifyidentityresponse.timeToCompleteQuestionsMillis, 0L));
        int i;
        if (hasReferralQuestions())
        {
            i = 0;
        } else
        {
            i = -1;
        }
        currentQuestionIndex = i;
    }

    public final void setAddress(com.google.wallet.proto.NanoWalletEntities.Address address1)
    {
        address = address1;
    }

    public final void setAddressList(List list)
    {
        addressList = list;
    }

    public final void setCurrentNavState(KycNavListener.NavState navstate)
    {
        currentNavState = navstate;
    }

    public final void setCurrentQuestionIndex(int i)
    {
        currentQuestionIndex = i;
    }

    public final void setDateOfBirth(com.google.wallet.proto.features.NanoWalletKyc.DateOfBirth dateofbirth)
    {
        dateOfBirth = dateofbirth;
    }

    public final void setEsignLegalDocument(com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument latestlegaldocument)
    {
        esignLegalDocument = latestlegaldocument;
    }

    public final void setFirstName(String s)
    {
        firstName = s;
    }

    public final void setIsAllLegalDocumentsAccepted(boolean flag)
    {
        isAlllegalDocumentsAccepted = flag;
    }

    public final void setIsRetryMode(boolean flag)
    {
        isRetryMode = flag;
    }

    public final void setLastName(String s)
    {
        lastName = s;
    }

    public final void setOowQuizDurationAllowedMillis(long l)
    {
        oowQuizDurationAllowedMillis = l;
    }

    public final void setOowQuizStartTimeMillis(long l)
    {
        oowQuizStartTimeMillis = l;
    }

    public final void setPreviousNavState(KycNavListener.NavState navstate)
    {
        previousNavState = navstate;
    }

    public final void setReferralAnswer(int i, com.google.wallet.proto.features.NanoWalletKyc.ReferralAnswer referralanswer)
    {
        if (referralAnswers == null)
        {
            referralAnswers = Lists.newArrayList();
            for (int j = 0; j < referralQuestions.size(); j++)
            {
                referralAnswers.add(new com.google.wallet.proto.features.NanoWalletKyc.ReferralAnswer());
            }

        }
        referralAnswers.set(i, referralanswer);
    }

    public final void setReferralAnswers(List list)
    {
        referralAnswers = list;
    }

    public final void setReferralQuestions(List list)
    {
        referralQuestions = list;
    }

    public final void setSelectedAddressIndex(int i)
    {
        selectedAddressIndex = i;
    }

    public final void setSsnFull9(String s)
    {
        ssnFull9 = s;
    }

    public final void setSsnLast4(String s)
    {
        ssnLast4 = s;
    }

    public final void setUserFlow(KycUserFlow kycuserflow)
    {
        userFlow = kycuserflow;
    }

    public final void setWalletLegalDocument(com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument latestlegaldocument)
    {
        walletLegalDocument = latestlegaldocument;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        writeUserFlowToParcel(parcel, userFlow);
        writeNavStateToParcel(parcel, previousNavState);
        writeNavStateToParcel(parcel, currentNavState);
        parcel.writeString(firstName);
        parcel.writeString(lastName);
        writeProtoToParcel(parcel, address);
        writeAddressListToParcel(parcel, addressList);
        parcel.writeInt(selectedAddressIndex);
        writeProtoToParcel(parcel, dateOfBirth);
        writeProtoToParcel(parcel, walletLegalDocument);
        writeProtoToParcel(parcel, esignLegalDocument);
        parcel.writeString(ssnLast4);
        parcel.writeString(ssnFull9);
        if (isRetryMode)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        if (isAlllegalDocumentsAccepted)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        writeReferralQuestionsToParcel(parcel, referralQuestions);
        writeReferralAnswersToParcel(parcel, referralAnswers);
        parcel.writeInt(currentQuestionIndex);
        parcel.writeLong(oowQuizStartTimeMillis);
        parcel.writeLong(oowQuizDurationAllowedMillis);
    }









}

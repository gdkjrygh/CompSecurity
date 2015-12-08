// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.os.Parcel;
import android.os.Parcelable;
import com.skype.android.util.CountryCode;

public class MnvStateData
    implements Parcelable
{
    public static final class PHONE_SOURCE extends Enum
    {

        private static final PHONE_SOURCE $VALUES[];
        public static final PHONE_SOURCE DEVICE;
        public static final PHONE_SOURCE MSA;
        public static final PHONE_SOURCE SKYPE;
        public static final PHONE_SOURCE UNSET;

        public static PHONE_SOURCE valueOf(String s)
        {
            return (PHONE_SOURCE)Enum.valueOf(com/skype/android/app/mnv/MnvStateData$PHONE_SOURCE, s);
        }

        public static PHONE_SOURCE[] values()
        {
            return (PHONE_SOURCE[])$VALUES.clone();
        }

        static 
        {
            UNSET = new PHONE_SOURCE("UNSET", 0);
            MSA = new PHONE_SOURCE("MSA", 1);
            SKYPE = new PHONE_SOURCE("SKYPE", 2);
            DEVICE = new PHONE_SOURCE("DEVICE", 3);
            $VALUES = (new PHONE_SOURCE[] {
                UNSET, MSA, SKYPE, DEVICE
            });
        }

        private PHONE_SOURCE(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class PHONE_TYPE extends Enum
    {

        private static final PHONE_TYPE $VALUES[];
        public static final PHONE_TYPE DEVICE_ENTERED;
        public static final PHONE_TYPE SERVER_ENTERED;
        public static final PHONE_TYPE UNSET;
        public static final PHONE_TYPE USER_ENTERED;

        public static PHONE_TYPE valueOf(String s)
        {
            return (PHONE_TYPE)Enum.valueOf(com/skype/android/app/mnv/MnvStateData$PHONE_TYPE, s);
        }

        public static PHONE_TYPE[] values()
        {
            return (PHONE_TYPE[])$VALUES.clone();
        }

        static 
        {
            UNSET = new PHONE_TYPE("UNSET", 0);
            SERVER_ENTERED = new PHONE_TYPE("SERVER_ENTERED", 1);
            DEVICE_ENTERED = new PHONE_TYPE("DEVICE_ENTERED", 2);
            USER_ENTERED = new PHONE_TYPE("USER_ENTERED", 3);
            $VALUES = (new PHONE_TYPE[] {
                UNSET, SERVER_ENTERED, DEVICE_ENTERED, USER_ENTERED
            });
        }

        private PHONE_TYPE(String s, int i)
        {
            super(s, i);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final MnvStateData createFromParcel(Parcel parcel)
        {
            return new MnvStateData(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final MnvStateData[] newArray(int i)
        {
            return new MnvStateData[0];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private CountryCode countryCode;
    private MnvManager.States currentState;
    private ProfileServicesErrors.ErrorState errorState;
    private MnvManager.States nextState;
    private String phoneNumber;
    private String signInPSTNWithCountry;
    private boolean skipAddFriendsView;
    private boolean skipAddNumberFlow;
    private PHONE_SOURCE source;
    private PHONE_TYPE type;

    public MnvStateData()
    {
        this(MnvManager.States.UNKNOWN_STATE, MnvManager.States.UNKNOWN_STATE, ProfileServicesErrors.ErrorState.NONE, new CountryCode(), false, false);
    }

    public MnvStateData(Parcel parcel)
    {
        readFromParcel(parcel);
    }

    public MnvStateData(MnvManager.States states, MnvManager.States states1, ProfileServicesErrors.ErrorState errorstate, CountryCode countrycode, boolean flag, boolean flag1)
    {
        currentState = states;
        nextState = states1;
        errorState = errorstate;
        countryCode = countrycode;
        skipAddNumberFlow = flag;
        skipAddFriendsView = flag1;
        source = PHONE_SOURCE.UNSET;
        type = PHONE_TYPE.UNSET;
    }

    private void readFromParcel(Parcel parcel)
    {
        boolean flag1 = true;
        MnvManager.States astates[] = MnvManager.States.values();
        setCurrentState(astates[parcel.readInt()]);
        setNextState(astates[parcel.readInt()]);
        setErrorState(ProfileServicesErrors.ErrorState.values()[parcel.readInt()]);
        setSource(PHONE_SOURCE.values()[parcel.readInt()]);
        setType(PHONE_TYPE.values()[parcel.readInt()]);
        setPhoneNumber(parcel.readString());
        setCountryCode((CountryCode)parcel.readParcelable(com/skype/android/util/CountryCode.getClassLoader()));
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setSkipAddNumberFlow(flag);
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        setSkipAddFriendsView(flag);
    }

    public int describeContents()
    {
        return 0;
    }

    public CountryCode getCountryCode()
    {
        return countryCode;
    }

    public MnvManager.States getCurrentState()
    {
        return currentState;
    }

    public ProfileServicesErrors.ErrorState getErrorState()
    {
        return errorState;
    }

    public MnvManager.States getNextState()
    {
        return nextState;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getSignInPSTNWithCountry()
    {
        return signInPSTNWithCountry;
    }

    public boolean getSkipAddFriendsView()
    {
        return skipAddFriendsView;
    }

    public boolean getSkipAddNumberFlow()
    {
        return skipAddNumberFlow;
    }

    public PHONE_SOURCE getSource()
    {
        return source;
    }

    public PHONE_TYPE getType()
    {
        return type;
    }

    public void setCountryCode(CountryCode countrycode)
    {
        countryCode = countrycode;
    }

    public void setCurrentState(MnvManager.States states)
    {
        currentState = states;
    }

    public void setErrorState(ProfileServicesErrors.ErrorState errorstate)
    {
        errorState = errorstate;
    }

    public void setNextState(MnvManager.States states)
    {
        nextState = states;
    }

    public void setPhoneNumber(String s)
    {
        phoneNumber = s;
    }

    public void setSignInPSTNWithCountry(String s)
    {
        signInPSTNWithCountry = s;
    }

    public void setSkipAddFriendsView(boolean flag)
    {
        skipAddFriendsView = flag;
    }

    public void setSkipAddNumberFlow(boolean flag)
    {
        skipAddNumberFlow = flag;
    }

    public void setSource(PHONE_SOURCE phone_source)
    {
        source = phone_source;
    }

    public void setType(PHONE_TYPE phone_type)
    {
        type = phone_type;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeInt(currentState.ordinal());
        parcel.writeInt(nextState.ordinal());
        parcel.writeInt(errorState.ordinal());
        parcel.writeInt(source.ordinal());
        parcel.writeInt(type.ordinal());
        parcel.writeString(phoneNumber);
        parcel.writeParcelable(countryCode, 0);
        if (skipAddNumberFlow)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        if (skipAddFriendsView)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }

}

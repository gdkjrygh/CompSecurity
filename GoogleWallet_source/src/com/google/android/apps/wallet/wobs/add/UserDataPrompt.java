// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.wallet.validator.DataValidator;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Strings;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            SimpleValueHolder, UserDataWidgetFactory, ValueHolder, ParcelHelper

public final class UserDataPrompt
    implements Parcelable
{
    public static final class InputType extends Enum
    {

        private static final InputType $VALUES[];
        public static final InputType BARCODE;
        public static final InputType BIRTHDATE;
        public static final InputType BIRTH_MONTH_AND_DAY;
        public static final InputType COLOR;
        public static final InputType DATE;
        public static final InputType EMAIL_ADDRESS;
        public static final InputType FIRST_NAME;
        public static final InputType GENDER;
        public static final InputType LAST_NAME;
        public static final InputType MONEY;
        public static final InputType MULTI_LINE_TEXT;
        public static final InputType NUMERIC;
        public static final InputType PHONE_NUMBER;
        public static final InputType STATE;
        public static final InputType TEXT;
        public static final InputType UNKNOWN;
        public static final InputType ZIPCODE;

        public static InputType valueOf(String s)
        {
            return (InputType)Enum.valueOf(com/google/android/apps/wallet/wobs/add/UserDataPrompt$InputType, s);
        }

        public static InputType[] values()
        {
            return (InputType[])$VALUES.clone();
        }

        static 
        {
            PHONE_NUMBER = new InputType("PHONE_NUMBER", 0);
            STATE = new InputType("STATE", 1);
            ZIPCODE = new InputType("ZIPCODE", 2);
            EMAIL_ADDRESS = new InputType("EMAIL_ADDRESS", 3);
            GENDER = new InputType("GENDER", 4);
            FIRST_NAME = new InputType("FIRST_NAME", 5);
            LAST_NAME = new InputType("LAST_NAME", 6);
            DATE = new InputType("DATE", 7);
            BIRTHDATE = new InputType("BIRTHDATE", 8);
            BIRTH_MONTH_AND_DAY = new InputType("BIRTH_MONTH_AND_DAY", 9);
            NUMERIC = new InputType("NUMERIC", 10);
            TEXT = new InputType("TEXT", 11);
            MULTI_LINE_TEXT = new InputType("MULTI_LINE_TEXT", 12);
            MONEY = new InputType("MONEY", 13);
            COLOR = new InputType("COLOR", 14);
            BARCODE = new InputType("BARCODE", 15);
            UNKNOWN = new InputType("UNKNOWN", 16);
            $VALUES = (new InputType[] {
                PHONE_NUMBER, STATE, ZIPCODE, EMAIL_ADDRESS, GENDER, FIRST_NAME, LAST_NAME, DATE, BIRTHDATE, BIRTH_MONTH_AND_DAY, 
                NUMERIC, TEXT, MULTI_LINE_TEXT, MONEY, COLOR, BARCODE, UNKNOWN
            });
        }

        private InputType(String s, int i)
        {
            super(s, i);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static UserDataPrompt createFromParcel(Parcel parcel)
        {
            Object obj = ParcelHelper.readNullableInteger(parcel);
            InputType inputtype = (InputType)ParcelHelper.readEnum(parcel, com/google/android/apps/wallet/wobs/add/UserDataPrompt$InputType);
            String s = ParcelHelper.readNullableString(parcel);
            String s1 = ParcelHelper.readNullableString(parcel);
            boolean flag = ParcelHelper.readNullableBoolean(parcel).booleanValue();
            boolean flag1 = ParcelHelper.readNullableBoolean(parcel).booleanValue();
            Integer integer = ParcelHelper.readNullableInteger(parcel);
            parcel = parcel.readString();
            obj = new UserDataPrompt(((Integer) (obj)), inputtype, s, s1, flag, flag1, integer, null);
            ((UserDataPrompt) (obj)).setValue(parcel);
            return ((UserDataPrompt) (obj));
        }

        private static UserDataPrompt[] newArray(int i)
        {
            return new UserDataPrompt[i];
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
    private final Integer id;
    private final InputType inputType;
    private final boolean isModifiable;
    private final boolean isRequired;
    private final String label;
    private final Integer maxLength;
    private final String prefilledValue;
    private final DataValidator validator;
    private ValueHolder valueHolder;

    UserDataPrompt(Integer integer, InputType inputtype, String s, String s1, boolean flag, boolean flag1, Integer integer1, 
            DataValidator datavalidator)
    {
        valueHolder = new SimpleValueHolder();
        id = integer;
        inputType = inputtype;
        label = s;
        prefilledValue = s1;
        isModifiable = flag;
        isRequired = flag1;
        maxLength = integer1;
        validator = datavalidator;
    }

    public static Predicate withId(final int promptId)
    {
        return new Predicate() {

            final int val$promptId;

            private boolean apply(UserDataPrompt userdataprompt)
            {
                return userdataprompt.getId().intValue() == promptId;
            }

            public final volatile boolean apply(Object obj)
            {
                return apply((UserDataPrompt)obj);
            }

            
            {
                promptId = i;
                super();
            }
        };
    }

    public final int calculateViewId()
    {
        return UserDataWidgetFactory.calculateViewId(label, id.intValue());
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Integer getId()
    {
        return id;
    }

    public final InputType getInputType()
    {
        return inputType;
    }

    public final String getLabel()
    {
        return label;
    }

    public final Integer getMaxLength()
    {
        return maxLength;
    }

    public final String getPrefilledValue()
    {
        return prefilledValue;
    }

    public final DataValidator getValidator()
    {
        return validator;
    }

    public final String getValue()
    {
        return valueHolder.getValue();
    }

    public final boolean hasValue()
    {
        return !valueHolder.getValue().isEmpty();
    }

    public final boolean isModifiable()
    {
        return isModifiable;
    }

    public final boolean isRequired()
    {
        return isRequired;
    }

    public final void setValue(String s)
    {
        valueHolder.setValue(s);
    }

    public final void setValueHolder(ValueHolder valueholder)
    {
        Preconditions.checkNotNull(valueholder);
        String s = valueHolder.getValue();
        if (!Strings.isNullOrEmpty(s))
        {
            valueholder.setValue(s);
        }
        valueHolder = valueholder;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ParcelHelper.writeNullableInteger(parcel, id);
        ParcelHelper.writeEnum(parcel, inputType);
        ParcelHelper.writeNullableString(parcel, label);
        ParcelHelper.writeNullableString(parcel, prefilledValue);
        ParcelHelper.writeNullableBoolean(parcel, Boolean.valueOf(isModifiable));
        ParcelHelper.writeNullableBoolean(parcel, Boolean.valueOf(isRequired));
        ParcelHelper.writeNullableInteger(parcel, maxLength);
        parcel.writeString(valueHolder.getValue());
    }

}

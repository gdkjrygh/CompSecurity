// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            UserDataPrompt

public final class SharedDataPromptConverter
{

    public static UserDataPrompt convert(com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataPrompt shareddataprompt)
    {
        UserDataPrompt.InputType inputtype = getInputType(shareddataprompt);
        boolean flag = Protos.valueWithDefaultFalse(shareddataprompt.modifiableByUser);
        boolean flag1 = Protos.valueWithDefaultFalse(shareddataprompt.isRequired);
        return new UserDataPrompt(shareddataprompt.sharedDataId, inputtype, shareddataprompt.label, shareddataprompt.prefilledValue, flag, flag1, null, null);
    }

    public static ImmutableList convert(List list)
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(convert((com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataPrompt)list.next()))) { }
        return ImmutableList.copyOf(arraylist);
    }

    public static com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataValue createValue(UserDataPrompt userdataprompt)
    {
        com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataValue shareddatavalue;
        boolean flag;
        if (userdataprompt.isModifiable() && !userdataprompt.getValue().equals(userdataprompt.getPrefilledValue()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        shareddatavalue = new com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataValue();
        shareddatavalue.sharedDataId = userdataprompt.getId();
        shareddatavalue.modifiedByUser = Boolean.valueOf(flag);
        if (flag)
        {
            userdataprompt = userdataprompt.getValue();
        } else
        {
            userdataprompt = userdataprompt.getPrefilledValue();
        }
        shareddatavalue.value = userdataprompt;
        return shareddatavalue;
    }

    public static List createValues(Iterable iterable)
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add(createValue((UserDataPrompt)iterable.next()))) { }
        return arraylist;
    }

    private static UserDataPrompt.InputType getInputType(com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataPrompt shareddataprompt)
    {
        if (shareddataprompt.sharedDataId.intValue() == -8)
        {
            return UserDataPrompt.InputType.BARCODE;
        }
        int i = Protos.valueWithDefault(shareddataprompt.inputTypeNumber, 0);
        switch (i)
        {
        default:
            if (i > 0 && i <= 1000)
            {
                return UserDataPrompt.InputType.NUMERIC;
            }
            break;

        case 2: // '\002'
            return UserDataPrompt.InputType.PHONE_NUMBER;

        case 1008: 
            return UserDataPrompt.InputType.STATE;

        case 3: // '\003'
            return UserDataPrompt.InputType.ZIPCODE;

        case 1002: 
            return UserDataPrompt.InputType.EMAIL_ADDRESS;

        case 1003: 
            return UserDataPrompt.InputType.GENDER;

        case 1005: 
            return UserDataPrompt.InputType.FIRST_NAME;

        case 1004: 
            return UserDataPrompt.InputType.LAST_NAME;

        case 2001: 
            return UserDataPrompt.InputType.DATE;

        case 2002: 
            return UserDataPrompt.InputType.BIRTHDATE;

        case 2003: 
            return UserDataPrompt.InputType.BIRTH_MONTH_AND_DAY;
        }
        if (i >= 1001 && i <= 2000)
        {
            return UserDataPrompt.InputType.TEXT;
        } else
        {
            return UserDataPrompt.InputType.UNKNOWN;
        }
    }
}

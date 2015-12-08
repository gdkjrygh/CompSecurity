// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.content.Context;
import com.google.android.apps.wallet.money.CurrencyUtil;
import com.google.android.apps.wallet.money.MoneyConverter;
import com.google.android.apps.wallet.money.PositiveMaxAmountMoneyValidator;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.android.apps.wallet.validator.DataValidator;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            LocalPromptId, UserDataPrompt, PromptValueSerialization

public final class LinkPromptConverter
{

    private static UserDataPrompt convert(com.google.wallet.proto.api.NanoWalletWobForms.LinkPrompt linkprompt, Context context)
    {
        int i = LocalPromptId.translateToLocalIdIfNecessary(linkprompt);
        UserDataPrompt.InputType inputtype = getInputType(linkprompt);
        String s = getPrefilledValue(linkprompt, inputtype);
        boolean flag = Protos.valueWithDefaultFalse(linkprompt.modifiableByUser);
        boolean flag1 = Protos.valueWithDefaultFalse(linkprompt.isRequired);
        Integer integer;
        if (linkprompt.promptId.intValue() == 4)
        {
            integer = Integer.valueOf(7);
        } else
        {
            integer = null;
        }
        context = getValidator(linkprompt, context);
        return new UserDataPrompt(Integer.valueOf(i), inputtype, linkprompt.label, s, flag, flag1, integer, context);
    }

    public static ImmutableList convert(com.google.wallet.proto.api.NanoWalletWobForms.LinkPrompt alinkprompt[], Context context)
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        int j = alinkprompt.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(convert(alinkprompt[i], context));
        }

        return ImmutableList.copyOf(arraylist);
    }

    private static com.google.wallet.proto.api.NanoWalletWobForms.LinkValue createValue(UserDataPrompt userdataprompt)
    {
        com.google.wallet.proto.api.NanoWalletWobForms.LinkValue linkvalue;
        Preconditions.checkNotNull(userdataprompt.getValue(), "Value must be set on userDataPrompt");
        linkvalue = new com.google.wallet.proto.api.NanoWalletWobForms.LinkValue();
        linkvalue.promptId = Integer.valueOf(Math.abs(userdataprompt.getId().intValue()));
        if (userdataprompt.getInputType() != UserDataPrompt.InputType.MONEY) goto _L2; else goto _L1
_L1:
        if (Strings.isNullOrEmpty(userdataprompt.getValue())) goto _L4; else goto _L3
_L3:
        linkvalue.moneyValue = MoneyConverter.toMoneyProto(new BigDecimal(userdataprompt.getValue()));
_L6:
        return linkvalue;
_L4:
        linkvalue.delete = Boolean.valueOf(true);
        return linkvalue;
_L2:
        if (userdataprompt.getId().intValue() != -8)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!Strings.isNullOrEmpty(userdataprompt.getValue()))
        {
            linkvalue.barcode = PromptValueSerialization.deserializeBarcode(userdataprompt.getValue());
            return linkvalue;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (userdataprompt.getId().intValue() == -6)
        {
            if (!Strings.isNullOrEmpty(userdataprompt.getValue()))
            {
                userdataprompt = PromptValueSerialization.deserializeLogoInfo(userdataprompt.getValue());
                linkvalue.textValue = ((PromptValueSerialization.LogoInfo) (userdataprompt)).colorHex;
                linkvalue.programIcon = ((PromptValueSerialization.LogoInfo) (userdataprompt)).programIcon;
                return linkvalue;
            }
        } else
        {
            linkvalue.textValue = userdataprompt.getValue();
            return linkvalue;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public static com.google.wallet.proto.api.NanoWalletWobForms.LinkValue[] createValues(List list)
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(createValue((UserDataPrompt)list.next()))) { }
        return (com.google.wallet.proto.api.NanoWalletWobForms.LinkValue[])arraylist.toArray(new com.google.wallet.proto.api.NanoWalletWobForms.LinkValue[arraylist.size()]);
    }

    private static UserDataPrompt.InputType getInputType(com.google.wallet.proto.api.NanoWalletWobForms.LinkPrompt linkprompt)
    {
        switch (Protos.valueWithDefault(linkprompt.fieldType, 0))
        {
        case 5: // '\005'
        default:
            return UserDataPrompt.InputType.UNKNOWN;

        case 1: // '\001'
            return UserDataPrompt.InputType.NUMERIC;

        case 2: // '\002'
            if (linkprompt.promptId.intValue() == 5)
            {
                return UserDataPrompt.InputType.MULTI_LINE_TEXT;
            } else
            {
                return UserDataPrompt.InputType.TEXT;
            }

        case 3: // '\003'
            return UserDataPrompt.InputType.MONEY;

        case 4: // '\004'
            return UserDataPrompt.InputType.COLOR;

        case 6: // '\006'
            return UserDataPrompt.InputType.BARCODE;
        }
    }

    private static String getPrefilledValue(com.google.wallet.proto.api.NanoWalletWobForms.LinkPrompt linkprompt, UserDataPrompt.InputType inputtype)
    {
        if (inputtype == UserDataPrompt.InputType.MONEY)
        {
            if (linkprompt.prefilledMoney != null && linkprompt.prefilledMoney.amount != null)
            {
                return MoneyConverter.toMoneyFieldString(linkprompt.prefilledMoney.amount);
            } else
            {
                return "";
            }
        }
        if (inputtype == UserDataPrompt.InputType.BARCODE)
        {
            if (linkprompt.prefilledBarcode != null)
            {
                return PromptValueSerialization.serializeBarcode(linkprompt.prefilledBarcode);
            } else
            {
                return "";
            }
        }
        if (inputtype == UserDataPrompt.InputType.COLOR && linkprompt.prefilledValue != null)
        {
            int i;
            if (linkprompt.prefilledProgramIcon != null)
            {
                i = linkprompt.prefilledProgramIcon.intValue();
            } else
            {
                i = 0;
            }
            return PromptValueSerialization.serializeLogoInfo(i, linkprompt.prefilledValue);
        } else
        {
            return Protos.valueWithDefault(linkprompt.prefilledValue, "");
        }
    }

    private static DataValidator getValidator(com.google.wallet.proto.api.NanoWalletWobForms.LinkPrompt linkprompt, Context context)
    {
        if (linkprompt.promptId.intValue() == 4)
        {
            return new PositiveMaxAmountMoneyValidator(0x2540bbcf0L, context.getString(com.google.android.apps.walletnfcrel.R.string.gift_cards_over_max_balance_amount_error, new Object[] {
                CurrencyUtil.microsToDisplayableMoney(0x2540bbcf0L, CurrencyUtil.getLegalAddressCurrency())
            }), true);
        } else
        {
            return null;
        }
    }
}

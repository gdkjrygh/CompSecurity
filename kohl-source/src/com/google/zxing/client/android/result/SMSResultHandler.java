// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result;

import android.app.Activity;
import android.telephony.PhoneNumberUtils;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.SMSParsedResult;

// Referenced classes of package com.google.zxing.client.android.result:
//            ResultHandler

public final class SMSResultHandler extends ResultHandler
{

    private static final int buttons[];

    public SMSResultHandler(Activity activity, ParsedResult parsedresult)
    {
        super(activity, parsedresult);
    }

    public int getButtonCount()
    {
        return buttons.length;
    }

    public int getButtonText(int i)
    {
        return buttons[i];
    }

    public CharSequence getDisplayContents()
    {
        SMSParsedResult smsparsedresult = (SMSParsedResult)getResult();
        String as1[] = smsparsedresult.getNumbers();
        String as[] = new String[as1.length];
        for (int i = 0; i < as1.length; i++)
        {
            as[i] = PhoneNumberUtils.formatNumber(as1[i]);
        }

        StringBuilder stringbuilder = new StringBuilder(50);
        ParsedResult.maybeAppend(as, stringbuilder);
        ParsedResult.maybeAppend(smsparsedresult.getSubject(), stringbuilder);
        ParsedResult.maybeAppend(smsparsedresult.getBody(), stringbuilder);
        return stringbuilder.toString();
    }

    public int getDisplayTitle()
    {
        return com.google.zxing.client.android.R.string.result_sms;
    }

    public void handleButtonPress(int i)
    {
        SMSParsedResult smsparsedresult = (SMSParsedResult)getResult();
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            sendSMS(smsparsedresult.getNumbers()[0], smsparsedresult.getBody());
            return;

        case 1: // '\001'
            sendMMS(smsparsedresult.getNumbers()[0], smsparsedresult.getSubject(), smsparsedresult.getBody());
            break;
        }
    }

    static 
    {
        buttons = (new int[] {
            com.google.zxing.client.android.R.string.button_sms, com.google.zxing.client.android.R.string.button_mms
        });
    }
}

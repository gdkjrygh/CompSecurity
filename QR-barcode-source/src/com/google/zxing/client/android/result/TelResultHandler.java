// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result;

import android.app.Activity;
import android.telephony.PhoneNumberUtils;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.TelParsedResult;

// Referenced classes of package com.google.zxing.client.android.result:
//            ResultHandler

public final class TelResultHandler extends ResultHandler
{

    private static final int buttons[];

    public TelResultHandler(Activity activity, ParsedResult parsedresult)
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
        return PhoneNumberUtils.formatNumber(getResult().getDisplayResult().replace("\r", ""));
    }

    public int getDisplayTitle()
    {
        return com.google.zxing.client.android.R.string.result_tel;
    }

    public void handleButtonPress(int i)
    {
        TelParsedResult telparsedresult = (TelParsedResult)getResult();
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            dialPhoneFromUri(telparsedresult.getTelURI());
            getActivity().finish();
            return;

        case 1: // '\001'
            addPhoneOnlyContact(new String[] {
                telparsedresult.getNumber()
            }, null);
            break;
        }
    }

    static 
    {
        buttons = (new int[] {
            com.google.zxing.client.android.R.string.button_dial, com.google.zxing.client.android.R.string.button_add_contact
        });
    }
}

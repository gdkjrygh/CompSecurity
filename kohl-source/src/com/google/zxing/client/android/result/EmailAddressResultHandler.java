// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result;

import android.app.Activity;
import com.google.zxing.client.result.EmailAddressParsedResult;
import com.google.zxing.client.result.ParsedResult;

// Referenced classes of package com.google.zxing.client.android.result:
//            ResultHandler

public final class EmailAddressResultHandler extends ResultHandler
{

    private static final int buttons[];

    public EmailAddressResultHandler(Activity activity, ParsedResult parsedresult)
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

    public int getDisplayTitle()
    {
        return com.google.zxing.client.android.R.string.result_email_address;
    }

    public void handleButtonPress(int i)
    {
        EmailAddressParsedResult emailaddressparsedresult = (EmailAddressParsedResult)getResult();
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            sendEmailFromUri(emailaddressparsedresult.getMailtoURI(), emailaddressparsedresult.getEmailAddress(), emailaddressparsedresult.getSubject(), emailaddressparsedresult.getBody());
            return;

        case 1: // '\001'
            addEmailOnlyContact(new String[] {
                emailaddressparsedresult.getEmailAddress()
            }, null);
            break;
        }
    }

    static 
    {
        buttons = (new int[] {
            com.google.zxing.client.android.R.string.button_email, com.google.zxing.client.android.R.string.button_add_contact
        });
    }
}

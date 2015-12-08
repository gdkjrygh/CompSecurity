// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result;

import android.app.Activity;
import com.google.zxing.client.android.LocaleManager;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.URIParsedResult;
import java.util.Locale;

// Referenced classes of package com.google.zxing.client.android.result:
//            ResultHandler

public final class URIResultHandler extends ResultHandler
{

    private static final String SECURE_PROTOCOLS[] = {
        "otpauth:"
    };
    private static final int buttons[];

    public URIResultHandler(Activity activity, ParsedResult parsedresult)
    {
        super(activity, parsedresult);
    }

    public boolean areContentsSecure()
    {
        String s = ((URIParsedResult)getResult()).getURI().toLowerCase(Locale.ENGLISH);
        String as[] = SECURE_PROTOCOLS;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            if (s.startsWith(as[i]))
            {
                return true;
            }
        }

        return false;
    }

    public int getButtonCount()
    {
        if (LocaleManager.isBookSearchUrl(((URIParsedResult)getResult()).getURI()))
        {
            return buttons.length;
        } else
        {
            return buttons.length - 1;
        }
    }

    public int getButtonText(int i)
    {
        return buttons[i];
    }

    public int getDisplayTitle()
    {
        return com.google.zxing.client.android.R.string.result_uri;
    }

    public void handleButtonPress(int i)
    {
        String s = ((URIParsedResult)getResult()).getURI();
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            openURL(s);
            return;

        case 1: // '\001'
            shareByEmail(s);
            return;

        case 2: // '\002'
            shareBySMS(s);
            return;

        case 3: // '\003'
            searchBookContents(s);
            break;
        }
    }

    static 
    {
        buttons = (new int[] {
            com.google.zxing.client.android.R.string.button_open_browser, com.google.zxing.client.android.R.string.button_share_by_email, com.google.zxing.client.android.R.string.button_share_by_sms, com.google.zxing.client.android.R.string.button_search_book_contents
        });
    }
}

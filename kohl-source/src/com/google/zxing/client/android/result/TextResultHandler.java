// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result;

import android.app.Activity;
import com.google.zxing.Result;
import com.google.zxing.client.result.ParsedResult;

// Referenced classes of package com.google.zxing.client.android.result:
//            ResultHandler

public final class TextResultHandler extends ResultHandler
{

    private static final int buttons[];

    public TextResultHandler(Activity activity, ParsedResult parsedresult, Result result)
    {
        super(activity, parsedresult, result);
    }

    public int getButtonCount()
    {
        if (hasCustomProductSearch())
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
        return com.google.zxing.client.android.R.string.result_text;
    }

    public void handleButtonPress(int i)
    {
        String s = getResult().getDisplayResult();
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            webSearch(s);
            return;

        case 1: // '\001'
            shareByEmail(s);
            return;

        case 2: // '\002'
            shareBySMS(s);
            return;

        case 3: // '\003'
            openURL(fillInCustomSearchURL(s));
            break;
        }
    }

    static 
    {
        buttons = (new int[] {
            com.google.zxing.client.android.R.string.button_web_search, com.google.zxing.client.android.R.string.button_share_by_email, com.google.zxing.client.android.R.string.button_share_by_sms, com.google.zxing.client.android.R.string.button_custom_product_search
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result;

import android.app.Activity;
import com.google.zxing.Result;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ProductParsedResult;

// Referenced classes of package com.google.zxing.client.android.result:
//            ResultHandler

public final class ProductResultHandler extends ResultHandler
{

    private static final int buttons[];

    public ProductResultHandler(Activity activity, ParsedResult parsedresult, Result result)
    {
        super(activity, parsedresult, result);
    }

    private static String getProductIDFromResult(ParsedResult parsedresult)
    {
        if (parsedresult instanceof ProductParsedResult)
        {
            return ((ProductParsedResult)parsedresult).getNormalizedProductID();
        }
        if (parsedresult instanceof ExpandedProductParsedResult)
        {
            return ((ExpandedProductParsedResult)parsedresult).getRawText();
        } else
        {
            throw new IllegalArgumentException(parsedresult.getClass().toString());
        }
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
        return com.google.zxing.client.android.R.string.result_product;
    }

    public void handleButtonPress(int i)
    {
        String s = getProductIDFromResult(getResult());
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            openProductSearch(s);
            return;

        case 1: // '\001'
            webSearch(s);
            return;

        case 2: // '\002'
            openURL(fillInCustomSearchURL(s));
            break;
        }
    }

    static 
    {
        buttons = (new int[] {
            com.google.zxing.client.android.R.string.button_product_search, com.google.zxing.client.android.R.string.button_web_search, com.google.zxing.client.android.R.string.button_custom_product_search
        });
    }
}

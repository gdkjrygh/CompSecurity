// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result;

import android.app.Activity;
import android.view.View;
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
        showGoogleShopperButton(new android.view.View.OnClickListener() {

            final ProductResultHandler this$0;

            public void onClick(View view)
            {
                view = (ProductParsedResult)getResult();
                openGoogleShopper(view.getNormalizedProductID());
            }

            
            {
                this$0 = ProductResultHandler.this;
                super();
            }
        });
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
        Object obj = getResult();
        if (obj instanceof ProductParsedResult)
        {
            obj = ((ProductParsedResult)obj).getNormalizedProductID();
        } else
        if (obj instanceof ExpandedProductParsedResult)
        {
            obj = ((ExpandedProductParsedResult)obj).getRawText();
        } else
        {
            throw new IllegalArgumentException(obj.getClass().toString());
        }
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            openProductSearch(((String) (obj)));
            return;

        case 1: // '\001'
            webSearch(((String) (obj)));
            return;

        case 2: // '\002'
            openURL(fillInCustomSearchURL(((String) (obj))));
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

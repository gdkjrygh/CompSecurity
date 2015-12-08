// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result;

import android.app.Activity;
import com.google.zxing.Result;
import com.google.zxing.client.result.ISBNParsedResult;
import com.google.zxing.client.result.ParsedResult;

// Referenced classes of package com.google.zxing.client.android.result:
//            ResultHandler

public final class ISBNResultHandler extends ResultHandler
{

    private static final int buttons[];

    public ISBNResultHandler(Activity activity, ParsedResult parsedresult, Result result)
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
        return com.google.zxing.client.android.R.string.result_isbn;
    }

    public void handleButtonPress(int i)
    {
        ISBNParsedResult isbnparsedresult = (ISBNParsedResult)getResult();
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            openProductSearch(isbnparsedresult.getISBN());
            return;

        case 1: // '\001'
            openBookSearch(isbnparsedresult.getISBN());
            return;

        case 2: // '\002'
            searchBookContents(isbnparsedresult.getISBN());
            return;

        case 3: // '\003'
            openURL(fillInCustomSearchURL(isbnparsedresult.getISBN()));
            break;
        }
    }

    static 
    {
        buttons = (new int[] {
            com.google.zxing.client.android.R.string.button_product_search, com.google.zxing.client.android.R.string.button_book_search, com.google.zxing.client.android.R.string.button_search_book_contents, com.google.zxing.client.android.R.string.button_custom_product_search
        });
    }
}

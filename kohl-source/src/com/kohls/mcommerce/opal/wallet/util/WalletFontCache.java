// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.util;

import android.content.Context;
import android.graphics.Typeface;

public class WalletFontCache
{

    private static Typeface mFontGothamBold;
    private static Typeface mFontGothamBook;
    private static Typeface mFontRobotoBold;
    private static Typeface mFontRobotoLight;
    private static Typeface mFontRobotoMedium;
    private static Typeface mFontRobotoRegular;

    public WalletFontCache()
    {
    }

    public static Typeface getGothamBold(Context context)
    {
        if (mFontGothamBold == null)
        {
            mFontGothamBold = Typeface.createFromAsset(context.getAssets(), "fonts/Gotham-Bold.otf");
        }
        return mFontGothamBold;
    }

    public static Typeface getGothamBook(Context context)
    {
        if (mFontGothamBook == null)
        {
            mFontGothamBook = Typeface.createFromAsset(context.getAssets(), "fonts/Gotham-Book.otf");
        }
        return mFontGothamBook;
    }
}

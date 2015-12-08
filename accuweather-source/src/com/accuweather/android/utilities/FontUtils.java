// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FontUtils
{

    private static Typeface mBoldCondensedTypeface;
    private static Typeface mBoldTypeface;
    private static Typeface mCondensedTypeface;
    private static Typeface mLightTypeface;
    private static Typeface mNormalTypeface;

    public FontUtils()
    {
    }

    public static Typeface getDefaultTypeface(Context context)
    {
        return getRobotoLight(context);
    }

    private static Typeface getFontFromResource(Context context, int i)
    {
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        obj2 = null;
        obj1 = null;
        obj3 = null;
        obj4 = null;
        Object obj = context.getResources().openRawResource(i);
        obj1 = obj;
        obj2 = obj;
        String s = (new StringBuilder()).append(context.getCacheDir()).append("/tmp.raw").toString();
        obj1 = obj;
        obj2 = obj;
        byte abyte0[] = new byte[((InputStream) (obj)).available()];
        obj1 = obj;
        obj2 = obj;
        context = new BufferedOutputStream(new FileOutputStream(s));
_L3:
        i = ((InputStream) (obj)).read(abyte0);
        if (i <= 0) goto _L2; else goto _L1
_L1:
        context.write(abyte0, 0, i);
          goto _L3
        obj1;
_L7:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return null;
_L2:
        obj1 = Typeface.createFromFile(s);
        (new File(s)).delete();
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return ((Typeface) (obj1));
        context;
        obj = obj1;
        obj1 = obj3;
_L5:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((BufferedOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw context;
        obj2;
        obj1 = context;
        context = ((Context) (obj2));
        if (true) goto _L5; else goto _L4
_L4:
        context;
        context = obj4;
        obj = obj2;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static Typeface getRobotoBold(Context context)
    {
        if (mBoldTypeface == null)
        {
            if (android.os.Build.VERSION.SDK_INT < 15)
            {
                mBoldTypeface = getFontFromResource(context, com.accuweather.android.R.raw.roboto_bold);
            } else
            {
                mBoldTypeface = Typeface.DEFAULT_BOLD;
            }
        }
        return mBoldTypeface;
    }

    public static Typeface getRobotoBoldCondensed(Context context)
    {
        if (mBoldCondensedTypeface == null)
        {
            mBoldCondensedTypeface = getFontFromResource(context, com.accuweather.android.R.raw.roboto_boldcondensed);
        }
        return mBoldCondensedTypeface;
    }

    public static Typeface getRobotoCondensed(Context context)
    {
        if (mCondensedTypeface == null)
        {
            mCondensedTypeface = getFontFromResource(context, com.accuweather.android.R.raw.roboto_condensed);
        }
        return mCondensedTypeface;
    }

    public static Typeface getRobotoLight(Context context)
    {
        if (mLightTypeface == null)
        {
            mLightTypeface = getFontFromResource(context, com.accuweather.android.R.raw.roboto_light);
        }
        return mLightTypeface;
    }

    public static Typeface getRobotoNormal(Context context)
    {
        if (mNormalTypeface == null)
        {
            if (android.os.Build.VERSION.SDK_INT < 15)
            {
                mNormalTypeface = getFontFromResource(context, com.accuweather.android.R.raw.roboto_regular);
            } else
            {
                mNormalTypeface = Typeface.DEFAULT;
            }
        }
        return mNormalTypeface;
    }
}

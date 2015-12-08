// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.widget.ImageView;
import com.c.b.aj;
import com.c.b.ay;
import com.dominos.App;
import java.util.Locale;

public final class ImageManagerCDN extends Enum
{

    private static final ImageManagerCDN $VALUES[];
    private static final String CATEGORY = "category/";
    private static final String DESCRIPTION = "description/";
    private static final String EXTENSION = ".jpg";
    public static final ImageManagerCDN INSTANCE;
    private static final Locale LOCALE = Locale.getDefault();
    private static final String MENU = "thumbnail/";
    public static final int NOIMAGE = 0;
    private static final String ROOT_CDN_URL = "http://cache.dominos.com/mobile/android/main/";
    private static final String TAG = com/dominos/utils/ImageManagerCDN.getName();
    private static final String UPSELL = "upsell/";

    private ImageManagerCDN(String s, int i)
    {
        super(s, i);
    }

    private String getImageURL(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("http://cache.dominos.com/mobile/android/main/");
        stringbuilder.append(s1);
        stringbuilder.append(s);
        stringbuilder.append(".jpg");
        if (App.isDebugMode())
        {
            Log.d(TAG, stringbuilder.toString());
        }
        return stringbuilder.toString();
    }

    public static ImageManagerCDN valueOf(String s)
    {
        return (ImageManagerCDN)Enum.valueOf(com/dominos/utils/ImageManagerCDN, s);
    }

    public static ImageManagerCDN[] values()
    {
        return (ImageManagerCDN[])$VALUES.clone();
    }

    public final void addCategoryImage(ImageView imageview, String s)
    {
        String s1 = s;
        if (s.equalsIgnoreCase("Sides"))
        {
            s1 = "Extras";
        }
        aj.a(imageview.getContext()).a(getImageURL(s1, "category/")).a(0x7f0a0037, 0x7f0a0036).c().a(imageview);
_L1:
        return;
        imageview;
        if (App.isDebugMode())
        {
            Log.e(TAG, (new StringBuilder("add category image error = ")).append(imageview.getMessage()).toString());
            return;
        }
          goto _L1
    }

    public final void addMenuImage(ImageView imageview, String s)
    {
        aj.a(imageview.getContext()).a(getImageURL(s.toUpperCase(LOCALE), "thumbnail/")).d().a(0x7f0a00ac, 0x7f0a00ab).c().a().a(imageview);
_L1:
        return;
        imageview;
        if (App.isDebugMode())
        {
            Log.e(TAG, (new StringBuilder("add menu image error = ")).append(imageview.getMessage()).toString());
            return;
        }
          goto _L1
    }

    public final void addProductDetailImage(ImageView imageview, String s)
    {
        aj.a(imageview.getContext()).a(getImageURL(s.toUpperCase(LOCALE), "description/")).d().a(0x7f0a00cb, 0x7f0a00ca).c().a().a(imageview);
_L1:
        return;
        imageview;
        if (App.isDebugMode())
        {
            Log.e(TAG, (new StringBuilder("add description image error = ")).append(imageview.getMessage()).toString());
            return;
        }
          goto _L1
    }

    public final void addProductPopupImage(ImageView imageview, String s)
    {
        aj.a(imageview.getContext()).a(getImageURL(s.toUpperCase(LOCALE), "description/")).d().a().a(imageview);
_L1:
        return;
        imageview;
        if (App.isDebugMode())
        {
            Log.e(TAG, (new StringBuilder("add background description image error = ")).append(imageview.getMessage()).toString());
            return;
        }
          goto _L1
    }

    public final void addUpsellImage(ImageView imageview, String s)
    {
        if (!s.equalsIgnoreCase("B2PCLAVA")) goto _L2; else goto _L1
_L1:
        int i = 0x7f020042;
_L3:
        boolean flag;
        try
        {
            imageview.setImageDrawable(imageview.getContext().getResources().getDrawable(i));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ImageView imageview) { }
        break MISSING_BLOCK_LABEL_144;
_L2:
        if (!s.equalsIgnoreCase("W08PHOTW"))
        {
            break MISSING_BLOCK_LABEL_43;
        }
        i = 0x7f0201ac;
          goto _L3
        if (!s.equalsIgnoreCase("2LCOKE"))
        {
            break MISSING_BLOCK_LABEL_58;
        }
        i = 0x7f020095;
          goto _L3
        if (!s.equalsIgnoreCase("STJUDE"))
        {
            break MISSING_BLOCK_LABEL_73;
        }
        i = 0x7f020194;
          goto _L3
        if (!s.equalsIgnoreCase("B16PBIT"))
        {
            break MISSING_BLOCK_LABEL_88;
        }
        i = 0x7f020041;
          goto _L3
        if (!s.equalsIgnoreCase("PSANSAPH"))
        {
            break MISSING_BLOCK_LABEL_103;
        }
        i = 0x7f02017c;
          goto _L3
        if (!s.equalsIgnoreCase("MAGGFSAL"))
        {
            break MISSING_BLOCK_LABEL_118;
        }
        i = 0x7f020148;
          goto _L3
        flag = s.equalsIgnoreCase("PINPASCA");
        if (flag)
        {
            i = 0x7f020177;
        } else
        {
            i = 0x7f020143;
        }
          goto _L3
        if (App.isDebugMode())
        {
            Log.e(TAG, (new StringBuilder("add upsell image error = ")).append(imageview.getMessage()).toString());
        }
        return;
    }

    static 
    {
        INSTANCE = new ImageManagerCDN("INSTANCE", 0);
        $VALUES = (new ImageManagerCDN[] {
            INSTANCE
        });
    }
}

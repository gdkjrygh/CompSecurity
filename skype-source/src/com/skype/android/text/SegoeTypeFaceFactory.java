// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.text;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;

// Referenced classes of package com.skype.android.text:
//            TypeFaceFactory

public class SegoeTypeFaceFactory
    implements TypeFaceFactory
{

    private static SegoeTypeFaceFactory instance;
    protected Context context;
    private Typeface illustrationFont;
    private final float largeFontSize;
    private Typeface segoe;
    private Typeface segoeBold;
    private Typeface segoeSemiBold;
    private Typeface segoeSemiLight;
    private final float smallFontSize;
    private Typeface symbolFont;

    public SegoeTypeFaceFactory(Application application)
    {
        context = application;
        android.content.res.AssetManager assetmanager = application.getAssets();
        application = application.getResources();
        if (!Build.MANUFACTURER.equalsIgnoreCase("Lenovo"))
        {
            try
            {
                segoeSemiLight = Typeface.createFromAsset(assetmanager, "font/SegoeUI-SemiLight.ttf");
                segoeSemiBold = Typeface.createFromAsset(assetmanager, "font/SegoeUI-SemiBold.ttf");
                segoeBold = Typeface.createFromAsset(assetmanager, "font/SegoeUI-Bold.ttf");
                segoe = Typeface.createFromAsset(assetmanager, "font/SegoeUI-Regular.ttf");
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        smallFontSize = application.getDimension(com.skype.android.widget.R.dimen.font_small);
        largeFontSize = application.getDimension(com.skype.android.widget.R.dimen.font_large);
    }

    public static SegoeTypeFaceFactory getInstance(Application application)
    {
        if (instance == null)
        {
            instance = new SegoeTypeFaceFactory(application);
        }
        return instance;
    }

    public Typeface getBold(float f)
    {
        Typeface typeface;
        Typeface typeface1;
        if (f < smallFontSize)
        {
            typeface = segoeSemiBold;
        } else
        {
            typeface = segoeBold;
        }
        typeface1 = typeface;
        if (typeface == null)
        {
            typeface1 = Typeface.DEFAULT_BOLD;
        }
        return typeface1;
    }

    public Typeface getDefault(float f)
    {
        if (f < largeFontSize)
        {
            return segoe;
        } else
        {
            return segoeSemiLight;
        }
    }

    public Typeface getIllustrationFont()
    {
        if (illustrationFont == null)
        {
            illustrationFont = Typeface.createFromAsset(context.getAssets(), "font/SkypeSymbol-Regular.ttf");
        }
        return illustrationFont;
    }

    public Typeface getSemiLight()
    {
        return segoeSemiLight;
    }

    public Typeface getSymbolFont()
    {
        if (symbolFont == null)
        {
            symbolFont = Typeface.createFromAsset(context.getAssets(), "font/SkypeUISymbol-Regular.ttf");
        }
        return symbolFont;
    }
}

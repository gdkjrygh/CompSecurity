// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.enums;

import bo.app.aa;
import com.appboy.models.IPutIntoJson;
import java.util.Locale;

public final class AppStore extends Enum
    implements IPutIntoJson
{

    public static final AppStore GOOGLE_PLAY_STORE;
    public static final AppStore KINDLE_STORE;
    private static final AppStore a[];

    private AppStore(String s, int i)
    {
        super(s, i);
    }

    public static String serverStringToEnumString(String s)
    {
        return s.replace(" ", "_").toUpperCase(Locale.US);
    }

    public static AppStore valueOf(String s)
    {
        return (AppStore)Enum.valueOf(com/appboy/enums/AppStore, s);
    }

    public static AppStore[] values()
    {
        return (AppStore[])a.clone();
    }

    public final volatile Object forJsonPut()
    {
        return forJsonPut();
    }

    public final String forJsonPut()
    {
        switch (aa.a[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return "Google Play Store";

        case 2: // '\002'
            return "Kindle Store";
        }
    }

    static 
    {
        GOOGLE_PLAY_STORE = new AppStore("GOOGLE_PLAY_STORE", 0);
        KINDLE_STORE = new AppStore("KINDLE_STORE", 1);
        a = (new AppStore[] {
            GOOGLE_PLAY_STORE, KINDLE_STORE
        });
    }
}

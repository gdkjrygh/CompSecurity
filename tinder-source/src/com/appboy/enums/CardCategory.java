// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public final class CardCategory extends Enum
{

    public static final CardCategory ADVERTISING;
    public static final EnumSet ALL_CATEGORIES = EnumSet.allOf(com/appboy/enums/CardCategory);
    public static final CardCategory ANNOUNCEMENTS;
    public static final CardCategory NEWS;
    public static final CardCategory NO_CATEGORY;
    public static final CardCategory SOCIAL;
    private static final Map a;
    private static final CardCategory b[];

    private CardCategory(String s, int i)
    {
        super(s, i);
    }

    public static CardCategory get(String s)
    {
        return (CardCategory)a.get(s.toUpperCase(Locale.US));
    }

    public static CardCategory valueOf(String s)
    {
        return (CardCategory)Enum.valueOf(com/appboy/enums/CardCategory, s);
    }

    public static CardCategory[] values()
    {
        return (CardCategory[])b.clone();
    }

    static 
    {
        ADVERTISING = new CardCategory("ADVERTISING", 0);
        ANNOUNCEMENTS = new CardCategory("ANNOUNCEMENTS", 1);
        NEWS = new CardCategory("NEWS", 2);
        SOCIAL = new CardCategory("SOCIAL", 3);
        NO_CATEGORY = new CardCategory("NO_CATEGORY", 4);
        b = (new CardCategory[] {
            ADVERTISING, ANNOUNCEMENTS, NEWS, SOCIAL, NO_CATEGORY
        });
        a = new HashMap();
        CardCategory cardcategory;
        for (Iterator iterator = EnumSet.allOf(com/appboy/enums/CardCategory).iterator(); iterator.hasNext(); a.put(cardcategory.toString(), cardcategory))
        {
            cardcategory = (CardCategory)iterator.next();
        }

    }
}

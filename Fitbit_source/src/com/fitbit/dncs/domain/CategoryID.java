// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.domain;


public final class CategoryID extends Enum
{

    public static final CategoryID a;
    public static final CategoryID b;
    public static final CategoryID c;
    public static final CategoryID d;
    public static final CategoryID e;
    public static final CategoryID f;
    public static final CategoryID g;
    public static final CategoryID h;
    public static final CategoryID i;
    public static final CategoryID j;
    public static final CategoryID k;
    public static final CategoryID l;
    private static final CategoryID m[];
    private final byte categoryId;

    private CategoryID(String s, int i1, byte byte0)
    {
        super(s, i1);
        categoryId = byte0;
    }

    public static CategoryID valueOf(String s)
    {
        return (CategoryID)Enum.valueOf(com/fitbit/dncs/domain/CategoryID, s);
    }

    public static CategoryID[] values()
    {
        return (CategoryID[])m.clone();
    }

    public byte a()
    {
        return categoryId;
    }

    static 
    {
        a = new CategoryID("CATEGORY_OTHER", 0, (byte)0);
        b = new CategoryID("CATEGORY_INCOMING_CALL", 1, (byte)1);
        c = new CategoryID("CATEGORY_MISSED_CALL", 2, (byte)2);
        d = new CategoryID("CATEGORY_VOICE_MAIL", 3, (byte)3);
        e = new CategoryID("CATEGORY_SOCIAL", 4, (byte)4);
        f = new CategoryID("CATEGORY_SCHEDULE", 5, (byte)5);
        g = new CategoryID("CATEGORY_EMAIL", 6, (byte)6);
        h = new CategoryID("CATEGORY_NEWS", 7, (byte)7);
        i = new CategoryID("CATEGORY_HEALTH_AND_FITNESS", 8, (byte)8);
        j = new CategoryID("CATEGORY_BUSINESS_AND_FINANCE", 9, (byte)9);
        k = new CategoryID("CATEGORY_LOCATION", 10, (byte)10);
        l = new CategoryID("CATEGORY_ENTERTAINMENT", 11, (byte)11);
        m = (new CategoryID[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.commonui.purchaserecord.common;


public final class RowTag extends Enum
{

    private static final RowTag $VALUES[];
    public static final RowTag AMOUNT;
    public static final RowTag LINE_ITEM;
    public static final RowTag TITLE;
    public static final RowTag TOTAL;
    private final String value;

    private RowTag(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }

    public static RowTag valueOf(String s)
    {
        return (RowTag)Enum.valueOf(com/google/checkout/commonui/purchaserecord/common/RowTag, s);
    }

    public static RowTag[] values()
    {
        return (RowTag[])$VALUES.clone();
    }

    public final String getValue()
    {
        return value;
    }

    static 
    {
        AMOUNT = new RowTag("AMOUNT", 0, "amount");
        LINE_ITEM = new RowTag("LINE_ITEM", 1, "line_item");
        TITLE = new RowTag("TITLE", 2, "header");
        TOTAL = new RowTag("TOTAL", 3, "total");
        $VALUES = (new RowTag[] {
            AMOUNT, LINE_ITEM, TITLE, TOTAL
        });
    }
}

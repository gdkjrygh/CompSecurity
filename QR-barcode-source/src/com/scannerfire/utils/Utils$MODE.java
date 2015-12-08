// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.utils;


// Referenced classes of package com.scannerfire.utils:
//            Utils

public static final class  extends Enum
{

    private static final _isbn ENUM$VALUES[];
    public static final _isbn _calendar;
    public static final _isbn _contact;
    public static final _isbn _email;
    public static final _isbn _geo;
    public static final _isbn _isbn;
    public static final _isbn _phone;
    public static final _isbn _product;
    public static final _isbn _text;
    public static final _isbn _url;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/scannerfire/utils/Utils$MODE, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        _contact = new <init>("_contact", 0);
        _email = new <init>("_email", 1);
        _url = new <init>("_url", 2);
        _text = new <init>("_text", 3);
        _geo = new <init>("_geo", 4);
        _phone = new <init>("_phone", 5);
        _calendar = new <init>("_calendar", 6);
        _product = new <init>("_product", 7);
        _isbn = new <init>("_isbn", 8);
        ENUM$VALUES = (new ENUM.VALUES[] {
            _contact, _email, _url, _text, _geo, _phone, _calendar, _product, _isbn
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

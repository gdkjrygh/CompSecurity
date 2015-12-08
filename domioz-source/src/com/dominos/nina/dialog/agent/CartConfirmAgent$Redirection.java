// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;


public final class  extends Enum
{

    private static final GOOGLE_WALLET $VALUES[];
    public static final GOOGLE_WALLET CHECKOUT;
    public static final GOOGLE_WALLET COUPON;
    public static final GOOGLE_WALLET GOOGLE_WALLET;
    public static final GOOGLE_WALLET MENULIST;
    public static final GOOGLE_WALLET PRODUCT;
    public static final GOOGLE_WALLET PRODUCT_EDIT;
    public static final GOOGLE_WALLET PRODUCT_REMOVE;
    public static final GOOGLE_WALLET ROOTMENU;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/nina/dialog/agent/CartConfirmAgent$Redirection, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        COUPON = new <init>("COUPON", 0);
        ROOTMENU = new <init>("ROOTMENU", 1);
        MENULIST = new <init>("MENULIST", 2);
        PRODUCT = new <init>("PRODUCT", 3);
        PRODUCT_EDIT = new <init>("PRODUCT_EDIT", 4);
        PRODUCT_REMOVE = new <init>("PRODUCT_REMOVE", 5);
        CHECKOUT = new <init>("CHECKOUT", 6);
        GOOGLE_WALLET = new <init>("GOOGLE_WALLET", 7);
        $VALUES = (new .VALUES[] {
            COUPON, ROOTMENU, MENULIST, PRODUCT, PRODUCT_EDIT, PRODUCT_REMOVE, CHECKOUT, GOOGLE_WALLET
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

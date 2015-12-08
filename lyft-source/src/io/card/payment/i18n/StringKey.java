// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n;


public final class StringKey extends Enum
{

    private static final StringKey $VALUES[];
    public static final StringKey CANCEL;
    public static final StringKey CARDTYPE_AMERICANEXPRESS;
    public static final StringKey CARDTYPE_DISCOVER;
    public static final StringKey CARDTYPE_JCB;
    public static final StringKey CARDTYPE_MASTERCARD;
    public static final StringKey CARDTYPE_VISA;
    public static final StringKey DONE;
    public static final StringKey ENTRY_CARD_NUMBER;
    public static final StringKey ENTRY_CVV;
    public static final StringKey ENTRY_EXPIRES;
    public static final StringKey ENTRY_POSTAL_CODE;
    public static final StringKey ERROR_CAMERA_CONNECT_FAIL;
    public static final StringKey ERROR_CAMERA_UNEXPECTED_FAIL;
    public static final StringKey ERROR_NO_DEVICE_SUPPORT;
    public static final StringKey EXPIRES_PLACEHOLDER;
    public static final StringKey KEYBOARD;
    public static final StringKey MANUAL_ENTRY_TITLE;
    public static final StringKey SCAN_GUIDE;

    private StringKey(String s, int i)
    {
        super(s, i);
    }

    public static StringKey valueOf(String s)
    {
        return (StringKey)Enum.valueOf(io/card/payment/i18n/StringKey, s);
    }

    public static StringKey[] values()
    {
        return (StringKey[])$VALUES.clone();
    }

    static 
    {
        CANCEL = new StringKey("CANCEL", 0);
        CARDTYPE_AMERICANEXPRESS = new StringKey("CARDTYPE_AMERICANEXPRESS", 1);
        CARDTYPE_DISCOVER = new StringKey("CARDTYPE_DISCOVER", 2);
        CARDTYPE_JCB = new StringKey("CARDTYPE_JCB", 3);
        CARDTYPE_MASTERCARD = new StringKey("CARDTYPE_MASTERCARD", 4);
        CARDTYPE_VISA = new StringKey("CARDTYPE_VISA", 5);
        DONE = new StringKey("DONE", 6);
        ENTRY_CVV = new StringKey("ENTRY_CVV", 7);
        ENTRY_POSTAL_CODE = new StringKey("ENTRY_POSTAL_CODE", 8);
        ENTRY_EXPIRES = new StringKey("ENTRY_EXPIRES", 9);
        EXPIRES_PLACEHOLDER = new StringKey("EXPIRES_PLACEHOLDER", 10);
        SCAN_GUIDE = new StringKey("SCAN_GUIDE", 11);
        KEYBOARD = new StringKey("KEYBOARD", 12);
        ENTRY_CARD_NUMBER = new StringKey("ENTRY_CARD_NUMBER", 13);
        MANUAL_ENTRY_TITLE = new StringKey("MANUAL_ENTRY_TITLE", 14);
        ERROR_NO_DEVICE_SUPPORT = new StringKey("ERROR_NO_DEVICE_SUPPORT", 15);
        ERROR_CAMERA_CONNECT_FAIL = new StringKey("ERROR_CAMERA_CONNECT_FAIL", 16);
        ERROR_CAMERA_UNEXPECTED_FAIL = new StringKey("ERROR_CAMERA_UNEXPECTED_FAIL", 17);
        $VALUES = (new StringKey[] {
            CANCEL, CARDTYPE_AMERICANEXPRESS, CARDTYPE_DISCOVER, CARDTYPE_JCB, CARDTYPE_MASTERCARD, CARDTYPE_VISA, DONE, ENTRY_CVV, ENTRY_POSTAL_CODE, ENTRY_EXPIRES, 
            EXPIRES_PLACEHOLDER, SCAN_GUIDE, KEYBOARD, ENTRY_CARD_NUMBER, MANUAL_ENTRY_TITLE, ERROR_NO_DEVICE_SUPPORT, ERROR_CAMERA_CONNECT_FAIL, ERROR_CAMERA_UNEXPECTED_FAIL
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin.view;


public final class mCanonicalName extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN AMEX;
    public static final UNKNOWN DINERS;
    public static final UNKNOWN DISCOVER;
    public static final UNKNOWN JCB;
    public static final UNKNOWN MAESTRO;
    public static final UNKNOWN MASTERCARD;
    public static final UNKNOWN PAYPAL;
    public static final UNKNOWN UNKNOWN;
    public static final UNKNOWN VISA;
    private String mCanonicalName;
    private final int mDescriptorStringId;
    private final int mPictureResId;

    static mCanonicalName forType(String s)
    {
        mCanonicalName amcanonicalname[] = values();
        int j = amcanonicalname.length;
        for (int i = 0; i < j; i++)
        {
            mCanonicalName mcanonicalname = amcanonicalname[i];
            if (mcanonicalname.mCanonicalName.equals(s))
            {
                return mcanonicalname;
            }
        }

        return UNKNOWN;
    }

    public static UNKNOWN valueOf(String s)
    {
        return (UNKNOWN)Enum.valueOf(com/braintreepayments/api/dropin/view/PaymentMethodView$PaymentType, s);
    }

    public static UNKNOWN[] values()
    {
        return (UNKNOWN[])$VALUES.clone();
    }

    static 
    {
        VISA = new <init>("VISA", 0, com.braintreepayments.api.dropin.Type, com.braintreepayments.api.dropin.Type, "Visa");
        MASTERCARD = new <init>("MASTERCARD", 1, com.braintreepayments.api.dropin.Type, com.braintreepayments.api.dropin.ard, "MasterCard");
        DISCOVER = new <init>("DISCOVER", 2, com.braintreepayments.api.dropin.Type, com.braintreepayments.api.dropin.r, "Discover");
        AMEX = new <init>("AMEX", 3, com.braintreepayments.api.dropin.Type, com.braintreepayments.api.dropin.Type, "American Express");
        JCB = new <init>("JCB", 4, com.braintreepayments.api.dropin.Type, com.braintreepayments.api.dropin.Type, "JCB");
        DINERS = new <init>("DINERS", 5, com.braintreepayments.api.dropin.Type, com.braintreepayments.api.dropin.Type, "Diners");
        MAESTRO = new <init>("MAESTRO", 6, com.braintreepayments.api.dropin.Type, com.braintreepayments.api.dropin., "Maestro");
        PAYPAL = new <init>("PAYPAL", 7, com.braintreepayments.api.dropin.Type, com.braintreepayments.api.dropin.Type, "PayPal");
        UNKNOWN = new <init>("UNKNOWN", 8, -1, com.braintreepayments.api.dropin., "unknown");
        $VALUES = (new .VALUES[] {
            VISA, MASTERCARD, DISCOVER, AMEX, JCB, DINERS, MAESTRO, PAYPAL, UNKNOWN
        });
    }



    private I(String s, int i, int j, int k, String s1)
    {
        super(s, i);
        mPictureResId = j;
        mDescriptorStringId = k;
        mCanonicalName = s1;
    }
}

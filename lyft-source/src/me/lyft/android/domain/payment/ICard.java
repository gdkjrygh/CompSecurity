// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;


public interface ICard
{

    public static final String AMERICAN_EXPRESS = "American Express";
    public static final String DINERS_CLUB = "Diners Club";
    public static final String DISCOVER = "Discover";
    public static final String JCB = "JCB";
    public static final String LOCALE_CANADA = "en_CA";
    public static final String LOCALE_USA = "en_US";
    public static final String MASTERCARD = "MasterCard";
    public static final int MAX_LENGTH_AMERICAN_EXPRESS = 15;
    public static final int MAX_LENGTH_CANADA_ZIP = 6;
    public static final int MAX_LENGTH_DINERS_CLUB = 14;
    public static final int MAX_LENGTH_STANDARD = 16;
    public static final int MAX_LENGTH_US_ZIP = 5;
    public static final String PREFIXES_AMERICAN_EXPRESS[] = {
        "34", "37"
    };
    public static final String PREFIXES_DINERS_CLUB[] = {
        "300", "301", "302", "303", "304", "305", "309", "36", "38", "37", 
        "39"
    };
    public static final String PREFIXES_DISCOVER[] = {
        "60", "62", "64", "65"
    };
    public static final String PREFIXES_JCB[] = {
        "35"
    };
    public static final String PREFIXES_MASTERCARD[] = {
        "50", "51", "52", "53", "54", "55"
    };
    public static final String PREFIXES_VISA[] = {
        "4"
    };
    public static final String UNKNOWN = "Unknown";
    public static final String VISA = "Visa";

    public abstract String getAddressCountry();

    public abstract String getAddressLine1();

    public abstract String getAddressLine2();

    public abstract String getAddressZip();

    public abstract String getCity();

    public abstract String getCvc();

    public abstract Integer getExpMonth();

    public abstract Integer getExpYear();

    public abstract String getLast4();

    public abstract String getName();

    public abstract String getNumber();

    public abstract String getState();

    public abstract String getType();

    public abstract boolean isBillingAddressEmpty();

    public abstract boolean isEmpty();

    public abstract boolean isInvalidBillingAddress();

    public abstract void setAddressLine1(String s);

    public abstract void setAddressLine2(String s);

    public abstract void setCity(String s);

    public abstract void setState(String s);

    public abstract boolean validateCVC();

    public abstract boolean validateCard();

    public abstract boolean validateExpiryDate();

    public abstract boolean validateNumber();

    public abstract boolean validateZip();

}

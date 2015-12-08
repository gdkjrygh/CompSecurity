// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.phonenumbers;

import java.io.Serializable;

public final class Phonenumber
{
    public static final class PhoneNumber
        implements Serializable
    {

        private CountryCodeSource countryCodeSource_;
        private int countryCode_;
        private String extension_;
        private boolean hasCountryCode;
        private boolean hasCountryCodeSource;
        private boolean hasExtension;
        private boolean hasItalianLeadingZero;
        private boolean hasNationalNumber;
        private boolean hasNumberOfLeadingZeros;
        private boolean hasPreferredDomesticCarrierCode;
        private boolean hasRawInput;
        private boolean italianLeadingZero_;
        private long nationalNumber_;
        private int numberOfLeadingZeros_;
        private String preferredDomesticCarrierCode_;
        private String rawInput_;

        private boolean exactlySameAs(PhoneNumber phonenumber)
        {
            if (phonenumber != null)
            {
                if (this == phonenumber)
                {
                    return true;
                }
                if (countryCode_ == phonenumber.countryCode_ && nationalNumber_ == phonenumber.nationalNumber_ && extension_.equals(phonenumber.extension_) && italianLeadingZero_ == phonenumber.italianLeadingZero_ && numberOfLeadingZeros_ == phonenumber.numberOfLeadingZeros_ && rawInput_.equals(phonenumber.rawInput_) && countryCodeSource_ == phonenumber.countryCodeSource_ && preferredDomesticCarrierCode_.equals(phonenumber.preferredDomesticCarrierCode_) && hasPreferredDomesticCarrierCode() == phonenumber.hasPreferredDomesticCarrierCode())
                {
                    return true;
                }
            }
            return false;
        }

        private CountryCodeSource getCountryCodeSource()
        {
            return countryCodeSource_;
        }

        private String getExtension()
        {
            return extension_;
        }

        private String getPreferredDomesticCarrierCode()
        {
            return preferredDomesticCarrierCode_;
        }

        private String getRawInput()
        {
            return rawInput_;
        }

        private boolean hasCountryCodeSource()
        {
            return hasCountryCodeSource;
        }

        private boolean hasExtension()
        {
            return hasExtension;
        }

        private boolean hasItalianLeadingZero()
        {
            return hasItalianLeadingZero;
        }

        private boolean hasNumberOfLeadingZeros()
        {
            return hasNumberOfLeadingZeros;
        }

        private boolean hasPreferredDomesticCarrierCode()
        {
            return hasPreferredDomesticCarrierCode;
        }

        public final PhoneNumber clearCountryCodeSource()
        {
            hasCountryCodeSource = false;
            countryCodeSource_ = CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
            return this;
        }

        public final boolean equals(Object obj)
        {
            return (obj instanceof PhoneNumber) && exactlySameAs((PhoneNumber)obj);
        }

        public final int getCountryCode()
        {
            return countryCode_;
        }

        public final long getNationalNumber()
        {
            return nationalNumber_;
        }

        public final int getNumberOfLeadingZeros()
        {
            return numberOfLeadingZeros_;
        }

        public final int hashCode()
        {
            char c1 = '\u04CF';
            int i = getCountryCode();
            int j = Long.valueOf(getNationalNumber()).hashCode();
            int k = getExtension().hashCode();
            char c;
            int l;
            int i1;
            int j1;
            int k1;
            if (isItalianLeadingZero())
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            l = getNumberOfLeadingZeros();
            i1 = getRawInput().hashCode();
            j1 = getCountryCodeSource().hashCode();
            k1 = getPreferredDomesticCarrierCode().hashCode();
            if (!hasPreferredDomesticCarrierCode())
            {
                c1 = '\u04D5';
            }
            return ((((((((i + 2173) * 53 + j) * 53 + k) * 53 + c) * 53 + l) * 53 + i1) * 53 + j1) * 53 + k1) * 53 + c1;
        }

        public final boolean isItalianLeadingZero()
        {
            return italianLeadingZero_;
        }

        public final PhoneNumber setCountryCode(int i)
        {
            hasCountryCode = true;
            countryCode_ = i;
            return this;
        }

        public final PhoneNumber setCountryCodeSource(CountryCodeSource countrycodesource)
        {
            if (countrycodesource == null)
            {
                throw new NullPointerException();
            } else
            {
                hasCountryCodeSource = true;
                countryCodeSource_ = countrycodesource;
                return this;
            }
        }

        public final PhoneNumber setExtension(String s)
        {
            if (s == null)
            {
                throw new NullPointerException();
            } else
            {
                hasExtension = true;
                extension_ = s;
                return this;
            }
        }

        public final PhoneNumber setItalianLeadingZero(boolean flag)
        {
            hasItalianLeadingZero = true;
            italianLeadingZero_ = flag;
            return this;
        }

        public final PhoneNumber setNationalNumber(long l)
        {
            hasNationalNumber = true;
            nationalNumber_ = l;
            return this;
        }

        public final PhoneNumber setNumberOfLeadingZeros(int i)
        {
            hasNumberOfLeadingZeros = true;
            numberOfLeadingZeros_ = i;
            return this;
        }

        public final PhoneNumber setPreferredDomesticCarrierCode(String s)
        {
            if (s == null)
            {
                throw new NullPointerException();
            } else
            {
                hasPreferredDomesticCarrierCode = true;
                preferredDomesticCarrierCode_ = s;
                return this;
            }
        }

        public final PhoneNumber setRawInput(String s)
        {
            if (s == null)
            {
                throw new NullPointerException();
            } else
            {
                hasRawInput = true;
                rawInput_ = s;
                return this;
            }
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Country Code: ").append(countryCode_);
            stringbuilder.append(" National Number: ").append(nationalNumber_);
            if (hasItalianLeadingZero() && isItalianLeadingZero())
            {
                stringbuilder.append(" Leading Zero(s): true");
            }
            if (hasNumberOfLeadingZeros())
            {
                stringbuilder.append(" Number of leading zeros: ").append(numberOfLeadingZeros_);
            }
            if (hasExtension())
            {
                stringbuilder.append(" Extension: ").append(extension_);
            }
            if (hasCountryCodeSource())
            {
                stringbuilder.append(" Country Code Source: ").append(countryCodeSource_);
            }
            if (hasPreferredDomesticCarrierCode())
            {
                stringbuilder.append(" Preferred Domestic Carrier Code: ").append(preferredDomesticCarrierCode_);
            }
            return stringbuilder.toString();
        }

        public PhoneNumber()
        {
            countryCode_ = 0;
            nationalNumber_ = 0L;
            extension_ = "";
            italianLeadingZero_ = false;
            numberOfLeadingZeros_ = 1;
            rawInput_ = "";
            preferredDomesticCarrierCode_ = "";
            countryCodeSource_ = CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
        }
    }

    public static final class PhoneNumber.CountryCodeSource extends Enum
    {

        private static final PhoneNumber.CountryCodeSource $VALUES[];
        public static final PhoneNumber.CountryCodeSource FROM_DEFAULT_COUNTRY;
        public static final PhoneNumber.CountryCodeSource FROM_NUMBER_WITHOUT_PLUS_SIGN;
        public static final PhoneNumber.CountryCodeSource FROM_NUMBER_WITH_IDD;
        public static final PhoneNumber.CountryCodeSource FROM_NUMBER_WITH_PLUS_SIGN;

        public static PhoneNumber.CountryCodeSource valueOf(String s)
        {
            return (PhoneNumber.CountryCodeSource)Enum.valueOf(com/google/android/libraries/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource, s);
        }

        public static PhoneNumber.CountryCodeSource[] values()
        {
            return (PhoneNumber.CountryCodeSource[])$VALUES.clone();
        }

        static 
        {
            FROM_NUMBER_WITH_PLUS_SIGN = new PhoneNumber.CountryCodeSource("FROM_NUMBER_WITH_PLUS_SIGN", 0);
            FROM_NUMBER_WITH_IDD = new PhoneNumber.CountryCodeSource("FROM_NUMBER_WITH_IDD", 1);
            FROM_NUMBER_WITHOUT_PLUS_SIGN = new PhoneNumber.CountryCodeSource("FROM_NUMBER_WITHOUT_PLUS_SIGN", 2);
            FROM_DEFAULT_COUNTRY = new PhoneNumber.CountryCodeSource("FROM_DEFAULT_COUNTRY", 3);
            $VALUES = (new PhoneNumber.CountryCodeSource[] {
                FROM_NUMBER_WITH_PLUS_SIGN, FROM_NUMBER_WITH_IDD, FROM_NUMBER_WITHOUT_PLUS_SIGN, FROM_DEFAULT_COUNTRY
            });
        }

        private PhoneNumber.CountryCodeSource(String s, int i)
        {
            super(s, i);
        }
    }

}

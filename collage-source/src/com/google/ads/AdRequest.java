// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;


public final class AdRequest
{
    public static final class ErrorCode extends Enum
    {

        public static final ErrorCode a;
        public static final ErrorCode b;
        public static final ErrorCode c;
        public static final ErrorCode d;
        private static final ErrorCode f[];
        private final String e;

        public static ErrorCode valueOf(String s)
        {
            return (ErrorCode)Enum.valueOf(com/google/ads/AdRequest$ErrorCode, s);
        }

        public static ErrorCode[] values()
        {
            return (ErrorCode[])f.clone();
        }

        public String toString()
        {
            return e;
        }

        static 
        {
            a = new ErrorCode("INVALID_REQUEST", 0, "Invalid Ad request.");
            b = new ErrorCode("NO_FILL", 1, "Ad request successful, but no ad returned due to lack of ad inventory.");
            c = new ErrorCode("NETWORK_ERROR", 2, "A network error occurred.");
            d = new ErrorCode("INTERNAL_ERROR", 3, "There was an internal error.");
            f = (new ErrorCode[] {
                a, b, c, d
            });
        }

        private ErrorCode(String s, int i, String s1)
        {
            super(s, i);
            e = s1;
        }
    }

    public static final class Gender extends Enum
    {

        public static final Gender a;
        public static final Gender b;
        public static final Gender c;
        private static final Gender d[];

        public static Gender valueOf(String s)
        {
            return (Gender)Enum.valueOf(com/google/ads/AdRequest$Gender, s);
        }

        public static Gender[] values()
        {
            return (Gender[])d.clone();
        }

        static 
        {
            a = new Gender("UNKNOWN", 0);
            b = new Gender("MALE", 1);
            c = new Gender("FEMALE", 2);
            d = (new Gender[] {
                a, b, c
            });
        }

        private Gender(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String a;

    private AdRequest()
    {
    }

    static 
    {
        a = com.google.android.gms.ads.AdRequest.DEVICE_ID_EMULATOR;
    }
}

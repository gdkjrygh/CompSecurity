// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;


public final class b
{

    public String a;
    public RecognizerType b;
    public String c;
    public int d;

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("languageCode: ");
        stringbuilder.append(a);
        stringbuilder.append(" recognizerType: ");
        stringbuilder.append(b);
        stringbuilder.append(" clientId: ");
        stringbuilder.append(c);
        stringbuilder.append(" clientVersion: ");
        stringbuilder.append(d);
        return stringbuilder.toString();
    }

    private RecognizerType()
    {
        class RecognizerType extends Enum
        {

            public static final RecognizerType CLOUD;
            public static final RecognizerType DONT_CARE;
            public static final RecognizerType ON_DEVICE;
            private static final RecognizerType a[];

            public static RecognizerType valueOf(String s)
            {
                return (RecognizerType)Enum.valueOf(com/google/android/apps/handwriting/service/HandwritingRecognizer$HandwritingRecognizerSettings$RecognizerType, s);
            }

            public static RecognizerType[] values()
            {
                return (RecognizerType[])a.clone();
            }

            static 
            {
                DONT_CARE = new RecognizerType("DONT_CARE", 0);
                ON_DEVICE = new RecognizerType("ON_DEVICE", 1);
                CLOUD = new RecognizerType("CLOUD", 2);
                a = (new RecognizerType[] {
                    DONT_CARE, ON_DEVICE, CLOUD
                });
            }

            private RecognizerType(String s, int i)
            {
                super(s, i);
            }
        }

        this(null, RecognizerType.DONT_CARE);
    }

    public RecognizerType.DONT_CARE(byte byte0)
    {
        this();
    }

    public RecognizerType(String s, RecognizerType recognizertype)
    {
        a = s;
        b = recognizertype;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;


public final class PushServiceType extends Enum
{

    private static final PushServiceType $VALUES[];
    public static final PushServiceType AMAZON_ADM;
    public static final PushServiceType GOOGLE_GCM;
    public static final PushServiceType NOKIA_NNA;
    public static final PushServiceType SKYPE_TROUTER;

    private PushServiceType(String s, int i)
    {
        super(s, i);
    }

    public static PushServiceType valueOf(String s)
    {
        return (PushServiceType)Enum.valueOf(com/skype/android/push/PushServiceType, s);
    }

    public static PushServiceType[] values()
    {
        return (PushServiceType[])$VALUES.clone();
    }

    static 
    {
        AMAZON_ADM = new PushServiceType("AMAZON_ADM", 0);
        GOOGLE_GCM = new PushServiceType("GOOGLE_GCM", 1);
        NOKIA_NNA = new PushServiceType("NOKIA_NNA", 2);
        SKYPE_TROUTER = new PushServiceType("SKYPE_TROUTER", 3);
        $VALUES = (new PushServiceType[] {
            AMAZON_ADM, GOOGLE_GCM, NOKIA_NNA, SKYPE_TROUTER
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


// Referenced classes of package com.skype.android.app.mnv:
//            MnvCases

public static final class  extends Enum
{

    private static final EXTERNAL_URI $VALUES[];
    public static final EXTERNAL_URI ADD_PEOPLE;
    public static final EXTERNAL_URI CONTACT_LIST;
    public static final EXTERNAL_URI DEBUG_SETTINGS;
    public static final EXTERNAL_URI EXTERNAL_URI;
    public static final EXTERNAL_URI HUB;
    public static final EXTERNAL_URI MANAGE_ALIASES;
    public static final EXTERNAL_URI SIGN_IN;
    public static final EXTERNAL_URI UNDEFINED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/mnv/MnvCases$REFERRER, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNDEFINED = new <init>("UNDEFINED", 0);
        DEBUG_SETTINGS = new <init>("DEBUG_SETTINGS", 1);
        MANAGE_ALIASES = new <init>("MANAGE_ALIASES", 2);
        CONTACT_LIST = new <init>("CONTACT_LIST", 3);
        SIGN_IN = new <init>("SIGN_IN", 4);
        HUB = new <init>("HUB", 5);
        ADD_PEOPLE = new <init>("ADD_PEOPLE", 6);
        EXTERNAL_URI = new <init>("EXTERNAL_URI", 7);
        $VALUES = (new .VALUES[] {
            UNDEFINED, DEBUG_SETTINGS, MANAGE_ALIASES, CONTACT_LIST, SIGN_IN, HUB, ADD_PEOPLE, EXTERNAL_URI
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;


// Referenced classes of package com.skype.android.app.contacts:
//            ContactAdapterViewBuilder

static final class  extends Enum
{

    private static final CONTACT_DIRECTORY $VALUES[];
    public static final CONTACT_DIRECTORY CONTACT;
    public static final CONTACT_DIRECTORY CONTACT_DIRECTORY;
    public static final CONTACT_DIRECTORY HEADER;
    public static final CONTACT_DIRECTORY SEARCH_RESULT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/contacts/ContactAdapterViewBuilder$a, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        HEADER = new <init>("HEADER", 0);
        SEARCH_RESULT = new <init>("SEARCH_RESULT", 1);
        CONTACT = new <init>("CONTACT", 2);
        CONTACT_DIRECTORY = new <init>("CONTACT_DIRECTORY", 3);
        $VALUES = (new .VALUES[] {
            HEADER, SEARCH_RESULT, CONTACT, CONTACT_DIRECTORY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

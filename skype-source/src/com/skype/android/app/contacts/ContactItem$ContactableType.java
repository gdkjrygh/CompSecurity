// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import java.util.HashMap;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactItem

public static final class mimeType extends Enum
{

    private static final mimeType $VALUES[];
    public static final mimeType EMAIL;
    public static final mimeType PHONE;
    private static HashMap typeMap;
    private final String mimeType;

    private static mimeType findType(String s)
    {
        return (mimeType)typeMap.get(s);
    }

    public static typeMap valueOf(String s)
    {
        return (typeMap)Enum.valueOf(com/skype/android/app/contacts/ContactItem$ContactableType, s);
    }

    public static typeMap[] values()
    {
        return (typeMap[])$VALUES.clone();
    }

    static 
    {
        PHONE = new <init>("PHONE", 0, "vnd.android.cursor.item/phone_v2");
        EMAIL = new <init>("EMAIL", 1, "vnd.android.cursor.item/email_v2");
        $VALUES = (new .VALUES[] {
            PHONE, EMAIL
        });
        typeMap = new HashMap(values().length);
        e_3B_.clone aclone[] = values();
        int j = aclone.length;
        for (int i = 0; i < j; i++)
        {
            e_3B_.clone clone = aclone[i];
            typeMap.put(clone.mimeType, clone);
        }

    }


    private (String s, int i, String s1)
    {
        super(s, i);
        mimeType = s1;
    }
}

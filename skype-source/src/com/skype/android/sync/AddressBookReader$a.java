// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import java.util.HashMap;

// Referenced classes of package com.skype.android.sync:
//            AddressBookReader

private static final class type extends Enum
{

    private static final type $VALUES[];
    public static final type EMAIL;
    public static final type PHONE;
    private static final HashMap mimetypes;
    private final String type;

    public static type get(String s)
    {
        return (type)mimetypes.get(s);
    }

    public static mimetypes valueOf(String s)
    {
        return (mimetypes)Enum.valueOf(com/skype/android/sync/AddressBookReader$a, s);
    }

    public static mimetypes[] values()
    {
        return (mimetypes[])$VALUES.clone();
    }

    static 
    {
        EMAIL = new <init>("EMAIL", 0, "vnd.android.cursor.item/email_v2");
        PHONE = new <init>("PHONE", 1, "vnd.android.cursor.item/phone_v2");
        $VALUES = (new .VALUES[] {
            EMAIL, PHONE
        });
        mimetypes = new HashMap();
        a_3B_.clone aclone[] = values();
        int j = aclone.length;
        for (int i = 0; i < j; i++)
        {
            a_3B_.clone clone = aclone[i];
            mimetypes.put(clone.type, clone);
        }

    }

    private (String s, int i, String s1)
    {
        super(s, i);
        type = s1;
    }
}

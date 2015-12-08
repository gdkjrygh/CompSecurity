// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;


// Referenced classes of package com.skype.android.app.contacts:
//            ContactFilter

protected static final class value extends Enum
{

    private static final GROUP $VALUES[];
    public static final GROUP AGENTS;
    public static final GROUP ALL;
    public static final GROUP AVAILABLE;
    public static final GROUP FAVORITES;
    public static final GROUP GROUP;
    public static final GROUP SKYPE;
    private final int value;

    public static value fromInt(int i)
    {
        value avalue[] = values();
        int k = avalue.length;
        for (int j = 0; j < k; j++)
        {
            value value1 = avalue[j];
            if (value1.value == i)
            {
                return value1;
            }
        }

        return null;
    }

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/skype/android/app/contacts/ContactFilter$FilterType, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    public final int toInt()
    {
        return value;
    }

    static 
    {
        ALL = new <init>("ALL", 0, 1);
        AVAILABLE = new <init>("AVAILABLE", 1, 2);
        SKYPE = new <init>("SKYPE", 2, 3);
        FAVORITES = new <init>("FAVORITES", 3, 4);
        AGENTS = new <init>("AGENTS", 4, 5);
        GROUP = new <init>("GROUP", 5, -1);
        $VALUES = (new .VALUES[] {
            ALL, AVAILABLE, SKYPE, FAVORITES, AGENTS, GROUP
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}

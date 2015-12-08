// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;


// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            NewUserContactBookFragment

public static final class a extends Enum
{

    private static final NON_SNAPCHATTERS $VALUES[];
    public static final NON_SNAPCHATTERS NON_SNAPCHATTERS;
    public static final NON_SNAPCHATTERS SNAPCHATTERS;
    private final int a;

    public static a getType(int i)
    {
        a aa[] = values();
        int k = aa.length;
        for (int j = 0; j < k; j++)
        {
            a a1 = aa[j];
            if (a1.a == i)
            {
                return a1;
            }
        }

        return null;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/snapchat/android/fragments/addfriends/NewUserContactBookFragment$NewUserContactBookPageType, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    public final int getValue()
    {
        return a;
    }

    static 
    {
        SNAPCHATTERS = new <init>("SNAPCHATTERS", 0, 0);
        NON_SNAPCHATTERS = new <init>("NON_SNAPCHATTERS", 1, 1);
        $VALUES = (new .VALUES[] {
            SNAPCHATTERS, NON_SNAPCHATTERS
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        a = j;
    }
}

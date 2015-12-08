// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model;

import java.util.Locale;

// Referenced classes of package com.snapchat.android.discover.model:
//            DSnapPanel

public static final class _cls9 extends Enum
{

    private static final ONCE $VALUES[];
    public static final ONCE LOOPING;
    public static final ONCE ONCE;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/snapchat/android/discover/model/DSnapPanel$Mode, s);
    }

    public static _cls9 valueOfIgnoreCase(String s)
    {
        return valueOf(s.toUpperCase(Locale.ENGLISH));
    }

    public static valueOf[] values()
    {
        return (valueOf[])$VALUES.clone();
    }

    static 
    {
        LOOPING = new <init>("LOOPING", 0);
        ONCE = new <init>("ONCE", 1);
        $VALUES = (new .VALUES[] {
            LOOPING, ONCE
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}

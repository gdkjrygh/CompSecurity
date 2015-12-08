// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model;

import java.util.Locale;

// Referenced classes of package com.snapchat.android.discover.model:
//            DSnapPage

public static final class  extends Enum
{

    private static final LONGFORM $VALUES[];
    public static final LONGFORM LONGFORM;
    public static final LONGFORM TOP_SNAP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/discover/model/DSnapPage$Form, s);
    }

    public static  valueOfIgnoreCase(String s)
    {
        return valueOf(s.toUpperCase(Locale.ENGLISH));
    }

    public static valueOf[] values()
    {
        return (valueOf[])$VALUES.clone();
    }

    public final int getIndex()
    {
        return ordinal();
    }

    public final String getKey()
    {
        return name();
    }

    static 
    {
        TOP_SNAP = new <init>("TOP_SNAP", 0);
        LONGFORM = new <init>("LONGFORM", 1);
        $VALUES = (new .VALUES[] {
            TOP_SNAP, LONGFORM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

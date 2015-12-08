// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;


// Referenced classes of package com.skype.android.app.search:
//            SearchResultAdapter

public static final class  extends Enum
{

    private static final MODE_SINGLE $VALUES[];
    public static final MODE_SINGLE MODE_COMBINED;
    public static final MODE_SINGLE MODE_SINGLE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/search/SearchResultAdapter$Mode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MODE_COMBINED = new <init>("MODE_COMBINED", 0);
        MODE_SINGLE = new <init>("MODE_SINGLE", 1);
        $VALUES = (new .VALUES[] {
            MODE_COMBINED, MODE_SINGLE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

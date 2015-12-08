// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


// Referenced classes of package com.millennialmedia.android:
//            InlineVideoView

static final class I extends Enum
{

    private static final PREPARED $VALUES[];
    public static final PREPARED DEFAULT;
    public static final PREPARED PREPARED;
    public static final PREPARED PREPARING;

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/millennialmedia/android/InlineVideoView$InlineParams$VideoState, s);
    }

    public static I[] values()
    {
        return (I[])$VALUES.clone();
    }

    static 
    {
        DEFAULT = new <init>("DEFAULT", 0);
        PREPARING = new <init>("PREPARING", 1);
        PREPARED = new <init>("PREPARED", 2);
        $VALUES = (new .VALUES[] {
            DEFAULT, PREPARING, PREPARED
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}

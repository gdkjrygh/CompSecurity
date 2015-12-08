// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.eventbus;


// Referenced classes of package com.snapchat.android.util.eventbus:
//            ChangePreviewQualityEvent

public static final class Q extends Enum
{

    private static final HIGH $VALUES[];
    public static final HIGH HIGH;
    public static final HIGH LOW;

    public static Q valueOf(String s)
    {
        return (Q)Enum.valueOf(com/snapchat/android/util/eventbus/ChangePreviewQualityEvent$PreviewQuality, s);
    }

    public static Q[] values()
    {
        return (Q[])$VALUES.clone();
    }

    static 
    {
        LOW = new <init>("LOW", 0);
        HIGH = new <init>("HIGH", 1);
        $VALUES = (new .VALUES[] {
            LOW, HIGH
        });
    }

    private Q(String s, int i)
    {
        super(s, i);
    }
}

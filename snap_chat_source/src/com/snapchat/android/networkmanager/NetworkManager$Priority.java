// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.networkmanager;


// Referenced classes of package com.snapchat.android.networkmanager:
//            NetworkManager

public static final class A extends Enum
{

    private static final LOW $VALUES[];
    public static final LOW HIGH;
    public static final LOW LOW;
    public static final LOW NORMAL;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/snapchat/android/networkmanager/NetworkManager$Priority, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        HIGH = new <init>("HIGH", 0);
        NORMAL = new <init>("NORMAL", 1);
        LOW = new <init>("LOW", 2);
        $VALUES = (new .VALUES[] {
            HIGH, NORMAL, LOW
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}

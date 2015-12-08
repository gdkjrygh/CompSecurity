// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;


// Referenced classes of package com.google.zxing.client.android:
//            CaptureActivityHandler

private static final class  extends Enum
{

    public static final DONE DONE;
    private static final DONE ENUM$VALUES[];
    public static final DONE PREVIEW;
    public static final DONE SUCCESS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/zxing/client/android/CaptureActivityHandler$State, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        PREVIEW = new <init>("PREVIEW", 0);
        SUCCESS = new <init>("SUCCESS", 1);
        DONE = new <init>("DONE", 2);
        ENUM$VALUES = (new ENUM.VALUES[] {
            PREVIEW, SUCCESS, DONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

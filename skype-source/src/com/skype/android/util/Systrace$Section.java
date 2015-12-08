// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;


// Referenced classes of package com.skype.android.util:
//            Systrace

public static final class  extends Enum
{

    public static final k a;
    public static final k b;
    public static final k c;
    public static final k d;
    public static final k e;
    public static final k f;
    public static final k g;
    public static final k h;
    public static final k i;
    public static final k j;
    public static final k k;
    private static final k l[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/util/Systrace$Section, s);
    }

    public static [] values()
    {
        return ([])l.clone();
    }

    static 
    {
        a = new <init>("CaptureVideo", 0);
        b = new <init>("VideoCaptured", 1);
        c = new <init>("EncodeVideo", 2);
        d = new <init>("VideoEncoded", 3);
        e = new <init>("DecodeVideo", 4);
        f = new <init>("VideoDecoded", 5);
        g = new <init>("RenderVideo", 6);
        h = new <init>("IssueFakeVideoFrame", 7);
        i = new <init>("ReadFakeVideoFrame", 8);
        j = new <init>("CopyFakeVideoFrame", 9);
        k = new <init>("PreviewFakeVideoFrame", 10);
        l = (new l[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }

    private (String s, int i1)
    {
        super(s, i1);
    }
}

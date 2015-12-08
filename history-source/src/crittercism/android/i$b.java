// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


// Referenced classes of package crittercism.android:
//            i

public static final class  extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(crittercism/android/i$b, s);
    }

    public static [] values()
    {
        return ([])d.clone();
    }

    static 
    {
        a = new <init>("SOCKET_MONITOR", 0);
        b = new <init>("STREAM_MONITOR", 1);
        c = new <init>("NONE", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int j)
    {
        super(s, j);
    }
}

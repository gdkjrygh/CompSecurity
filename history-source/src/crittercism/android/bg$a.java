// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


// Referenced classes of package crittercism.android:
//            bg

static final class  extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public static final i i;
    private static final i j[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(crittercism/android/bg$a, s);
    }

    public static [] values()
    {
        return ([])j.clone();
    }

    static 
    {
        a = new <init>("CREATED", 0);
        b = new <init>("STARTED", 1);
        c = new <init>("SUCCESS", 2);
        d = new <init>("SLOW", 3);
        e = new <init>("FAILED", 4);
        f = new <init>("TIMEOUT", 5);
        g = new <init>("CRASHED", 6);
        h = new <init>("ABORTED", 7);
        i = new <init>("INTERRUPTED", 8);
        j = (new j[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private (String s, int k)
    {
        super(s, k);
    }
}

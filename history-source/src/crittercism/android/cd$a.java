// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


// Referenced classes of package crittercism.android:
//            cd

public static final class  extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e f[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(crittercism/android/cd$a, s);
    }

    public static [] values()
    {
        return ([])f.clone();
    }

    static 
    {
        a = new <init>("INTERNET_UP", 0);
        b = new <init>("INTERNET_DOWN", 1);
        c = new <init>("CONN_TYPE_GAINED", 2);
        d = new <init>("CONN_TYPE_LOST", 3);
        e = new <init>("CONN_TYPE_SWITCHED", 4);
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

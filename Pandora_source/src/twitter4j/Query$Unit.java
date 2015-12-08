// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;


// Referenced classes of package twitter4j:
//            Query

public static final class  extends Enum
{

    private static final km $VALUES[];
    public static final km km;
    public static final km mi;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(twitter4j/Query$Unit, s);
    }

    public static f[] values()
    {
        return (f[])$VALUES.clone();
    }

    static 
    {
        mi = new <init>("mi", 0);
        km = new <init>("km", 1);
        $VALUES = (new .VALUES[] {
            mi, km
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

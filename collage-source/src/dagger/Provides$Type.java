// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger;


// Referenced classes of package dagger:
//            Provides

public static final class  extends Enum
{

    private static final SET_VALUES $VALUES[];
    public static final SET_VALUES SET;
    public static final SET_VALUES SET_VALUES;
    public static final SET_VALUES UNIQUE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(dagger/Provides$Type, s);
    }

    public static f[] values()
    {
        return (f[])$VALUES.clone();
    }

    static 
    {
        UNIQUE = new <init>("UNIQUE", 0);
        SET = new <init>("SET", 1);
        SET_VALUES = new <init>("SET_VALUES", 2);
        $VALUES = (new .VALUES[] {
            UNIQUE, SET, SET_VALUES
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

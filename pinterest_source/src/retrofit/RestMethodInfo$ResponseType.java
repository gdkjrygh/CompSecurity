// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


final class  extends Enum
{

    private static final OBJECT $VALUES[];
    public static final OBJECT OBJECT;
    public static final OBJECT OBSERVABLE;
    public static final OBJECT VOID;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(retrofit/RestMethodInfo$ResponseType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        VOID = new <init>("VOID", 0);
        OBSERVABLE = new <init>("OBSERVABLE", 1);
        OBJECT = new <init>("OBJECT", 2);
        $VALUES = (new .VALUES[] {
            VOID, OBSERVABLE, OBJECT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

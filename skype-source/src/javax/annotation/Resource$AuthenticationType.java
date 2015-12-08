// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.annotation;


// Referenced classes of package javax.annotation:
//            Resource

public static final class  extends Enum
{

    private static final APPLICATION $VALUES[];
    public static final APPLICATION APPLICATION;
    public static final APPLICATION CONTAINER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(javax/annotation/Resource$AuthenticationType, s);
    }

    public static final [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CONTAINER = new <init>("CONTAINER", 0);
        APPLICATION = new <init>("APPLICATION", 1);
        $VALUES = (new .VALUES[] {
            CONTAINER, APPLICATION
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

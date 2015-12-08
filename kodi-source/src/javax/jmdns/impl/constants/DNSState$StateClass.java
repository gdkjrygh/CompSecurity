// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl.constants;


// Referenced classes of package javax.jmdns.impl.constants:
//            DNSState

private static final class  extends Enum
{

    private static final closed $VALUES[];
    public static final closed announced;
    public static final closed announcing;
    public static final closed canceled;
    public static final closed canceling;
    public static final closed closed;
    public static final closed closing;
    public static final closed probing;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(javax/jmdns/impl/constants/DNSState$StateClass, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        probing = new <init>("probing", 0);
        announcing = new <init>("announcing", 1);
        announced = new <init>("announced", 2);
        canceling = new <init>("canceling", 3);
        canceled = new <init>("canceled", 4);
        closing = new <init>("closing", 5);
        closed = new <init>("closed", 6);
        $VALUES = (new .VALUES[] {
            probing, announcing, announced, canceling, canceled, closing, closed
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

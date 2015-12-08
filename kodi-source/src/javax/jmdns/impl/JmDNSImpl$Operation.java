// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;


// Referenced classes of package javax.jmdns.impl:
//            JmDNSImpl

public static final class  extends Enum
{

    private static final Noop $VALUES[];
    public static final Noop Add;
    public static final Noop Noop;
    public static final Noop RegisterServiceType;
    public static final Noop Remove;
    public static final Noop Update;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(javax/jmdns/impl/JmDNSImpl$Operation, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Remove = new <init>("Remove", 0);
        Update = new <init>("Update", 1);
        Add = new <init>("Add", 2);
        RegisterServiceType = new <init>("RegisterServiceType", 3);
        Noop = new <init>("Noop", 4);
        $VALUES = (new .VALUES[] {
            Remove, Update, Add, RegisterServiceType, Noop
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

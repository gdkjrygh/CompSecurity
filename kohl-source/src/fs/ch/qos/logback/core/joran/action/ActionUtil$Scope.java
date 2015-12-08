// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.action;


// Referenced classes of package fs.ch.qos.logback.core.joran.action:
//            ActionUtil

public static final class  extends Enum
{

    private static final SYSTEM $VALUES[];
    public static final SYSTEM CONTEXT;
    public static final SYSTEM LOCAL;
    public static final SYSTEM SYSTEM;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(fs/ch/qos/logback/core/joran/action/ActionUtil$Scope, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LOCAL = new <init>("LOCAL", 0);
        CONTEXT = new <init>("CONTEXT", 1);
        SYSTEM = new <init>("SYSTEM", 2);
        $VALUES = (new .VALUES[] {
            LOCAL, CONTEXT, SYSTEM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

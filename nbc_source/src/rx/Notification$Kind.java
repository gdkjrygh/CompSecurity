// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;


// Referenced classes of package rx:
//            Notification

public static final class  extends Enum
{

    private static final OnCompleted $VALUES[];
    public static final OnCompleted OnCompleted;
    public static final OnCompleted OnError;
    public static final OnCompleted OnNext;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(rx/Notification$Kind, s);
    }

    public static f[] values()
    {
        return (f[])$VALUES.clone();
    }

    static 
    {
        OnNext = new <init>("OnNext", 0);
        OnError = new <init>("OnError", 1);
        OnCompleted = new <init>("OnCompleted", 2);
        $VALUES = (new .VALUES[] {
            OnNext, OnError, OnCompleted
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

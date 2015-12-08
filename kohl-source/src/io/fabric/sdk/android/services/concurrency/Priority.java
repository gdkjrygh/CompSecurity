// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;


// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            PriorityProvider

public final class Priority extends Enum
{

    private static final Priority $VALUES[];
    public static final Priority HIGH;
    public static final Priority IMMEDIATE;
    public static final Priority LOW;
    public static final Priority NORMAL;

    private Priority(String s, int i)
    {
        super(s, i);
    }

    static int compareTo(PriorityProvider priorityprovider, Object obj)
    {
        if (obj instanceof PriorityProvider)
        {
            obj = ((PriorityProvider)obj).getPriority();
        } else
        {
            obj = NORMAL;
        }
        return ((Priority) (obj)).ordinal() - priorityprovider.getPriority().ordinal();
    }

    public static Priority valueOf(String s)
    {
        return (Priority)Enum.valueOf(io/fabric/sdk/android/services/concurrency/Priority, s);
    }

    public static Priority[] values()
    {
        return (Priority[])$VALUES.clone();
    }

    static 
    {
        LOW = new Priority("LOW", 0);
        NORMAL = new Priority("NORMAL", 1);
        HIGH = new Priority("HIGH", 2);
        IMMEDIATE = new Priority("IMMEDIATE", 3);
        $VALUES = (new Priority[] {
            LOW, NORMAL, HIGH, IMMEDIATE
        });
    }
}

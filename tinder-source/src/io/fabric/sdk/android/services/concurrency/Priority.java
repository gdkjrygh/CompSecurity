// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;


// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            f

public final class Priority extends Enum
{

    public static final Priority a;
    public static final Priority b;
    public static final Priority c;
    public static final Priority d;
    private static final Priority e[];

    private Priority(String s, int i)
    {
        super(s, i);
    }

    static int a(f f1, Object obj)
    {
        if (obj instanceof f)
        {
            obj = ((f)obj).a();
        } else
        {
            obj = b;
        }
        return ((Priority) (obj)).ordinal() - f1.a().ordinal();
    }

    public static Priority valueOf(String s)
    {
        return (Priority)Enum.valueOf(io/fabric/sdk/android/services/concurrency/Priority, s);
    }

    public static Priority[] values()
    {
        return (Priority[])e.clone();
    }

    static 
    {
        a = new Priority("LOW", 0);
        b = new Priority("NORMAL", 1);
        c = new Priority("HIGH", 2);
        d = new Priority("IMMEDIATE", 3);
        e = (new Priority[] {
            a, b, c, d
        });
    }
}

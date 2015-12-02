// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a;


public final class p extends Enum
{

    private static final p $VALUES[];
    public static final p FINISHED;
    public static final p PENDING;
    public static final p RUNNING;

    private p(String s, int i)
    {
        super(s, i);
    }

    public static p valueOf(String s)
    {
        return (p)Enum.valueOf(android/support/v4/a/p, s);
    }

    public static p[] values()
    {
        return (p[])$VALUES.clone();
    }

    static 
    {
        PENDING = new p("PENDING", 0);
        RUNNING = new p("RUNNING", 1);
        FINISHED = new p("FINISHED", 2);
        $VALUES = (new p[] {
            PENDING, RUNNING, FINISHED
        });
    }
}

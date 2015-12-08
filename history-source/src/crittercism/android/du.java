// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


// Referenced classes of package crittercism.android:
//            bu, ax

public final class du
    implements bu
{

    public int a;

    public du(int i)
    {
        a = i;
    }

    public final void a(ax ax1, String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        ax1.a(s, s1, Integer.valueOf(a).intValue());
        this;
        JVM INSTR monitorexit ;
        return;
        ax1;
        throw ax1;
    }

    public final Object b()
    {
        return Integer.valueOf(a);
    }
}

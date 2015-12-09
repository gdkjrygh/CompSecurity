// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            eu

public abstract class ek
    implements Runnable
{

    public ek()
    {
    }

    public abstract void a();

    public final void run()
    {
        try
        {
            a();
            return;
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            eu.a(throwable);
        }
    }
}

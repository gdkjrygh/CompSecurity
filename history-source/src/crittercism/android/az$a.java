// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


// Referenced classes of package crittercism.android:
//            az, bg

static final class <init>
    implements android.os.geQueue.IdleHandler
{

    private boolean a;

    public final boolean queueIdle()
    {
        this;
        JVM INSTR monitorenter ;
        if (!a)
        {
            a = true;
            bg.g();
        }
        this;
        JVM INSTR monitorexit ;
        return true;
        Exception exception;
        exception;
        throw exception;
    }

    private dleHandler()
    {
        a = false;
    }

    a(byte byte0)
    {
        this();
    }
}

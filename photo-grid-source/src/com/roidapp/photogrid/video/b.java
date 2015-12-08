// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;


// Referenced classes of package com.roidapp.photogrid.video:
//            a

final class b
    implements com.roidapp.baselib.e.b
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (com.roidapp.photogrid.video.a.a(a) != null)
        {
            com.roidapp.photogrid.video.a.a(a).a(com.roidapp.photogrid.video.a.b(a));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Exception exception;
        try
        {
            if (com.roidapp.photogrid.video.a.a(a) != null)
            {
                com.roidapp.photogrid.video.a.a(a).a(i);
            }
        }
        catch (Exception exception1) { }
        finally
        {
            this;
        }
        return;
        throw exception;
    }

    public final void a(int i, Exception exception)
    {
        if (com.roidapp.photogrid.video.a.a(a) != null)
        {
            com.roidapp.photogrid.video.a.a(a).a(i, exception);
        }
    }

    public final volatile void a(Object obj)
    {
        a();
    }
}

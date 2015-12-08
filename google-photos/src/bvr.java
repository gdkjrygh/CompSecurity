// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

final class bvr
    implements Runnable
{

    private bvq a;

    bvr(bvq bvq1)
    {
        a = bvq1;
        super();
    }

    public final void run()
    {
        try
        {
            bvm.a(a.b, a.a);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.w(bvm.b(), "interrupted while encoding");
            return;
        }
        catch (cri cri1)
        {
            bvm.b(a.b, true);
            bvm.a(a.b, true);
            return;
        }
        catch (Exception exception)
        {
            Log.e(bvm.b(), "exception while encoding", exception);
        }
        bvm.a(a.b, true);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import android.os.Handler;
import java.util.concurrent.RejectedExecutionException;

// Referenced classes of package kik.android:
//            s

final class t
    implements Runnable
{

    final s.a a;
    final Handler b;
    final s c;

    t(s s, s.a a1, Handler handler)
    {
        c = s;
        a = a1;
        b = handler;
        super();
    }

    public final void run()
    {
        try
        {
            a.a(new String[0]);
            return;
        }
        catch (RejectedExecutionException rejectedexecutionexception)
        {
            b.postDelayed(this, 200L);
        }
    }
}

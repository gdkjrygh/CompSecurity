// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.c.b;

// Referenced classes of package bo.app:
//            aw

final class ay
    implements Runnable
{

    final b a;
    final Object b;
    final aw c;

    ay(aw aw, b b1, Object obj)
    {
        c = aw;
        a = b1;
        b = obj;
        super();
    }

    public final void run()
    {
        a.trigger(b);
    }
}

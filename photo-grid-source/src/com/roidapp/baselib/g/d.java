// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.g;

import android.os.Message;
import com.roidapp.baselib.e.b;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.baselib.g:
//            c

final class d
    implements b
{

    private WeakReference a;

    private d(c c1)
    {
        a = new WeakReference(c1);
    }

    d(c c1, byte byte0)
    {
        this(c1);
    }

    private void a(Message message)
    {
        c c1;
        if (a == null)
        {
            c1 = null;
        } else
        {
            c1 = (c)a.get();
        }
        if (c1 != null)
        {
            c1.sendMessage(message);
        }
    }

    public final void a(int i)
    {
        a(Message.obtain(null, 52163, i, 0));
    }

    public final void a(int i, Exception exception)
    {
        a(Message.obtain(null, 52162, i, 0, exception));
    }

    public final void a(Object obj)
    {
        a(Message.obtain(null, 52161, (String)obj));
    }
}

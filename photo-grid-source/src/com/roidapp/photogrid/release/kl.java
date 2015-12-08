// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import com.roidapp.baselib.a.a;

// Referenced classes of package com.roidapp.photogrid.release:
//            kg, ig

final class kl
    implements Runnable
{

    final ig a;
    final int b;
    final int c;
    final kg d;

    kl(kg kg1, ig ig1, int i, int j)
    {
        d = kg1;
        a = ig1;
        b = i;
        c = j;
        super();
    }

    public final void run()
    {
        com.roidapp.photogrid.release.kg.a(d, false);
        Object obj = d;
        com.roidapp.baselib.a.a.a();
        com.roidapp.photogrid.release.kg.a(((kg) (obj)), com.roidapp.baselib.a.a.b(a.n, b, c));
        obj = Message.obtain();
        obj.what = 0;
        kg.n(d).sendMessage(((Message) (obj)));
    }
}

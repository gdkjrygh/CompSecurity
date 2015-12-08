// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import com.roidapp.baselib.a.a;

// Referenced classes of package com.roidapp.photogrid.release:
//            jj

final class jl
    implements Runnable
{

    final String a;
    final int b;
    final int c;
    final jj d;

    jl(jj jj1, String s, int i, int j)
    {
        d = jj1;
        a = s;
        b = i;
        c = j;
        super();
    }

    public final void run()
    {
        com.roidapp.photogrid.release.jj.a(d, false);
        Object obj = d;
        com.roidapp.baselib.a.a.a();
        com.roidapp.photogrid.release.jj.a(((jj) (obj)), com.roidapp.baselib.a.a.b(a, b, c));
        obj = Message.obtain();
        obj.what = 0;
        jj.g(d).sendMessage(((Message) (obj)));
    }
}

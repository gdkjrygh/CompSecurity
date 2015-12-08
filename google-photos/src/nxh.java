// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class nxh
    implements nxg
{

    private static final int b = Math.max(1, Runtime.getRuntime().availableProcessors() - 1);
    public final Context b_;
    private final ExecutorService c;
    private final Handler d = new Handler(Looper.getMainLooper(), new nxi(this));
    private final nxl e = new nxl(this);
    private final HashMap f = new HashMap();
    private nxn g;

    public nxh(Context context)
    {
        b_ = context;
        c = Executors.newFixedThreadPool(b, new nxj(this));
    }

    static void a(nxh nxh1, nxb nxb1)
    {
        nxd nxd = nxb1.g;
        if (nxb1.m)
        {
            String s = String.valueOf(nxd);
            (new StringBuilder(String.valueOf(s).length() + 30)).append("Finished preloading resource: ").append(s);
        }
        nxh1.f.remove(nxd);
        nxh1.d.sendMessage(nxh1.d.obtainMessage(4, nxb1));
    }

    public final void a(nxb nxb1, int i)
    {
        d.sendMessage(d.obtainMessage(0, i, 0, nxb1));
    }

    public void a(nxb nxb1, int i, int j)
    {
        d.sendMessage(d.obtainMessage(2, i, j, nxb1));
    }

    public final void a(nxb nxb1, int i, Object obj)
    {
        d.sendMessage(d.obtainMessage(1, i, 0, new nxm(nxb1, obj)));
    }

    public final void a(nxb nxb1, Object obj)
    {
        c.execute(new nxk(this, nxb1, obj));
    }

    final boolean a(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 4: default 40
    //                   0 42
    //                   1 96
    //                   2 65
    //                   3 132
    //                   4 155;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return true;
_L2:
        nxb nxb1 = (nxb)message.obj;
        nxb1.i = message.arg1;
        nxb1.t();
        continue; /* Loop/switch isn't completed */
_L4:
        nxb nxb2 = (nxb)message.obj;
        nxb2.i = message.arg1;
        nxb2.k = message.arg2;
        nxb2.t();
        continue; /* Loop/switch isn't completed */
_L3:
        nxm nxm1 = (nxm)message.obj;
        nxb nxb4 = nxm1.a;
        nxb4.h = nxm1.b;
        nxb4.i = message.arg1;
        nxb4.t();
        continue; /* Loop/switch isn't completed */
_L5:
        nxb nxb3 = (nxb)message.obj;
        nxb3.l = message.arg1;
        nxb3.t();
        continue; /* Loop/switch isn't completed */
_L6:
        ((nxb)message.obj).a(e);
        if (true) goto _L1; else goto _L7
_L7:
    }

    public final void b(nxb nxb1, int i)
    {
        d.sendMessage(d.obtainMessage(3, i, 0, nxb1));
    }

    public final void c(nxb nxb1)
    {
        if (g == null)
        {
            g = new nxn();
            g.start();
        }
        nxn nxn1 = g;
        nxn1.a.sendMessage(nxn1.a.obtainMessage(0, nxb1));
    }

    public final Context o()
    {
        return b_;
    }

}

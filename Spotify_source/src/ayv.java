// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer.ExoPlaybackException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class ayv
    implements ayr
{

    final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    final boolean b[] = new boolean[3];
    boolean c;
    int d;
    int e;
    private final Handler f = new Handler() {

        private ayv a;

        public final void handleMessage(Message message)
        {
            Object obj = a;
            message.what;
            JVM INSTR tableswitch 1 4: default 40
        //                       1 41
        //                       2 111
        //                       3 161
        //                       4 205;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            return;
_L2:
            boolean aflag[] = (boolean[])message.obj;
            System.arraycopy(aflag, 0, ((ayv) (obj)).b, 0, aflag.length);
            obj.d = message.arg1;
            message = ((ayv) (obj)).a.iterator();
            while (message.hasNext()) 
            {
                ((ayu)message.next()).a(((ayv) (obj)).c, ((ayv) (obj)).d);
            }
            continue; /* Loop/switch isn't completed */
_L3:
            obj.d = message.arg1;
            message = ((ayv) (obj)).a.iterator();
            while (message.hasNext()) 
            {
                ((ayu)message.next()).a(((ayv) (obj)).c, ((ayv) (obj)).d);
            }
            if (true) goto _L1; else goto _L4
_L4:
            obj.e = ((ayv) (obj)).e - 1;
            if (((ayv) (obj)).e == 0)
            {
                message = ((ayv) (obj)).a.iterator();
                while (message.hasNext()) 
                {
                    message.next();
                }
            }
            if (true)
            {
                continue; /* Loop/switch isn't completed */
            }
_L5:
            message = (ExoPlaybackException)message.obj;
            obj = ((ayv) (obj)).a.iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ((ayu)((Iterator) (obj)).next()).a(message);
            }
            if (true) goto _L1; else goto _L6
_L6:
        }

            
            {
                a = ayv.this;
                super();
            }
    };
    private final ayw g;
    private final boolean h[] = new boolean[3];

    public ayv()
    {
        int i = 0;
        super();
        Log.i("ExoPlayerImpl", "Init 1.4.2");
        c = false;
        d = 1;
        for (; i < 3; i++)
        {
            h[i] = true;
        }

        g = new ayw(f, c, h);
    }

    public final Looper a()
    {
        return g.b.getLooper();
    }

    public final void a(long l)
    {
        g.a.obtainMessage(6, Long.valueOf(l)).sendToTarget();
    }

    public final void a(ays ays)
    {
        g.a(ays);
    }

    public final void a(ays ays, Object obj)
    {
        ayw ayw1 = g;
        ayw1.c = ayw1.c + 1;
        ayw1.a.obtainMessage(9, 1, 0, Pair.create(ays, obj)).sendToTarget();
    }

    public final void a(ayu ayu1)
    {
        a.add(ayu1);
    }

    public final void a(boolean flag)
    {
        if (h[0] != flag)
        {
            h[0] = flag;
            Handler handler = g.a;
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            handler.obtainMessage(8, 0, i).sendToTarget();
        }
    }

    public final transient void a(azq aazq[])
    {
        Arrays.fill(b, false);
        g.a.obtainMessage(1, aazq).sendToTarget();
    }

    public final int b()
    {
        return d;
    }

    public final void b(ayu ayu1)
    {
        a.remove(ayu1);
    }

    public final void b(boolean flag)
    {
        if (c != flag)
        {
            c = flag;
            e = e + 1;
            Handler handler = g.a;
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            handler.obtainMessage(3, i, 0).sendToTarget();
            for (Iterator iterator = a.iterator(); iterator.hasNext(); ((ayu)iterator.next()).a(flag, d)) { }
        }
    }

    public final boolean c()
    {
        return c;
    }

    public final void d()
    {
        g.a.sendEmptyMessage(4);
    }

    public final void e()
    {
        g.a();
        f.removeCallbacksAndMessages(null);
    }

    public final long f()
    {
        ayw ayw1 = g;
        if (ayw1.d == -1L)
        {
            return -1L;
        } else
        {
            return ayw1.d / 1000L;
        }
    }

    public final long g()
    {
        return g.e / 1000L;
    }
}

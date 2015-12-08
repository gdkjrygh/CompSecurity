// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.nuance.b.a.ab;
import com.nuance.b.a.ac;
import com.nuance.b.a.l;
import com.nuance.b.a.n;
import com.nuance.b.a.z;
import com.nuance.b.b.aq;
import com.nuance.b.b.ar;
import com.nuance.b.d.a;
import com.nuance.b.e.a.b;
import com.nuance.b.e.a.f;
import com.nuance.b.e.a.g;
import com.nuance.b.e.a.h;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.nuance.b.e:
//            c, ak, ah, af, 
//            ag, ai, ab, ae

final class ad
    implements Runnable
{

    AtomicBoolean a;
    com.nuance.b.e.ab b;
    c c;
    z d;
    aq e;
    boolean f;
    boolean g;
    private final String h;
    private final String i;

    public ad(com.nuance.b.e.ab ab1, z z1, c c1)
    {
        a = new AtomicBoolean(false);
        if (ab1 == null)
        {
            throw new NullPointerException("Parameter 'interpretationHandler' must not be null.");
        }
        if (z1 == null)
        {
            throw new NullPointerException("Parameter 'conversationMananger' must not be null.");
        }
        if (c1 == null)
        {
            throw new NullPointerException("Parameter 'nina' must not be null.");
        } else
        {
            b = ab1;
            d = z1;
            c = c1;
            ab1 = c1.q().getResources();
            h = ab1.getString(ak.c);
            i = com.nuance.b.d.a.a(ab1.getString(com.nuance.b.e.ak.a), ab1.getString(ak.d));
            return;
        }
    }

    private void a()
    {
        ab ab1;
        for (ab1 = d.g(); c() && ab1.a == ac.c; ab1 = d.g())
        {
            d.a(ab.f);
            Log.i("NinaInterpretationHandlerRunnable", "Executing custom runnable...");
            a(ab1.b, "custom runnable");
        }

        Object obj = c.b;
        obj;
        JVM INSTR monitorenter ;
        if (!c()) goto _L2; else goto _L1
_L1:
        com.nuance.b.e.ah.a[ab1.a.ordinal()];
        JVM INSTR tableswitch 1 4: default 217
    //                   1 149
    //                   2 164
    //                   3 182
    //                   4 206;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_206;
_L3:
        Log.w("NinaInterpretationHandlerRunnable", (new StringBuilder("Unhandled case for what to do after an interpretation: ")).append(ab1).toString());
_L2:
        return;
_L4:
        c.s();
          goto _L2
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L5:
        Log.i("NinaInterpretationHandlerRunnable", "Going back to listening.");
        c.d();
          goto _L2
_L6:
        Log.i("NinaInterpretationHandlerRunnable", "Waiting for user.");
        c.x().waitForUser(null);
          goto _L2
        Log.i("NinaInterpretationHandlerRunnable", "Waiting for another interpretation.");
          goto _L2
    }

    private void a(h h1)
    {
        a(((Runnable) (new af(this, h1))), "ninaPersona.recognitionComplete");
    }

    private void a(Runnable runnable, String s)
    {
        AtomicReference atomicreference;
        int j;
        atomicreference = new AtomicReference(null);
        runnable = new Thread(new ag(this, runnable, atomicreference));
        runnable.start();
        j = 0;
_L2:
        if (!runnable.isAlive())
        {
            break; /* Loop/switch isn't completed */
        }
        if (a.get())
        {
            Log.d("NinaInterpretationHandlerRunnable", (new StringBuilder("Cancelled during ")).append(s).toString());
            runnable.interrupt();
        }
        if (j % 1000 != 0)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        Log.d("NinaInterpretationHandlerRunnable", (new StringBuilder("Waiting for ")).append(s).append(" to finish...").toString());
        Thread.sleep(5L);
        j++;
        if (true) goto _L2; else goto _L1
        InterruptedException interruptedexception;
        interruptedexception;
        Log.i("NinaInterpretationHandlerRunnable", (new StringBuilder("Interrupted while waiting for ")).append(s).append(" to finish").toString());
        runnable.interrupt();
_L1:
        if (atomicreference.get() != null)
        {
            throw (RuntimeException)atomicreference.get();
        } else
        {
            return;
        }
    }

    static boolean a(ad ad1)
    {
        return ad1.b();
    }

    static String b(ad ad1)
    {
        return ad1.i;
    }

    private boolean b()
    {
        Object obj = e.q;
        if (obj == null || ((List) (obj)).size() <= 0)
        {
            return false;
        }
        obj = (String)((List) (obj)).get(0);
        if (obj == null)
        {
            return false;
        } else
        {
            return ((String) (obj)).matches("^\\[DM\\.INPUTFAILURE.*\\]");
        }
    }

    static String c(ad ad1)
    {
        return ad1.h;
    }

    private boolean c()
    {
        return !a.get() && !c.t();
    }

    public final void run()
    {
        boolean flag;
        flag = false;
        if (e == null)
        {
            throw new IllegalStateException("Must be prepared before calling run().");
        }
        Log.d("NinaInterpretationHandlerRunnable", (new StringBuilder("Starting to handle: ")).append(e.b).toString());
        b.a(this);
        if (!c())
        {
            break MISSING_BLOCK_LABEL_498;
        }
        if (e.a != ar.b) goto _L2; else goto _L1
_L1:
        Log.d("NinaInterpretationHandlerRunnable", "NO_INPUT_TIMEOUT --> tell NinaPersona to wait for user");
        c.a(false);
        String s = com.nuance.b.e.c.b();
        c.x().waitForUser(s, null);
_L7:
        Log.d("NinaInterpretationHandlerRunnable", (new StringBuilder("Done handling: ")).append(e.b).toString());
_L8:
        b.a();
        return;
_L2:
        long l1;
        a(new ae(this), "interpretation processing");
        l1 = d.b();
        if (l1 < 0L) goto _L4; else goto _L3
_L3:
        Log.d("NinaInterpretationHandlerRunnable", "Syncing agent values to server");
        flag = true;
_L10:
        d.c();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        c.a(false);
        if (!f) goto _L6; else goto _L5
_L5:
        a(new h(false, d.f(), d.e()));
_L13:
        a();
          goto _L7
        ai ai1;
        ai1;
        Log.e("NinaInterpretationHandlerRunnable", ai1.getMessage());
        c.a(ak.e);
          goto _L7
        Object obj;
        obj;
        String s1 = (new StringBuilder("Caught exception in NinaHandleInterpretationRunnable.run ")).append(obj).toString();
        if (c.t())
        {
            Log.w("NinaInterpretationHandlerRunnable", s1, ((Throwable) (obj)));
        } else
        {
            Log.e("NinaInterpretationHandlerRunnable", s1, ((Throwable) (obj)));
            c.x().reportResult(new com.nuance.b.e.a.a(null));
        }
          goto _L8
_L4:
        if (l1 == 0x8000000000000000L) goto _L10; else goto _L9
_L9:
        throw new ai(l1);
_L6:
        obj = e.d;
        if (!"SetAgentValues.Execute".equals(obj)) goto _L12; else goto _L11
_L11:
        a(new f(g.b, g, d.f(), d.e(), null));
          goto _L13
_L12:
label0:
        {
            if (!"SendCloudSMSUpdates.Execute".equals(obj))
            {
                break label0;
            }
            a(new f(g.b, g, null, null, null));
        }
          goto _L13
        obj = g.a;
        if (e.a != ar.a || b())
        {
            obj = g.c;
        }
        a(new f(((g) (obj)), g, d.f(), d.e(), d.a().a(n.c)));
          goto _L13
        Log.i("NinaInterpretationHandlerRunnable", (new StringBuilder("Aborting the handling of: ")).append(e.b).toString());
          goto _L7
    }
}

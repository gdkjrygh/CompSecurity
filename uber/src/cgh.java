// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class cgh
{

    static final Handler a = new Handler(Looper.getMainLooper()) {

        public final void handleMessage(Message message)
        {
            message.what;
            JVM INSTR lookupswitch 3: default 40
        //                       3: 117
        //                       8: 67
        //                       13: 163;
               goto _L1 _L2 _L3 _L4
_L1:
            throw new AssertionError((new StringBuilder("Unknown handler message received: ")).append(message.what).toString());
_L3:
            message = (List)message.obj;
            int k1 = message.size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                cfh cfh1 = (cfh)message.get(i1);
                cfh1.b.a(cfh1);
            }

            break; /* Loop/switch isn't completed */
_L2:
            message = (cfe)message.obj;
            if (message.j().l)
            {
                chf.a("Main", "canceled", ((cfe) (message)).b.a(), "target got garbage collected");
            }
            cgh.a(((cfe) (message)).a, message.d());
_L6:
            return;
_L4:
            message = (List)message.obj;
            int l1 = message.size();
            int j1 = 0;
            while (j1 < l1) 
            {
                cfe cfe1 = (cfe)message.get(j1);
                cfe1.a.b(cfe1);
                j1++;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

    };
    static cgh b = null;
    final Context c;
    final cfo d;
    final cfi e;
    final cgx f;
    final Map g = new WeakHashMap();
    final Map h = new WeakHashMap();
    final ReferenceQueue i = new ReferenceQueue();
    final android.graphics.Bitmap.Config j;
    boolean k;
    volatile boolean l;
    boolean m;
    private final cgk n;
    private final cgn o;
    private final cgj p;
    private final List q;

    cgh(Context context, cfo cfo1, cfi cfi1, cgk cgk, cgn cgn1, List list, cgx cgx1, 
            android.graphics.Bitmap.Config config, boolean flag, boolean flag1)
    {
        c = context;
        d = cfo1;
        e = cfi1;
        n = cgk;
        o = cgn1;
        j = config;
        int i1;
        if (list != null)
        {
            i1 = list.size();
        } else
        {
            i1 = 0;
        }
        cfi1 = new ArrayList(i1 + 7);
        cfi1.add(new cgw(context));
        if (list != null)
        {
            cfi1.addAll(list);
        }
        cfi1.add(new cfk(context));
        cfi1.add(new cga(context));
        cfi1.add(new cfm(context));
        cfi1.add(new cfg(context));
        cfi1.add(new cfv(context));
        cfi1.add(new cge(cfo1.d, cgx1));
        q = Collections.unmodifiableList(cfi1);
        f = cgx1;
        k = flag;
        l = flag1;
        p = new cgj(i, a);
        p.start();
    }

    public static cgh a(Context context)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        cgh;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = (new cgi(context)).a();
        }
        cgh;
        JVM INSTR monitorexit ;
_L2:
        return b;
        context;
        cgh;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void a(Bitmap bitmap, cgl cgl1, cfe cfe1)
    {
        if (!cfe1.f()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!cfe1.g())
        {
            g.remove(cfe1.d());
        }
        if (bitmap == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (cgl1 == null)
        {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        cfe1.a(bitmap, cgl1);
        if (l)
        {
            chf.a("Main", "completed", cfe1.b.a(), (new StringBuilder("from ")).append(cgl1).toString());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        cfe1.a();
        if (l)
        {
            chf.a("Main", "errored", cfe1.b.a());
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    static void a(cgh cgh1, Object obj)
    {
        cgh1.c(obj);
    }

    private void c(cfe cfe1)
    {
        d.a(cfe1);
    }

    private void c(Object obj)
    {
        chf.b();
        cfe cfe1 = (cfe)g.remove(obj);
        if (cfe1 != null)
        {
            cfe1.b();
            d.b(cfe1);
        }
        if (obj instanceof ImageView)
        {
            obj = (ImageView)obj;
            obj = (cfn)h.remove(obj);
            if (obj != null)
            {
                ((cfn) (obj)).a();
            }
        }
    }

    final cgr a(cgr cgr1)
    {
        cgr cgr2 = o.a(cgr1);
        if (cgr2 == null)
        {
            throw new IllegalStateException((new StringBuilder("Request transformer ")).append(o.getClass().getCanonicalName()).append(" returned null for ").append(cgr1).toString());
        } else
        {
            return cgr2;
        }
    }

    public final cgt a(int i1)
    {
        if (i1 == 0)
        {
            throw new IllegalArgumentException("Resource ID must not be zero.");
        } else
        {
            return new cgt(this, null, i1);
        }
    }

    public final cgt a(Uri uri)
    {
        return new cgt(this, uri, 0);
    }

    public final cgt a(String s)
    {
        if (s == null)
        {
            return new cgt(this, null, 0);
        }
        if (s.trim().length() == 0)
        {
            throw new IllegalArgumentException("Path must not be empty.");
        } else
        {
            return a(Uri.parse(s));
        }
    }

    final List a()
    {
        return q;
    }

    public final void a(ImageView imageview)
    {
        c(imageview);
    }

    final void a(ImageView imageview, cfn cfn1)
    {
        h.put(imageview, cfn1);
    }

    final void a(cfe cfe1)
    {
        Object obj = cfe1.d();
        if (obj != null && g.get(obj) != cfe1)
        {
            c(obj);
            g.put(obj, cfe1);
        }
        c(cfe1);
    }

    final void a(cfh cfh1)
    {
        cfe cfe1;
        List list;
        boolean flag;
        boolean flag2 = true;
        cfe1 = cfh1.i();
        list = cfh1.k();
        boolean flag1;
        if (list != null && !list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag2;
        if (cfe1 == null)
        {
            if (flag)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = cfh1.h().d;
        cfh1.l();
        obj = cfh1.e();
        cfh1 = cfh1.m();
        if (cfe1 != null)
        {
            a(((Bitmap) (obj)), ((cgl) (cfh1)), cfe1);
        }
        if (flag)
        {
            int j1 = list.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                a(((Bitmap) (obj)), ((cgl) (cfh1)), (cfe)list.get(i1));
                i1++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void a(cha cha)
    {
        c(cha);
    }

    public final void a(Object obj)
    {
        d.a(obj);
    }

    final Bitmap b(String s)
    {
        s = e.a(s);
        if (s != null)
        {
            f.a();
            return s;
        } else
        {
            f.b();
            return s;
        }
    }

    final void b(cfe cfe1)
    {
        Bitmap bitmap = null;
        if (cgc.a(cfe1.e))
        {
            bitmap = b(cfe1.e());
        }
        if (bitmap != null)
        {
            a(bitmap, cgl.a, cfe1);
            if (l)
            {
                chf.a("Main", "completed", cfe1.b.a(), (new StringBuilder("from ")).append(cgl.a).toString());
            }
        } else
        {
            a(cfe1);
            if (l)
            {
                chf.a("Main", "resumed", cfe1.b.a());
                return;
            }
        }
    }

    public final void b(Object obj)
    {
        d.b(obj);
    }

}

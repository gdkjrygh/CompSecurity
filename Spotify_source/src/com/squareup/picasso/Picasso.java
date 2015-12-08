// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import guz;
import gvb;
import gvc;
import gvd;
import gvf;
import gvg;
import gvh;
import gvi;
import gvo;
import gvu;
import gvv;
import gvz;
import gwb;
import gwe;
import gwf;
import gwm;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

// Referenced classes of package com.squareup.picasso:
//            MediaStoreRequestHandler, NetworkRequestHandler, MemoryPolicy

public final class Picasso
{

    public static final Handler a = new Handler(Looper.getMainLooper()) {

        public final void handleMessage(Message message)
        {
            message.what;
            JVM INSTR lookupswitch 3: default 40
        //                       3: 278
        //                       8: 67
        //                       13: 324;
               goto _L1 _L2 _L3 _L4
_L1:
            throw new AssertionError((new StringBuilder("Unknown handler message received: ")).append(message.what).toString());
_L3:
            message = (List)message.obj;
            int j2 = message.size();
            int k1;
            int i2;
            for (int i1 = 0; i1 < j2; i1++)
            {
                Object obj = (gvc)message.get(i1);
                Picasso picasso = ((gvc) (obj)).b;
                guz guz1 = ((gvc) (obj)).h;
                List list1 = ((gvc) (obj)).i;
                if (list1 != null && !list1.isEmpty())
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                if (guz1 != null || k1 != 0)
                {
                    i2 = 1;
                } else
                {
                    i2 = 0;
                }
                if (i2 != 0)
                {
                    Object obj1 = ((gvc) (obj)).d.d;
                    obj1 = ((gvc) (obj)).m;
                    obj1 = ((gvc) (obj)).j;
                    obj = ((gvc) (obj)).l;
                    if (guz1 != null)
                    {
                        picasso.a(((Bitmap) (obj1)), ((LoadedFrom) (obj)), guz1);
                    }
                    if (k1 != 0)
                    {
                        i2 = list1.size();
                        for (k1 = 0; k1 < i2; k1++)
                        {
                            picasso.a(((Bitmap) (obj1)), ((LoadedFrom) (obj)), (guz)list1.get(k1));
                        }

                    }
                }
            }

            break; /* Loop/switch isn't completed */
_L2:
            message = (guz)message.obj;
            if (((guz) (message)).a.h)
            {
                gwm.a("Main", "canceled", ((guz) (message)).b.a(), "target got garbage collected");
            }
            Picasso.a(((guz) (message)).a, message.c());
_L6:
            return;
_L4:
            List list = (List)message.obj;
            int l1 = list.size();
            int j1 = 0;
            while (j1 < l1) 
            {
                guz guz2 = (guz)list.get(j1);
                Picasso picasso1 = guz2.a;
                message = null;
                if (MemoryPolicy.a(0))
                {
                    message = picasso1.b(guz2.g);
                }
                if (message != null)
                {
                    picasso1.a(message, LoadedFrom.a, guz2);
                    if (picasso1.h)
                    {
                        gwm.a("Main", "completed", guz2.b.a(), (new StringBuilder("from ")).append(LoadedFrom.a).toString());
                    }
                } else
                {
                    picasso1.a(guz2);
                    if (picasso1.h)
                    {
                        gwm.a("Main", "resumed", guz2.b.a());
                    }
                }
                j1++;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }


        private class LoadedFrom extends Enum
        {

            public static final LoadedFrom a;
            public static final LoadedFrom b;
            public static final LoadedFrom c;
            private static final LoadedFrom d[];
            public final int debugColor;

            public static LoadedFrom valueOf(String s)
            {
                return (LoadedFrom)Enum.valueOf(com/squareup/picasso/Picasso$LoadedFrom, s);
            }

            public static LoadedFrom[] values()
            {
                return (LoadedFrom[])d.clone();
            }

            static 
            {
                a = new LoadedFrom("MEMORY", 0, 0xff00ff00);
                b = new LoadedFrom("DISK", 1, 0xff0000ff);
                c = new LoadedFrom("NETWORK", 2, 0xffff0000);
                d = (new LoadedFrom[] {
                    a, b, c
                });
            }

            private LoadedFrom(String s, int i1, int j1)
            {
                super(s, i1);
                debugColor = j1;
            }
        }

    };
    private static volatile Picasso j = null;
    public final gvv b;
    public final List c;
    public final Context d;
    public final ReferenceQueue e = new ReferenceQueue();
    public final android.graphics.Bitmap.Config f = null;
    public boolean g;
    public volatile boolean h;
    public boolean i;
    private final gvu k;
    private gvi l;
    private gvd m;
    private gwf n;
    private Map o;
    private Map p;

    public Picasso(Context context, gvi gvi1, gvd gvd1, gvv gvv, gwf gwf1)
    {
        d = context;
        l = gvi1;
        m = gvd1;
        b = gvv;
        gvd1 = new ArrayList(7);
        gvd1.add(new gwe(context));
        gvd1.add(new gvf(context));
        gvd1.add(new MediaStoreRequestHandler(context));
        gvd1.add(new gvg(context));
        gvd1.add(new gvb(context));
        gvd1.add(new gvo(context));
        gvd1.add(new NetworkRequestHandler(gvi1.a, gwf1));
        c = Collections.unmodifiableList(gvd1);
        n = gwf1;
        o = new WeakHashMap();
        p = new WeakHashMap();
        g = false;
        h = false;
        k = new gvu(e, a);
        k.start();
    }

    static void a(Picasso picasso, Object obj)
    {
        picasso.a(obj);
    }

    public final gwb a(int i1)
    {
        if (i1 == 0)
        {
            throw new IllegalArgumentException("Resource ID must not be zero.");
        } else
        {
            return new gwb(this, null, i1);
        }
    }

    public final gwb a(Uri uri)
    {
        return new gwb(this, uri, 0);
    }

    public final gwb a(String s)
    {
        if (s == null)
        {
            return new gwb(this, null, 0);
        }
        if (s.trim().length() == 0)
        {
            throw new IllegalArgumentException("Path must not be empty.");
        } else
        {
            return a(Uri.parse(s));
        }
    }

    final void a(Bitmap bitmap, LoadedFrom loadedfrom, guz guz1)
    {
        if (!guz1.j) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!guz1.i)
        {
            o.remove(guz1.c());
        }
        if (bitmap == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (loadedfrom == null)
        {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        guz1.a(bitmap, loadedfrom);
        if (h)
        {
            gwm.a("Main", "completed", guz1.b.a(), (new StringBuilder("from ")).append(loadedfrom).toString());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        guz1.a();
        if (h)
        {
            gwm.a("Main", "errored", guz1.b.a());
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void a(guz guz1)
    {
        Object obj = guz1.c();
        if (obj != null && o.get(obj) != guz1)
        {
            a(obj);
            o.put(obj, guz1);
        }
        b(guz1);
    }

    public final void a(Object obj)
    {
        gwm.a();
        guz guz1 = (guz)o.remove(obj);
        if (guz1 != null)
        {
            guz1.b();
            gvi gvi1 = l;
            gvi1.f.sendMessage(gvi1.f.obtainMessage(2, guz1));
        }
        if (obj instanceof ImageView)
        {
            obj = (ImageView)obj;
            obj = (gvh)p.remove(obj);
            if (obj != null)
            {
                Object obj1 = (ImageView)((gvh) (obj)).a.get();
                if (obj1 != null)
                {
                    obj1 = ((ImageView) (obj1)).getViewTreeObserver();
                    if (((ViewTreeObserver) (obj1)).isAlive())
                    {
                        ((ViewTreeObserver) (obj1)).removeOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (obj)));
                    }
                }
            }
        }
    }

    public final Bitmap b(String s)
    {
        s = m.a(s);
        if (s != null)
        {
            n.a();
            return s;
        } else
        {
            n.b.sendEmptyMessage(1);
            return s;
        }
    }

    public final void b(guz guz1)
    {
        gvi gvi1 = l;
        gvi1.f.sendMessage(gvi1.f.obtainMessage(1, guz1));
    }

}

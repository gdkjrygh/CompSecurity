// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.snapchat.android.discover.model.ChannelPage;
import com.snapchat.android.discover.model.MediaState;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class vO
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(ChannelPage channelpage);

        public abstract void a(String s);

        public abstract String b();
    }

    static final class b extends Enum
    {

        private static final int a[] = {
            1, 2, 3
        };

        public static int[] a()
        {
            return (int[])a.clone();
        }

    }


    public final Object a;
    public final Map b;
    public final Set c;
    final ConcurrentHashMap d;
    private final vJ e;
    private final vJ.a f;

    public vO()
    {
        this(vJ.a());
    }

    private vO(vJ vj)
    {
        a = new Object();
        b = new HashMap();
        c = new HashSet();
        d = new ConcurrentHashMap();
        f = new vJ.a() {

            private vO a;

            public final void a(List list)
            {
                Object obj = a.a;
                obj;
                JVM INSTR monitorenter ;
                a.d.clear();
                ChannelPage channelpage;
                for (list = list.iterator(); list.hasNext(); a.d.put(channelpage.c, channelpage))
                {
                    channelpage = (ChannelPage)list.next();
                }

                break MISSING_BLOCK_LABEL_70;
                list;
                obj;
                JVM INSTR monitorexit ;
                throw list;
                a.a();
                obj;
                JVM INSTR monitorexit ;
            }

            
            {
                a = vO.this;
                super();
            }
        };
        e = vj;
        e.a(f);
        e.c(f);
    }

    private int a(String s)
    {
label0:
        {
            synchronized (a)
            {
                if (d.size() != 0)
                {
                    break label0;
                }
            }
            return 3;
        }
        if (d.containsKey(s))
        {
            return 1;
        }
        break MISSING_BLOCK_LABEL_41;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        obj;
        JVM INSTR monitorexit ;
        return 2;
    }

    private void a(a a1, String s)
    {
        synchronized (a)
        {
            if (c.contains(a1))
            {
                a1.a(s);
                c.remove(a1);
            }
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void a()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        Iterator iterator;
        obj1 = new HashMap(b.size());
        iterator = b.keySet().iterator();
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        a a1;
        String s;
        int i;
        a1 = (a)iterator.next();
        s = a1.b();
        i = a(s);
        static final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[b.a().length];
                try
                {
                    a[2] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[0] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[1] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.a[i - 1];
        JVM INSTR tableswitch 1 3: default 324
    //                   1 112
    //                   2 131
    //                   3 252;
           goto _L3 _L4 _L5 _L6
_L4:
        ((Map) (obj1)).put(a1, s);
          goto _L3
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L5:
        ChannelPage channelpage = (ChannelPage)d.get(s);
        if (!channelpage.f()) goto _L8; else goto _L7
_L7:
        a1.a(channelpage);
_L11:
        a(a1, channelpage.a);
          goto _L3
_L8:
        if (channelpage.m().isError() || channelpage.l().isError() || channelpage.k().isError() || channelpage.n().isError())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!i) goto _L10; else goto _L9
_L9:
        a1.a();
          goto _L11
_L10:
        ((Map) (obj1)).put(a1, s);
          goto _L11
_L6:
        a(a1, null);
        a1.a();
          goto _L3
_L2:
        b.clear();
        b.putAll(((Map) (obj1)));
        Timber.a("IntroMediaStateProvider", (new StringBuilder("Unprocessed intro media state listeners: ")).append(b.size()).toString(), new Object[0]);
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(a a1)
    {
        synchronized (a)
        {
            b.put(a1, a1.b());
            c.add(a1);
            a();
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }
}

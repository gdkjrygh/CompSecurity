// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.i.a.a;

import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import com.facebook.base.broadcast.j;
import com.facebook.common.e.h;
import com.facebook.i.a.a;
import com.facebook.i.a.b;
import com.facebook.i.a.c;
import com.google.common.a.fi;
import com.google.common.a.hq;
import com.google.common.a.ik;
import com.google.common.a.kl;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.WeakHashMap;

// Referenced classes of package com.facebook.i.a.a:
//            f, i, a, b, 
//            e, d

public class g
    implements f
{

    protected final Class a = getClass();
    private final e b;
    private final Map c = ik.a();
    private final Map d = ik.a();
    private final Map e = ik.a();
    private final fi f;
    private final b g;
    private final ClassLoader h;
    private final h i;
    private final boolean j;

    public g(e e1, fi fi1, c c1, String s, j j1, ClassLoader classloader, h h1, 
            boolean flag)
    {
        b = e1;
        f = (fi)Preconditions.checkNotNull(fi1);
        i = h1;
        j = flag;
        g = c1.a(s, j1, flag);
        e1 = new i(this, null);
        g.a(e1);
        g.a(0x3b9aca00, e1);
        g.a(0x3b9aca01, e1);
        h = classloader;
        a(g.b(), f);
    }

    static ClassLoader a(g g1)
    {
        return g1.h;
    }

    private void a(Uri uri, boolean flag)
    {
        Object obj = hq.a();
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = e.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (a(uri, (Uri)entry.getKey()))
            {
                ((List) (obj)).addAll(((WeakHashMap)entry.getValue()).keySet());
            }
        } while (true);
        break MISSING_BLOCK_LABEL_89;
        uri;
        this;
        JVM INSTR monitorexit ;
        throw uri;
        this;
        JVM INSTR monitorexit ;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((com.facebook.i.a.a.a)((Iterator) (obj)).next()).a(uri, flag, this)) { }
        return;
    }

    static void a(g g1, Uri uri, boolean flag)
    {
        g1.a(uri, flag);
    }

    static void a(g g1, a a1, Bundle bundle)
    {
        g1.b(a1, bundle);
    }

    private void a(a a1, Bundle bundle)
    {
        Uri uri = (Uri)bundle.getParcelable("__STATE_URI__");
        this;
        JVM INSTR monitorenter ;
        a1 = (Set)c.get(a1);
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1 = a1.iterator();
_L4:
        if (!a1.hasNext()) goto _L2; else goto _L1
_L1:
        com.facebook.i.a.a.b b1 = (com.facebook.i.a.a.b)a1.next();
        if (!a(uri, b1.c())) goto _L4; else goto _L3
_L3:
        b1.b(bundle);
        boolean flag = true;
_L6:
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            a(uri, false);
            return;
        } else
        {
            return;
        }
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(a a1, Set set)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator;
        c.put(a1, set);
        iterator = set.iterator();
_L1:
        com.facebook.i.a.a.b b1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_105;
        }
        b1 = (com.facebook.i.a.a.b)iterator.next();
        set = (SortedSet)d.get(b1.c());
        a1 = set;
        if (set != null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        a1 = kl.a(com.facebook.i.a.a.b.a);
        a1.add(b1);
        d.put(b1.c(), a1);
          goto _L1
        a1;
        throw a1;
        this;
        JVM INSTR monitorexit ;
    }

    private static boolean a(Uri uri, Uri uri1)
    {
        if (uri.getAuthority().equals(uri1.getAuthority())) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        uri = uri.getPathSegments();
        uri1 = uri1.getPathSegments();
        if (uri.size() >= uri1.size())
        {
            int k = 0;
label0:
            do
            {
label1:
                {
                    if (k >= uri1.size())
                    {
                        break label1;
                    }
                    if (!((String)uri.get(k)).equals(uri1.get(k)))
                    {
                        break label0;
                    }
                    k++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private Message b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Bundle bundle;
        ArrayList arraylist;
        ArrayList arraylist1;
        ArrayList arraylist2;
        obj = Message.obtain(null, 0x3b9aca00);
        bundle = ((Message) (obj)).getData();
        arraylist = hq.a();
        arraylist1 = hq.a();
        arraylist2 = hq.a();
        Bundle bundle1;
        for (Iterator iterator = f.iterator(); iterator.hasNext(); arraylist.add(bundle1))
        {
            com.facebook.i.a.a.b b1 = (com.facebook.i.a.a.b)iterator.next();
            arraylist1.add(b1.c());
            arraylist2.add(Integer.valueOf(b1.b()));
            bundle1 = new Bundle();
            b1.a(bundle1);
        }

        break MISSING_BLOCK_LABEL_115;
        obj;
        throw obj;
        bundle.putParcelableArrayList("__BASE_URIS__", arraylist1);
        bundle.putIntegerArrayList("__PRIORITIES__", arraylist2);
        bundle.putParcelableArrayList("__ROLES_DATA__", arraylist);
        this;
        JVM INSTR monitorexit ;
        return ((Message) (obj));
    }

    static b b(g g1)
    {
        return g1.g;
    }

    static void b(g g1, a a1, Bundle bundle)
    {
        g1.a(a1, bundle);
    }

    private void b(a a1, Bundle bundle)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        ArrayList arraylist1;
        java.util.HashSet hashset;
        arraylist = bundle.getParcelableArrayList("__BASE_URIS__");
        arraylist1 = bundle.getIntegerArrayList("__PRIORITIES__");
        bundle = bundle.getParcelableArrayList("__ROLES_DATA__");
        hashset = kl.a();
        int k = 0;
_L2:
        com.facebook.i.a.a.b b1;
        if (k >= arraylist.size())
        {
            break MISSING_BLOCK_LABEL_207;
        }
        b1 = b.a((Uri)arraylist.get(k), ((Integer)arraylist1.get(k)).intValue());
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        i.a(a.getSimpleName(), (new StringBuilder()).append("Can not create PeerStateRole for base uri ").append(arraylist.get(k)).append(" with priority ").append(arraylist1.get(k)).append(" in process ").append(g.b().c).toString());
        break MISSING_BLOCK_LABEL_217;
        b1.b((Bundle)bundle.get(k));
        hashset.add(b1);
        break MISSING_BLOCK_LABEL_217;
        a1;
        throw a1;
        a(a1, hashset);
        this;
        JVM INSTR monitorexit ;
        return;
        k++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static fi c(g g1)
    {
        return g1.f;
    }

    static Message d(g g1)
    {
        return g1.b();
    }

    static Map e(g g1)
    {
        return g1.c;
    }

    static Map f(g g1)
    {
        return g1.d;
    }

    static h g(g g1)
    {
        return g1.i;
    }

    public Object a(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1 = d.entrySet().iterator();
_L4:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = (java.util.Map.Entry)((Iterator) (obj1)).next();
        if (!a(uri, (Uri)((java.util.Map.Entry) (obj)).getKey())) goto _L4; else goto _L3
_L3:
        obj1 = new d();
        obj = ((SortedSet)((java.util.Map.Entry) (obj)).getValue()).iterator();
_L8:
        if (!((Iterator) (obj)).hasNext()) goto _L6; else goto _L5
_L5:
        ((com.facebook.i.a.a.b)((Iterator) (obj)).next()).a(uri, ((d) (obj1)));
        if (!((d) (obj1)).b) goto _L8; else goto _L7
_L7:
        uri = ((Uri) (((d) (obj1)).a));
_L10:
        this;
        JVM INSTR monitorexit ;
        return uri;
_L6:
        uri = ((Uri) (((d) (obj1)).a));
        continue; /* Loop/switch isn't completed */
_L2:
        uri = null;
        if (true) goto _L10; else goto _L9
_L9:
        uri;
        throw uri;
    }

    public void a()
    {
        g.a();
    }

    public void a(Uri uri, com.facebook.i.a.a.a a1)
    {
        this;
        JVM INSTR monitorenter ;
        WeakHashMap weakhashmap1 = (WeakHashMap)e.get(uri);
        WeakHashMap weakhashmap;
        weakhashmap = weakhashmap1;
        if (weakhashmap1 != null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        weakhashmap = new WeakHashMap();
        weakhashmap.put(a1, Boolean.valueOf(true));
        e.put(uri, weakhashmap);
        this;
        JVM INSTR monitorexit ;
        return;
        uri;
        throw uri;
    }

    public void a(Uri uri, Object obj)
    {
        if (f.isEmpty()) goto _L2; else goto _L1
_L1:
        Object obj1 = f.iterator();
_L6:
        if (!((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        com.facebook.i.a.a.b b1 = (com.facebook.i.a.a.b)((Iterator) (obj1)).next();
        if (!a(uri, b1.c())) goto _L6; else goto _L5
_L5:
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        obj1 = Message.obtain(null, 0x3b9aca01);
        Bundle bundle = ((Message) (obj1)).getData();
        this;
        JVM INSTR monitorenter ;
        boolean flag = b1.a(uri, obj);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        b1.a(bundle);
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            bundle.putParcelable("__STATE_URI__", uri);
            g.a(((Message) (obj1)));
            a(uri, true);
        }
        return;
        uri;
        this;
        JVM INSTR monitorexit ;
        throw uri;
_L2:
        throw new IllegalStateException((new StringBuilder()).append("Current process ").append(g.b().c).append(" is not a stateful peer.").toString());
_L4:
        b1 = null;
        if (true) goto _L5; else goto _L7
_L7:
    }

    public boolean b(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = d.containsKey(uri);
        this;
        JVM INSTR monitorexit ;
        return flag;
        uri;
        throw uri;
    }

    public void d()
    {
        if (!j)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        this;
        JVM INSTR monitorenter ;
        c.clear();
        d.clear();
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((com.facebook.i.a.a.b)iterator.next()).a()) { }
        break MISSING_BLOCK_LABEL_64;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        a(g.b(), f);
        this;
        JVM INSTR monitorexit ;
        g.d();
    }
}

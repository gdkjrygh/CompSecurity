// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import android.content.BroadcastReceiver;
import android.content.ContentProviderClient;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.content.OperationApplicationException;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.common.e.h;
import com.facebook.common.executors.a;
import com.facebook.common.w.k;
import com.facebook.common.w.q;
import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.a.fi;
import com.google.common.a.hq;
import com.google.common.a.hw;
import com.google.common.a.hx;
import com.google.common.a.ik;
import com.google.common.a.kl;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.WeakHashMap;

// Referenced classes of package com.facebook.prefs.shared:
//            d, k, l, ae, 
//            h, n, f, af, 
//            o, e, p, m

public class j
    implements d
{

    private static final Class a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    private static final String f[] = {
        "key", "type", "value"
    };
    private static final Object y = new Object();
    private final Context g;
    private final ContentResolver h;
    private final a i;
    private final com.facebook.prefs.shared.h j;
    private final h k;
    private SharedPreferences l;
    private final TreeMap m = ik.d();
    private final Map n = ik.a();
    private final Set o = kl.a();
    private final Set p = kl.a();
    private final Map q = new WeakHashMap();
    private final List r = hq.a();
    private boolean s;
    private boolean t;
    private final Object u = new Object();
    private boolean v;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener w = new com.facebook.prefs.shared.k(this);
    private final BroadcastReceiver x = new l(this);

    public j(Context context, ContentResolver contentresolver, a a1, SharedPreferences sharedpreferences, com.facebook.prefs.shared.h h1, h h2)
    {
        e e1 = com.facebook.debug.d.e.a("FbSharedPreferences.ctor");
        g = context;
        h = contentresolver;
        i = a1;
        j = h1;
        k = h2;
        l = sharedpreferences;
        e1.a();
    }

    private ev a(Map map, Map map1)
    {
        map = ik.a(map, map1);
        Object obj1 = map.a();
        Object obj = map.b();
        map1 = map.d();
        map = ev.k();
        for (obj1 = ((Map) (obj1)).keySet().iterator(); ((Iterator) (obj1)).hasNext(); map.b((ae)((Iterator) (obj1)).next(), y)) { }
        java.util.Map.Entry entry1;
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); map.b(entry1.getKey(), entry1.getValue()))
        {
            entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

        java.util.Map.Entry entry;
        for (map1 = map1.entrySet().iterator(); map1.hasNext(); map.b(entry.getKey(), ((hx)entry.getValue()).b()))
        {
            entry = (java.util.Map.Entry)map1.next();
        }

        return map.b();
    }

    static List a(j j1)
    {
        return j1.r;
    }

    private void a(android.content.SharedPreferences.Editor editor, Map map)
    {
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)map.next();
            ae ae1 = (ae)((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            if (obj == y)
            {
                editor.remove(ae1.a());
            } else
            if (obj != null)
            {
                if (obj instanceof String)
                {
                    editor.putString(ae1.a(), (String)obj);
                } else
                if (obj instanceof Boolean)
                {
                    editor.putBoolean(ae1.a(), ((Boolean)obj).booleanValue());
                } else
                if (obj instanceof Integer)
                {
                    editor.putInt(ae1.a(), ((Integer)obj).intValue());
                } else
                if (obj instanceof Long)
                {
                    editor.putLong(ae1.a(), ((Long)obj).longValue());
                } else
                if (obj instanceof Float)
                {
                    editor.putFloat(ae1.a(), ((Float)obj).floatValue());
                } else
                if (!(obj instanceof Double));
            }
        } while (true);
    }

    private void a(Cursor cursor, Set set, Map map)
    {
        int i1 = cursor.getColumnIndex("key");
        int j1 = cursor.getColumnIndex("type");
        int k1 = cursor.getColumnIndex("value");
        do
        {
            if (!cursor.moveToNext())
            {
                break;
            }
            set = cursor.getString(i1);
            switch (cursor.getInt(j1))
            {
            case 1: // '\001'
                map.put(new ae(set), cursor.getString(k1));
                break;

            case 2: // '\002'
                set = new ae(set);
                boolean flag;
                if (cursor.getInt(k1) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                map.put(set, Boolean.valueOf(flag));
                break;

            case 3: // '\003'
                map.put(new ae(set), Integer.valueOf(cursor.getInt(k1)));
                break;

            case 4: // '\004'
                map.put(new ae(set), Long.valueOf(cursor.getLong(k1)));
                break;

            case 5: // '\005'
                map.put(new ae(set), Float.valueOf(cursor.getFloat(k1)));
                break;

            case 6: // '\006'
                map.put(new ae(set), Double.valueOf(cursor.getDouble(k1)));
                break;
            }
        } while (true);
    }

    static void a(j j1, ae ae1)
    {
        j1.g(ae1);
    }

    static void a(j j1, String s1)
    {
        j1.a(s1);
    }

    static void a(j j1, List list)
    {
        j1.a(list);
    }

    static void a(j j1, Map map, boolean flag)
    {
        j1.a(map, flag);
    }

    private void a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        p.add(s1);
        this;
        JVM INSTR monitorexit ;
        i();
        return;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
    }

    private void a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        o.addAll(list);
        this;
        JVM INSTR monitorexit ;
        i();
        return;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
    }

    private void a(Map map)
    {
        int k1 = 0;
        if (!map.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ArrayList arraylist;
        int j1;
        arraylist = hq.a();
        ContentValues contentvalues = new ContentValues();
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            Object obj = (java.util.Map.Entry)map.next();
            ae ae1 = (ae)((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            Uri uri = j.b();
            if (obj == y)
            {
                arraylist.add(ContentProviderOperation.newDelete(Uri.withAppendedPath(uri, (new StringBuilder()).append("key/").append(Uri.encode(ae1.a())).toString())).build());
            } else
            {
                contentvalues.put("key", ae1.a());
                if (obj instanceof String)
                {
                    contentvalues.put("type", Integer.valueOf(1));
                    contentvalues.put("value", (String)obj);
                } else
                if (obj instanceof Boolean)
                {
                    contentvalues.put("type", Integer.valueOf(2));
                    int i1;
                    if (((Boolean)obj).booleanValue())
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    contentvalues.put("value", Integer.valueOf(i1));
                } else
                if (obj instanceof Integer)
                {
                    contentvalues.put("type", Integer.valueOf(3));
                    contentvalues.put("value", (Integer)obj);
                } else
                if (obj instanceof Long)
                {
                    contentvalues.put("type", Integer.valueOf(4));
                    contentvalues.put("value", (Long)obj);
                } else
                if (obj instanceof Float)
                {
                    contentvalues.put("type", Integer.valueOf(5));
                    contentvalues.put("value", (Float)obj);
                } else
                if (obj instanceof Double)
                {
                    contentvalues.put("type", Integer.valueOf(6));
                    contentvalues.put("value", (Double)obj);
                }
                arraylist.add(ContentProviderOperation.newInsert(uri).withValues(contentvalues).build());
            }
        }

        map = null;
        j1 = k1;
_L4:
        if (j1 >= 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        h.applyBatch(j.a(), arraylist);
        map = null;
        if (map == null) goto _L1; else goto _L3
_L3:
        throw Throwables.propagate(map);
        map;
        throw Throwables.propagate(map);
        map;
        Parcel parcel = Parcel.obtain();
        parcel.writeList(arraylist);
        k1 = parcel.dataSize();
        parcel.recycle();
        k.a(d, (new StringBuilder()).append("Attempt ").append(j1).append(" to apply changes failed. Operations size: ").append(k1).toString(), map);
        j1++;
          goto _L4
        map;
        parcel.recycle();
        throw map;
    }

    private void a(Map map, boolean flag)
    {
        if (map.isEmpty())
        {
            return;
        }
        ArrayList arraylist = hq.c(map.size());
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = map.entrySet().iterator();
_L2:
        ae ae1;
        Object obj;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_166;
            }
            obj = (java.util.Map.Entry)iterator.next();
            ae1 = (ae)((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            if (obj != y)
            {
                break MISSING_BLOCK_LABEL_125;
            }
            if (m.containsKey(ae1))
            {
                arraylist.add(ae1);
            }
            m.remove(ae1);
        } while (true);
        map;
        this;
        JVM INSTR monitorexit ;
        throw map;
        if (!Objects.equal(m.get(ae1), obj))
        {
            arraylist.add(ae1);
        }
        m.put(ae1, obj);
        if (true) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        n.putAll(map);
        i();
        this;
        JVM INSTR monitorexit ;
        i.b(new n(this, arraylist));
        return;
    }

    private void a(Set set, Map map)
    {
        Object obj2 = null;
        Object obj;
        Object obj1;
        Cursor cursor;
        RemoteException remoteexception;
        ContentProviderClient contentproviderclient;
        int i1;
        if (set != null)
        {
            obj1 = (new StringBuilder()).append("key IN ").append(com.facebook.common.w.k.b(set)).toString();
        } else
        {
            obj1 = null;
        }
        contentproviderclient = h.acquireContentProviderClient(j.b());
        if (contentproviderclient == null)
        {
            k.b(c, "Failed to acquire content provider client.");
            return;
        }
        obj = obj2;
        cursor = contentproviderclient.query(j.b(), f, ((String) (obj1)), null, null);
        obj1 = cursor;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        obj = obj1;
        k.b(e, "Null cursor.");
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        contentproviderclient.release();
        return;
        remoteexception;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_270;
        }
        obj = obj2;
        set = Parcel.obtain();
        set.writeString(((String) (obj1)));
        i1 = set.dataSize();
        obj = obj2;
        set.recycle();
        obj = obj2;
        k.a(d, (new StringBuilder()).append("Failed to perform query. Where clause size: ").append(i1).toString(), remoteexception);
        obj = obj2;
        a(((Set) (null)), map);
        if (false)
        {
            throw new NullPointerException();
        } else
        {
            contentproviderclient.release();
            return;
        }
        map;
        obj = obj2;
        set.recycle();
        obj = obj2;
        throw map;
        set;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        contentproviderclient.release();
        throw set;
        obj = obj2;
        k.b(d, "Failed to query.", remoteexception);
        if (false)
        {
            throw new NullPointerException();
        } else
        {
            contentproviderclient.release();
            return;
        }
        obj = obj1;
        a(((Cursor) (obj1)), set, map);
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        contentproviderclient.release();
        return;
    }

    static boolean a(j j1, boolean flag)
    {
        j1.t = flag;
        return flag;
    }

    private Map b(Map map)
    {
        java.util.HashMap hashmap = ik.a();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); hashmap.put(new ae((String)entry.getKey()), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return hashmap;
    }

    static void b(j j1)
    {
        j1.j();
    }

    static void b(j j1, List list)
    {
        j1.b(list);
    }

    private void b(List list)
    {
        this;
        JVM INSTR monitorenter ;
        fi fi1 = fi.a(q.keySet());
        this;
        JVM INSTR monitorexit ;
        for (list = list.iterator(); list.hasNext();)
        {
            ae ae1 = (ae)list.next();
            Iterator iterator = fi1.iterator();
            while (iterator.hasNext()) 
            {
                f f1 = (f)iterator.next();
                if (f1 != null)
                {
                    f1.a(this, ae1);
                }
            }
        }

        break MISSING_BLOCK_LABEL_95;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
    }

    static Class f()
    {
        return a;
    }

    static Object g()
    {
        return y;
    }

    private void g(ae ae1)
    {
        k.a(b, (new StringBuilder()).append("Wrote null pref to ").append(ae1).toString());
    }

    private SortedMap h(ae ae1)
    {
        this;
        JVM INSTR monitorenter ;
        o();
        ae1 = com.facebook.prefs.shared.af.a(m, ae1);
        this;
        JVM INSTR monitorexit ;
        return ae1;
        ae1;
        throw ae1;
    }

    private void h()
    {
        a(((Set) (null)), m);
    }

    private void i()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = t;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        i.c(new o(this));
        t = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void j()
    {
        synchronized (u)
        {
            if (!v)
            {
                n();
                v = true;
                l.registerOnSharedPreferenceChangeListener(w);
            }
            ev ev1 = k();
            a(ev1);
            ev ev2 = l();
            a(ev2, false);
            android.content.SharedPreferences.Editor editor = l.edit();
            a(editor, ev1);
            a(editor, ev2);
            editor.commit();
            a(m(), true);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private ev k()
    {
        this;
        JVM INSTR monitorenter ;
        if (!n.isEmpty()) goto _L2; else goto _L1
_L1:
        ev ev1 = ev.j();
_L4:
        this;
        JVM INSTR monitorexit ;
        return ev1;
_L2:
        ev1 = ev.a(n);
        n.clear();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private ev l()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (!o.isEmpty())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        obj = ev.j();
        this;
        JVM INSTR monitorexit ;
        return ((ev) (obj));
        java.util.HashMap hashmap;
        Iterator iterator;
        obj = kl.a(o);
        o.clear();
        hashmap = ik.a();
        iterator = ((Set) (obj)).iterator();
_L2:
        ae ae1;
        Object obj1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_112;
            }
            ae1 = new ae((String)iterator.next());
            obj1 = m.get(ae1);
        } while (obj1 == null);
        hashmap.put(ae1, obj1);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        this;
        JVM INSTR monitorexit ;
        java.util.HashMap hashmap1 = ik.a();
        a(((Set) (obj)), hashmap1);
        return a(hashmap, hashmap1);
    }

    private ev m()
    {
        this;
        JVM INSTR monitorenter ;
        if (!p.isEmpty()) goto _L2; else goto _L1
_L1:
        Object obj = ev.j();
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((ev) (obj));
_L2:
        Map map;
        Object obj1;
        obj1 = kl.a(p);
        p.clear();
        obj = ev.k();
        map = l.getAll();
        obj1 = ((Set) (obj1)).iterator();
_L3:
        ae ae1;
        Object obj2;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_171;
            }
            obj2 = (String)((Iterator) (obj1)).next();
            ae1 = new ae(((String) (obj2)));
            if (map.containsKey(obj2))
            {
                break MISSING_BLOCK_LABEL_132;
            }
            if (m.containsKey(ae1))
            {
                ((ew) (obj)).b(ae1, y);
            }
        } while (true);
        obj;
        throw obj;
        obj2 = map.get(obj2);
        if (!Objects.equal(m.get(ae1), obj2))
        {
            ((ew) (obj)).b(ae1, obj2);
        }
          goto _L3
        obj = ((ew) (obj)).b();
          goto _L4
    }

    private void n()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = ik.a(m);
        this;
        JVM INSTR monitorexit ;
        obj = a(b(l.getAll()), ((Map) (obj)));
        android.content.SharedPreferences.Editor editor = l.edit();
        a(editor, ((Map) (obj)));
        editor.commit();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void o()
    {
        this;
        JVM INSTR monitorenter ;
        Preconditions.checkState(s, "FbSharedPreferences used before initialized");
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public float a(ae ae1, float f1)
    {
        this;
        JVM INSTR monitorenter ;
        o();
        ae1 = (Float)m.get(ae1);
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        f1 = ae1.floatValue();
        this;
        JVM INSTR monitorexit ;
        return f1;
        ae1;
        throw ae1;
    }

    public int a(ae ae1, int i1)
    {
        this;
        JVM INSTR monitorenter ;
        o();
        ae1 = (Integer)m.get(ae1);
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        i1 = ae1.intValue();
        this;
        JVM INSTR monitorexit ;
        return i1;
        ae1;
        throw ae1;
    }

    public long a(ae ae1, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        o();
        ae1 = (Long)m.get(ae1);
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        l1 = ae1.longValue();
        this;
        JVM INSTR monitorexit ;
        return l1;
        ae1;
        throw ae1;
    }

    public String a(ae ae1, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        o();
        ae1 = (String)m.get(ae1);
        if (ae1 == null)
        {
            ae1 = s1;
        }
        this;
        JVM INSTR monitorexit ;
        return ae1;
        ae1;
        throw ae1;
    }

    public void a(f f1)
    {
        this;
        JVM INSTR monitorenter ;
        q.put(f1, Integer.valueOf(1));
        this;
        JVM INSTR monitorexit ;
        return;
        f1;
        throw f1;
    }

    public void a(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        if (!s)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        i.d(runnable);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        r.add(runnable);
        if (true) goto _L2; else goto _L1
_L1:
        runnable;
        this;
        JVM INSTR monitorexit ;
        throw runnable;
    }

    public void a(Set set)
    {
        com.facebook.prefs.shared.e e1 = b();
        android.content.SharedPreferences.Editor editor = l.edit();
        ae ae1;
        for (set = set.iterator(); set.hasNext(); editor.remove(ae1.a()))
        {
            ae1 = (ae)set.next();
            e1.b(ae1);
        }

        e1.a();
        editor.commit();
    }

    public boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = s;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean a(ae ae1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        o();
        flag = m.containsKey(ae1);
        this;
        JVM INSTR monitorexit ;
        return flag;
        ae1;
        throw ae1;
    }

    public boolean a(ae ae1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        o();
        ae1 = (Boolean)m.get(ae1);
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        flag = ae1.booleanValue();
        this;
        JVM INSTR monitorexit ;
        return flag;
        ae1;
        throw ae1;
    }

    public q b(ae ae1)
    {
        this;
        JVM INSTR monitorenter ;
        o();
        ae1 = (Boolean)m.get(ae1);
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = com.facebook.common.w.q.valueOf(ae1);
_L4:
        this;
        JVM INSTR monitorexit ;
        return ae1;
_L2:
        ae1 = q.UNSET;
        if (true) goto _L4; else goto _L3
_L3:
        ae1;
        throw ae1;
    }

    public com.facebook.prefs.shared.e b()
    {
        o();
        return new p(this);
    }

    public void b(f f1)
    {
        this;
        JVM INSTR monitorenter ;
        q.remove(f1);
        this;
        JVM INSTR monitorexit ;
        return;
        f1;
        throw f1;
    }

    public Object c(ae ae1)
    {
        this;
        JVM INSTR monitorenter ;
        o();
        ae1 = ((ae) (m.get(ae1)));
        this;
        JVM INSTR monitorexit ;
        return ae1;
        ae1;
        throw ae1;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        for (; !a(); wait()) { }
        break MISSING_BLOCK_LABEL_21;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public SortedSet d(ae ae1)
    {
        this;
        JVM INSTR monitorenter ;
        ae1 = kl.b(h(ae1).keySet());
        this;
        JVM INSTR monitorexit ;
        return ae1;
        ae1;
        throw ae1;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        e e1;
        e e2;
        IntentFilter intentfilter;
        String s1;
        e1 = com.facebook.debug.d.e.a("FbSharedPreferences.initialize");
        s = true;
        e2 = com.facebook.debug.d.e.a("#register");
        intentfilter = new IntentFilter(j.c());
        s1 = j.e();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        g.registerReceiver(x, intentfilter, s1, null);
_L1:
        e2.a();
        e2 = com.facebook.debug.d.e.a("#loadInitialValues");
        h();
        e2.a();
        i();
        e1.a();
        i.b(new m(this));
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        g.registerReceiver(x, intentfilter);
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    public SortedMap e(ae ae1)
    {
        return f(ae1);
    }

    public void e()
    {
        o();
        java.util.Map.Entry entry;
        for (Iterator iterator = m.entrySet().iterator(); iterator.hasNext(); com.facebook.debug.log.b.a(a, (new StringBuilder()).append("Pref: ").append(entry.getKey()).append(": ").append(entry.getValue()).toString()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

    }

    public TreeMap f(ae ae1)
    {
        this;
        JVM INSTR monitorenter ;
        ae1 = ik.a(h(ae1));
        this;
        JVM INSTR monitorexit ;
        return ae1;
        ae1;
        throw ae1;
    }

    static 
    {
        a = com/facebook/prefs/shared/d;
        b = (new StringBuilder()).append(a.getSimpleName()).append("_NULL_PREF").toString();
        c = (new StringBuilder()).append(a.getSimpleName()).append("_NULL_PROVIDER").toString();
        d = (new StringBuilder()).append(a.getSimpleName()).append("_PROVIDER_REMOTE_EXCEPTION").toString();
        e = (new StringBuilder()).append(a.getSimpleName()).append("_NULL_CURSOR").toString();
    }
}

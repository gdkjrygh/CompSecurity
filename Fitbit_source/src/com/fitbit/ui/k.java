// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.DataSetObserver;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.widget.ListAdapter;
import com.fitbit.data.bl.an;
import com.fitbit.util.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public abstract class k
    implements ListAdapter
{
    public static class a
    {

        private static final String b = "order";
        private static final String c = "enabled";
        private static final String d = "hidden";
        private static final Map e = new HashMap();
        public List a;
        private final Set f = new HashSet();
        private final Set g = new HashSet();
        private final Handler h = new Handler(Looper.getMainLooper());
        private final Context i;
        private final String j;
        private final Class k;
        private final List l;
        private final SparseArray m = new SparseArray();
        private final List n = new LinkedList();
        private final List o = new LinkedList();
        private final Set p = new HashSet();
        private final Set q = new HashSet();
        private final List r;
        private final List s;
        private final Set t;
        private final Set u;
        private Runnable v;

        public static a a(Context context, String s1, Class class1)
        {
            a a1 = (a)e.get(s1);
            Object obj = a1;
            if (a1 == null)
            {
                context = new a(context, s1, class1);
                obj = context;
                if (an.a().b() != null)
                {
                    e.put(s1, context);
                    obj = context;
                }
            }
            return ((a) (obj));
        }

        public static void a(Context context, String s1)
        {
            context.getSharedPreferences(s1, 0).edit().clear().commit();
            e.remove(s1);
        }

        static void a(a a1)
        {
            a1.i();
        }

        private void a(List list)
        {
            n.clear();
            m.clear();
            for (list = list.listIterator(); list.hasNext();)
            {
                int i1 = list.nextIndex();
                Enum enum = (Enum)list.next();
                if (((b)enum).b())
                {
                    n.add(enum);
                } else
                {
                    m.put(i1, enum);
                }
            }

        }

        private boolean a(Set set, String s1)
        {
            boolean flag2 = false;
            if (s1 == null) goto _L2; else goto _L1
_L1:
            boolean flag;
            int i1;
            int j1;
            set.clear();
            s1 = s1.split(",");
            j1 = s1.length;
            i1 = 0;
            flag = false;
_L4:
            String s2;
            if (i1 >= j1)
            {
                break; /* Loop/switch isn't completed */
            }
            s2 = s1[i1];
            flag2 = set.add(Enum.valueOf(k, s2));
            boolean flag1;
            if (!flag2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag = flag1 | flag;
_L5:
            i1++;
            if (true) goto _L4; else goto _L3
            IllegalArgumentException illegalargumentexception;
            illegalargumentexception;
            flag = true;
              goto _L5
_L3:
            flag2 = flag | set.isEmpty();
_L7:
            return flag2;
_L2:
            if (set.size() > 0)
            {
                set.clear();
                return false;
            }
            if (true) goto _L7; else goto _L6
_L6:
        }

        static void b(a a1)
        {
            a1.j();
        }

        static Set c(a a1)
        {
            return a1.f;
        }

        static Set d(a a1)
        {
            return a1.g;
        }

        static List e(a a1)
        {
            return a1.l;
        }

        private void h()
        {
            SharedPreferences sharedpreferences;
            LinkedList linkedlist;
            int i1;
            boolean flag;
            flag = true;
            a(l);
            sharedpreferences = i.getSharedPreferences(j, 0);
            com.fitbit.e.a.a("RelocatableListAdapter", "load order = %s, load enabled = %s, load hidden = %s", new Object[] {
                sharedpreferences.getString("order", "<nothing>"), sharedpreferences.getString("enabled", "<nothing>"), sharedpreferences.getString("hidden", "<nothing>")
            });
            String s1 = sharedpreferences.getString("order", null);
            String as[];
            Object obj1;
            int j1;
            int k1;
            if (s1 == null)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            i1 |= 0;
            if (s1 == null)
            {
                break MISSING_BLOCK_LABEL_363;
            }
            linkedlist = new LinkedList();
            as = s1.split(",");
            k1 = as.length;
            j1 = 0;
_L6:
label0:
            {
                if (j1 >= k1)
                {
                    break label0;
                }
                obj1 = as[j1];
                try
                {
                    obj1 = Enum.valueOf(k, ((String) (obj1)));
                    if (!((b)obj1).b())
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    linkedlist.add(obj1);
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    i1 = 1;
                }
            }
_L4:
            j1++;
            if (true) goto _L2; else goto _L1
_L2:
            break MISSING_BLOCK_LABEL_128;
_L1:
            i1 = 1;
            if (true) goto _L4; else goto _L3
_L3:
            if (true) goto _L6; else goto _L5
_L5:
            if (n.size() != linkedlist.size())
            {
                Object obj = new HashSet(n);
                ((Set) (obj)).removeAll(linkedlist);
                if (k.equals(com/fitbit/home/ui/DashboardFragment$Tile))
                {
                    obj = ((Set) (obj)).iterator();
                    do
                    {
                        i1 = ((flag) ? 1 : 0);
                        if (!((Iterator) (obj)).hasNext())
                        {
                            break;
                        }
                        Enum enum = (Enum)((Iterator) (obj)).next();
                        i1 = enum.ordinal() - 2;
                        if (i1 < linkedlist.size())
                        {
                            linkedlist.add(i1, enum);
                        } else
                        {
                            linkedlist.add(enum);
                        }
                    } while (true);
                } else
                {
                    linkedlist.addAll(0, ((Collection) (obj)));
                    i1 = ((flag) ? 1 : 0);
                }
            }
            n.clear();
            n.addAll(linkedlist);
            boolean flag1 = a(p, sharedpreferences.getString("enabled", null));
            boolean flag2 = a(q, sharedpreferences.getString("hidden", null));
            c c1;
            for (Iterator iterator = g.iterator(); iterator.hasNext(); c1.a(this))
            {
                c1 = (c)iterator.next();
                c1.b(this);
            }

            if ((flag2 | (flag1 | i1)) != 0)
            {
                i();
            }
            return;
        }

        private void i()
        {
            if (an.a().b() == null)
            {
                return;
            }
            SharedPreferences sharedpreferences = i.getSharedPreferences(j, 0);
            android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putString("order", com.fitbit.util.d.a(",", n));
            if (q.size() != 0)
            {
                editor.putString("hidden", com.fitbit.util.d.a(",", q));
            } else
            {
                editor.remove("hidden");
            }
            if (p.size() != 0)
            {
                editor.putString("enabled", com.fitbit.util.d.a(",", p));
            } else
            {
                editor.remove("enabled");
            }
            editor.commit();
            com.fitbit.e.a.a("RelocatableListAdapter", "saved order = %s", new Object[] {
                sharedpreferences.getString("order", "<nothing>")
            });
            com.fitbit.e.a.a("RelocatableListAdapter", "saved enabled = %s", new Object[] {
                sharedpreferences.getString("enabled", "<nothing>")
            });
            com.fitbit.e.a.a("RelocatableListAdapter", "saved hidden = %s", new Object[] {
                sharedpreferences.getString("hidden", "<nothing>")
            });
        }

        private void j()
        {
            List list = k();
            list.retainAll(p);
            list.removeAll(q);
            a = Collections.unmodifiableList(list);
            o.clear();
            o.addAll(n);
            o.retainAll(p);
            o.removeAll(q);
        }

        private List k()
        {
            int i1 = m.size();
            int j1 = n.size() + i1;
            ArrayList arraylist = new ArrayList(j1);
            Iterator iterator = n.iterator();
            i1 = 0;
            while (i1 < j1) 
            {
                int k1 = m.indexOfKey(i1);
                if (k1 >= 0)
                {
                    arraylist.add(m.valueAt(k1));
                } else
                if (iterator.hasNext())
                {
                    arraylist.add(iterator.next());
                } else
                {
                    throw new IllegalStateException("inconsistent data");
                }
                i1++;
            }
            return arraylist;
        }

        private void l()
        {
            h.removeCallbacks(v);
            h.post(v);
        }

        public a a()
        {
            if (q.size() > 0)
            {
                q.clear();
                for (Iterator iterator = g.iterator(); iterator.hasNext(); ((c)iterator.next()).a(this)) { }
                l();
            }
            return this;
        }

        public a a(Enum enum, Enum enum1)
        {
            if (enum != enum1)
            {
                n.remove(enum);
                n.add(n.indexOf(enum1), enum);
                l();
            }
            return this;
        }

        public a a(Collection collection)
        {
            if (q.removeAll(collection))
            {
                for (collection = g.iterator(); collection.hasNext(); ((c)collection.next()).a(this)) { }
                l();
            }
            return this;
        }

        public a a(boolean flag, Collection collection)
        {
            if (flag)
            {
                c(collection);
                return this;
            } else
            {
                d(collection);
                return this;
            }
        }

        public transient a a(boolean flag, Enum aenum[])
        {
            a(flag, ((Collection) (Arrays.asList(aenum))));
            return this;
        }

        public transient a a(Enum aenum[])
        {
            a(((Collection) (Arrays.asList(aenum))));
            return this;
        }

        public void a(c c1)
        {
            g.add(c1);
        }

        public boolean a(Enum enum)
        {
            return p.contains(enum) && !q.contains(enum);
        }

        public a b()
        {
            a(l);
            q.clear();
            for (Iterator iterator = g.iterator(); iterator.hasNext(); ((c)iterator.next()).a(this)) { }
            l();
            return this;
        }

        public a b(Enum enum, Enum enum1)
        {
            if (enum != enum1)
            {
                n.remove(enum);
                n.add(n.indexOf(enum1) + 1, enum);
                l();
            }
            return this;
        }

        public a b(Collection collection)
        {
            if (q.addAll(collection))
            {
                for (collection = g.iterator(); collection.hasNext(); ((c)collection.next()).a(this)) { }
                l();
            }
            return this;
        }

        public transient a b(Enum aenum[])
        {
            b(((Collection) (Arrays.asList(aenum))));
            return this;
        }

        public void b(c c1)
        {
            g.remove(c1);
        }

        public boolean b(Enum enum)
        {
            return q.contains(enum);
        }

        public a c(Collection collection)
        {
            if (p.addAll(collection))
            {
                for (collection = g.iterator(); collection.hasNext(); ((c)collection.next()).b(this)) { }
                l();
            }
            return this;
        }

        public transient a c(Enum aenum[])
        {
            c(((Collection) (Arrays.asList(aenum))));
            return this;
        }

        public List c()
        {
            return l;
        }

        public boolean c(Enum enum)
        {
            return p.contains(enum);
        }

        public a d(Collection collection)
        {
            if (p.removeAll(collection))
            {
                for (collection = g.iterator(); collection.hasNext(); ((c)collection.next()).b(this)) { }
                l();
            }
            return this;
        }

        public transient a d(Enum aenum[])
        {
            d(((Collection) (Arrays.asList(aenum))));
            return this;
        }

        public Set d()
        {
            return u;
        }

        public boolean d(Enum enum)
        {
            return o.indexOf(enum) > 0;
        }

        public a e(Enum enum)
        {
            int i1 = o.indexOf(enum);
            if (i1 > 0)
            {
                a(enum, (Enum)o.get(i1 - 1));
            }
            return this;
        }

        public Set e()
        {
            return t;
        }

        public a f(Enum enum)
        {
            a(enum, (Enum)o.get(0));
            return this;
        }

        public List f()
        {
            return r;
        }

        public List g()
        {
            return s;
        }

        public boolean g(Enum enum)
        {
            int i1 = o.indexOf(enum);
            return i1 >= 0 && i1 < o.size() - 1;
        }

        public a h(Enum enum)
        {
            int i1 = o.indexOf(enum);
            if (i1 >= 0 && i1 < o.size() - 1)
            {
                b(enum, (Enum)o.get(i1 + 1));
            }
            return this;
        }

        public a i(Enum enum)
        {
            b(enum, (Enum)o.get(o.size() - 1));
            return this;
        }


        private a(Context context, String s1, Class class1)
        {
            r = Collections.unmodifiableList(n);
            s = Collections.unmodifiableList(o);
            t = Collections.unmodifiableSet(p);
            u = Collections.unmodifiableSet(q);
            a = Collections.emptyList();
            v = new _cls1(this);
            i = context.getApplicationContext();
            j = s1;
            k = class1;
            l = Collections.unmodifiableList(Arrays.asList(class1.getEnumConstants()));
            h();
            j();
        }
    }

    public static interface b
    {

        public abstract boolean b();
    }

    public static interface c
    {

        public abstract void a(a a1);

        public abstract void a(a a1, Set set, Set set1);

        public abstract void b(a a1);
    }


    private static final String a = "RelocatableListAdapter";
    private final a b;

    public k(Context context, String s, Class class1)
    {
        b = a.a(context, s, class1);
    }

    public int a(Enum enum)
    {
        return b.a.indexOf(enum);
    }

    public Enum a(int i)
    {
        return (Enum)b.a.get(i);
    }

    public Enum a(long l)
    {
        return (Enum)a.e(b).get((int)l);
    }

    public boolean areAllItemsEnabled()
    {
        return true;
    }

    public a b()
    {
        return b;
    }

    public int getCount()
    {
        return b.a.size();
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return (long)a(i).ordinal();
    }

    public int getItemViewType(int i)
    {
        return a(i).ordinal();
    }

    public int getViewTypeCount()
    {
        return a.e(b).size();
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public boolean isEmpty()
    {
        return b.a.isEmpty();
    }

    public boolean isEnabled(int i)
    {
        return true;
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        a.c(b).add(datasetobserver);
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        a.c(b).remove(datasetobserver);
    }

    // Unreferenced inner class com/fitbit/ui/k$a$1

/* anonymous class */
    class a._cls1
        implements Runnable
    {

        final a a;

        public void run()
        {
            String s = null;
            a.a(a);
            HashSet hashset = new HashSet(a.a);
            a.b(a);
            HashSet hashset1 = new HashSet(a.a);
            for (Iterator iterator = a.c(a).iterator(); iterator.hasNext(); ((DataSetObserver)iterator.next()).onChanged()) { }
            hashset1.removeAll(hashset);
            hashset.removeAll(a.a);
            if (hashset1.size() > 0 || hashset.size() > 0)
            {
                Object obj;
                if (hashset1.size() > 0)
                {
                    obj = d.a(",", hashset1);
                } else
                {
                    obj = null;
                }
                if (hashset.size() > 0)
                {
                    s = d.a(",", hashset);
                }
                com.fitbit.e.a.a("RelocatableListAdapter", "shown = %s; hidden = %s", new Object[] {
                    obj, s
                });
                for (obj = com.fitbit.ui.a.d(a).iterator(); ((Iterator) (obj)).hasNext(); ((c)((Iterator) (obj)).next()).a(a, hashset1, hashset)) { }
            }
        }

            
            {
                a = a1;
                super();
            }
    }

}

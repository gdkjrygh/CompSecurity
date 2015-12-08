// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class bo extends md
{

    private final ay b;
    private bp c;
    private ArrayList d;
    private ArrayList e;
    private am f;

    public bo(ay ay1)
    {
        c = null;
        d = new ArrayList();
        e = new ArrayList();
        f = null;
        b = ay1;
    }

    public abstract am a(int i);

    public Object a(ViewGroup viewgroup, int i)
    {
        if (e.size() > i)
        {
            am am1 = (am)e.get(i);
            if (am1 != null)
            {
                return am1;
            }
        }
        if (c == null)
        {
            c = b.a();
        }
        am am2 = a(i);
        if (d.size() > i)
        {
            ap ap1 = (ap)d.get(i);
            if (ap1 != null)
            {
                am2.a(ap1);
            }
        }
        for (; e.size() <= i; e.add(null)) { }
        am2.e(false);
        am2.g_(false);
        e.set(i, am2);
        c.a(viewgroup.getId(), am2);
        return am2;
    }

    public final void a(Parcelable parcelable, ClassLoader classloader)
    {
        if (parcelable != null)
        {
            parcelable = (Bundle)parcelable;
            parcelable.setClassLoader(classloader);
            classloader = parcelable.getParcelableArray("states");
            d.clear();
            e.clear();
            if (classloader != null)
            {
                for (int i = 0; i < classloader.length; i++)
                {
                    d.add((ap)classloader[i]);
                }

            }
            classloader = parcelable.keySet().iterator();
            do
            {
                if (!classloader.hasNext())
                {
                    break;
                }
                String s = (String)classloader.next();
                if (s.startsWith("f"))
                {
                    int j = Integer.parseInt(s.substring(1));
                    am am1 = b.a(parcelable, s);
                    if (am1 != null)
                    {
                        for (; e.size() <= j; e.add(null)) { }
                        am1.e(false);
                        e.set(j, am1);
                    } else
                    {
                        Log.w("FragmentStatePagerAdapter", (new StringBuilder("Bad fragment at key ")).append(s).toString());
                    }
                }
            } while (true);
        }
    }

    public void a(ViewGroup viewgroup)
    {
        if (c != null)
        {
            c.c();
            c = null;
            b.b();
        }
    }

    public void a(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup = (am)obj;
        if (c == null)
        {
            c = b.a();
        }
        for (; d.size() <= i; d.add(null)) { }
        d.set(i, b.a(viewgroup));
        e.set(i, null);
        c.a(viewgroup);
    }

    public final boolean a(View view, Object obj)
    {
        return ((am)obj).R == view;
    }

    public final Parcelable af_()
    {
        Object obj = null;
        if (d.size() > 0)
        {
            obj = new Bundle();
            ap aap[] = new ap[d.size()];
            d.toArray(aap);
            ((Bundle) (obj)).putParcelableArray("states", aap);
        }
        for (int i = 0; i < e.size();)
        {
            am am1 = (am)e.get(i);
            Object obj1 = obj;
            if (am1 != null)
            {
                obj1 = obj;
                if (am1.i())
                {
                    obj1 = obj;
                    if (obj == null)
                    {
                        obj1 = new Bundle();
                    }
                    obj = (new StringBuilder("f")).append(i).toString();
                    b.a(((Bundle) (obj1)), ((String) (obj)), am1);
                }
            }
            i++;
            obj = obj1;
        }

        return ((Parcelable) (obj));
    }

    public final void b(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup = (am)obj;
        if (viewgroup != f)
        {
            if (f != null)
            {
                f.e(false);
                f.g_(false);
            }
            if (viewgroup != null)
            {
                viewgroup.e(true);
                viewgroup.g_(true);
            }
            f = viewgroup;
        }
    }
}

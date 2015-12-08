// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class U extends aU
{

    private final S a;
    private V b;
    private ArrayList c;
    private ArrayList d;
    private Fragment e;

    public U(S s)
    {
        b = null;
        c = new ArrayList();
        d = new ArrayList();
        e = null;
        a = s;
    }

    public abstract Fragment a(int i);

    public Object a(ViewGroup viewgroup, int i)
    {
        if (d.size() > i)
        {
            Fragment fragment = (Fragment)d.get(i);
            if (fragment != null)
            {
                return fragment;
            }
        }
        if (b == null)
        {
            b = a.a();
        }
        Fragment fragment1 = a(i);
        if (c.size() > i)
        {
            android.support.v4.app.Fragment.SavedState savedstate = (android.support.v4.app.Fragment.SavedState)c.get(i);
            if (savedstate != null)
            {
                fragment1.setInitialSavedState(savedstate);
            }
        }
        for (; d.size() <= i; d.add(null)) { }
        fragment1.setMenuVisibility(false);
        fragment1.setUserVisibleHint(false);
        d.set(i, fragment1);
        b.a(viewgroup.getId(), fragment1);
        return fragment1;
    }

    public final void a()
    {
        if (b != null)
        {
            b.b();
            b = null;
            a.b();
        }
    }

    public final void a(Parcelable parcelable, ClassLoader classloader)
    {
        if (parcelable != null)
        {
            parcelable = (Bundle)parcelable;
            parcelable.setClassLoader(classloader);
            classloader = parcelable.getParcelableArray("states");
            c.clear();
            d.clear();
            if (classloader != null)
            {
                for (int i = 0; i < classloader.length; i++)
                {
                    c.add((android.support.v4.app.Fragment.SavedState)classloader[i]);
                }

            }
            classloader = parcelable.keySet().iterator();
            do
            {
                if (!classloader.hasNext())
                {
                    break;
                }
                Object obj = (String)classloader.next();
                if (((String) (obj)).startsWith("f"))
                {
                    int j = Integer.parseInt(((String) (obj)).substring(1));
                    obj = a.a(parcelable, ((String) (obj)));
                    if (obj != null)
                    {
                        for (; d.size() <= j; d.add(null)) { }
                        ((Fragment) (obj)).setMenuVisibility(false);
                        d.set(j, obj);
                    }
                }
            } while (true);
        }
    }

    public void a(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup = (Fragment)obj;
        if (b == null)
        {
            b = a.a();
        }
        for (; c.size() <= i; c.add(null)) { }
        c.set(i, a.a(viewgroup));
        d.set(i, null);
        b.a(viewgroup);
    }

    public final void a(Object obj)
    {
        obj = (Fragment)obj;
        if (obj != e)
        {
            if (e != null)
            {
                e.setMenuVisibility(false);
                e.setUserVisibleHint(false);
            }
            if (obj != null)
            {
                ((Fragment) (obj)).setMenuVisibility(true);
                ((Fragment) (obj)).setUserVisibleHint(true);
            }
            e = ((Fragment) (obj));
        }
    }

    public final boolean a(View view, Object obj)
    {
        return ((Fragment)obj).getView() == view;
    }

    public final Parcelable b()
    {
        Object obj = null;
        if (c.size() > 0)
        {
            obj = new Bundle();
            android.support.v4.app.Fragment.SavedState asavedstate[] = new android.support.v4.app.Fragment.SavedState[c.size()];
            c.toArray(asavedstate);
            ((Bundle) (obj)).putParcelableArray("states", asavedstate);
        }
        for (int i = 0; i < d.size();)
        {
            Fragment fragment = (Fragment)d.get(i);
            Object obj1 = obj;
            if (fragment != null)
            {
                obj1 = obj;
                if (fragment.isAdded())
                {
                    obj1 = obj;
                    if (obj == null)
                    {
                        obj1 = new Bundle();
                    }
                    obj = (new StringBuilder("f")).append(i).toString();
                    a.a(((Bundle) (obj1)), ((String) (obj)), fragment);
                }
            }
            i++;
            obj = obj1;
        }

        return ((Parcelable) (obj));
    }
}

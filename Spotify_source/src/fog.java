// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.ui.ActionBarTitle;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.util.Assertion;
import java.util.ArrayList;
import java.util.Iterator;

public final class fog
{

    public aa a;
    int b;
    public ArrayList c;
    public Context d;
    private ArrayList e;

    protected fog()
    {
        e = new ArrayList();
        c = new ArrayList();
    }

    public fog(Context context, aa aa1, ViewGroup viewgroup)
    {
        e = new ArrayList();
        c = new ArrayList();
        d = (Context)ctz.a(context);
        a = (aa)ctz.a(aa1);
        ctz.a(viewgroup);
        b = ((ViewGroup)ctz.a(viewgroup)).getId();
        viewgroup.setOnHierarchyChangeListener(new android.view.ViewGroup.OnHierarchyChangeListener() {

            private fog a;

            public final void onChildViewAdded(View view, View view1)
            {
                view = a.c.iterator();
                do
                {
                    if (!view.hasNext())
                    {
                        break;
                    }
                    view1 = ((fok)view.next()).b();
                    if (view1 != null)
                    {
                        view1.bringToFront();
                    }
                } while (true);
            }

            public final void onChildViewRemoved(View view, View view1)
            {
            }

            
            {
                a = fog.this;
                super();
            }
        });
    }

    private foh f()
    {
        if (c.isEmpty())
        {
            return null;
        }
        fok fok1 = (fok)c.get(c.size() - 1);
        if (fok1.a() != 2)
        {
            return null;
        } else
        {
            return fok1.b(null);
        }
    }

    public final ActionBarTitle a()
    {
        foh foh1 = f();
        if (foh1 != null)
        {
            return ((fok) (foh1)).d;
        } else
        {
            return new ActionBarTitle(d, "");
        }
    }

    public final void a(ah ah1, boolean flag)
    {
        int i;
        int j;
        if (flag)
        {
            i = 2;
        } else
        {
            i = 1;
        }
        j = c.size() - 1;
        while (j >= 0) 
        {
            fok fok1 = (fok)c.get(j);
            if (i > 0)
            {
                c.set(j, fok1.b(ah1));
                i--;
            } else
            {
                c.set(j, fok1.a(ah1));
            }
            j--;
        }
    }

    public final void a(Bundle bundle)
    {
        int i;
        int j;
        bundle = bundle.getParcelableArray("entries");
        j = bundle.length;
        i = 0;
_L6:
        Bundle bundle1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        bundle1 = (Bundle)bundle[i];
        bundle1.setClassLoader(d.getClassLoader());
        bundle1.getInt("type");
        JVM INSTR tableswitch 0 2: default 68
    //                   0 80
    //                   1 100
    //                   2 120;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_120;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        Assertion.a("Unhandled entry type");
_L7:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        c.add(new foj(this, bundle1));
          goto _L7
_L3:
        c.add(new foi(this, bundle1));
          goto _L7
        c.add(new foh(this, bundle1));
          goto _L7
    }

    public final void a(fol fol1)
    {
        e.add(fol1);
    }

    public final Fragment b()
    {
        foh foh1 = f();
        if (foh1 != null)
        {
            return foh1.a;
        } else
        {
            return null;
        }
    }

    public final void b(fol fol1)
    {
        e.remove(fol1);
    }

    public final boolean c()
    {
        if (c.size() <= 1)
        {
            return false;
        } else
        {
            ah ah1 = a.a();
            ((fok)c.remove(c.size() - 1)).c(ah1);
            a(ah1, false);
            ah1.c();
            a.b();
            d();
            return true;
        }
    }

    public final void d()
    {
        Object obj = b();
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((fol)iterator.next()).a(((Fragment) (obj)))) { }
        com.spotify.mobile.android.ui.NavigationItem.NavigationGroup navigationgroup = com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.a;
        if (obj instanceof NavigationItem)
        {
            navigationgroup = ((NavigationItem)obj).A_();
        }
        obj = (gnq)dmz.a(gnq);
        Intent intent = new Intent();
        intent.setAction("ACTION_LATEST_NAVIGATION").putExtra("navigation_group", navigationgroup);
        ((gnq) (obj)).a(intent);
    }

    public final Bundle e()
    {
        Bundle bundle = new Bundle();
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); arraylist.add(((fok)iterator.next()).d())) { }
        bundle.putParcelableArray("entries", (android.os.Parcelable[])arraylist.toArray(new Bundle[arraylist.size()]));
        return bundle;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); stringbuilder.append((fok)iterator.next()).append('\n')) { }
        return stringbuilder.toString();
    }
}

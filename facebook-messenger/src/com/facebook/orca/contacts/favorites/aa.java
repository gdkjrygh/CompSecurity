// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.favorites;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.contacts.picker.ContactPickerColorScheme;
import com.facebook.contacts.picker.ad;
import com.facebook.contacts.picker.ae;
import com.facebook.contacts.picker.c;
import com.facebook.contacts.picker.l;
import com.facebook.contacts.picker.m;
import com.facebook.contacts.picker.u;
import com.facebook.orca.contacts.picker.ar;
import com.facebook.orca.contacts.picker.ba;
import com.facebook.orca.contacts.picker.bb;
import com.facebook.widget.listview.f;
import com.google.common.a.es;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.contacts.favorites:
//            aj, a, e, s, 
//            w, u, y, ab, 
//            c, g

public class aa extends c
    implements f
{

    private static final Class c = com/facebook/orca/contacts/favorites/aa;
    protected final Context a;
    protected final LayoutInflater b;
    private final a d;
    private es e;
    private es f;
    private u g;
    private ContactPickerColorScheme h;
    private int i;

    public aa(Context context, a a1, LayoutInflater layoutinflater)
    {
        e = es.d();
        f = es.d();
        h = ContactPickerColorScheme.DIVEBAR_SCHEME;
        i = 0;
        a = context;
        d = a1;
        b = layoutinflater;
    }

    private View a(View view, ViewGroup viewgroup)
    {
        viewgroup = (bb)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new bb(a);
            view.setColorScheme(ContactPickerColorScheme.DIVEBAR_SCHEME);
        }
        return view;
    }

    private View a(ViewGroup viewgroup, View view)
    {
        if (view != null)
        {
            return view;
        } else
        {
            return new aj(a);
        }
    }

    private View a(ae ae1, View view, ViewGroup viewgroup)
    {
        viewgroup = (ba)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new ba(a);
            view.setColorScheme(h);
        }
        view.setText(ae1.a());
        return view;
    }

    private View a(com.facebook.orca.contacts.favorites.c c1, View view, ViewGroup viewgroup)
    {
        viewgroup = (com.facebook.orca.contacts.favorites.a)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new com.facebook.orca.contacts.favorites.a(a);
        }
        view.setContactRow(c1);
        return view;
    }

    private View a(g g1, View view, ViewGroup viewgroup)
    {
        viewgroup = (e)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new e(a);
        }
        view.setGroupRow(g1);
        return view;
    }

    private View a(com.facebook.orca.contacts.favorites.u u1, View view, ViewGroup viewgroup)
    {
label0:
        {
            viewgroup = (s)view;
            if (viewgroup != null)
            {
                view = viewgroup;
                if (viewgroup.a())
                {
                    break label0;
                }
            }
            view = new s(a);
        }
        view.setContactRow(u1);
        return view;
    }

    private View a(y y1, View view, ViewGroup viewgroup)
    {
label0:
        {
            viewgroup = (w)view;
            if (viewgroup != null)
            {
                view = viewgroup;
                if (viewgroup.a())
                {
                    break label0;
                }
            }
            view = new w(a);
        }
        view.setGroupRow(y1);
        return view;
    }

    public u a()
    {
        if (g == null)
        {
            g = (u)d.b();
            g.a(this);
        }
        return g;
    }

    public void a(ContactPickerColorScheme contactpickercolorscheme)
    {
        h = contactpickercolorscheme;
    }

    public void a(es es1)
    {
        e = es1;
        f = e;
        notifyDataSetChanged();
        i = 0;
        es1 = es1.iterator();
        do
        {
            if (!es1.hasNext())
            {
                break;
            }
            ad ad1 = (ad)es1.next();
            if ((ad1 instanceof com.facebook.orca.contacts.favorites.u) || (ad1 instanceof y))
            {
                i = i + 1;
            }
        } while (true);
    }

    public void a(CharSequence charsequence, l l1)
    {
        Preconditions.checkNotNull(l1);
        switch (com.facebook.orca.contacts.favorites.ab.a[l1.a().ordinal()])
        {
        default:
            b(es.d());
            return;

        case 1: // '\001'
            b(l1.d());
            return;

        case 2: // '\002'
            b();
            break;
        }
    }

    public void b()
    {
        f = e;
        if (f.size() > 0)
        {
            notifyDataSetChanged();
            return;
        } else
        {
            notifyDataSetInvalidated();
            return;
        }
    }

    void b(es es1)
    {
        f = es1;
        if (es1.size() > 0)
        {
            notifyDataSetChanged();
            return;
        } else
        {
            notifyDataSetInvalidated();
            return;
        }
    }

    public com.facebook.widget.a.f c()
    {
        return a();
    }

    public int d()
    {
        int j = 0;
        if (f.get(0) == ar.f)
        {
            j = 1;
        }
        return j;
    }

    public int e()
    {
        return i - 1;
    }

    public int getCount()
    {
        return f.size();
    }

    public Object getItem(int j)
    {
        return f.get(j);
    }

    public long getItemId(int j)
    {
        return (long)j;
    }

    public int getItemViewType(int j)
    {
        ad ad1 = (ad)f.get(j);
        if (ad1 instanceof com.facebook.orca.contacts.favorites.u)
        {
            return 0;
        }
        if (ad1 instanceof y)
        {
            return 4;
        }
        if (ad1 instanceof com.facebook.orca.contacts.favorites.c)
        {
            return 1;
        }
        if (ad1 instanceof g)
        {
            return 5;
        }
        if (ad1 instanceof ae)
        {
            return 6;
        }
        if (ad1 == ar.e)
        {
            return 3;
        }
        if (ad1 == ar.f)
        {
            return 2;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown object type ").append(ad1.getClass()).toString());
        }
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        ad ad1 = (ad)f.get(j);
        if (ad1 == ar.f)
        {
            return a(viewgroup, view);
        }
        if (ad1 instanceof com.facebook.orca.contacts.favorites.u)
        {
            return a((com.facebook.orca.contacts.favorites.u)ad1, view, viewgroup);
        }
        if (ad1 instanceof com.facebook.orca.contacts.favorites.c)
        {
            return a((com.facebook.orca.contacts.favorites.c)ad1, view, viewgroup);
        }
        if (ad1 instanceof ae)
        {
            return a((ae)ad1, view, viewgroup);
        }
        if (ad1 instanceof y)
        {
            return a((y)ad1, view, viewgroup);
        }
        if (ad1 instanceof g)
        {
            return a((g)ad1, view, viewgroup);
        }
        if (ad1 == ar.e)
        {
            return a(view, viewgroup);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown object type ").append(ad1.getClass()).toString());
        }
    }

    public int getViewTypeCount()
    {
        return 7;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.contacts.picker.ContactPickerColorScheme;
import com.facebook.contacts.picker.ad;
import com.facebook.contacts.picker.ae;
import com.facebook.contacts.picker.af;
import com.facebook.contacts.picker.ag;
import com.facebook.contacts.picker.c;
import com.facebook.contacts.picker.l;
import com.facebook.contacts.picker.m;
import com.facebook.contacts.picker.t;
import com.facebook.contacts.picker.u;
import com.facebook.f;
import com.facebook.i;
import com.facebook.k;
import com.facebook.orca.contacts.divebar.ax;
import com.facebook.orca.contacts.divebar.ay;
import com.google.common.a.es;
import com.google.common.base.Preconditions;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            s, ah, af, ba, 
//            bb, ao, k, an, 
//            ap, bd, ad, j, 
//            ar

public class bc extends c
{

    private static final Class a = com/facebook/orca/contacts/picker/bc;
    private final Context b;
    private final a c;
    private final LayoutInflater d;
    private final com.facebook.user.i e;
    private es f;
    private es g;
    private u h;
    private ContactPickerColorScheme i;

    public bc(Context context, a a1, LayoutInflater layoutinflater, com.facebook.user.i i1)
    {
        f = es.d();
        g = es.d();
        i = ContactPickerColorScheme.DEFAULT_SCHEME;
        b = context;
        c = a1;
        d = layoutinflater;
        e = i1;
    }

    private View a(View view, ViewGroup viewgroup)
    {
        viewgroup = (s)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new s(b);
            view.setColorScheme(i);
        }
        return view;
    }

    private View a(View view, com.facebook.orca.contacts.picker.af af1)
    {
        ah ah1 = (ah)view;
        view = ah1;
        if (ah1 == null)
        {
            view = new ah(b);
        }
        view.a(af1.a());
        return view;
    }

    private View a(ae ae1, View view, ViewGroup viewgroup)
    {
        viewgroup = (ba)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new ba(b);
            view.setColorScheme(i);
        }
        view.setText(ae1.a());
        return view;
    }

    private View a(af af1, View view, ViewGroup viewgroup)
    {
        view = (bb)view;
        af1 = view;
        if (view == null)
        {
            af1 = new bb(b);
            af1.setColorScheme(i);
        }
        return af1;
    }

    private View a(ag ag1, View view)
    {
        ao ao1 = (ao)view;
        view = ao1;
        if (ao1 == null)
        {
            view = new ao(b);
            view.setColorScheme(i);
        }
        view.setContactRow(ag1);
        return view;
    }

    private View a(t t1, View view, ViewGroup viewgroup)
    {
        viewgroup = (com.facebook.orca.contacts.picker.k)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new com.facebook.orca.contacts.picker.k(b);
            view.setColorScheme(i);
        }
        view.setContactRow(t1);
        return view;
    }

    private View a(ax ax1, View view, ViewGroup viewgroup)
    {
        viewgroup = (ay)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new ay(b);
        }
        view.a(ax1.a());
        view.a(ax1.b());
        return view;
    }

    private View a(com.facebook.orca.contacts.picker.ad ad1, View view)
    {
        an an1 = (an)view;
        view = an1;
        if (an1 == null)
        {
            view = new an(b);
            view.setColorScheme(i);
        }
        view.setContactRow(ad1);
        return view;
    }

    private View a(j j1, View view, ViewGroup viewgroup)
    {
        viewgroup = (com.facebook.orca.contacts.picker.k)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new com.facebook.orca.contacts.picker.k(b);
            view.setColorScheme(i);
        }
        view.setContactRow(j1);
        return view;
    }

    private View b(View view, ViewGroup viewgroup)
    {
        viewgroup = (com.facebook.orca.contacts.divebar.bc)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new com.facebook.orca.contacts.divebar.bc(b);
        }
        return view;
    }

    private View c(View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = d.inflate(k.orca_contact_picker_new_group, viewgroup, false);
            ((TextView)(TextView)view1.findViewById(i.contact_name)).setTextColor(b.getResources().getColor(f.default_contacts_section_text));
        }
        return view1;
    }

    private View d(View view, ViewGroup viewgroup)
    {
        viewgroup = (ap)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new ap(b);
        }
        return view;
    }

    public u a()
    {
        if (h == null && c != null)
        {
            h = (u)c.b();
            h.a(this);
        }
        return h;
    }

    public void a(ContactPickerColorScheme contactpickercolorscheme)
    {
        i = contactpickercolorscheme;
    }

    public void a(es es1)
    {
        f = es1;
        g = f;
        notifyDataSetChanged();
    }

    public void a(CharSequence charsequence, l l1)
    {
        Preconditions.checkNotNull(l1);
        switch (com.facebook.orca.contacts.picker.bd.a[l1.a().ordinal()])
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

    public boolean areAllItemsEnabled()
    {
        return false;
    }

    public void b()
    {
        g = f;
        if (g.size() > 0)
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
        g = es1;
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

    public int getCount()
    {
        return g.size();
    }

    public Object getItem(int i1)
    {
        return g.get(i1);
    }

    public long getItemId(int i1)
    {
        return (long)i1;
    }

    public int getItemViewType(int i1)
    {
        ad ad1 = (ad)g.get(i1);
        if (ad1 instanceof ag)
        {
            return 1;
        }
        if (ad1 instanceof com.facebook.orca.contacts.picker.ad)
        {
            return 9;
        }
        if (ad1 instanceof j)
        {
            return 2;
        }
        if (ad1 == ar.b)
        {
            return 5;
        }
        if (ad1 == ar.g)
        {
            return 10;
        }
        if (ad1 instanceof ax)
        {
            return 11;
        }
        if (ad1 instanceof ae)
        {
            return 3;
        }
        if (ad1 instanceof af)
        {
            return 4;
        }
        if (ad1 == com.facebook.orca.contacts.picker.ar.a)
        {
            return 0;
        }
        if (ad1 == com.facebook.orca.contacts.picker.ar.c)
        {
            return 6;
        }
        if (ad1 instanceof com.facebook.orca.contacts.picker.af)
        {
            return 7;
        }
        if (ad1 instanceof t)
        {
            return 8;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown object type ").append(ad1.getClass()).toString());
        }
    }

    public View getView(int i1, View view, ViewGroup viewgroup)
    {
        ad ad1 = (ad)g.get(i1);
        if (ad1 instanceof ag)
        {
            return a((ag)ad1, view);
        }
        if (ad1 instanceof com.facebook.orca.contacts.picker.ad)
        {
            return a((com.facebook.orca.contacts.picker.ad)ad1, view);
        }
        if (ad1 instanceof j)
        {
            return a((j)ad1, view, viewgroup);
        }
        if (ad1 == ar.b)
        {
            return a(view, viewgroup);
        }
        if (ad1 == ar.g)
        {
            return b(view, viewgroup);
        }
        if (ad1 instanceof ax)
        {
            return a((ax)ad1, view, viewgroup);
        }
        if (ad1 instanceof ae)
        {
            return a((ae)ad1, view, viewgroup);
        }
        if (ad1 instanceof af)
        {
            return a((af)ad1, view, viewgroup);
        }
        if (ad1 == com.facebook.orca.contacts.picker.ar.a)
        {
            return c(view, viewgroup);
        }
        if (ad1 == com.facebook.orca.contacts.picker.ar.c)
        {
            return d(view, viewgroup);
        }
        if (ad1 instanceof t)
        {
            return a((t)ad1, view, viewgroup);
        }
        if (ad1 instanceof com.facebook.orca.contacts.picker.af)
        {
            return a(view, (com.facebook.orca.contacts.picker.af)ad1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown object type ").append(ad1.getClass()).toString());
        }
    }

    public int getViewTypeCount()
    {
        return 12;
    }

    public boolean isEnabled(int i1)
    {
        return !(getItem(i1) instanceof ae);
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import android.content.Context;
import android.widget.ListView;
import com.facebook.i;
import com.facebook.o;
import com.facebook.widget.f;
import com.facebook.widget.listview.BetterListView;
import com.facebook.widget.listview.EmptyListViewItem;
import com.google.common.a.es;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.contacts.picker:
//            al, am, b, ad, 
//            aq, ap, an, ao

public class ak extends f
{

    private static final Class b = com/facebook/contacts/picker/ak;
    protected ListView a;
    private aq c;
    private ap d;
    private EmptyListViewItem e;
    private b f;

    public ak(Context context, b b1, int j)
    {
        super(context);
        setContentView(j);
        f = b1;
        a = (ListView)getViewRequired(i.friends_list);
        e = (EmptyListViewItem)getViewRequired(i.friends_list_empty_item);
        a.setDividerHeight(0);
        a.setAdapter(b1);
        if (a instanceof BetterListView)
        {
            ((BetterListView)a).setBroadcastInteractionChanges(true);
        }
        a.setOnScrollListener(new al(this));
        a.setOnItemClickListener(new am(this));
    }

    private void a(int j)
    {
        ad ad1 = (ad)f.getItem(j);
        if (c != null)
        {
            c.a(ad1, j);
        }
    }

    static void a(ak ak1, int j)
    {
        ak1.b(j);
    }

    private void b(int j)
    {
        if (d != null)
        {
            d.a(j);
        }
    }

    static void b(ak ak1, int j)
    {
        ak1.a(j);
    }

    public void a()
    {
        e.a(false);
        e.setVisibility(8);
        e.setMessage(o.contact_picker_no_results);
    }

    public void a(ao ao1)
    {
        Preconditions.checkNotNull(ao1);
        an.a[ao1.ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 45
    //                   2 66;
           goto _L1 _L2 _L3
_L1:
        e.setVisibility(0);
        return;
_L2:
        e.setMessage(o.contacts_loading);
        e.a(true);
        continue; /* Loop/switch isn't completed */
_L3:
        e.setMessage(o.contact_picker_no_results);
        e.a(false);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void a(es es)
    {
        f.a(es);
        a();
    }

    public ListView getListView()
    {
        return a;
    }

    public void setOnContactListScrollListener(ap ap1)
    {
        d = ap1;
    }

    public void setOnRowClickedListener(aq aq1)
    {
        c = aq1;
    }

}

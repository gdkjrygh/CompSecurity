// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactslist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.contacts.models.Contact;
import com.google.common.a.es;
import com.google.common.a.jq;
import java.util.List;

// Referenced classes of package com.facebook.contacts.contactslist:
//            a, b

public class e extends BaseAdapter
{

    private final Context a;
    private final a b = new a();
    private List c;

    public e(Context context)
    {
        c = es.d();
        a = context;
    }

    public void a(es es1)
    {
        c = jq.a(b).b(es1);
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return c.size();
    }

    public Object getItem(int i)
    {
        return c.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = (Contact)c.get(i);
        if (view == null)
        {
            view = new b(a);
        } else
        {
            view = (b)view;
        }
        view.setContact(viewgroup);
        return view;
    }
}

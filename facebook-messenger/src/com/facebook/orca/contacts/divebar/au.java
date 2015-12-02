// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.contacts.picker.ContactPickerColorScheme;
import com.facebook.contacts.picker.ag;
import com.facebook.contacts.picker.b;
import com.facebook.orca.contacts.picker.ao;
import com.google.common.a.es;

public class au extends b
{

    private final Context a;
    private es b;

    public au(Context context)
    {
        b = es.d();
        a = context;
    }

    public ag a(int i)
    {
        return (ag)b.get(i);
    }

    public void a(es es1)
    {
        b = es1;
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return b.size();
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = (ao)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new ao(a);
            view.setColorScheme(ContactPickerColorScheme.DIVEBAR_SCHEME);
        }
        view.setContactRow(a(i));
        return view;
    }
}

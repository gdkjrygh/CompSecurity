// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning.preferences;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

// Referenced classes of package com.brightcove.player.captioning.preferences:
//            ListDialogPreference, a

class b extends BaseAdapter
{

    final ListDialogPreference a;
    private LayoutInflater b;

    private b(ListDialogPreference listdialogpreference)
    {
        a = listdialogpreference;
        super();
    }

    b(ListDialogPreference listdialogpreference, a a1)
    {
        this(listdialogpreference);
    }

    public Integer a(int i)
    {
        return Integer.valueOf(ListDialogPreference.a(a)[i]);
    }

    public int getCount()
    {
        return ListDialogPreference.a(a).length;
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return (long)ListDialogPreference.a(a)[i];
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            if (b == null)
            {
                b = LayoutInflater.from(viewgroup.getContext());
            }
            view1 = b.inflate(ListDialogPreference.b(a), viewgroup, false);
        }
        a.a(view1, i);
        return view1;
    }

    public boolean hasStableIds()
    {
        return true;
    }
}

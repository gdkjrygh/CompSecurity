// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning.preferences;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

// Referenced classes of package com.brightcove.player.captioning.preferences:
//            ListDialogPreference

final class <init> extends BaseAdapter
{

    private LayoutInflater a;
    private ListDialogPreference b;

    public final int getCount()
    {
        return ListDialogPreference.a(b).length;
    }

    public final Object getItem(int i)
    {
        return Integer.valueOf(ListDialogPreference.a(b)[i]);
    }

    public final long getItemId(int i)
    {
        return (long)ListDialogPreference.a(b)[i];
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            if (a == null)
            {
                a = LayoutInflater.from(viewgroup.getContext());
            }
            view1 = a.inflate(ListDialogPreference.b(b), viewgroup, false);
        }
        b.a(view1, i);
        return view1;
    }

    public final boolean hasStableIds()
    {
        return true;
    }

    private I(ListDialogPreference listdialogpreference)
    {
        b = listdialogpreference;
        super();
    }

    b(ListDialogPreference listdialogpreference, byte byte0)
    {
        this(listdialogpreference);
    }
}

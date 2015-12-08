// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.androidquery.a;
import com.cardinalblue.android.piccollage.model.gson.FbFriend;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class h extends BaseAdapter
{
    private static class a
    {

        TextView a;
        ImageView b;

        private a()
        {
        }

    }


    private LayoutInflater a;
    private List b;
    private List c;
    private int d;
    private String e;

    public h(Context context)
    {
        a = LayoutInflater.from(context);
        d = context.getResources().getDimensionPixelSize(0x7f0b0137);
        b = new LinkedList();
        c = new LinkedList();
    }

    private boolean b()
    {
        return !TextUtils.isEmpty(e);
    }

    public FbFriend a(int i)
    {
        if (b())
        {
            return (FbFriend)b.get(i);
        } else
        {
            return (FbFriend)c.get(i);
        }
    }

    public void a()
    {
        c.clear();
        b.clear();
    }

    public void a(String s)
    {
        e = s.toLowerCase(Locale.getDefault());
        b.clear();
        LinkedList linkedlist = new LinkedList();
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            FbFriend fbfriend = (FbFriend)iterator.next();
            if (fbfriend != null && fbfriend.getName() != null && fbfriend.getName().toLowerCase(Locale.getDefault()).contains(s))
            {
                linkedlist.add(fbfriend.copy());
            }
        } while (true);
        b.addAll(linkedlist);
        notifyDataSetChanged();
    }

    public void a(List list)
    {
        c.addAll(list);
    }

    public int getCount()
    {
        if (b())
        {
            return b.size();
        } else
        {
            return c.size();
        }
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
        Object obj;
        Object obj1;
        if (view == null)
        {
            view = a.inflate(0x7f0300ae, viewgroup, false);
            obj = new a();
            obj.a = (TextView)view.findViewById(0x7f1001b4);
            obj.b = (ImageView)view.findViewById(0x7f1001b3);
            view.setTag(obj);
        } else
        {
            obj = (a)view.getTag();
        }
        obj1 = a(i);
        ((a) (obj)).a.setText(((FbFriend) (obj1)).getName());
        obj = String.format("https://graph.facebook.com/%s/picture", new Object[] {
            ((FbFriend) (obj1)).getId()
        });
        obj1 = new com.androidquery.a(view);
        ((com.androidquery.a) (obj1)).b(0x7f1001b3);
        if (((com.androidquery.a) (obj1)).a(i, view, viewgroup, ((String) (obj))))
        {
            ((com.androidquery.a) (obj1)).d(0x7f02021e);
            return view;
        } else
        {
            ((com.androidquery.a) (obj1)).a(((String) (obj)), true, true, d, 0);
            return view;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.h;
import com.bumptech.glide.load.b.e;
import com.bumptech.glide.p;
import com.roidapp.baselib.b.a;
import com.roidapp.baselib.c.x;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            FbFriend, v, u, FbFriendListActivity

public final class t extends ArrayAdapter
{

    final FbFriendListActivity a;
    private LayoutInflater b;
    private List c;
    private List d;

    public t(FbFriendListActivity fbfriendlistactivity, Activity activity, List list)
    {
        a = fbfriendlistactivity;
        super(activity, as.o, list);
        b = LayoutInflater.from(activity);
        c = list;
        d = new LinkedList();
        fbfriendlistactivity = c.iterator();
        do
        {
            if (!fbfriendlistactivity.hasNext())
            {
                return;
            }
            activity = (FbFriend)fbfriendlistactivity.next();
            d.add(activity.a());
        } while (true);
    }

    public final void a(String s)
    {
        s = s.toLowerCase();
        LinkedList linkedlist = new LinkedList();
        Iterator iterator = d.iterator();
        do
        {
            FbFriend fbfriend;
            String s1;
            do
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        c.clear();
                        c.addAll(linkedlist);
                        notifyDataSetChanged();
                        return;
                    }
                    fbfriend = (FbFriend)iterator.next();
                } while (fbfriend == null);
                s1 = fbfriend.c();
            } while (s1 == null || !s1.toLowerCase().contains(s));
            linkedlist.add(fbfriend.a());
        } while (true);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        FbFriend fbfriend;
        if (view != null)
        {
            viewgroup = (v)view.getTag();
            view1 = view;
        } else
        {
            view1 = b.inflate(as.o, viewgroup, false);
            viewgroup = new v((byte)0);
            viewgroup.b = (TextView)view1.findViewById(ar.da);
            viewgroup.a = (ImageView)view1.findViewById(ar.bl);
            view1.setTag(viewgroup);
        }
        fbfriend = (FbFriend)getItem(i);
        view = fbfriend.b();
        if (view != null) goto _L2; else goto _L1
_L1:
        view = "";
_L4:
        h.a(a).a(view).b(com.roidapp.baselib.b.a.b()).g().a(e.c).a(new u(this, ((v) (viewgroup)).a));
        ((v) (viewgroup)).b.setText(fbfriend.c());
        return view1;
_L2:
        Object obj = new ArrayList(3);
        view = String.format(Locale.ENGLISH, "https://graph.facebook.com/v2.3/%s/picture", new Object[] {
            view
        });
        if (!((List) (obj)).isEmpty())
        {
            ArrayList arraylist = new ArrayList(3);
            ArrayList arraylist1 = new ArrayList(3);
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                x x1 = (x)((Iterator) (obj)).next();
                if (x1 != null && x1.a != null)
                {
                    arraylist.add(x1.a);
                    arraylist1.add(x1.b);
                }
            } while (true);
            view = com.roidapp.baselib.d.a.a(view, (String[])arraylist.toArray(new String[arraylist.size()]), (String[])arraylist1.toArray(new String[arraylist1.size()]));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}

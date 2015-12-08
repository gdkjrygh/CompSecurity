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
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            l, b, FbAlbumListActivity, g

public final class k extends ArrayAdapter
{

    final FbAlbumListActivity a;
    private LayoutInflater b;

    public k(FbAlbumListActivity fbalbumlistactivity, Activity activity, List list)
    {
        a = fbalbumlistactivity;
        super(activity, as.n, list);
        b = LayoutInflater.from(activity);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        b b1;
        String s;
        String s1;
        if (view != null)
        {
            l l1 = (l)view.getTag();
            viewgroup = view;
            view = l1;
        } else
        {
            viewgroup = b.inflate(as.n, viewgroup, false);
            view = new l(this, (byte)0);
            view.b = (ImageView)viewgroup.findViewById(ar.bi);
            view.c = (TextView)viewgroup.findViewById(ar.cJ);
            view.a = (TextView)viewgroup.findViewById(ar.cI);
            viewgroup.setTag(view);
        }
        b1 = (b)getItem(i);
        i = b1.a();
        s = (new StringBuilder("(")).append(i).append(")").toString();
        s1 = b1.b();
        if (s1 == null)
        {
            ((l) (view)).b.setImageResource(aq.f);
        } else
        {
            h.a(a).a(s1).a(e.c).g().b(com.roidapp.baselib.b.a.b()).b(com.roidapp.cloudlib.facebook.FbAlbumListActivity.h(a), com.roidapp.cloudlib.facebook.FbAlbumListActivity.h(a)).a(new g(a, ((l) (view)).b));
        }
        ((l) (view)).c.setText(b1.d());
        if (!b1.c().equals("<friends_albums>"))
        {
            ((l) (view)).a.setVisibility(0);
            ((l) (view)).a.setText(s);
            return viewgroup;
        } else
        {
            ((l) (view)).a.setVisibility(8);
            return viewgroup;
        }
    }
}

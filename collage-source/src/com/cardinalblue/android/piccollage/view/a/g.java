// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.androidquery.a;
import com.cardinalblue.android.piccollage.model.gson.FbAlbum;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            a

public class g extends ArrayAdapter
{

    private LayoutInflater a;
    private int b;

    public g(Context context, int i)
    {
        super(context, 0x7f030046);
        a = LayoutInflater.from(context);
        b = i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        com.cardinalblue.android.piccollage.view.a.a a1;
        String s;
        FbAlbum fbalbum;
        String s1;
        int j;
        if (view == null)
        {
            view = a.inflate(0x7f030046, viewgroup, false);
            a1 = new com.cardinalblue.android.piccollage.view.a.a(view);
            view.setTag(a1);
        } else
        {
            a1 = (com.cardinalblue.android.piccollage.view.a.a)view.getTag();
            if (a1 == null)
            {
                view = a.inflate(0x7f030046, viewgroup, false);
                a1 = new com.cardinalblue.android.piccollage.view.a.a(view);
            }
        }
        fbalbum = (FbAlbum)getItem(i);
        j = fbalbum.getCount();
        if (j > 1)
        {
            s = (new StringBuilder()).append(j).append(getContext().getString(0x7f07022c)).toString();
        } else
        {
            s = (new StringBuilder()).append(j).append(getContext().getString(0x7f070224)).toString();
        }
        s1 = fbalbum.getCoverPhotoUrl();
        if (TextUtils.isEmpty(s1))
        {
            a1.a.setImageResource(0x7f020233);
        } else
        {
            a a2 = new a(view);
            if (a2.a(i, view, viewgroup, s1))
            {
                ((a)a2.b(0x7f100107)).d(0x7f02021e);
            } else
            {
                ((a)a2.b(0x7f100107)).a(s1, true, true, b, 0);
            }
        }
        a1.b.setText(fbalbum.getName());
        if (fbalbum.getId().equals("<friends_albums>"))
        {
            a1.c.setVisibility(8);
            return view;
        } else
        {
            a1.c.setVisibility(0);
            a1.c.setText(s);
            return view;
        }
    }
}

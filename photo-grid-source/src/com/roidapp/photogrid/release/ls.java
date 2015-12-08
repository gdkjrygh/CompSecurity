// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.release:
//            lu, lt

public final class ls extends BaseAdapter
{

    private Context a;
    private LayoutInflater b;
    private List c;

    public ls(Context context, List list)
    {
        a = context;
        b = LayoutInflater.from(context);
        c = list;
    }

    public final int getCount()
    {
        return c.size();
    }

    public final Object getItem(int i)
    {
        return ((lu)c.get(i)).a;
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        File file;
        if (view == null)
        {
            view = b.inflate(0x7f03009d, null);
            viewgroup = new lt(this, (byte)0);
            viewgroup.a = (TextView)view.findViewById(0x7f0d010c);
            if (a.getResources().getDisplayMetrics().density == 1.0F && (a.getResources().getDisplayMetrics().heightPixels == 1280 || a.getResources().getDisplayMetrics().heightPixels == 1184) && a.getResources().getDisplayMetrics().widthPixels == 800)
            {
                ((lt) (viewgroup)).a.setTextSize(25F);
            }
            viewgroup.b = (ImageView)view.findViewById(0x7f0d010b);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (lt)view.getTag();
        }
        ((lt) (viewgroup)).b.setVisibility(4);
        file = new File(((lu)c.get(i)).b.toString());
        if (((lu)c.get(i)).a.toString().equals("b1"))
        {
            ((lt) (viewgroup)).a.setText("Return to the root directory..");
            return view;
        }
        if (((lu)c.get(i)).a.toString().equals("backupParent"))
        {
            ((lt) (viewgroup)).a.setText(0x7f070032);
            ((lt) (viewgroup)).b.setVisibility(4);
            return view;
        } else
        {
            ((lt) (viewgroup)).a.setText(file.getName());
            return view;
        }
    }
}

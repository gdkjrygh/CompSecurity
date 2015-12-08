// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.drawer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fitbit.home.ui.HomeNavigationItem;
import com.fitbit.util.bq;

// Referenced classes of package com.fitbit.ui.drawer:
//            NavigationItem

public class c extends com.fitbit.ui.a.c
{

    public c()
    {
    }

    public int getItemViewType(int i)
    {
        return ((NavigationItem)getItem(i)).a().ordinal();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        NavigationItem navigationitem;
        navigationitem = (NavigationItem)getItem(i);
        if (navigationitem.a() == NavigationItem.Type.c)
        {
            return bq.a(viewgroup.getContext());
        }
        view = (HomeNavigationItem)navigationitem.b();
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[HomeNavigationItem.values().length];
                try
                {
                    a[HomeNavigationItem.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[HomeNavigationItem.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[HomeNavigationItem.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[HomeNavigationItem.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[view.ordinal()];
        JVM INSTR tableswitch 1 4: default 76
    //                   1 163
    //                   2 169
    //                   3 175
    //                   4 181;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_181;
_L1:
        i = 0;
_L6:
        if (i != 0)
        {
            view = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f040190, null);
            ((ImageView)view.findViewById(0x7f110435)).setBackgroundResource(i);
            viewgroup = (TextView)view.findViewById(0x7f110437);
            if (navigationitem.e() > 0)
            {
                viewgroup.setText(String.valueOf(navigationitem.e()));
                viewgroup.setVisibility(0);
            } else
            {
                viewgroup.setVisibility(8);
            }
        } else
        {
            view = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f040191, null);
        }
        ((TextView)view.findViewById(0x7f110436)).setText(navigationitem.c());
        return view;
_L2:
        i = 0x7f0202f5;
          goto _L6
_L3:
        i = 0x7f0202f4;
          goto _L6
_L4:
        i = 0x7f0202f6;
          goto _L6
        i = 0x7f0202f1;
          goto _L6
    }

    public int getViewTypeCount()
    {
        return NavigationItem.Type.values().length;
    }
}

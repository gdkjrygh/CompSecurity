// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kik.m.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kik.android.widget.TabIconImageView;

// Referenced classes of package com.kik.view.adapters:
//            ai

public class MediaTrayTabAdapter extends FragmentPagerAdapter
    implements ai
{

    private LinkedHashMap a;
    private ArrayList b;
    private LayoutInflater c;
    private int d;
    private ArrayList e;

    public MediaTrayTabAdapter(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
        a = new LinkedHashMap();
        b = new ArrayList();
        d = 0;
        e = new ArrayList();
    }

    public final View a(int i, ViewGroup viewgroup)
    {
        viewgroup = (TabIconImageView)c.inflate(0x7f030080, viewgroup, false);
        viewgroup.setImageResource(((Integer)e.get(i)).intValue());
        com.kik.m.d.a(viewgroup, (new StringBuilder("AUTOMATION_MEDIA_TRAY_")).append(((String)b.get(i)).toUpperCase()).append("_TAB").toString());
        return viewgroup;
    }

    public final String a(int i)
    {
        if (i < b.size())
        {
            return (String)b.get(i);
        } else
        {
            return null;
        }
    }

    public final void a(Context context)
    {
        c = LayoutInflater.from(context);
    }

    public final void a(String s, int i, Fragment fragment)
    {
        if (!a.containsKey(s))
        {
            d = d + 1;
            e.add(Integer.valueOf(i));
            b.add(s);
            a.put(s, fragment);
        }
    }

    public int getCount()
    {
        return d;
    }

    public Fragment getItem(int i)
    {
        return (Fragment)a.get(b.get(i));
    }

    public CharSequence getPageTitle(int i)
    {
        return "";
    }
}

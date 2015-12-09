// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.a;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.fitbit.ui.choose.activity.ChooseFragment;
import com.fitbit.util.g.b;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a extends FragmentPagerAdapter
{

    private Context a;
    private Date b;
    private Map c;
    private List d;

    public a(FragmentManager fragmentmanager, Context context, Date date, List list)
    {
        super(fragmentmanager);
        c = new HashMap();
        d = Collections.emptyList();
        a = context;
        b = date;
        d = list;
    }

    private static ChooseFragment a(Class class1, Date date)
    {
        Object obj = (ChooseFragment)com.fitbit.util.g.b.a(null, new Object[] {
            Boolean.valueOf(true), "newInstance", date
        }).c;
        Object obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        obj1 = obj;
        try
        {
            class1 = (ChooseFragment)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            class1.printStackTrace();
            return ((ChooseFragment) (obj1));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            class1.printStackTrace();
            return ((ChooseFragment) (obj));
        }
        obj1 = class1;
        obj = class1;
        class1.a(date);
        obj1 = class1;
        return ((ChooseFragment) (obj1));
    }

    private ChooseFragment c(int i)
    {
        if (i < d.size())
        {
            Class class1 = (Class)d.get(i);
            ChooseFragment choosefragment1 = (ChooseFragment)c.get(class1);
            ChooseFragment choosefragment = choosefragment1;
            if (choosefragment1 == null)
            {
                choosefragment = a(class1, b);
                c.put(class1, choosefragment);
            }
            return choosefragment;
        } else
        {
            return null;
        }
    }

    public ChooseFragment a(int i)
    {
        return c(i);
    }

    public void a(Class class1)
    {
        d.add(class1);
        notifyDataSetChanged();
    }

    public String b(int i)
    {
        return a.getString(a(i).b());
    }

    public int getCount()
    {
        return d.size();
    }

    public Fragment getItem(int i)
    {
        return a(i);
    }

    public CharSequence getPageTitle(int i)
    {
        return b(i);
    }
}

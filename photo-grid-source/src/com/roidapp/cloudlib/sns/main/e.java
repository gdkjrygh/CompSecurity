// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.roidapp.cloudlib.sns.main:
//            b

public final class e extends FragmentPagerAdapter
{

    private List a;
    private final Set b = new HashSet();

    public e(FragmentManager fragmentmanager, List list)
    {
        super(fragmentmanager);
        a = list;
    }

    public final b a(int i)
    {
        if (a != null && a.size() > i)
        {
            return (b)a.get(i);
        } else
        {
            return null;
        }
    }

    public final void a(int i, b b1)
    {
        if (a != null && a.size() > i)
        {
            Fragment fragment = (Fragment)a.get(i);
            if (!fragment.equals(b1))
            {
                b.add(Integer.valueOf(fragment.hashCode()));
                a.set(i, b1);
            }
        }
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Fragment getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        b b1 = a(i);
        if (b1 != null)
        {
            return (long)(b1.hashCode() | i);
        } else
        {
            return super.getItemId(i);
        }
    }

    public final int getItemPosition(Object obj)
    {
        return !b.remove(Integer.valueOf(obj.hashCode())) ? -1 : -2;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.view.ViewGroup;
import com.tinder.enums.UserType;
import com.tinder.f.ak;
import com.tinder.fragments.ab;
import com.tinder.fragments.ac;
import com.tinder.fragments.aj;
import com.tinder.fragments.bd;
import com.tinder.fragments.bm;
import com.tinder.fragments.by;
import com.tinder.fragments.k;
import com.tinder.fragments.s;
import com.tinder.fragments.y;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.z;
import com.tinder.utils.o;
import com.tinder.utils.v;
import com.tinder.views.FragmentTagPagerAdapter;

public final class l extends FragmentTagPagerAdapter
{

    public static String a;
    z b;
    public Fragment c;
    public aj d;

    public l(m m)
    {
        super(m);
        a = "fragment recommendations";
        ManagerApp.h().a(this);
    }

    private Fragment a(String s1)
    {
        if (s1.equals("fragment recommendations"))
        {
            return new bd();
        }
        if (s1.equals("FRAGMENT_LOADING"))
        {
            return new ab();
        }
        if (s1.equals("fragment exhausted"))
        {
            return new y();
        }
        if (s1.equals("fragment view profile"))
        {
            return bm.a(b.b(), UserType.ME);
        }
        if (s1.equals("fragment app settings"))
        {
            return new k();
        }
        if (s1.equals("discover off"))
        {
            return new s();
        } else
        {
            return null;
        }
    }

    public static String a()
    {
        return a;
    }

    public final int getCount()
    {
        return 2;
    }

    public final Fragment getItem(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            boolean flag = true;
            if (c instanceof by)
            {
                flag = a.equals(((by)c).e());
            }
            if (c == null || !flag)
            {
                c = a(a);
            }
            return c;

        case 1: // '\001'
            break;
        }
        if (d == null)
        {
            d = aj.a();
        }
        return d;
    }

    public final int getItemPosition(Object obj)
    {
        (new StringBuilder("get item position called with : ")).append(obj);
        return -2;
    }

    public final Object instantiateItem(ViewGroup viewgroup, int i)
    {
        Object obj = super.instantiateItem(viewgroup, i);
        viewgroup = ((ViewGroup) (obj));
        if (obj == null)
        {
            v.b("Instantiated a fragment, but got null!?");
            viewgroup = a(a);
        }
        if (!(viewgroup instanceof ac)) goto _L2; else goto _L1
_L1:
        c = (ac)viewgroup;
_L4:
        o.a((Fragment)viewgroup);
        return viewgroup;
_L2:
        if (viewgroup instanceof aj)
        {
            d = (aj)viewgroup;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final boolean isCorrectFragment(int i, Fragment fragment)
    {
label0:
        {
            if (i == 0)
            {
                String s1 = a;
                if ((!s1.equals("fragment recommendations") || !(fragment instanceof bd)) && (!s1.equals("FRAGMENT_LOADING") || !(fragment instanceof ab)) && (!s1.equals("fragment exhausted") || !(fragment instanceof y)) && (!s1.equals("discover off") || !(fragment instanceof s)))
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.support.v4.app.p;
import android.view.ViewGroup;
import com.tinder.enums.UserType;
import com.tinder.f.ak;
import com.tinder.fragments.ac;
import com.tinder.fragments.af;
import com.tinder.fragments.ay;
import com.tinder.fragments.bm;
import com.tinder.fragments.k;
import com.tinder.fragments.u;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.z;
import com.tinder.model.Match;
import com.tinder.sunset.b;
import com.tinder.utils.o;
import com.tinder.utils.v;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.tinder.adapters:
//            n

public final class ActivityMainPagerAdapter extends p
{
    public static final class ModalType extends Enum
    {

        public static final ModalType a;
        public static final ModalType b;
        public static final ModalType c;
        public static final ModalType d;
        public static final ModalType e;
        public static final ModalType f;
        public static final ModalType g;
        private static final ModalType h[];

        public static ModalType valueOf(String s)
        {
            return (ModalType)Enum.valueOf(com/tinder/adapters/ActivityMainPagerAdapter$ModalType, s);
        }

        public static ModalType[] values()
        {
            return (ModalType[])h.clone();
        }

        static 
        {
            a = new ModalType("NONE", 0);
            b = new ModalType("MATCH", 1);
            c = new ModalType("MATCHES", 2);
            d = new ModalType("MY_PROFILE", 3);
            e = new ModalType("APP_SETTINGS", 4);
            f = new ModalType("DISCOVER_SETTINGS", 5);
            g = new ModalType("MOMENTS_SUNSET", 6);
            h = (new ModalType[] {
                a, b, c, d, e, f, g
            });
        }

        private ModalType(String s, int i)
        {
            super(s, i);
        }
    }


    z a;
    public ac b;
    public Match c;
    public List d;

    public ActivityMainPagerAdapter(m m)
    {
        super(m);
        ManagerApp.h().a(this);
        d = new ArrayList(5);
    }

    public final Fragment a(int i)
    {
        ModalType modaltype;
        switch (i)
        {
        default:
            modaltype = (ModalType)d.get(i - 1);
            if (modaltype == com.tinder.adapters.ModalType.b && c != null)
            {
                return af.a(c);
            }
            break;

        case 0: // '\0'
            return new ac();
        }
        if (modaltype == ModalType.c)
        {
            return ay.a();
        }
        if (modaltype == ModalType.d)
        {
            return bm.a(a.b(), UserType.ME);
        }
        if (modaltype == ModalType.e)
        {
            return new k();
        }
        if (modaltype == ModalType.f)
        {
            return new u();
        }
        if (modaltype == ModalType.g)
        {
            return new b();
        } else
        {
            return null;
        }
    }

    public final void a()
    {
        if (d.size() != 0)
        {
            d.remove(d.size() - 1);
            notifyDataSetChanged();
        }
    }

    public final void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        (new StringBuilder("destroyItem position: ")).append(i).append(" object: ").append(obj);
        if (obj instanceof af)
        {
            n n1 = ((af)obj).k;
            n1.a = true;
            try
            {
                n1.notifyDataSetChanged();
            }
            catch (Exception exception)
            {
                v.a("Failed to recreate dataset for Match Pager Adapter", exception);
            }
        }
        try
        {
            super.destroyItem(viewgroup, i, obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            return;
        }
    }

    public final int getCount()
    {
        return d.size() + 1;
    }

    public final int getItemPosition(Object obj)
    {
        return !(obj instanceof ac) ? -2 : -1;
    }

    public final Object instantiateItem(ViewGroup viewgroup, int i)
    {
        viewgroup = ((ViewGroup) (super.instantiateItem(viewgroup, i)));
        if (viewgroup instanceof ac)
        {
            b = (ac)viewgroup;
        }
        o.a((Fragment)viewgroup);
        return viewgroup;
    }
}

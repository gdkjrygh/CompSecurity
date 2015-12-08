// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.roidapp.cloudlib.template.b.c;
import com.roidapp.cloudlib.template.c.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            TemplateSelectorActivity

final class cu extends FragmentPagerAdapter
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{

    private final WeakReference a;
    private final List b = new ArrayList();
    private Context c;
    private ViewPager d;
    private ImageView e;
    private ImageButton f;
    private Handler g;
    private RelativeLayout h;
    private RelativeLayout i;
    private RelativeLayout j;
    private f k;
    private TemplateSelectorActivity l;

    public cu(TemplateSelectorActivity templateselectoractivity)
    {
        super(templateselectoractivity.getSupportFragmentManager());
        a = new WeakReference(templateselectoractivity);
        l = (TemplateSelectorActivity)a.get();
        if (l != null)
        {
            c = l;
            d = TemplateSelectorActivity.a(l);
            g = TemplateSelectorActivity.d(l);
            d.setOnPageChangeListener(this);
            e = TemplateSelectorActivity.i(l);
            f = TemplateSelectorActivity.j(l);
            h = TemplateSelectorActivity.k(l);
            i = TemplateSelectorActivity.l(l);
            j = TemplateSelectorActivity.m(l);
        }
    }

    static List a(cu cu1)
    {
        return cu1.b;
    }

    public final void a(f f1)
    {
        if (b != null && f1 != null)
        {
            b.add(f1);
            notifyDataSetChanged();
        }
    }

    public final void b(f f1)
    {
        k = (f)b.remove(2);
        b.add(2, f1);
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Fragment getItem(int i1)
    {
        return (Fragment)b.get(i1);
    }

    public final long getItemId(int i1)
    {
        Fragment fragment = getItem(i1);
        if (fragment != null)
        {
            return (long)fragment.hashCode();
        } else
        {
            return (long)i1;
        }
    }

    public final int getItemPosition(Object obj)
    {
        if (obj == k)
        {
            return -2;
        } else
        {
            return super.getItemPosition(obj);
        }
    }

    public final void onPageScrollStateChanged(int i1)
    {
    }

    public final void onPageScrolled(int i1, float f1, int j1)
    {
    }

    public final void onPageSelected(int i1)
    {
        if (c != null && d != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (l != null)
        {
            l.i();
        }
        d.setCurrentItem(i1);
        if (f == null || h == null || j == null || i == null) goto _L1; else goto _L3
_L3:
        switch (i1)
        {
        default:
            return;

        case 0: // '\0'
            f.setVisibility(0);
            i.setSelected(true);
            h.setSelected(false);
            j.setSelected(false);
            if (!((c)g).d())
            {
                g.sendEmptyMessage(8978);
                return;
            }
            break;

        case 1: // '\001'
            f.setVisibility(0);
            j.setSelected(true);
            h.setSelected(false);
            i.setSelected(false);
            if (!((c)g).e())
            {
                g.sendEmptyMessage(8980);
            }
            if (e != null && e.getVisibility() == 0)
            {
                e.setVisibility(8);
                PreferenceManager.getDefaultSharedPreferences(c).edit().putBoolean("TEMPLATE_STUFF_NEW", false).apply();
                return;
            }
            break;

        case 2: // '\002'
            f.setVisibility(4);
            h.setSelected(true);
            j.setSelected(false);
            i.setSelected(false);
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (((c)g).c()) goto _L1; else goto _L5
_L5:
        g.sendEmptyMessage(8976);
        return;
    }
}

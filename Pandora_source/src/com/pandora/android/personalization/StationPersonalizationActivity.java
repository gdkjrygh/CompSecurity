// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.personalization;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.h;
import android.support.v4.app.k;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.pandora.android.activity.BaseFragmentActivity;
import com.pandora.android.activity.a;
import com.pandora.android.activity.c;
import com.pandora.android.activity.d;
import com.pandora.android.coachmark.CoachmarkBuilder;
import com.pandora.android.provider.b;
import com.pandora.radio.data.y;
import java.security.InvalidParameterException;
import p.ca.p;
import p.ca.x;
import p.dd.ag;

public class StationPersonalizationActivity extends BaseFragmentActivity
    implements d
{
    private class a
    {

        final StationPersonalizationActivity a;

        public void onPlayerStateChange(ag ag1)
        {
            static class _cls3
            {

                static final int a[];
                static final int b[];

                static 
                {
                    b = new int[p.cw.b.a.values().length];
                    try
                    {
                        b[p.cw.b.a.b.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        b[p.cw.b.a.a.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        b[p.cw.b.a.e.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        b[p.cw.b.a.d.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        b[p.cw.b.a.c.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    a = new int[com.pandora.android.coachmark.e.e.values().length];
                    try
                    {
                        a[com.pandora.android.coachmark.e.e.m.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (com.pandora.android.personalization._cls3.b[ag1.a.ordinal()])
            {
            default:
                throw new InvalidParameterException((new StringBuilder()).append("onPlayerStateChangeEvent called with unknown PlayerStateChangeEvent state: ").append(ag1.a).toString());

            case 1: // '\001'
                if (!a.m().c())
                {
                    a.m().a();
                }
                return;

            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                a.m().d();
                return;
            }
        }

        private a()
        {
            a = StationPersonalizationActivity.this;
            super();
        }

    }


    private h o;
    private y p;
    private p.cl.a q;
    private a z;

    public StationPersonalizationActivity()
    {
    }

    public static Bundle a(y y1, View view, Class class1, boolean flag, boolean flag1, boolean flag2)
    {
        Bundle bundle = new Bundle();
        if (view != null)
        {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            bundle.putParcelable("sp_menu_action_view_rect", rect);
        }
        if (class1 != null)
        {
            bundle.putString("sp_entry_point_launch", class1.toString());
        }
        bundle.putBoolean("sp_show_thumb_history", flag);
        bundle.putBoolean("action_show_add_variety", flag1);
        bundle.putBoolean("intent_jump_to_thumbs_down", flag2);
        bundle.putSerializable("intent_station_data", y1);
        return bundle;
    }

    public static void a(Activity activity, y y1, View view, Class class1)
    {
        y1 = a(y1, view, class1, false, false, false);
        c.a().a(activity, com/pandora/android/personalization/StationPersonalizationActivity, y1, new Pair(Integer.valueOf(0), Integer.valueOf(0)));
    }

    public static void a(Activity activity, y y1, Class class1)
    {
        y1 = a(y1, null, class1, false, true, false);
        c.a().a(activity, com/pandora/android/personalization/StationPersonalizationActivity, y1, new Pair(Integer.valueOf(0), Integer.valueOf(0)));
    }

    public static void a(Activity activity, y y1, Class class1, boolean flag)
    {
        y1 = a(y1, null, class1, true, false, flag);
        c.a().a(activity, com/pandora/android/personalization/StationPersonalizationActivity, y1, new Pair(Integer.valueOf(0), Integer.valueOf(0)));
    }

    public int a(x x1)
    {
        k k1 = o.a();
        k1.a(0, 0);
        x1 = (Fragment)x1;
        k1.a(0x7f050007, 0x7f050008);
        k1.b(0x7f10020f, x1, null);
        k1.a(0);
        k1.a(null);
        k1.b();
        o.b();
        return o.e();
    }

    protected void a(Context context, Intent intent, String s)
    {
    }

    public void a(CoachmarkBuilder coachmarkbuilder)
    {
        super.a(coachmarkbuilder);
        com.pandora.android.coachmark.e.e e = coachmarkbuilder.e();
        switch (com.pandora.android.personalization._cls3.a[e.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            com.pandora.android.activity.a.a(this, 1, (y)coachmarkbuilder.o(), null, null);
            break;
        }
    }

    protected boolean ab()
    {
        return true;
    }

    public void ae()
    {
    }

    public void ag()
    {
    }

    protected IntentFilter l()
    {
        return null;
    }

    p.cl.a m()
    {
        if (q == null)
        {
            q = new p.cl.a(0x493e0L);
            q.a(new p.cl.a.b() {

                final StationPersonalizationActivity a;

                public void a()
                {
                    b.a.E();
                    a.finish();
                }

            
            {
                a = StationPersonalizationActivity.this;
                super();
            }
            });
        }
        return q;
    }

    public x n()
    {
        if (o.e() == 0)
        {
            return new p();
        } else
        {
            return (x)o.a(0x7f10020f);
        }
    }

    public void onBackPressed()
    {
        x x1 = n();
        if (x1 != null)
        {
            x1.c();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        boolean flag1 = false;
        super.onCreate(bundle);
        setContentView(0x7f040080);
        z = new a();
        b.a.b().b(z);
        Intent intent = getIntent();
        Rect rect = (Rect)intent.getParcelableExtra("sp_menu_action_view_rect");
        p = (y)intent.getSerializableExtra("intent_station_data");
        String s = intent.getStringExtra("sp_entry_point_launch");
        boolean flag2 = intent.getBooleanExtra("sp_show_thumb_history", false);
        boolean flag;
        if (flag2)
        {
            flag = intent.getBooleanExtra("intent_jump_to_thumbs_down", false);
        } else
        {
            flag = false;
        }
        if (!flag2)
        {
            flag1 = intent.getBooleanExtra("action_show_add_variety", false);
        }
        o = f();
        if (bundle == null)
        {
            a(p.cj.c.a(p, rect, s, flag1, flag2, flag));
        }
        if (!m().c())
        {
            m().a();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        com.pandora.android.activity.a.a(menu, getMenuInflater(), new android.view.View.OnClickListener() {

            final StationPersonalizationActivity a;

            public void onClick(View view)
            {
                if (com.pandora.android.activity.a.d(a, 0x7f10000f))
                {
                    a.finish();
                }
            }

            
            {
                a = StationPersonalizationActivity.this;
                super();
            }
        });
        super.onCreateOptionsMenu(menu);
        return true;
    }

    protected void onDestroy()
    {
        f("onDestroy");
        super.onDestroy();
        if (m().c())
        {
            m().d();
        }
        q = null;
        b.a.b().c(z);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (com.pandora.android.activity.a.d(this, menuitem.getItemId()))
        {
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPause()
    {
        super.onPause();
        if (b.a.b().d().o() && !m().c())
        {
            m().a();
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (m().c())
        {
            m().b();
        }
    }

    public void onUserInteraction()
    {
        super.onUserInteraction();
        if (m().c())
        {
            m().b();
        }
    }

    public void r()
    {
        o.c();
    }
}

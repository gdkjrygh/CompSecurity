// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.support.v4.app.Fragment;
import com.pandora.android.provider.b;
import p.ca.x;
import p.cw.c;
import p.dg.i;

// Referenced classes of package com.pandora.android.activity:
//            f, HomeTabsActivity, h

class a
    implements Runnable
{

    final f a;
    final b b;

    public void run()
    {
        x x1 = (x)a.a;
        HomeTabsActivity.a(b.b, x1, true);
        x1.b(a.a(false));
        if (HomeTabsActivity.d(b.b) != null)
        {
            b.b.a(HomeTabsActivity.d(b.b), true);
            HomeTabsActivity.a(b.b, null);
        }
    }

    lues(lues lues, f f1)
    {
        b = lues;
        a = f1;
        super();
    }

    // Unreferenced inner class com/pandora/android/activity/HomeTabsActivity$3

/* anonymous class */
    class HomeTabsActivity._cls3
        implements HomeTabsActivity.c
    {

        final HomeTabsActivity a;
        private HomeTabsActivity.b b[];

        public void a(int j)
        {
            Fragment fragment = b[j].e.a;
            if (fragment != null)
            {
                HomeTabsActivity.a(a, new HomeTabsActivity._cls3._cls1(fragment));
            }
        }

        public void a(Fragment fragment, int j)
        {
            b[j].e.a = fragment;
            HomeTabsActivity.e(a).b();
            a.R();
        }

        public void b(int j)
        {
            HomeTabsActivity.a(a, true);
            a.f((new StringBuilder()).append("homeTab Changed to (pending): ").append(b[j].e.b).toString());
            com.pandora.android.activity.HomeTabsActivity.b(a);
            b.a.b().f().b();
            Object obj = b[j].e;
            a.f((new StringBuilder()).append("homeTab Changed to (actual): ").append(((f) (obj)).b).toString());
            a.v();
            com.pandora.android.activity.HomeTabsActivity.c(a).removeMessages(123);
            obj = new HomeTabsActivity._cls3._cls2(this, ((f) (obj)));
            obj = com.pandora.android.activity.HomeTabsActivity.c(a).obtainMessage(123, obj);
            com.pandora.android.activity.HomeTabsActivity.c(a).sendMessageDelayed(((android.os.Message) (obj)), 250L);
            a.ae();
            a.af();
        }

            
            {
                a = hometabsactivity;
                super();
                b = HomeTabsActivity.b.values();
            }

        // Unreferenced inner class com/pandora/android/activity/HomeTabsActivity$3$1

/* anonymous class */
        class HomeTabsActivity._cls3._cls1
            implements HomeTabsActivity.a
        {

            final Fragment a;
            final HomeTabsActivity._cls3 b;

            public void a(x x1)
            {
                boolean flag;
                if (a == x1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                x1.b(flag);
            }

                    
                    {
                        b = HomeTabsActivity._cls3.this;
                        a = fragment;
                        super();
                    }
        }

    }

}

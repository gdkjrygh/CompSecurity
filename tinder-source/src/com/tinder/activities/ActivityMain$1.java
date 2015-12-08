// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.widget.Toast;
import com.b.a.c;
import com.b.a.d;
import com.tinder.adapters.ActivityMainPagerAdapter;
import com.tinder.e.ab;
import com.tinder.fragments.ac;
import com.tinder.fragments.bd;
import com.tinder.managers.i;
import com.tinder.managers.n;
import com.tinder.managers.z;
import com.tinder.model.Match;
import com.tinder.model.User;
import com.tinder.views.CustomDrawerLayout;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.tinder.activities:
//            ActivityMain

final class a
    implements ab
{

    final ActivityMain a;

    public final void onProfileLoadFailed()
    {
        Toast.makeText(a.getApplicationContext(), 0x7f060210, 0).show();
    }

    public final void onProfileLoaded(User user)
    {
label0:
        {
            int j;
            int k;
label1:
            {
                if (user == null || a.e.b() == null)
                {
                    break label0;
                }
                String s = a.e.b().getAge();
                String s1 = user.getAge();
                if (s1 != null && s != null)
                {
                    j = Integer.parseInt(s);
                    k = Integer.parseInt(s1);
                    if (j >= 18 || k < 18)
                    {
                        break label1;
                    }
                    Toast.makeText(a.getApplicationContext(), 0x7f060258, 0).show();
                }
                return;
            }
            if (j >= 18 && k < 18)
            {
                Toast.makeText(a.getApplicationContext(), 0x7f06026d, 0).show();
                return;
            }
            Object obj = a.c;
            Object obj1 = user.getId();
            obj = d.a(((i) (obj)).a).a(new n(((String) (obj1)))).b();
            if (obj == null || !((c) (obj)).c())
            {
                obj = null;
            } else
            {
                obj = (Match)((c) (obj)).b();
            }
            if (obj != null)
            {
                ActivityMain.a(a);
                a.i();
                a.a(((Match) (obj)), false);
                return;
            }
            if (user.getId().equals(a.e.b().getId()))
            {
                ActivityMain.a(a);
                a.q();
                return;
            }
            obj = ActivityMain.b(a);
            obj1 = ((com.tinder.managers.ab) (obj)).a.iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                User user1 = (User)((Iterator) (obj1)).next();
                if (user1.getId().equals(user.getId()))
                {
                    ((com.tinder.managers.ab) (obj)).a.remove(user1);
                }
            } while (true);
            ((com.tinder.managers.ab) (obj)).a.add(0, user);
            user = com.tinder.activities.ActivityMain.c(a).b;
            if (user != null)
            {
                user = user.h();
                if (user != null)
                {
                    user.a();
                    user.a(true);
                }
            }
            com.tinder.activities.ActivityMain.d(a).closeDrawer();
            a.o();
            a.f();
            return;
        }
        Toast.makeText(a.getApplicationContext(), 0x7f060210, 0).show();
    }

    Adapter(ActivityMain activitymain)
    {
        a = activitymain;
        super();
    }
}

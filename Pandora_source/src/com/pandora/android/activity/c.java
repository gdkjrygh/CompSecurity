// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Pair;
import com.pandora.android.tablet.TabletHome;
import com.pandora.android.util.a;
import com.pandora.radio.util.b;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.pandora.android.activity:
//            HomeTabsActivity, HomeDrawerActivity, WelcomeActivity, AndroidLinkActivity, 
//            PandoraLinkInterceptorActivity, p, ModalPresenterActivity

public class c
{
    public static class a extends b
    {

        private static volatile c a;

        public static c a()
        {
            if (a == null)
            {
                a = new c();
            }
            return a;
        }
    }


    private LinkedList a;
    private LinkedList b;

    private c()
    {
        a = new LinkedList();
        b = new LinkedList();
    }


    public static c a()
    {
        return com.pandora.android.activity.a.a();
    }

    private Class d(Class class1)
    {
        Object obj;
        obj = class1;
        if (com.pandora.android.util.a.a(p.dj.b.a.i))
        {
            obj = class1;
            if (class1.equals(com/pandora/android/activity/HomeTabsActivity))
            {
                obj = com/pandora/android/activity/HomeDrawerActivity;
            }
        }
        class1 = a.iterator();
_L4:
        if (!class1.hasNext()) goto _L2; else goto _L1
_L1:
        if (!((Activity)class1.next()).getClass().equals(obj)) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L10:
        if (flag)
        {
            b.add(obj);
        }
        if (!obj.equals(com/pandora/android/activity/WelcomeActivity)) goto _L6; else goto _L5
_L5:
        c();
_L8:
        return ((Class) (obj));
_L6:
        if (!obj.equals(com/pandora/android/activity/AndroidLinkActivity)) goto _L8; else goto _L7
_L7:
        e();
        return ((Class) (obj));
_L2:
        flag = true;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void e()
    {
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Activity activity = (Activity)iterator.next();
            if (!activity.getClass().equals(com/pandora/android/activity/AndroidLinkActivity) && !activity.getClass().equals(com/pandora/android/activity/PandoraLinkInterceptorActivity))
            {
                activity.finish();
            }
        } while (true);
    }

    private boolean e(Class class1)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            if (((Activity)iterator.next()).getClass().equals(class1))
            {
                return true;
            }
        }

        return false;
    }

    private void f()
    {
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Activity activity = (Activity)iterator.next();
            if (activity instanceof p)
            {
                a(activity.getClass().getSimpleName(), "Stopping transient activity");
                activity.finish();
            }
        } while (true);
    }

    public void a(Activity activity)
    {
        b.remove(activity.getClass());
        if (!a.contains(activity))
        {
            a.add(activity);
        }
    }

    public void a(Activity activity, Class class1)
    {
        a(activity, class1, 0, null, null, -1, null);
    }

    public void a(Activity activity, Class class1, int i, Uri uri, Bundle bundle, int j, Pair pair)
    {
        class1 = d(class1);
        Intent intent = new Intent(activity.getApplicationContext(), class1);
        if (bundle != null)
        {
            intent.putExtras(bundle);
        }
        intent.setFlags(i);
        intent.setData(uri);
        a(activity.getClass().getSimpleName(), (new StringBuilder()).append("Starting new activity ").append(class1.getSimpleName()).append(" - ").append(intent.toString()).toString());
        activity.startActivityForResult(intent, j);
        if (pair != null)
        {
            activity.overridePendingTransition(((Integer)pair.first).intValue(), ((Integer)pair.second).intValue());
        }
        f();
    }

    public void a(Activity activity, Class class1, int i, Bundle bundle)
    {
        a(activity, class1, i, null, bundle, -1, null);
    }

    public void a(Activity activity, Class class1, int i, Bundle bundle, int j)
    {
        a(activity, class1, i, null, bundle, j, null);
    }

    public void a(Activity activity, Class class1, Bundle bundle)
    {
        a(activity, class1, 0, null, bundle, -1, null);
    }

    public void a(Activity activity, Class class1, Bundle bundle, Pair pair)
    {
        a(activity, class1, 0, null, bundle, -1, pair);
    }

    public void a(Fragment fragment, Class class1, int i, Uri uri, Bundle bundle, int j, Pair pair)
    {
        a(((Activity) (fragment.getActivity())), class1, i, uri, bundle, j, pair);
    }

    public void a(Fragment fragment, Class class1, int i, Bundle bundle, int j, Pair pair)
    {
        a(fragment, class1, i, null, bundle, j, pair);
    }

    public void a(Class class1)
    {
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Activity activity = (Activity)iterator.next();
            a("Controller", (new StringBuilder()).append("existingActivity.getClass().getSimpleName(): ").append(activity.getClass().getSimpleName()).toString());
            if (activity.getClass().equals(class1))
            {
                a(activity.getClass().getSimpleName(), "Force stopping activity (existing)");
                activity.finish();
            }
        } while (true);
    }

    protected void a(String s, String s1)
    {
        p.df.a.c("Controller", (new StringBuilder()).append("ACTIVITY [").append(s).append("] ").append(s1).toString());
    }

    public void b(Activity activity)
    {
        a(activity.getClass().getSimpleName(), "Activity complete");
        a.remove(activity);
    }

    public void b(Class class1)
    {
        Object obj = class1;
        if (com.pandora.android.util.a.a(p.dj.b.a.i))
        {
            obj = class1;
            if (class1.equals(com/pandora/android/activity/HomeTabsActivity))
            {
                obj = com/pandora/android/activity/HomeDrawerActivity;
            }
        }
        class1 = a.iterator();
        do
        {
            if (!class1.hasNext())
            {
                break;
            }
            Activity activity = (Activity)class1.next();
            if (!activity.isFinishing() && !activity.getClass().equals(obj))
            {
                activity.finish();
            }
        } while (true);
    }

    public boolean b()
    {
        if (a.size() == 0)
        {
            return false;
        }
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            if (((Activity)iterator.next()).hasWindowFocus())
            {
                return true;
            }
        }

        return false;
    }

    public void c()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((Activity)iterator.next()).finish()) { }
    }

    public void c(Activity activity)
    {
        Iterator iterator;
        boolean flag;
        iterator = a.iterator();
        flag = true;
_L8:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Activity activity1;
        Class class1;
        activity1 = (Activity)iterator.next();
        class1 = activity.getClass();
        if (!activity1.getClass().equals(class1)) goto _L4; else goto _L3
_L3:
        if (!flag) goto _L6; else goto _L5
_L5:
        if (!activity.isFinishing())
        {
            a(activity.getClass().getSimpleName(), "Stopping duplicate activity (new)");
            activity.finish();
        }
_L4:
        if (flag)
        {
            flag = false;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (!activity1.isFinishing())
        {
            a(activity1.getClass().getSimpleName(), "Stopping duplicate activity (existing)");
            activity1.finish();
        }
        if (true) goto _L4; else goto _L2
_L2:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean c(Class class1)
    {
        Object obj = class1;
        if (com.pandora.android.util.a.a(p.dj.b.a.i))
        {
            obj = class1;
            if (class1.equals(com/pandora/android/activity/HomeTabsActivity))
            {
                obj = com/pandora/android/activity/HomeDrawerActivity;
            }
        }
        for (class1 = b.iterator(); class1.hasNext();)
        {
            if (((Class)class1.next()).equals(obj))
            {
                return true;
            }
        }

        return false;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    public void d(Activity activity)
    {
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Activity activity1 = (Activity)iterator.next();
            Class class1 = activity.getClass();
            if (activity1.getClass().equals(class1))
            {
                a(activity1.getClass().getSimpleName(), "Stopping duplicate activity (existing)");
                activity1.finish();
            }
        } while (true);
    }

    public boolean d()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            Activity activity = (Activity)iterator.next();
            if (activity.getClass().equals(com/pandora/android/activity/ModalPresenterActivity))
            {
                return !activity.isFinishing();
            }
        }

        return false;
    }

    public boolean e(Activity activity)
    {
        while (a.size() == 0 || a.size() == 1 && e(activity.getClass())) 
        {
            return true;
        }
        return false;
    }

    public boolean f(Activity activity)
    {
        Object obj;
        if (com.pandora.android.util.a.a(p.dj.b.a.i))
        {
            obj = com/pandora/android/activity/HomeDrawerActivity;
        } else
        {
            obj = com/pandora/android/activity/HomeTabsActivity;
        }
        return a.size() == 2 && e(activity.getClass()) && e(((Class) (obj)));
    }

    public boolean g(Activity activity)
    {
        return a.size() == 2 && e(activity.getClass()) && e(com/pandora/android/tablet/TabletHome);
    }
}

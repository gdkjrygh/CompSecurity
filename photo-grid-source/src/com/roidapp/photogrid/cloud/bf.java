// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.roidapp.baselib.c.n;
import com.roidapp.photogrid.cloud.a.l;
import com.roidapp.photogrid.common.af;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            o, BaseShareActivity, p, bg, 
//            bh

public final class bf
    implements o
{

    private BaseShareActivity a;

    bf(BaseShareActivity baseshareactivity)
    {
        a = baseshareactivity;
        af.d(baseshareactivity, (new StringBuilder("Save/Finish/")).append(baseshareactivity.m).toString());
    }

    static p a(bf bf1)
    {
        return bf1.h();
    }

    public static boolean a(Activity activity, int i, String s, int j, String s1, String s2, String s3, String s4, 
            String s5, boolean flag, int k)
    {
        return BaseShareActivity.a(activity, i, s, j, s1, s2, s3, s4, s5, flag, false, k);
    }

    static BaseShareActivity b(bf bf1)
    {
        return bf1.a;
    }

    private p h()
    {
        Object obj;
        SharedPreferences sharedpreferences;
        sharedpreferences = a.getSharedPreferences("share", 0);
        obj = null;
        if (!a.j) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj2;
        Intent intent;
        obj1 = new HashSet();
        obj2 = a.getPackageManager();
        intent = new Intent("android.intent.action.SEND", null);
        intent.setType("video/mp4");
        obj = null;
        obj2 = ((PackageManager) (obj2)).queryIntentActivities(intent, 0);
        obj = obj2;
_L11:
        if (obj != null)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj3 = (ResolveInfo)((Iterator) (obj)).next();
                if (((ResolveInfo) (obj3)).activityInfo != null)
                {
                    obj3 = ((ResolveInfo) (obj3)).activityInfo.packageName;
                    if (!TextUtils.isEmpty(((CharSequence) (obj3))))
                    {
                        ((Set) (obj1)).add(obj3);
                    }
                }
            } while (true);
        }
        obj = obj1;
_L2:
        int i;
        long l1;
        obj1 = new TreeSet();
        long l2 = 100L;
        if (n.a(a, "com.whatsapp"))
        {
            p p1 = new p(sharedpreferences.getLong("Whatsapp", 100L), 0x7f020196, -7, "Whatsapp");
            p1.d = "com.whatsapp";
            ((TreeSet) (obj1)).add(p1);
            l2 = 99L;
        }
        l1 = l2;
        if (n.a(a, "com.google.android.apps.plus"))
        {
            ((TreeSet) (obj1)).add(new p(sharedpreferences.getLong("Google+", l2), 0x7f020162, -2, "Google+"));
            l1 = l2 - 1L;
        }
        l2 = l1;
        if (!a.j)
        {
            ((TreeSet) (obj1)).add(new p(sharedpreferences.getLong("Pinterest", l1), 0x7f020173, -6, "Pinterest"));
            l2 = l1 - 1L;
        }
        String s = a.getString(0x7f070140);
        l1 = l2 - 1L;
        ((TreeSet) (obj1)).add(new p(sharedpreferences.getLong(s, l2), 0x7f02016d, -3, s));
        if (n.a(a, "com.facebook.orca"))
        {
            ((TreeSet) (obj1)).add(new p(sharedpreferences.getLong("Messenger", l1), 0x7f02015b, -8, "Messenger"));
            l1--;
        }
        i = 0;
_L9:
        if (i >= BaseShareActivity.d.length) goto _L4; else goto _L3
_L3:
        if (obj != null) goto _L6; else goto _L5
_L5:
        long l3 = l1;
        if (!n.a(a, BaseShareActivity.d[i].d)) goto _L8; else goto _L7
_L7:
        ((TreeSet) (obj1)).add(new p(BaseShareActivity.d[i], sharedpreferences.getLong(BaseShareActivity.d[i].c, l1), i));
        l3 = l1 - 1L;
_L8:
        i++;
        l1 = l3;
          goto _L9
_L6:
        l3 = l1;
        if (!((Set) (obj)).contains(BaseShareActivity.d[i].d)) goto _L8; else goto _L7
_L4:
        if (((TreeSet) (obj1)).isEmpty())
        {
            return null;
        } else
        {
            return (p)((TreeSet) (obj1)).first();
        }
        Exception exception;
        exception;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final View a(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(a).inflate(0x7f03001e, viewgroup, false);
        if (viewgroup != null)
        {
            TextView textview = (TextView)viewgroup.findViewById(0x7f0d00a3);
            if (textview != null)
            {
                textview.setText(0x7f0702b6);
            }
        }
        return viewgroup;
    }

    public final String a(String s)
    {
        return (new StringBuilder()).append(s).append('/').toString();
    }

    public final void a()
    {
    }

    public final void a(int i, int j, Intent intent)
    {
    }

    public final void a(View view)
    {
    }

    public final l[] b()
    {
        if (a.j)
        {
            return (new l[] {
                new bg(this, a, a)
            });
        } else
        {
            return (new l[] {
                new bh(this, a, a), new bg(this, a, a)
            });
        }
    }

    public final int c()
    {
        if (a.k == 0)
        {
            DisplayMetrics displaymetrics = a.getResources().getDisplayMetrics();
            a.k = Math.round(a.getResources().getDimension(0x7f090139) - displaymetrics.density * 16F);
        }
        return 0x7f0d00a1;
    }

    public final int d()
    {
        return 0x7f070227;
    }

    public final String e()
    {
        return "#PhotoGrid";
    }

    public final boolean f()
    {
        return false;
    }

    public final void g()
    {
    }
}

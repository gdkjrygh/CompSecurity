// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.c;
import com.roidapp.cloudlib.sns.b.h;
import com.roidapp.cloudlib.sns.notification.p;
import com.roidapp.photogrid.common.az;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage

final class ab extends aa
{

    final MainPage a;

    ab(MainPage mainpage)
    {
        a = mainpage;
        super();
    }

    public final void b(int i, Exception exception)
    {
    }

    public final void c(Object obj)
    {
        obj = (c)obj;
        if (obj == null || ((c) (obj)).isEmpty())
        {
            return;
        }
        long l = PreferenceManager.getDefaultSharedPreferences(a).getLong("notification_fresh_time", 0L);
        int i = 0;
        int j;
        int k;
        for (j = 0; i < ((c) (obj)).size(); j = k)
        {
            k = j;
            if (((h)((c) (obj)).get(i)).f > l)
            {
                k = j + 1;
            }
            i++;
        }

        if (j > 0)
        {
            if (MainPage.z(a) == null)
            {
                MainPage.a(a, new p(a));
            }
            MainPage.A(a);
            if (MainPage.B(a).isShown())
            {
                MainPage.z(a).a(MainPage.B(a), j);
            } else
            {
                MainPage.z(a).a();
            }
            if (MainPage.C(a) != null && a.a(az.r) != MainPage.D(a))
            {
                MainPage.C(a).setVisibility(0);
            }
        }
        if (((c) (obj)).isEmpty())
        {
            l = 0L;
        } else
        {
            l = ((h)((c) (obj)).get(0)).f;
        }
        MainPage.a(a, l);
    }
}

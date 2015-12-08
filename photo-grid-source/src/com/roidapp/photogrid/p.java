// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Message;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.y;
import com.roidapp.cloudlib.template.TemplateInfo;
import com.roidapp.cloudlib.template.b.b;
import com.roidapp.cloudlib.template.d;
import com.roidapp.cloudlib.template.j;
import com.roidapp.photogrid.common.bd;
import com.roidapp.photogrid.release.ImageSelector;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid:
//            k, MainPage

final class p extends b
{

    final k a;

    p(k k1)
    {
        a = k1;
        super();
    }

    public final FragmentActivity a()
    {
        return k.a(a);
    }

    public final void a(d d)
    {
        if (k.a(a) == null || k.a(a).isFinishing())
        {
            return;
        } else
        {
            bd.a(d);
            j.c();
            d = new Intent();
            d.putExtra("isFromTemplate", true);
            k.a(a).getSharedPreferences("FaceClip", 0).edit().putBoolean("needFaceClip", false).apply();
            d.setClass(k.a(a), com/roidapp/photogrid/release/ImageSelector);
            a.startActivity(d);
            k.a(a).finish();
            return;
        }
    }

    public final void a(boolean flag)
    {
        if (com.roidapp.photogrid.k.b(a) != null)
        {
            com.roidapp.photogrid.k.b(a).c_(com.roidapp.photogrid.k.b(a).g() + 2);
        }
    }

    public final void b(List list)
    {
        if (list == null || list.isEmpty())
        {
            return;
        }
        long l = PreferenceManager.getDefaultSharedPreferences(aj.a()).getLong("newestHotID", 0L);
        Object obj = null;
        Iterator iterator = list.iterator();
        list = obj;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            TemplateInfo templateinfo = (TemplateInfo)iterator.next();
            if (l == -1L && list != null)
            {
                break;
            }
            if (l != -1L && templateinfo.e() > l)
            {
                k.f(a);
            } else
            {
                l = -1L;
            }
            if (list == null && !j.a().c(templateinfo) && !j.b(templateinfo.e()))
            {
                list = templateinfo;
            }
        } while (true);
        k.a(a, list);
    }

    public final void g()
    {
        Message.obtain(k.e(a), 8980).sendToTarget();
    }
}

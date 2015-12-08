// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.a.c.d;
import com.roidapp.photogrid.common.az;

// Referenced classes of package com.roidapp.photogrid.release:
//            oa, hw, PhotoGridActivity

final class ob
    implements android.widget.AdapterView.OnItemClickListener
{

    final oa a;

    ob(oa oa1)
    {
        a = oa1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (oa.a(a))
        {
            oa.c(a).setText(oa.b(a)[i]);
            a.a.dismiss();
            if (i == 0)
            {
                hw.a(com.roidapp.photogrid.release.oa.d(a), false);
                return;
            } else
            {
                hw.a(com.roidapp.photogrid.release.oa.d(a), true);
                return;
            }
        }
        if (oa.e(a))
        {
            az.v = false;
            oa.c(a).setText(oa.b(a)[i]);
            a.a.dismiss();
            if (oa.f(a) != null)
            {
                oa.f(a).setText(com.roidapp.photogrid.release.oa.d(a).getResources().getString(0x7f07024c));
            }
            if (d.a())
            {
                if (i == 0)
                {
                    if (oa.f(a) != null)
                    {
                        oa.f(a).setText(com.roidapp.photogrid.release.oa.d(a).getResources().getString(0x7f07024d));
                    }
                    hw.a(com.roidapp.photogrid.release.oa.d(a), "Smart");
                    return;
                }
                if (i == 1)
                {
                    hw.a(com.roidapp.photogrid.release.oa.d(a), "High");
                    return;
                }
                if (i == 2)
                {
                    hw.a(com.roidapp.photogrid.release.oa.d(a), "Medium");
                    return;
                } else
                {
                    hw.a(com.roidapp.photogrid.release.oa.d(a), "Low");
                    return;
                }
            }
            if (i == 0)
            {
                hw.a(com.roidapp.photogrid.release.oa.d(a), "High");
                return;
            }
            if (i == 1)
            {
                hw.a(com.roidapp.photogrid.release.oa.d(a), "Medium");
                return;
            } else
            {
                hw.a(com.roidapp.photogrid.release.oa.d(a), "Low");
                return;
            }
        }
        if (!oa.g(a) && !oa.h(a))
        {
            if (i != 0)
            {
                oa.c(a).setText((new StringBuilder()).append(oa.i(a)[i - 1]).append("P").toString());
                hw.a(com.roidapp.photogrid.release.oa.d(a), oa.i(a)[i - 1]);
                a.a.dismiss();
                return;
            } else
            {
                ((PhotoGridActivity)com.roidapp.photogrid.release.oa.d(a)).t();
                return;
            }
        } else
        {
            oa.c(a).setText((new StringBuilder()).append(oa.i(a)[i]).append("P").toString());
            hw.a(com.roidapp.photogrid.release.oa.d(a), oa.i(a)[i]);
            a.a.dismiss();
            return;
        }
    }
}

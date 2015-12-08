// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.view.View;
import com.roidapp.photogrid.release.ImageEditor;
import com.roidapp.photogrid.release.PhotoGridActivity;

// Referenced classes of package com.roidapp.photogrid.common:
//            be, af

final class bi
    implements android.view.View.OnClickListener
{

    final Activity a;
    final String b;
    final int c;
    final be d;

    bi(be be1, Activity activity, String s, int i)
    {
        d = be1;
        a = activity;
        b = s;
        c = i;
        super();
    }

    public final void onClick(View view)
    {
        if (System.currentTimeMillis() - be.b(d) < 3000L)
        {
            return;
        }
        be.a(d, System.currentTimeMillis());
        af.b(a, (new StringBuilder("Preview/")).append(be.c(d)).append("/share").toString());
        if (be.d(d))
        {
            ((ImageEditor)a).a(b);
            return;
        }
        if (((PhotoGridActivity)a).i)
        {
            ((PhotoGridActivity)a).r = true;
            return;
        } else
        {
            ((PhotoGridActivity)a).a(b, c);
            return;
        }
    }
}

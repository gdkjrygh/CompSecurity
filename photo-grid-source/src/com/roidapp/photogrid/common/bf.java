// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.view.View;
import com.roidapp.photogrid.release.PhotoGridActivity;

// Referenced classes of package com.roidapp.photogrid.common:
//            be

final class bf
    implements android.view.View.OnClickListener
{

    final Activity a;
    final be b;

    bf(be be1, Activity activity)
    {
        b = be1;
        a = activity;
        super();
    }

    public final void onClick(View view)
    {
        view = (PhotoGridActivity)a;
        if (((PhotoGridActivity) (view)).i)
        {
            return;
        } else
        {
            view.y();
            be.a(b);
            return;
        }
    }
}

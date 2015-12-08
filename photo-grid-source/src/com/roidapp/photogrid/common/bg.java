// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.roidapp.photogrid.release.PhotoGridActivity;
import com.roidapp.photogrid.release.Preference;

// Referenced classes of package com.roidapp.photogrid.common:
//            be

final class bg
    implements android.view.View.OnClickListener
{

    final Activity a;
    final be b;

    bg(be be, Activity activity)
    {
        b = be;
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
            Intent intent = new Intent();
            intent.putExtra("fromPhotoGrid", true);
            intent.setClass(view, com/roidapp/photogrid/release/Preference);
            view.startActivity(intent);
            return;
        }
    }
}

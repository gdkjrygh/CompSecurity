// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.ImageView;
import com.roidapp.photogrid.release.PhotoGridActivity;

// Referenced classes of package com.roidapp.photogrid.common:
//            ap

final class aw
    implements android.content.DialogInterface.OnDismissListener
{

    final Activity a;
    final ap b;

    aw(ap ap1, Activity activity)
    {
        b = ap1;
        a = activity;
        super();
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        if (a instanceof PhotoGridActivity)
        {
            ((PhotoGridActivity)a).i = false;
        }
        ap.e(b).removeMessages(1);
        ap.e(b).removeMessages(2);
        if (ap.b(b) != null)
        {
            ap.b(b).setImageDrawable(null);
        }
        if (ap.c(b) != null)
        {
            ap.c(b).setCallback(null);
        }
        if (ap.d(b) != null)
        {
            ap.d(b).setCallback(null);
        }
    }
}

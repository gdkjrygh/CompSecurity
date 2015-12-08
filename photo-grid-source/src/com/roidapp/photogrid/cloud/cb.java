// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.roidapp.photogrid.common.af;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            br, BaseShareActivity

final class cb
    implements android.view.View.OnClickListener
{

    final AlertDialog a;
    final br b;

    cb(br br1, AlertDialog alertdialog)
    {
        b = br1;
        a = alertdialog;
        super();
    }

    public final void onClick(View view)
    {
        af.b(br.c(b), "SharePage/ShareToFB/policy");
        view = Uri.parse(br.c);
        br.c(b).startActivity(new Intent("android.intent.action.VIEW", view));
        a.dismiss();
    }
}

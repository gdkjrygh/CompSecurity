// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.common:
//            az, be

final class bh
    implements android.view.View.OnClickListener
{

    final String a;
    final Activity b;
    final be c;

    bh(be be1, String s, Activity activity)
    {
        c = be1;
        a = s;
        b = activity;
        super();
    }

    public final void onClick(View view)
    {
        view = Uri.parse((new StringBuilder("file://")).append(a).toString());
        Intent intent = new Intent("android.intent.action.VIEW", view);
        if (az.q == 6)
        {
            intent.setDataAndType(view, "video/*");
        } else
        {
            intent.setDataAndType(view, "image/*");
        }
        b.startActivity(intent);
        be.a(c);
    }
}

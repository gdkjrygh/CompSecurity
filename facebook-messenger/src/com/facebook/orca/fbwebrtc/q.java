// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.facebook.appconfig.m;
import com.facebook.c.s;
import com.facebook.config.a.a;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            WebrtcIncallActivity

class q
    implements android.content.DialogInterface.OnClickListener
{

    final WebrtcIncallActivity a;

    q(WebrtcIncallActivity webrtcincallactivity)
    {
        a = webrtcincallactivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Uri uri;
        if (WebrtcIncallActivity.l(a).e() != null)
        {
            uri = Uri.parse(WebrtcIncallActivity.l(a).e());
        } else
        {
            uri = Uri.parse(com.facebook.orca.fbwebrtc.WebrtcIncallActivity.m(a).g());
        }
        WebrtcIncallActivity.n(a).b(new Intent("android.intent.action.VIEW", uri), a);
        dialoginterface.dismiss();
    }
}

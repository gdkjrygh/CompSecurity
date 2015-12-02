// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.content.DialogInterface;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            WebrtcIncallActivity

class r
    implements android.content.DialogInterface.OnDismissListener
{

    final WebrtcIncallActivity a;

    r(WebrtcIncallActivity webrtcincallactivity)
    {
        a = webrtcincallactivity;
        super();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        a.finish();
    }
}

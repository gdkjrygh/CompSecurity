// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.view.View;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            WebrtcIncallActivity

class v
    implements android.view.View.OnClickListener
{

    final WebrtcIncallActivity a;

    v(WebrtcIncallActivity webrtcincallactivity)
    {
        a = webrtcincallactivity;
        super();
    }

    public void onClick(View view)
    {
        WebrtcIncallActivity.b(a);
    }
}

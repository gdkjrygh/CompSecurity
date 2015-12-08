// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.view.View;
import android.widget.TextView;
import com.pandora.android.util.s;
import com.pandora.radio.provider.f;
import p.cx.c;

// Referenced classes of package com.pandora.android.activity:
//            AndroidLinkConnectActivity

class a
    implements android.view.nnectActivity._cls1
{

    final f a;
    final AndroidLinkConnectActivity b;

    public void onClick(View view)
    {
        view = s.a(AndroidLinkConnectActivity.a(b).getText());
        a.a("ACCESSORY_HOST_PREFERENCE", view);
        c c1 = c.a();
        if (!c1.G())
        {
            c1.a(false);
            c1.a(view);
            b.d("Connecting...");
        }
    }

    (AndroidLinkConnectActivity androidlinkconnectactivity, f f1)
    {
        b = androidlinkconnectactivity;
        a = f1;
        super();
    }
}

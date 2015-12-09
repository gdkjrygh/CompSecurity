// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.view.View;
import android.widget.TextView;
import com.pandora.android.util.s;
import com.pandora.radio.provider.f;

// Referenced classes of package com.pandora.android.activity:
//            AndroidLinkInterceptorActivity

class a
    implements android.view.eptorActivity._cls1
{

    final f a;
    final AndroidLinkInterceptorActivity b;

    public void onClick(View view)
    {
        view = s.a(AndroidLinkInterceptorActivity.a(b).getText());
        a.a("ACCESSORY_INTERCEPTOR_PREFERENCE", view);
        b.finish();
        AndroidLinkInterceptorActivity.m();
    }

    (AndroidLinkInterceptorActivity androidlinkinterceptoractivity, f f1)
    {
        b = androidlinkinterceptoractivity;
        a = f1;
        super();
    }
}

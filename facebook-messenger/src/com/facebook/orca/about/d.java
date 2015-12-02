// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.about;

import android.content.Intent;
import android.net.Uri;
import com.facebook.c.s;
import com.facebook.widget.text.f;

// Referenced classes of package com.facebook.orca.about:
//            MessengerAboutActivity

class d extends f
{

    final MessengerAboutActivity a;

    d(MessengerAboutActivity messengeraboutactivity)
    {
        a = messengeraboutactivity;
        super();
    }

    public void a()
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://m.facebook.com"));
        MessengerAboutActivity.a(a).b(intent, a);
    }
}

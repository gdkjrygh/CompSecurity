// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.about;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.facebook.c.s;

// Referenced classes of package com.facebook.orca.about:
//            MessengerAboutActivity

class c
    implements android.view.View.OnClickListener
{

    final MessengerAboutActivity a;

    c(MessengerAboutActivity messengeraboutactivity)
    {
        a = messengeraboutactivity;
        super();
    }

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW", Uri.parse("http://m.facebook.com/terms.php"));
        MessengerAboutActivity.a(a).b(view, a);
    }
}

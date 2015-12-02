// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.facebook.c.s;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.selfupdate:
//            SelfUpdateInstallActivity

class n
    implements android.view.View.OnClickListener
{

    final Uri a;
    final t b;
    final SelfUpdateInstallActivity c;

    n(SelfUpdateInstallActivity selfupdateinstallactivity, Uri uri, t t1)
    {
        c = selfupdateinstallactivity;
        a = uri;
        b = t1;
        super();
    }

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW", a);
        ((s)b.a(com/facebook/c/s)).b(view, c);
    }
}

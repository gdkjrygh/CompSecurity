// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import android.net.Uri;
import android.view.View;
import java.io.File;

// Referenced classes of package com.facebook.selfupdate:
//            SelfUpdateInstallActivity, p, o, af

class l
    implements android.view.View.OnClickListener
{

    final String a;
    final SelfUpdateInstallActivity b;

    l(SelfUpdateInstallActivity selfupdateinstallactivity, String s)
    {
        b = selfupdateinstallactivity;
        a = s;
        super();
    }

    public void onClick(View view)
    {
        Uri uri = Uri.parse(a);
        view = uri;
        if (uri.getScheme() == null)
        {
            view = Uri.fromFile(new File(a));
        }
        SelfUpdateInstallActivity.a(b).a(b, p.BUTTON_PRESS_INSTALL);
        af.a(view, b);
    }
}

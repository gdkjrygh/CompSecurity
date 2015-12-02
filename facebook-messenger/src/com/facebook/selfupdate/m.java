// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import android.view.View;

// Referenced classes of package com.facebook.selfupdate:
//            SelfUpdateInstallActivity, p, o

class m
    implements android.view.View.OnClickListener
{

    final SelfUpdateInstallActivity a;

    m(SelfUpdateInstallActivity selfupdateinstallactivity)
    {
        a = selfupdateinstallactivity;
        super();
    }

    public void onClick(View view)
    {
        SelfUpdateInstallActivity.a(a).a(a, p.BUTTON_PRESS_REMIND);
        SelfUpdateInstallActivity.b(a);
        a.finish();
    }
}

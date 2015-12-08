// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.content.DialogInterface;

// Referenced classes of package com.jcp.activities:
//            SplashActivity

class by
    implements android.content.DialogInterface.OnClickListener
{

    final SplashActivity a;

    by(SplashActivity splashactivity)
    {
        a = splashactivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        SplashActivity.a(a);
    }
}

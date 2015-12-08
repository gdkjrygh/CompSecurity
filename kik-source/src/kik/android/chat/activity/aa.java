// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import android.widget.Toast;

// Referenced classes of package kik.android.chat.activity:
//            KikApiLandingActivity

final class aa
    implements Runnable
{

    final String a;
    final KikApiLandingActivity b;

    aa(KikApiLandingActivity kikapilandingactivity, String s)
    {
        b = kikapilandingactivity;
        a = s;
        super();
    }

    public final void run()
    {
        b.a();
        KikApiLandingActivity.c(b).setText(a);
        KikApiLandingActivity.c(b).show();
    }
}

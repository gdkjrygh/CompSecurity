// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import android.content.res.Resources;
import android.widget.Toast;

// Referenced classes of package kik.android.chat.activity:
//            q, KikApiLandingActivity

final class s
    implements Runnable
{

    final q a;

    s(q q1)
    {
        a = q1;
        super();
    }

    public final void run()
    {
        a.b.a();
        String s1 = a.b.getResources().getString(0x7f0900a2, new Object[] {
            a.a
        });
        KikApiLandingActivity.c(a.b).setText(s1);
        KikApiLandingActivity.c(a.b).show();
    }
}

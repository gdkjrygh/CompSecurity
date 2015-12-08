// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import com.kik.g.r;
import kik.a.d.k;

// Referenced classes of package kik.android.chat.activity:
//            r, KikApiLandingActivity, s

final class q extends r
{

    final String a;
    final KikApiLandingActivity b;

    q(KikApiLandingActivity kikapilandingactivity, String s1)
    {
        b = kikapilandingactivity;
        a = s1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (k)obj;
        b.runOnUiThread(new kik.android.chat.activity.r(this));
        KikApiLandingActivity.a(b, ((k) (obj)));
        super.a(obj);
    }

    public final void a(Throwable throwable)
    {
        b.runOnUiThread(new s(this));
        b.finish();
        super.a(throwable);
    }
}

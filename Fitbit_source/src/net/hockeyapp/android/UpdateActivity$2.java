// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import net.hockeyapp.android.b.a;
import net.hockeyapp.android.c.d;

// Referenced classes of package net.hockeyapp.android:
//            UpdateActivity, q, r

class a extends a
{

    final UpdateActivity a;

    public String a(int i)
    {
        r r1 = q.b();
        if (r1 != null)
        {
            return r1.a(i);
        } else
        {
            return null;
        }
    }

    public void a(d d)
    {
        a.d();
    }

    public void a(d d, Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            a.c();
            return;
        } else
        {
            a.d();
            return;
        }
    }

    (UpdateActivity updateactivity)
    {
        a = updateactivity;
        super();
    }
}

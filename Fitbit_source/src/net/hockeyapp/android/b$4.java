// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import java.lang.ref.WeakReference;

// Referenced classes of package net.hockeyapp.android:
//            b, c

static final class b extends Thread
{

    final WeakReference a;
    final c b;

    public void run()
    {
        net.hockeyapp.android.b.a(a, b);
        net.hockeyapp.android.b.a(false);
    }

    e(WeakReference weakreference, c c)
    {
        a = weakreference;
        b = c;
        super();
    }
}

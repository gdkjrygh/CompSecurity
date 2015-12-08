// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

// Referenced classes of package net.hockeyapp.android:
//            b, c

static final class c
    implements android.content.ogInterface.OnClickListener
{

    final c a;
    final WeakReference b;
    final boolean c;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (a != null)
        {
            a.m();
        }
        net.hockeyapp.android.b.b(b);
        net.hockeyapp.android.b.a(b, a, c);
    }

    e(c c1, WeakReference weakreference, boolean flag)
    {
        a = c1;
        b = weakreference;
        c = flag;
        super();
    }
}

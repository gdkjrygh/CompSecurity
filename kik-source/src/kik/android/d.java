// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import android.os.Handler;
import com.kik.g.r;

// Referenced classes of package kik.android:
//            a, e

final class d extends r
{

    final a a;

    d(a a1)
    {
        a = a1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Boolean)obj;
        if (obj != null && ((Boolean) (obj)).booleanValue())
        {
            kik.android.a.k(a).post(new e(this));
        }
        super.c();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.graphics.Bitmap;
import com.kik.g.r;
import kik.a.d.a.a;
import kik.a.d.d;

// Referenced classes of package kik.android.f.a:
//            ae

final class af extends r
{

    final a a;
    final ae.b b;

    af(ae.b b1, a a1)
    {
        b = b1;
        a = a1;
        super();
    }

    public final void a()
    {
        if (a.a("icon") == null)
        {
            kik.android.f.a.ae.b.a(b, a);
        }
        ae.b.b(b, a);
    }

    public final void a(Object obj)
    {
        obj = kik.android.f.a.ae.a((Bitmap)obj);
        if (obj != null && obj.length > 0)
        {
            a.a("icon", new d(((byte []) (obj))));
        }
    }
}

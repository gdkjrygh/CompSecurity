// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;

import android.graphics.Point;
import com.kik.g.i;
import kik.android.scan.k;
import kik.android.util.by;

// Referenced classes of package kik.android.scan.fragment:
//            ScanFragment

final class a extends i
{

    final ScanFragment a;

    a(ScanFragment scanfragment)
    {
        a = scanfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        Object obj2 = (kik.android.scan.k.a)obj1;
        obj = ScanFragment.a(a).a();
        if (!ScanFragment.b(a) && !ScanFragment.c(a) && obj2 != null)
        {
            ScanFragment.d(a);
            obj1 = ScanFragment.a(a, ((com.kik.scan.Scanner.ScanResult) (obj)));
            ScanFragment.e(a).set(((Point) (obj1)).x, ((Point) (obj1)).y);
            ScanFragment.a(a, ((kik.android.scan.k.a) (obj2)));
            obj2 = ((kik.android.scan.k.a) (obj2)).b;
            ScanFragment.a(a, kik.android.chat.b.a.b(((com.kik.scan.KikCode) (obj2))));
            com.kik.android.f f = by.a("Success", a.a);
            if (obj != null)
            {
                f.a("Size", ((com.kik.scan.Scanner.ScanResult) (obj)).scale);
                f.a("X", ((Point) (obj1)).x);
                f.a("Y", ((Point) (obj1)).y);
            }
            f.a("Colour", kik.android.chat.b.a.a(((com.kik.scan.KikCode) (obj2))));
            f.b();
            ScanFragment.a(a, ((com.kik.scan.KikCode) (obj2)));
        }
    }
}

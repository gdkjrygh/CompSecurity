// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.app.Activity;
import android.widget.Toast;

// Referenced classes of package kik.android.f.a:
//            ab, z

final class ac
    implements Runnable
{

    final ab a;

    ac(ab ab1)
    {
        a = ab1;
        super();
    }

    public final void run()
    {
        String s = a.b.b.getString(0x7f090383);
        if (a.a instanceof ae.a)
        {
            s = ((ae.a)a.a).a(a.b.b);
        }
        Toast.makeText(a.b.b, s, 1).show();
    }
}

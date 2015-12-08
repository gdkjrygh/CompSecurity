// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.support.v4.app.Fragment;
import android.widget.Toast;

// Referenced classes of package kik.android.f.a:
//            o, l

final class p
    implements Runnable
{

    final o a;

    p(o o1)
    {
        a = o1;
        super();
    }

    public final void run()
    {
        String s = a.b.c.getString(0x7f090383);
        if (a.a instanceof ae.a)
        {
            s = ((ae.a)a.a).a(a.b.c.getActivity());
        }
        Toast.makeText(a.b.c.getActivity(), s, 1).show();
    }
}

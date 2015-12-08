// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.kik.g.r;

// Referenced classes of package kik.android.f.a:
//            l, p

final class o extends r
{

    final Throwable a;
    final l b;

    o(l l1, Throwable throwable)
    {
        b = l1;
        a = throwable;
        super();
    }

    public final void a()
    {
        b.c.getActivity().runOnUiThread(new p(this));
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.app.Activity;
import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            KikIqFragmentBase, lx, ly

final class lw extends r
{

    final KikIqFragmentBase a;

    lw(KikIqFragmentBase kikiqfragmentbase)
    {
        a = kikiqfragmentbase;
        super();
    }

    public final void a(Object obj)
    {
        obj = a.getActivity();
        if (obj != null)
        {
            ((Activity) (obj)).runOnUiThread(new lx(this));
        }
    }

    public final void a(Throwable throwable)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = a.getActivity();
        if (fragmentactivity != null)
        {
            fragmentactivity.runOnUiThread(new ly(this, throwable));
            return;
        } else
        {
            a.w();
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import kik.a.d.aa;
import kik.a.d.j;
import kik.a.e.w;
import kik.a.z;
import kik.android.chat.activity.k;

// Referenced classes of package kik.android.chat.fragment:
//            KikCodeFragment

final class ig
    implements android.view.View.OnClickListener
{

    final KikCodeFragment a;

    ig(KikCodeFragment kikcodefragment)
    {
        a = kikcodefragment;
        super();
    }

    public final void onClick(View view)
    {
        view = a.e.d();
        if (((aa) (view)).f != null)
        {
            KikCodeFragment.l(a);
            z z1 = z.b(a.c);
            ViewPictureFragment.a a1 = new ViewPictureFragment.a();
            a1.a(z1.a().a()).c(((aa) (view)).f).a();
            k.a(a1, a.getActivity()).f();
        }
    }
}

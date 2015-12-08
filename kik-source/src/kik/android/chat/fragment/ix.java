// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import kik.a.d.n;
import kik.android.chat.activity.k;

// Referenced classes of package kik.android.chat.fragment:
//            KikCodeFragment

final class ix
    implements android.view.View.OnClickListener
{

    final n a;
    final KikCodeFragment b;

    ix(KikCodeFragment kikcodefragment, n n1)
    {
        b = kikcodefragment;
        a = n1;
        super();
    }

    public final void onClick(View view)
    {
        if (a != null && a.r() != null)
        {
            KikCodeFragment.l(b);
            view = new ViewPictureFragment.a();
            view.a(a.b()).c(a.r()).d();
            k.a(view, b.getActivity()).f();
        }
    }
}

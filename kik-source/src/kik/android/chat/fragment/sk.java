// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.r;
import kik.a.d.a.a;
import kik.android.util.by;

// Referenced classes of package kik.android.chat.fragment:
//            sj, ViewPictureFragment, sm, sl

final class sk extends r
{

    final sj a;

    sk(sj sj1)
    {
        a = sj1;
        super();
    }

    public final void b(Throwable throwable)
    {
        if (ViewPictureFragment.e(a.b) == null)
        {
            throwable = null;
        } else
        {
            throwable = ViewPictureFragment.e(a.b).u();
        }
        by.a(a.b.f, false, throwable, true, false);
        a.b.b(new sm(this));
    }

    public final void c()
    {
        String s;
        if (ViewPictureFragment.e(a.b) == null)
        {
            s = null;
        } else
        {
            s = ViewPictureFragment.e(a.b).u();
        }
        by.a(a.b.f, true, s, true, false);
        a.b.b(new sl(this));
    }
}

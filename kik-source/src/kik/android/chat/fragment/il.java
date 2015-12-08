// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.p;
import com.kik.g.r;
import com.kik.scan.UsernameKikCode;
import kik.a.d.aa;
import kik.a.e.w;
import kik.android.scan.d;
import kik.android.util.bx;
import kik.android.widget.KikFinderCodeImageView;

// Referenced classes of package kik.android.chat.fragment:
//            KikCodeFragment, im

final class il extends r
{

    final int a;
    final KikCodeFragment b;

    il(KikCodeFragment kikcodefragment, int i)
    {
        b = kikcodefragment;
        a = i;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Integer)obj;
        b._drawArea.setOnTouchListener(KikCodeFragment.n(b));
        aa aa1 = b.e.d();
        if (aa1.c.length() > 20)
        {
            b.h.a(aa1, ((Integer) (obj)).intValue()).a(new im(this));
            return;
        } else
        {
            obj = new UsernameKikCode(aa1.c, ((Integer) (obj)).intValue(), a);
            KikCodeFragment.b(b, ((com.kik.scan.KikCode) (obj)));
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        bx.a(throwable);
        KikCodeFragment.a(b, KikCodeFragment.o(b));
    }
}

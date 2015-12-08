// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.r;
import com.kik.scan.GroupKikCode;
import kik.a.d.n;
import kik.a.f.f.j;
import kik.android.util.bx;

// Referenced classes of package kik.android.chat.fragment:
//            KikCodeFragment, if

final class ie extends r
{

    final n a;
    final KikCodeFragment b;

    ie(KikCodeFragment kikcodefragment, n n)
    {
        b = kikcodefragment;
        a = n;
        super();
    }

    public final void a(Object obj)
    {
        obj = new GroupKikCode(((j)obj).d(), 0);
        KikCodeFragment.b(b, ((com.kik.scan.KikCode) (obj)));
    }

    public final void b(Throwable throwable)
    {
        bx.a(throwable);
        KikCodeFragment.a(b, new if(this));
    }
}

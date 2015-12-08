// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.r;
import com.kik.scan.RemoteKikCode;

// Referenced classes of package kik.android.chat.fragment:
//            il, KikCodeFragment

final class im extends r
{

    final il a;

    im(il il1)
    {
        a = il1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (byte[])obj;
        super.a(obj);
        obj = new RemoteKikCode(((byte []) (obj)), a.a);
        KikCodeFragment.b(a.b, ((com.kik.scan.KikCode) (obj)));
    }

    public final void a(Throwable throwable)
    {
        super.a(throwable);
        KikCodeFragment.a(a.b, KikCodeFragment.o(a.b));
    }
}

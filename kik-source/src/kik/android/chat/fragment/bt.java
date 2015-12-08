// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import java.util.concurrent.Callable;
import kik.a.d.n;
import kik.a.e.l;

// Referenced classes of package kik.android.chat.fragment:
//            KikChangeGroupNameFragment

final class bt
    implements Callable
{

    final String a;
    final KikChangeGroupNameFragment b;

    bt(KikChangeGroupNameFragment kikchangegroupnamefragment, String s)
    {
        b = kikchangegroupnamefragment;
        a = s;
        super();
    }

    public final Object call()
    {
        return b.c.a(KikChangeGroupNameFragment.b(b).b(), a);
    }
}

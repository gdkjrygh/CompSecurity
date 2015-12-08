// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import com.kik.g.f;

// Referenced classes of package kik.android.chat.activity:
//            m, KikActivityBase

final class n
    implements Runnable
{

    final m a;

    n(m m1)
    {
        a = m1;
        super();
    }

    public final void run()
    {
        KikActivityBase.a.a(a.a).a();
        a.a.a.finish();
        KikActivityBase.a(a.a.a);
    }
}

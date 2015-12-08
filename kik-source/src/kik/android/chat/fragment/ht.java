// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Handler;
import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            hs, hr, hq, KikChatInfoFragment, 
//            hu

final class ht extends r
{

    final hs a;

    ht(hs hs1)
    {
        a = hs1;
        super();
    }

    public final void a(Object obj)
    {
        KikChatInfoFragment.g(a.a.b.a).sendEmptyMessage(2);
        KikChatInfoFragment.d(a.a.b.a);
    }

    public final void b(Throwable throwable)
    {
        KikChatInfoFragment.g(a.a.b.a).sendEmptyMessage(2);
        KikChatInfoFragment.g(a.a.b.a).post(new hu(this, throwable));
    }
}

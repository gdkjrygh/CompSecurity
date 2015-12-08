// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Handler;
import com.kik.g.i;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class gb extends i
{

    final KikChatFragment a;

    gb(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        if (KikChatFragment.w(a) != null || KikChatFragment.x(a) != null)
        {
            KikChatFragment.y(a).sendEmptyMessage(6);
        }
    }
}

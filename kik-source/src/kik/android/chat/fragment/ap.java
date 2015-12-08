// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Handler;
import com.kik.g.i;

// Referenced classes of package kik.android.chat.fragment:
//            ConversationsBaseFragment

final class ap extends i
{

    final ConversationsBaseFragment a;

    ap(ConversationsBaseFragment conversationsbasefragment)
    {
        a = conversationsbasefragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        ConversationsBaseFragment.d(a).sendEmptyMessage(5);
    }
}

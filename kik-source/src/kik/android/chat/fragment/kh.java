// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.view.adapters.t;

// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment

final class kh
    implements Runnable
{

    final KikConversationsFragment a;

    kh(KikConversationsFragment kikconversationsfragment)
    {
        a = kikconversationsfragment;
        super();
    }

    public final void run()
    {
        if (KikConversationsFragment.i(a) != null)
        {
            KikConversationsFragment.i(a).b();
        }
    }
}

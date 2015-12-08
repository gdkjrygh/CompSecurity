// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.android.widget.PullToRevealView;

// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment

final class jp
    implements Runnable
{

    final KikConversationsFragment a;

    jp(KikConversationsFragment kikconversationsfragment)
    {
        a = kikconversationsfragment;
        super();
    }

    public final void run()
    {
        a._pullToScan.e();
    }
}

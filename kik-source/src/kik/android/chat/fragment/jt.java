// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment, ScanCodeTabFragment

final class jt
    implements Runnable
{

    final KikConversationsFragment a;

    jt(KikConversationsFragment kikconversationsfragment)
    {
        a = kikconversationsfragment;
        super();
    }

    public final void run()
    {
        if (KikConversationsFragment.c(a) == null || a._animationContainer == null)
        {
            return;
        }
        cv.b(new View[] {
            a._pullToScanHint, a._animationContainer
        });
        cv.c(new View[] {
            a._pullToScanHint, a._animationContainer
        });
        if (KikConversationsFragment.c(a) != null)
        {
            cv.e(new View[] {
                KikConversationsFragment.c(a).getView()
            });
            KikConversationsFragment.c(a).c();
            KikConversationsFragment.c(a).e();
        }
        KikConversationsFragment.d(a);
    }
}

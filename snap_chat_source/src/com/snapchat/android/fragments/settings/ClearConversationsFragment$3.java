// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import android.widget.ProgressBar;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            ClearConversationsFragment

final class a
    implements Runnable
{

    private ClearConversationsFragment a;

    public final void run()
    {
        synchronized (ClearConversationsFragment.e(a))
        {
            ClearConversationsFragment.b(a).setVisibility(8);
        }
        return;
        exception;
        ib;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (ClearConversationsFragment clearconversationsfragment)
    {
        a = clearconversationsfragment;
        super();
    }
}

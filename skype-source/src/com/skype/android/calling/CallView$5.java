// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;

import java.util.Set;

// Referenced classes of package com.skype.android.calling:
//            CallView, CallViewAdapter

final class a
    implements Runnable
{

    final CallView a;

    public final void run()
    {
        if (CallView.j(a) != null)
        {
            CallView.j(a).onDisplayedVideoCountChanged(CallView.g(a).size());
            CallView.j(a).onMinimizedParticipantCountChanged(CallView.k(a));
        }
    }

    pter(CallView callview)
    {
        a = callview;
        super();
    }
}

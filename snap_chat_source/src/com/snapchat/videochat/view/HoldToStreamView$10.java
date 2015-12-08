// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;

import android.view.View;

// Referenced classes of package com.snapchat.videochat.view:
//            HoldToStreamView

final class a
    implements Runnable
{

    private HoldToStreamView a;

    public final void run()
    {
        while (a.e.getVisibility() != 0 || a.c.getScaleX() > 0.35F) 
        {
            return;
        }
        HoldToStreamView.b(a);
    }

    (HoldToStreamView holdtostreamview)
    {
        a = holdtostreamview;
        super();
    }
}

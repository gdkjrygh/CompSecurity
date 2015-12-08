// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;

import android.view.View;
import cS;
import cT;

// Referenced classes of package com.snapchat.videochat.view:
//            HoldToStreamView, LockToStreamView

final class a extends cS
{

    private HoldToStreamView a;

    public final void a(cT ct)
    {
        while (!a.b || a.d.c) 
        {
            return;
        }
        a.c.setY((float)ct.d.etY);
        HoldToStreamView.a(a);
    }

    (HoldToStreamView holdtostreamview)
    {
        a = holdtostreamview;
        super();
    }
}

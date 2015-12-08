// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;


// Referenced classes of package com.snapchat.videochat.view:
//            HoldToStreamView

final class a
    implements Runnable
{

    private HoldToStreamView a;

    public final void run()
    {
        HoldToStreamView.i(a);
    }

    (HoldToStreamView holdtostreamview)
    {
        a = holdtostreamview;
        super();
    }
}

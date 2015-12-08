// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.ptr;

import android.graphics.drawable.AnimationDrawable;

// Referenced classes of package com.snapchat.android.ui.ptr:
//            DancingGhostPtrHeader

final class a
    implements Runnable
{

    private int a;
    private DancingGhostPtrHeader b;

    public final void run()
    {
        if (DancingGhostPtrHeader.a(b).isRunning())
        {
            if (a == 0x7f020283)
            {
                b.a(0x7f020213);
                return;
            }
            if (a == 0x7f020213)
            {
                b.a(0x7f02018c);
                return;
            }
            if (a == 0x7f02018c)
            {
                b.a(0x7f02008c);
                return;
            }
            if (a == 0x7f02008c)
            {
                b.a(0x7f02010c);
                return;
            }
            if (a == 0x7f02010c)
            {
                b.a(0x7f020283);
                return;
            }
        }
    }

    _cls9(DancingGhostPtrHeader dancingghostptrheader, int i)
    {
        b = dancingghostptrheader;
        a = i;
        super();
    }
}

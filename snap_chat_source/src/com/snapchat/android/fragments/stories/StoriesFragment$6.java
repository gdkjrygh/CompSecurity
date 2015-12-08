// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.stories;

import IG;
import afA;
import android.os.SystemClock;
import com.snapchat.android.util.StoriesPageStateManager;
import in.srain.cube.views.ptr.PtrFrameLayout;

// Referenced classes of package com.snapchat.android.fragments.stories:
//            StoriesFragment

final class a
    implements afA
{

    private StoriesFragment a;

    public final void a(PtrFrameLayout ptrframelayout)
    {
    }

    public final void a(PtrFrameLayout ptrframelayout, boolean flag, byte byte0, int i, int j, float f, float f1)
    {
        com.snapchat.android.util.nager.PtrStatus ptrstatus;
        long l;
        ptrframelayout = StoriesFragment.k(a);
        l = SystemClock.elapsedRealtime();
        ptrstatus = com.snapchat.android.util.nager.PtrStatus.fromValue(byte0);
        com.snapchat.android.util.nager._cls1..SwitchMap.com.snapchat.android.util.StoriesPageStateManager.PtrStatus[ptrstatus.ordinal()];
        JVM INSTR tableswitch 1 1: default 48
    //                   1 77;
           goto _L1 _L2
_L1:
        if (((StoriesPageStateManager) (ptrframelayout)).mLastPtrStatus == com.snapchat.android.util.nager.PtrStatus.INIT)
        {
            ((StoriesPageStateManager) (ptrframelayout)).mLastPtrPeriod.a(l, 0x7fffffffffffffffL);
        }
_L4:
        ptrframelayout.mLastPtrStatus = ptrstatus;
        return;
_L2:
        if (((StoriesPageStateManager) (ptrframelayout)).mLastPtrPeriod.a())
        {
            ((StoriesPageStateManager) (ptrframelayout)).mLastPtrPeriod.mEnd = l;
        } else
        {
            ((StoriesPageStateManager) (ptrframelayout)).mLastPtrPeriod.a(l, l);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b(PtrFrameLayout ptrframelayout)
    {
    }

    public final void c(PtrFrameLayout ptrframelayout)
    {
    }

    public final void d(PtrFrameLayout ptrframelayout)
    {
    }

    us(StoriesFragment storiesfragment)
    {
        a = storiesfragment;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.view.MotionEvent;
import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            MMLayout, MMSDK, MMLog

private static class layoutRef extends android.view.Listener
{

    WeakReference layoutRef;

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        while (motionevent == null || motionevent1 == null || Math.abs((int)(motionevent1.getX() - motionevent.getX())) <= 200 || Math.abs(f) <= Math.abs(f1)) 
        {
            return false;
        }
        if (f <= 0.0F) goto _L2; else goto _L1
_L1:
        if (MMSDK.logLevel == 0)
        {
            MMLog.i("MMLayout", "Enabling debug and verbose logging.");
            MMSDK.logLevel = 3;
        } else
        {
            MMLog.i("MMLayout", "Disabling debug and verbose logging.");
            MMSDK.logLevel = 0;
        }
_L4:
        return true;
_L2:
        motionevent = (MMLayout)layoutRef.get();
        if (motionevent != null)
        {
            MMSDK.printDiagnostics(((MMLayout) (motionevent)).adImpl);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public (MMLayout mmlayout)
    {
        layoutRef = new WeakReference(mmlayout);
    }
}

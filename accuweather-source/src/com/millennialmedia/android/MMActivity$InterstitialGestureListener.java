// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.view.MotionEvent;
import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            MMActivity, MMAdImplController

private static class mmActivityRef extends android.view.
{

    WeakReference mmActivityRef;

    public boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        motionevent = (MMActivity)mmActivityRef.get();
        if (motionevent != null)
        {
            mmActivityRef(MMAdImplController.getAdImplWithId(((MMActivity) (motionevent)).creatorAdImplInternalId));
        }
        return false;
    }

    public (MMActivity mmactivity)
    {
        mmActivityRef = new WeakReference(mmactivity);
    }
}

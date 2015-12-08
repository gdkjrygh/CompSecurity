// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.Activity;
import java.lang.ref.WeakReference;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkViewInternal

private class mXWalkViewRef
    implements org.chromium.base.tener
{

    WeakReference mXWalkViewRef;
    final XWalkViewInternal this$0;

    public void onActivityStateChange(Activity activity, int i)
    {
        XWalkViewInternal xwalkviewinternal = (XWalkViewInternal)mXWalkViewRef.get();
        if (xwalkviewinternal == null)
        {
            return;
        } else
        {
            XWalkViewInternal.access$000(xwalkviewinternal, activity, i);
            return;
        }
    }

    (XWalkViewInternal xwalkviewinternal1)
    {
        this$0 = XWalkViewInternal.this;
        super();
        mXWalkViewRef = new WeakReference(xwalkviewinternal1);
    }
}

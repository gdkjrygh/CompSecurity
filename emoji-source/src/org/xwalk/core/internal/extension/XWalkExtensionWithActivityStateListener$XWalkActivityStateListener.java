// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension;

import android.app.Activity;
import java.lang.ref.WeakReference;

// Referenced classes of package org.xwalk.core.internal.extension:
//            XWalkExtensionWithActivityStateListener

private class mExtensionRef
    implements org.chromium.base.tyStateListener
{

    WeakReference mExtensionRef;
    final XWalkExtensionWithActivityStateListener this$0;

    public void onActivityStateChange(Activity activity, int i)
    {
        XWalkExtensionWithActivityStateListener xwalkextensionwithactivitystatelistener = (XWalkExtensionWithActivityStateListener)mExtensionRef.get();
        if (xwalkextensionwithactivitystatelistener == null)
        {
            return;
        } else
        {
            xwalkextensionwithactivitystatelistener.onActivityStateChange(activity, i);
            return;
        }
    }

    (XWalkExtensionWithActivityStateListener xwalkextensionwithactivitystatelistener1)
    {
        this$0 = XWalkExtensionWithActivityStateListener.this;
        super();
        mExtensionRef = new WeakReference(xwalkextensionwithactivitystatelistener1);
    }
}

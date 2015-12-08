// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.chromium.base.ApplicationStatus;
import org.xwalk.core.internal.XWalkExtensionInternal;

public abstract class XWalkExtensionWithActivityStateListener extends XWalkExtensionInternal
{
    private class XWalkActivityStateListener
        implements org.chromium.base.ApplicationStatus.ActivityStateListener
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

        XWalkActivityStateListener(XWalkExtensionWithActivityStateListener xwalkextensionwithactivitystatelistener1)
        {
            this$0 = XWalkExtensionWithActivityStateListener.this;
            super();
            mExtensionRef = new WeakReference(xwalkextensionwithactivitystatelistener1);
        }
    }


    private XWalkActivityStateListener mActivityStateListener;

    public XWalkExtensionWithActivityStateListener(String s, String s1, Activity activity)
    {
        super(s, s1);
        initActivityStateListener(activity);
    }

    public XWalkExtensionWithActivityStateListener(String s, String s1, String as[], Activity activity)
    {
        super(s, s1, as);
        initActivityStateListener(activity);
    }

    private void initActivityStateListener(Activity activity)
    {
        mActivityStateListener = new XWalkActivityStateListener(this);
        ApplicationStatus.registerStateListenerForActivity(mActivityStateListener, activity);
    }

    public abstract void onActivityStateChange(Activity activity, int i);
}

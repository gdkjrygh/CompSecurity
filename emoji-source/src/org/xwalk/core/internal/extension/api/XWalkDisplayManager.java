// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api;

import android.content.Context;
import android.view.Display;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package org.xwalk.core.internal.extension.api:
//            DisplayManagerJBMR1, DisplayManagerNull

public abstract class XWalkDisplayManager
{
    public static interface DisplayListener
    {

        public abstract void onDisplayAdded(int i);

        public abstract void onDisplayChanged(int i);

        public abstract void onDisplayRemoved(int i);
    }


    static final boolean $assertionsDisabled;
    private static Context mContext;
    private static XWalkDisplayManager mInstance;
    protected final ArrayList mListeners = new ArrayList();

    public XWalkDisplayManager()
    {
    }

    public static XWalkDisplayManager getInstance(Context context)
    {
        if (mContext != null)
        {
            if (!$assertionsDisabled && context.getApplicationContext() != mContext)
            {
                throw new AssertionError();
            }
        } else
        {
            mContext = context.getApplicationContext();
        }
        if (mInstance == null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 17)
            {
                mInstance = new DisplayManagerJBMR1(mContext);
            } else
            {
                mInstance = new DisplayManagerNull();
            }
        }
        return mInstance;
    }

    public abstract Display getDisplay(int i);

    public abstract Display[] getDisplays();

    public abstract Display[] getPresentationDisplays();

    protected void notifyDisplayAdded(int i)
    {
        for (Iterator iterator = mListeners.iterator(); iterator.hasNext(); ((DisplayListener)iterator.next()).onDisplayAdded(i)) { }
    }

    protected void notifyDisplayChanged(int i)
    {
        for (Iterator iterator = mListeners.iterator(); iterator.hasNext(); ((DisplayListener)iterator.next()).onDisplayChanged(i)) { }
    }

    protected void notifyDisplayRemoved(int i)
    {
        for (Iterator iterator = mListeners.iterator(); iterator.hasNext(); ((DisplayListener)iterator.next()).onDisplayRemoved(i)) { }
    }

    public void registerDisplayListener(DisplayListener displaylistener)
    {
        mListeners.add(displaylistener);
    }

    public void unregisterDisplayListener(DisplayListener displaylistener)
    {
        mListeners.remove(displaylistener);
    }

    static 
    {
        boolean flag;
        if (!org/xwalk/core/internal/extension/api/XWalkDisplayManager.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

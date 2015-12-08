// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import org.chromium.base.ThreadUtils;

// Referenced classes of package org.chromium.content.browser:
//            ScreenOrientationListener

private class <init>
    implements <init>, ComponentCallbacks
{

    static final boolean $assertionsDisabled;
    private static final long POLLING_DELAY = 500L;
    private int mAccurateCount;
    final ScreenOrientationListener this$0;

    public void onConfigurationChanged(Configuration configuration)
    {
        ScreenOrientationListener.access$200(ScreenOrientationListener.this);
    }

    public void onLowMemory()
    {
    }

    public void startAccurateListening()
    {
        mAccurateCount = mAccurateCount + 1;
        if (mAccurateCount > 1)
        {
            return;
        } else
        {
            ThreadUtils.postOnUiThreadDelayed(new Runnable() {

                final ScreenOrientationListener.ScreenOrientationConfigurationListener this$1;
                final ScreenOrientationListener.ScreenOrientationConfigurationListener val$self;

                public void run()
                {
                    self.onConfigurationChanged(null);
                    if (self.mAccurateCount < 1)
                    {
                        return;
                    } else
                    {
                        ThreadUtils.postOnUiThreadDelayed(this, 500L);
                        return;
                    }
                }

            
            {
                this$1 = ScreenOrientationListener.ScreenOrientationConfigurationListener.this;
                self = screenorientationconfigurationlistener1;
                super();
            }
            }, 500L);
            return;
        }
    }

    public void startListening()
    {
        ScreenOrientationListener.access$000(ScreenOrientationListener.this).registerComponentCallbacks(this);
    }

    public void stopAccurateListening()
    {
        mAccurateCount = mAccurateCount - 1;
        if (!$assertionsDisabled && mAccurateCount < 0)
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    public void stopListening()
    {
        ScreenOrientationListener.access$000(ScreenOrientationListener.this).unregisterComponentCallbacks(this);
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/ScreenOrientationListener.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }


    private _cls1.val.self()
    {
        this$0 = ScreenOrientationListener.this;
        super();
        mAccurateCount = 0;
    }

    mAccurateCount(mAccurateCount maccuratecount)
    {
        this();
    }
}

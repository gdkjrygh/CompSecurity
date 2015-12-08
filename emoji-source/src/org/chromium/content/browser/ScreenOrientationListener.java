// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.util.Iterator;
import org.chromium.base.ObserverList;
import org.chromium.base.ThreadUtils;
import org.chromium.ui.gfx.DeviceDisplayInfo;

public class ScreenOrientationListener
{
    private class ScreenOrientationConfigurationListener
        implements ScreenOrientationListenerBackend, ComponentCallbacks
    {

        static final boolean $assertionsDisabled;
        private static final long POLLING_DELAY = 500L;
        private int mAccurateCount;
        final ScreenOrientationListener this$0;

        public void onConfigurationChanged(Configuration configuration)
        {
            notifyObservers();
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

                    final ScreenOrientationConfigurationListener this$1;
                    final ScreenOrientationConfigurationListener val$self;

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
                this$1 = final_screenorientationconfigurationlistener;
                self = ScreenOrientationConfigurationListener.this;
                super();
            }
                }, 500L);
                return;
            }
        }

        public void startListening()
        {
            mAppContext.registerComponentCallbacks(this);
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
            mAppContext.unregisterComponentCallbacks(this);
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


        private ScreenOrientationConfigurationListener()
        {
            this$0 = ScreenOrientationListener.this;
            super();
            mAccurateCount = 0;
        }

    }

    private class ScreenOrientationDisplayListener
        implements ScreenOrientationListenerBackend, android.hardware.display.DisplayManager.DisplayListener
    {

        final ScreenOrientationListener this$0;

        public void onDisplayAdded(int i)
        {
        }

        public void onDisplayChanged(int i)
        {
            notifyObservers();
        }

        public void onDisplayRemoved(int i)
        {
        }

        public void startAccurateListening()
        {
        }

        public void startListening()
        {
            ((DisplayManager)mAppContext.getSystemService("display")).registerDisplayListener(this, null);
        }

        public void stopAccurateListening()
        {
        }

        public void stopListening()
        {
            ((DisplayManager)mAppContext.getSystemService("display")).unregisterDisplayListener(this);
        }

        private ScreenOrientationDisplayListener()
        {
            this$0 = ScreenOrientationListener.this;
            super();
        }

    }

    private static interface ScreenOrientationListenerBackend
    {

        public abstract void startAccurateListening();

        public abstract void startListening();

        public abstract void stopAccurateListening();

        public abstract void stopListening();
    }

    public static interface ScreenOrientationObserver
    {

        public abstract void onScreenOrientationChanged(int i);
    }


    static final boolean $assertionsDisabled;
    private static final String TAG = "ScreenOrientationListener";
    private static ScreenOrientationListener sInstance;
    private Context mAppContext;
    private ScreenOrientationListenerBackend mBackend;
    private final ObserverList mObservers = new ObserverList();
    private int mOrientation;

    private ScreenOrientationListener()
    {
        Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            obj = new ScreenOrientationDisplayListener();
        } else
        {
            obj = new ScreenOrientationConfigurationListener();
        }
        mBackend = ((ScreenOrientationListenerBackend) (obj));
    }

    public static ScreenOrientationListener getInstance()
    {
        ThreadUtils.assertOnUiThread();
        if (sInstance == null)
        {
            sInstance = new ScreenOrientationListener();
        }
        return sInstance;
    }

    private void notifyObservers()
    {
        int i = mOrientation;
        updateOrientation();
        if (mOrientation != i)
        {
            DeviceDisplayInfo.create(mAppContext).updateNativeSharedDisplayInfo();
            Iterator iterator = mObservers.iterator();
            while (iterator.hasNext()) 
            {
                ((ScreenOrientationObserver)iterator.next()).onScreenOrientationChanged(mOrientation);
            }
        }
    }

    private void updateOrientation()
    {
        switch (((WindowManager)mAppContext.getSystemService("window")).getDefaultDisplay().getRotation())
        {
        default:
            throw new IllegalStateException("Display.getRotation() shouldn't return that value");

        case 0: // '\0'
            mOrientation = 0;
            return;

        case 1: // '\001'
            mOrientation = 90;
            return;

        case 2: // '\002'
            mOrientation = 180;
            return;

        case 3: // '\003'
            mOrientation = -90;
            break;
        }
    }

    public void addObserver(final ScreenOrientationObserver obs, Context context)
    {
        if (mAppContext == null)
        {
            mAppContext = context.getApplicationContext();
        }
        if (!$assertionsDisabled && mAppContext != context.getApplicationContext())
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && mAppContext == null)
        {
            throw new AssertionError();
        }
        if (!mObservers.addObserver(obs))
        {
            Log.w("ScreenOrientationListener", "Adding an observer that is already present!");
            return;
        }
        if (mObservers.size() == 1)
        {
            updateOrientation();
            mBackend.startListening();
        }
        ThreadUtils.assertOnUiThread();
        ThreadUtils.postOnUiThread(new Runnable() {

            final ScreenOrientationListener this$0;
            final ScreenOrientationObserver val$obs;

            public void run()
            {
                obs.onScreenOrientationChanged(mOrientation);
            }

            
            {
                this$0 = ScreenOrientationListener.this;
                obs = screenorientationobserver;
                super();
            }
        });
    }

    public void removeObserver(ScreenOrientationObserver screenorientationobserver)
    {
        if (!mObservers.removeObserver(screenorientationobserver))
        {
            Log.w("ScreenOrientationListener", "Removing an inexistent observer!");
        } else
        if (mObservers.isEmpty())
        {
            mBackend.stopListening();
            return;
        }
    }

    public void startAccurateListening()
    {
        mBackend.startAccurateListening();
    }

    public void stopAccurateListening()
    {
        mBackend.stopAccurateListening();
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



}

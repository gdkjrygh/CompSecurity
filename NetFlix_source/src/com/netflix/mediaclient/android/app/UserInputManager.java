// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.pin.PinVerifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.netflix.mediaclient.android.app:
//            ApplicationStateListener

public class UserInputManager
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private static final String TAG = "nf_input";
    private static final ThreadFactory sThreadFactory = new ThreadFactory() {

        private final AtomicInteger mCount = new AtomicInteger(1);

        public Thread newThread(Runnable runnable)
        {
            return new Thread(runnable, (new StringBuilder()).append("UserInputManager #").append(mCount.getAndIncrement()).toString());
        }

    };
    private AtomicInteger mActivitiesCount;
    private AtomicLong mLastUserInteraction;
    private List mListeners;
    private AtomicInteger mResumed;
    private ScheduledExecutorService mScheduler;
    private AtomicInteger mStopped;

    public UserInputManager()
    {
        mLastUserInteraction = new AtomicLong(SystemClock.elapsedRealtime());
        mListeners = Collections.synchronizedList(new ArrayList());
        mActivitiesCount = new AtomicInteger();
        mResumed = new AtomicInteger();
        mStopped = new AtomicInteger();
        mScheduler = Executors.newSingleThreadScheduledExecutor(sThreadFactory);
    }

    private void notifyOthersOfLastUserInteraction()
    {
        PinVerifier.lastUserInteractionTime(getTimeSinceLastUserInteraction());
    }

    private void postOnBackground()
    {
        if (mResumed != mStopped)
        {
            Log.d("nf_input", "UI is in background");
            mScheduler.execute(new Runnable() {

                final UserInputManager this$0;

                public void run()
                {
                    for (Iterator iterator = mListeners.iterator(); iterator.hasNext(); ((ApplicationStateListener)iterator.next()).onBackground(UserInputManager.this)) { }
                }

            
            {
                this$0 = UserInputManager.this;
                super();
            }
            });
        }
    }

    private void postOnForeground()
    {
        if (mResumed != mStopped)
        {
            Log.d("nf_input", "UI is in foreground");
            mScheduler.execute(new Runnable() {

                final UserInputManager this$0;

                public void run()
                {
                    for (Iterator iterator = mListeners.iterator(); iterator.hasNext(); ((ApplicationStateListener)iterator.next()).onForeground(UserInputManager.this)) { }
                }

            
            {
                this$0 = UserInputManager.this;
                super();
            }
            });
        }
    }

    private void postUiExit(int i)
    {
        if (i == 0)
        {
            Log.d("nf_input", "UI is  gone");
            mScheduler.execute(new Runnable() {

                final UserInputManager this$0;

                public void run()
                {
                    for (Iterator iterator = mListeners.iterator(); iterator.hasNext(); ((ApplicationStateListener)iterator.next()).onUiGone(UserInputManager.this)) { }
                }

            
            {
                this$0 = UserInputManager.this;
                super();
            }
            });
        } else
        if (Log.isLoggable("nf_input", 3))
        {
            Log.d("nf_input", (new StringBuilder()).append("Activity destroyed, count ").append(i).toString());
            return;
        }
    }

    private void postUiStart(int i)
    {
        if (i == 1)
        {
            Log.d("nf_input", "UI may just started, only one activity");
            mScheduler.execute(new Runnable() {

                final UserInputManager this$0;

                public void run()
                {
                    for (Iterator iterator = mListeners.iterator(); iterator.hasNext(); ((ApplicationStateListener)iterator.next()).onUiStarted(UserInputManager.this)) { }
                }

            
            {
                this$0 = UserInputManager.this;
                super();
            }
            });
        } else
        if (Log.isLoggable("nf_input", 3))
        {
            Log.d("nf_input", (new StringBuilder()).append("New activity, count ").append(i).toString());
            return;
        }
    }

    public boolean addListener(ApplicationStateListener applicationstatelistener)
    {
        if (!mListeners.contains(applicationstatelistener))
        {
            return mListeners.add(applicationstatelistener);
        } else
        {
            Log.e("nf_input", "Listener already exist");
            return false;
        }
    }

    public void checkState()
    {
        notifyOthersOfLastUserInteraction();
    }

    public long getTimeSinceLastUserInteraction()
    {
        return SystemClock.elapsedRealtime() - mLastUserInteraction.get();
    }

    public boolean isApplicationBackground()
    {
        return !isApplicationInForeground();
    }

    public boolean isApplicationInForeground()
    {
        return mResumed.get() > mStopped.get();
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        postUiStart(mActivitiesCount.incrementAndGet());
    }

    public void onActivityDestroyed(Activity activity)
    {
        postUiExit(mActivitiesCount.decrementAndGet());
    }

    public void onActivityPaused(Activity activity)
    {
    }

    public void onActivityResumed(Activity activity)
    {
        mResumed.incrementAndGet();
        postOnForeground();
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
    }

    public void onActivityStopped(Activity activity)
    {
        mStopped.incrementAndGet();
        postOnBackground();
    }

    public boolean removeListener(ApplicationStateListener applicationstatelistener)
    {
        return mListeners.remove(applicationstatelistener);
    }

    public void updateUserInteraction()
    {
        long l = SystemClock.elapsedRealtime();
        mLastUserInteraction.set(l);
    }


}

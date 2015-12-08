// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import android.content.res.Resources;
import android.os.Handler;
import android.view.Window;
import com.snapchat.android.Timber;

public final class TitleBarManager
{
    public static final class LockedState extends Enum
    {

        private static final LockedState $VALUES[];
        public static final LockedState LOCKED;
        public static final LockedState NOT_LOCKED;

        public static LockedState valueOf(String s)
        {
            return (LockedState)Enum.valueOf(com/snapchat/android/util/TitleBarManager$LockedState, s);
        }

        public static LockedState[] values()
        {
            return (LockedState[])$VALUES.clone();
        }

        static 
        {
            NOT_LOCKED = new LockedState("NOT_LOCKED", 0);
            LOCKED = new LockedState("LOCKED", 1);
            $VALUES = (new LockedState[] {
                NOT_LOCKED, LOCKED
            });
        }

        private LockedState(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class Visibility extends Enum
    {

        private static final Visibility $VALUES[];
        public static final Visibility HIDDEN;
        public static final Visibility VISIBLE;

        public static Visibility valueOf(String s)
        {
            return (Visibility)Enum.valueOf(com/snapchat/android/util/TitleBarManager$Visibility, s);
        }

        public static Visibility[] values()
        {
            return (Visibility[])$VALUES.clone();
        }

        static 
        {
            VISIBLE = new Visibility("VISIBLE", 0);
            HIDDEN = new Visibility("HIDDEN", 1);
            $VALUES = (new Visibility[] {
                VISIBLE, HIDDEN
            });
        }

        private Visibility(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = "TitleBarManager";
    public Handler mHandler;
    public Resources mResources;
    public LockedState mTitleBarLockedState;
    public boolean mTitleBarShown;
    public Visibility mTitleBarTargetUnlockedVisibility;
    boolean mTitleBarUpdateInProgress;
    public Window mWindow;

    public TitleBarManager()
    {
        mTitleBarShown = true;
        mTitleBarUpdateInProgress = false;
        mTitleBarTargetUnlockedVisibility = Visibility.VISIBLE;
        mTitleBarLockedState = LockedState.NOT_LOCKED;
    }

    public final void a()
    {
        final boolean titleBarUpdateWasInProgress = mTitleBarUpdateInProgress;
        mTitleBarUpdateInProgress = true;
        Runnable runnable = new Runnable() {

            final TitleBarManager this$0;
            final boolean val$titleBarUpdateWasInProgress;

            public final void run()
            {
                mTitleBarUpdateInProgress = false;
                if (titleBarUpdateWasInProgress)
                {
                    a();
                }
            }

            
            {
                this$0 = TitleBarManager.this;
                titleBarUpdateWasInProgress = flag;
                super();
            }
        };
        mHandler.postDelayed(runnable, mResources.getInteger(0x7f0e0004));
        if (titleBarUpdateWasInProgress)
        {
            Timber.a("TitleBarManager", "Update was in progress. Wait.", new Object[0]);
            return;
        }
        if (mTitleBarShown)
        {
            Timber.a("TitleBarManager", "Showing title bar.", new Object[0]);
            mWindow.addFlags(2048);
            mWindow.clearFlags(1024);
            return;
        } else
        {
            Timber.a("TitleBarManager", "Hiding title bar.", new Object[0]);
            mWindow.addFlags(1024);
            mWindow.clearFlags(2048);
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.cheat.popup;

import android.app.Activity;
import android.os.Binder;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.internal.GamesLog;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.games.ui.cheat.popup:
//            CodeListenerBasePopup

public class CodeListenerPopupManager
{
    public static final class CodeListenerPopupLocationInfo
    {

        public int bottom;
        public int displayId;
        public int gravity;
        public int left;
        public int right;
        public int top;
        public IBinder windowToken;

        private CodeListenerPopupLocationInfo(int i, IBinder ibinder)
        {
            displayId = -1;
            left = 0;
            top = 0;
            right = 0;
            bottom = 0;
            gravity = i;
            windowToken = ibinder;
        }

        CodeListenerPopupLocationInfo(int i, IBinder ibinder, byte byte0)
        {
            this(i, ibinder);
        }
    }

    private static final class CodeListenerPopupManagerHCMR1 extends CodeListenerPopupManager
        implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        private WeakReference mViewWeakReference;
        private boolean mWaitingForPopupManagerReady;

        private void setPopupLocationInfo(View view)
        {
            int i = -1;
            if (PlatformVersion.checkVersion(17))
            {
                Object obj = view.getDisplay();
                int ai[];
                int j;
                int k;
                if (obj != null)
                {
                    i = ((Display) (obj)).getDisplayId();
                } else
                {
                    i = -1;
                }
            }
            obj = view.getWindowToken();
            ai = new int[2];
            view.getLocationInWindow(ai);
            j = view.getWidth();
            k = view.getHeight();
            mPopupLocationInfo.displayId = i;
            mPopupLocationInfo.windowToken = ((IBinder) (obj));
            mPopupLocationInfo.left = ai[0];
            mPopupLocationInfo.top = ai[1];
            mPopupLocationInfo.right = ai[0] + j;
            mPopupLocationInfo.bottom = ai[1] + k;
            if (mWaitingForPopupManagerReady)
            {
                mListener.onPopupManagerReady(mPopupLocationInfo);
                mWaitingForPopupManagerReady = false;
            }
        }

        protected final void createPopupLocationInfo(int i)
        {
            mPopupLocationInfo = new CodeListenerPopupLocationInfo(i, null, (byte)0);
        }

        public final void onGlobalLayout()
        {
            View view;
            if (mViewWeakReference != null)
            {
                if ((view = (View)mViewWeakReference.get()) != null)
                {
                    setPopupLocationInfo(view);
                    return;
                }
            }
        }

        public final void onViewAttachedToWindow(View view)
        {
            setPopupLocationInfo(view);
        }

        public final void onViewDetachedFromWindow(View view)
        {
            CodeListenerBasePopup.removePopups();
            view.removeOnAttachStateChangeListener(this);
        }

        public final void preparePopupManager()
        {
            if (mPopupLocationInfo.windowToken != null)
            {
                mListener.onPopupManagerReady(mPopupLocationInfo);
                return;
            }
            boolean flag;
            if (mViewWeakReference != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mWaitingForPopupManagerReady = flag;
        }

        protected CodeListenerPopupManagerHCMR1(Activity activity, int i, CodeListenerPopupManagerReadyListener codelistenerpopupmanagerreadylistener)
        {
            super(activity, 49, codelistenerpopupmanagerreadylistener, (byte)0);
            mWaitingForPopupManagerReady = false;
            CodeListenerBasePopup.removePopups();
            if (mViewWeakReference != null)
            {
                codelistenerpopupmanagerreadylistener = (View)mViewWeakReference.get();
                activity = codelistenerpopupmanagerreadylistener;
                if (codelistenerpopupmanagerreadylistener == null)
                {
                    activity = mActivity.getWindow().getDecorView();
                }
                if (activity != null)
                {
                    activity.removeOnAttachStateChangeListener(this);
                    activity = activity.getViewTreeObserver();
                    if (PlatformVersion.checkVersion(16))
                    {
                        activity.removeOnGlobalLayoutListener(this);
                    } else
                    {
                        activity.removeGlobalOnLayoutListener(this);
                    }
                }
            }
            mViewWeakReference = null;
            codelistenerpopupmanagerreadylistener = mActivity.findViewById(0x1020002);
            activity = codelistenerpopupmanagerreadylistener;
            if (codelistenerpopupmanagerreadylistener == null)
            {
                activity = mActivity.getWindow().getDecorView();
            }
            if (activity != null)
            {
                setPopupLocationInfo(activity);
                mViewWeakReference = new WeakReference(activity);
                activity.addOnAttachStateChangeListener(this);
                activity.getViewTreeObserver().addOnGlobalLayoutListener(this);
                return;
            } else
            {
                GamesLog.e("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
                return;
            }
        }
    }

    public static interface CodeListenerPopupManagerReadyListener
    {

        public abstract void onPopupManagerReady(CodeListenerPopupLocationInfo codelistenerpopuplocationinfo);
    }


    protected final Activity mActivity;
    protected final CodeListenerPopupManagerReadyListener mListener;
    protected CodeListenerPopupLocationInfo mPopupLocationInfo;

    private CodeListenerPopupManager(Activity activity, int i, CodeListenerPopupManagerReadyListener codelistenerpopupmanagerreadylistener)
    {
        mActivity = activity;
        mListener = codelistenerpopupmanagerreadylistener;
        createPopupLocationInfo(i);
    }

    CodeListenerPopupManager(Activity activity, int i, CodeListenerPopupManagerReadyListener codelistenerpopupmanagerreadylistener, byte byte0)
    {
        this(activity, i, codelistenerpopupmanagerreadylistener);
    }

    public static CodeListenerPopupManager getPopupManager$b65fc95(Activity activity, CodeListenerPopupManagerReadyListener codelistenerpopupmanagerreadylistener)
    {
        if (PlatformVersion.checkVersion(12))
        {
            return new CodeListenerPopupManagerHCMR1(activity, 49, codelistenerpopupmanagerreadylistener);
        } else
        {
            return new CodeListenerPopupManager(activity, 49, codelistenerpopupmanagerreadylistener);
        }
    }

    protected void createPopupLocationInfo(int i)
    {
        mPopupLocationInfo = new CodeListenerPopupLocationInfo(i, new Binder(), (byte)0);
    }

    public void preparePopupManager()
    {
        mListener.onPopupManagerReady(mPopupLocationInfo);
    }
}

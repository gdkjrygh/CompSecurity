// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.app.Activity;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl, IGamesService, GamesLog

public class PopupManager
{
    public static final class PopupLocationInfo
    {

        public int bottom;
        public int displayId;
        public int gravity;
        public int left;
        public int right;
        public int top;
        public IBinder windowToken;

        public final Bundle getInfoBundle()
        {
            Bundle bundle = new Bundle();
            bundle.putInt("popupLocationInfo.gravity", gravity);
            bundle.putInt("popupLocationInfo.displayId", displayId);
            bundle.putInt("popupLocationInfo.left", left);
            bundle.putInt("popupLocationInfo.top", top);
            bundle.putInt("popupLocationInfo.right", right);
            bundle.putInt("popupLocationInfo.bottom", bottom);
            return bundle;
        }

        private PopupLocationInfo(int i, IBinder ibinder)
        {
            displayId = -1;
            left = 0;
            top = 0;
            right = 0;
            bottom = 0;
            gravity = i;
            windowToken = ibinder;
        }

        PopupLocationInfo(int i, IBinder ibinder, byte byte0)
        {
            this(i, ibinder);
        }

        public PopupLocationInfo(Bundle bundle, IBinder ibinder)
        {
            displayId = -1;
            left = 0;
            top = 0;
            right = 0;
            bottom = 0;
            windowToken = ibinder;
            gravity = bundle.getInt("popupLocationInfo.gravity");
            displayId = bundle.getInt("popupLocationInfo.displayId");
            left = bundle.getInt("popupLocationInfo.left");
            top = bundle.getInt("popupLocationInfo.top");
            right = bundle.getInt("popupLocationInfo.right");
            bottom = bundle.getInt("popupLocationInfo.bottom");
        }
    }

    private static final class PopupManagerHCMR1 extends PopupManager
        implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        private boolean mMustShowWelcomePopup;
        private WeakReference mViewWeakReference;

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
            if (mMustShowWelcomePopup)
            {
                showWelcomePopup();
                mMustShowWelcomePopup = false;
            }
        }

        protected final void createPopupLocationInfo(int i)
        {
            mPopupLocationInfo = new PopupLocationInfo(i, null, (byte)0);
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
            mGamesClientImpl.cancelPopups();
            view.removeOnAttachStateChangeListener(this);
        }

        public final void setGamesContentView(View view)
        {
            mGamesClientImpl.cancelPopups();
            if (mViewWeakReference != null)
            {
                View view1 = (View)mViewWeakReference.get();
                android.content.Context context1 = ((GmsClient) (mGamesClientImpl)).mContext;
                Object obj = view1;
                if (view1 == null)
                {
                    obj = view1;
                    if (context1 instanceof Activity)
                    {
                        obj = ((Activity)context1).getWindow().getDecorView();
                    }
                }
                if (obj != null)
                {
                    ((View) (obj)).removeOnAttachStateChangeListener(this);
                    obj = ((View) (obj)).getViewTreeObserver();
                    android.content.Context context;
                    if (PlatformVersion.checkVersion(16))
                    {
                        ((ViewTreeObserver) (obj)).removeOnGlobalLayoutListener(this);
                    } else
                    {
                        ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(this);
                    }
                }
            }
            mViewWeakReference = null;
            context = ((GmsClient) (mGamesClientImpl)).mContext;
            obj = view;
            if (view == null)
            {
                obj = view;
                if (context instanceof Activity)
                {
                    obj = ((Activity)context).findViewById(0x1020002);
                    view = ((View) (obj));
                    if (obj == null)
                    {
                        view = ((Activity)context).getWindow().getDecorView();
                    }
                    GamesLog.w("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
                    obj = view;
                }
            }
            if (obj != null)
            {
                setPopupLocationInfo(((View) (obj)));
                mViewWeakReference = new WeakReference(obj);
                ((View) (obj)).addOnAttachStateChangeListener(this);
                ((View) (obj)).getViewTreeObserver().addOnGlobalLayoutListener(this);
                return;
            } else
            {
                GamesLog.e("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
                return;
            }
        }

        public final void showWelcomePopup()
        {
            if (mPopupLocationInfo.windowToken != null)
            {
                showWelcomePopup();
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
            mMustShowWelcomePopup = flag;
        }

        protected PopupManagerHCMR1(GamesClientImpl gamesclientimpl, int i)
        {
            super(gamesclientimpl, i, (byte)0);
            mMustShowWelcomePopup = false;
        }
    }


    protected GamesClientImpl mGamesClientImpl;
    protected PopupLocationInfo mPopupLocationInfo;

    private PopupManager(GamesClientImpl gamesclientimpl, int i)
    {
        mGamesClientImpl = gamesclientimpl;
        createPopupLocationInfo(i);
    }

    PopupManager(GamesClientImpl gamesclientimpl, int i, byte byte0)
    {
        this(gamesclientimpl, i);
    }

    public static PopupManager getPopupManager(GamesClientImpl gamesclientimpl, int i)
    {
        if (PlatformVersion.checkVersion(12))
        {
            return new PopupManagerHCMR1(gamesclientimpl, i);
        } else
        {
            return new PopupManager(gamesclientimpl, i);
        }
    }

    protected void createPopupLocationInfo(int i)
    {
        mPopupLocationInfo = new PopupLocationInfo(i, new Binder(), (byte)0);
    }

    public final PopupLocationInfo getPopupLocationInfo()
    {
        return mPopupLocationInfo;
    }

    public final IBinder getPopupWindowToken()
    {
        return mPopupLocationInfo.windowToken;
    }

    public void setGamesContentView(View view)
    {
    }

    public void showWelcomePopup()
    {
        GamesClientImpl gamesclientimpl;
        IBinder ibinder;
        Bundle bundle;
        gamesclientimpl = mGamesClientImpl;
        ibinder = mPopupLocationInfo.windowToken;
        bundle = mPopupLocationInfo.getInfoBundle();
        if (!gamesclientimpl.isConnected())
        {
            break MISSING_BLOCK_LABEL_42;
        }
        ((IGamesService)gamesclientimpl.getService()).showWelcomePopup(ibinder, bundle);
        return;
        RemoteException remoteexception;
        remoteexception;
        GamesClientImpl.printExceptionLog(remoteexception);
        return;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.app.Activity;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.games.internal:
//            PopupManager, GamesClientImpl, GamesLog

private static final class mMustShowWelcomePopup extends PopupManager
    implements android.view.r, android.view.Listener
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
        mPopupLocationInfo.windowToken = ((android.os.IBinder) (obj));
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
        mPopupLocationInfo = new <init>(i, null, (byte)0);
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
            super.showWelcomePopup();
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

    protected (GamesClientImpl gamesclientimpl, int i)
    {
        super(gamesclientimpl, i, (byte)0);
        mMustShowWelcomePopup = false;
    }
}

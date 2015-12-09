// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.cheat.popup;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.cheat.popup.manager.CodeListenerContextManager;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class CodeListenerBasePopup
    implements android.view.animation.Animation.AnimationListener
{
    protected static final class PopupHandler extends Handler
    {

        public final void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                throw new IllegalArgumentException("Unknown message code");

            case 0: // '\0'
                CodeListenerBasePopup.access$100((CodeListenerBasePopup)message.obj);
                return;

            case 1: // '\001'
                ((CodeListenerBasePopup)message.obj).startAnimation();
                break;
            }
        }

        private PopupHandler(Looper looper)
        {
            super(looper);
        }

        PopupHandler(Looper looper, byte byte0)
        {
            this(looper);
        }
    }


    private static final Rect RECT_CONTAINER = new Rect();
    private static final Rect RECT_OUT = new Rect();
    protected static final PopupHandler sHandler = new PopupHandler(Looper.getMainLooper(), (byte)0);
    private static final ConcurrentLinkedQueue sPopupQueue = new ConcurrentLinkedQueue();
    protected final Context mContext;
    private final Animation mHidePopupAnimation;
    private boolean mIsDisplayed;
    protected final FrameLayout mPopupContainer;
    private final CodeListenerPopupManager.CodeListenerPopupLocationInfo mPopupLocationInfo;
    protected View mPopupView;
    private final Animation mShowPopupAnimation;

    protected CodeListenerBasePopup(Context context, CodeListenerPopupManager.CodeListenerPopupLocationInfo codelistenerpopuplocationinfo)
    {
        mIsDisplayed = false;
        mContext = context;
        mPopupContainer = new FrameLayout(mContext);
        mPopupLocationInfo = codelistenerpopuplocationinfo;
        mShowPopupAnimation = AnimationUtils.loadAnimation(mContext, 0x7f05001f);
        mShowPopupAnimation.setAnimationListener(this);
        mShowPopupAnimation.setFillAfter(true);
        mHidePopupAnimation = AnimationUtils.loadAnimation(mContext, 0x7f050015);
        mHidePopupAnimation.setAnimationListener(this);
        mHidePopupAnimation.setFillAfter(true);
    }

    private void cleanup()
    {
        synchronized (sPopupQueue)
        {
            removeWindow_locked();
            sPopupQueue.remove(this);
            if (!sPopupQueue.isEmpty())
            {
                ((CodeListenerBasePopup)sPopupQueue.peek()).displayView_locked();
            }
        }
        return;
        exception;
        concurrentlinkedqueue;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void displayView_locked()
    {
        WindowManager windowmanager = (WindowManager)CodeListenerContextManager.getContext(mContext, mPopupLocationInfo.displayId).getSystemService("window");
        android.view.WindowManager.LayoutParams layoutparams = new android.view.WindowManager.LayoutParams();
        layoutparams.flags = 24;
        layoutparams.format = -3;
        mPopupContainer.measure(0, 0);
        int k = mPopupContainer.getMeasuredWidth();
        int l = mPopupContainer.getMeasuredHeight();
        layoutparams.width = k;
        layoutparams.height = l;
        if (PlatformVersion.checkVersion(12))
        {
            layoutparams.type = 1000;
            layoutparams.token = mPopupLocationInfo.windowToken;
            layoutparams.gravity = 51;
            RECT_CONTAINER.left = mPopupLocationInfo.left;
            RECT_CONTAINER.top = mPopupLocationInfo.top;
            RECT_CONTAINER.bottom = mPopupLocationInfo.bottom;
            RECT_CONTAINER.right = mPopupLocationInfo.right;
            int j = mPopupLocationInfo.gravity;
            int i = j;
            if (j == 0)
            {
                i = 49;
            }
            if (PlatformVersion.checkVersion(17))
            {
                Configuration configuration = mPopupContainer.getContext().getResources().getConfiguration();
                Gravity.apply(i, k, l, RECT_CONTAINER, RECT_OUT, configuration.getLayoutDirection());
            } else
            {
                Gravity.apply(i, k, l, RECT_CONTAINER, RECT_OUT);
            }
            layoutparams.x = RECT_OUT.left;
            layoutparams.y = RECT_OUT.top;
        } else
        {
            layoutparams.type = 2005;
            layoutparams.token = new Binder();
            layoutparams.gravity = mPopupLocationInfo.gravity;
        }
        try
        {
            windowmanager.addView(mPopupContainer, layoutparams);
        }
        catch (android.view.WindowManager.BadTokenException badtokenexception)
        {
            GamesLog.e("BasePopup", "Cannot show the popup as the given window token is not valid. Either the given view is not attached to a window or you tried to connect the GoogleApiClient in the same lifecycle step as the creation of the GoogleApiClient. See GoogleApiClient.Builder.create() and GoogleApiClient.connect() for more information.");
            cleanup();
            return;
        }
        mIsDisplayed = true;
        mPopupView.startAnimation(mShowPopupAnimation);
    }

    public static void removePopups()
    {
        if (!PlatformVersion.checkVersion(12)) goto _L2; else goto _L1
_L1:
        ConcurrentLinkedQueue concurrentlinkedqueue = sPopupQueue;
        concurrentlinkedqueue;
        JVM INSTR monitorenter ;
        CodeListenerBasePopup codelistenerbasepopup;
        for (Iterator iterator = sPopupQueue.iterator(); iterator.hasNext(); sHandler.removeMessages(1, codelistenerbasepopup))
        {
            codelistenerbasepopup = (CodeListenerBasePopup)iterator.next();
            codelistenerbasepopup.removeWindow_locked();
        }

        break MISSING_BLOCK_LABEL_60;
        Exception exception;
        exception;
        concurrentlinkedqueue;
        JVM INSTR monitorexit ;
        throw exception;
        sPopupQueue.clear();
        concurrentlinkedqueue;
        JVM INSTR monitorexit ;
_L2:
    }

    private void removeWindow_locked()
    {
        if (mIsDisplayed)
        {
            ((WindowManager)CodeListenerContextManager.getContext(mContext, mPopupLocationInfo.displayId).getSystemService("window")).removeView(mPopupContainer);
            mIsDisplayed = false;
        }
    }

    protected abstract void bindViewData();

    public void onAnimationEnd(Animation animation)
    {
        if (animation == mShowPopupAnimation)
        {
            sHandler.sendMessageDelayed(sHandler.obtainMessage(1, this), 2000L);
        } else
        if (animation == mHidePopupAnimation)
        {
            sHandler.post(new Runnable() {

                final CodeListenerBasePopup this$0;

                public final void run()
                {
                    cleanup();
                }

            
            {
                this$0 = CodeListenerBasePopup.this;
                super();
            }
            });
            return;
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    protected final boolean shouldDisplay()
    {
        return mPopupView != null;
    }



/*
    static void access$100(CodeListenerBasePopup codelistenerbasepopup)
    {
        if (codelistenerbasepopup.mPopupLocationInfo.windowToken != null)
        {
            (new PopupSetupTask((byte)0)).execute(new CodeListenerBasePopup[] {
                codelistenerbasepopup
            });
        }
        return;
    }

*/



/*
    static void access$300(CodeListenerBasePopup codelistenerbasepopup)
    {
        ((LayoutInflater)codelistenerbasepopup.mContext.getSystemService("layout_inflater")).inflate(0x7f040054, codelistenerbasepopup.mPopupContainer, true);
        codelistenerbasepopup.mPopupView = codelistenerbasepopup.mPopupContainer.findViewById(0x7f0d013f);
        codelistenerbasepopup.mPopupView.setBackgroundResource(0x7f0200d9);
        codelistenerbasepopup.bindViewData();
        return;
    }

*/


/*
    static void access$400(CodeListenerBasePopup codelistenerbasepopup)
    {
        ConcurrentLinkedQueue concurrentlinkedqueue = sPopupQueue;
        concurrentlinkedqueue;
        JVM INSTR monitorenter ;
        boolean flag;
        if (codelistenerbasepopup.mPopupView == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        flag = sPopupQueue.isEmpty();
        sPopupQueue.add(codelistenerbasepopup);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        codelistenerbasepopup.displayView_locked();
        concurrentlinkedqueue;
        JVM INSTR monitorexit ;
        return;
        codelistenerbasepopup;
        concurrentlinkedqueue;
        JVM INSTR monitorexit ;
        throw codelistenerbasepopup;
    }

*/

}

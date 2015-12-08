// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.app.Activity;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ll;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl, GamesLog

public class PopupManager
{
    public static final class PopupLocationInfo
    {

        public IBinder ZS;
        public int ZT;
        public int bottom;
        public int gravity;
        public int left;
        public int right;
        public int top;

        public Bundle lW()
        {
            Bundle bundle = new Bundle();
            bundle.putInt("popupLocationInfo.gravity", gravity);
            bundle.putInt("popupLocationInfo.displayId", ZT);
            bundle.putInt("popupLocationInfo.left", left);
            bundle.putInt("popupLocationInfo.top", top);
            bundle.putInt("popupLocationInfo.right", right);
            bundle.putInt("popupLocationInfo.bottom", bottom);
            return bundle;
        }

        private PopupLocationInfo(int i, IBinder ibinder)
        {
            ZT = -1;
            left = 0;
            top = 0;
            right = 0;
            bottom = 0;
            gravity = i;
            ZS = ibinder;
        }

    }

    private static final class PopupManagerHCMR1 extends PopupManager
        implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        private boolean Yq;
        private WeakReference ZU;

        private void m(View view)
        {
            int j = -1;
            int i = j;
            if (ll.il())
            {
                Display display = view.getDisplay();
                i = j;
                if (display != null)
                {
                    i = display.getDisplayId();
                }
            }
            IBinder ibinder = view.getWindowToken();
            int ai[] = new int[2];
            view.getLocationInWindow(ai);
            j = view.getWidth();
            int k = view.getHeight();
            ZR.ZT = i;
            ZR.ZS = ibinder;
            ZR.left = ai[0];
            ZR.top = ai[1];
            ZR.right = ai[0] + j;
            ZR.bottom = ai[1] + k;
            if (Yq)
            {
                lT();
                Yq = false;
            }
        }

        protected void dY(int i)
        {
            ZR = new PopupLocationInfo(i, null);
        }

        public void l(View view)
        {
            ZQ.lE();
            if (ZU != null)
            {
                View view1 = (View)ZU.get();
                android.content.Context context1 = ZQ.getContext();
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
                    if (ll.ik())
                    {
                        ((ViewTreeObserver) (obj)).removeOnGlobalLayoutListener(this);
                    } else
                    {
                        ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(this);
                    }
                }
            }
            ZU = null;
            context = ZQ.getContext();
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
                    GamesLog.o("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view which may not work properly in future versions of the API. Use setViewForPopups() to set your content view.");
                    obj = view;
                }
            }
            if (obj != null)
            {
                m(((View) (obj)));
                ZU = new WeakReference(obj);
                ((View) (obj)).addOnAttachStateChangeListener(this);
                ((View) (obj)).getViewTreeObserver().addOnGlobalLayoutListener(this);
                return;
            } else
            {
                GamesLog.p("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
                return;
            }
        }

        public void lT()
        {
            if (ZR.ZS != null)
            {
                lT();
                return;
            }
            boolean flag;
            if (ZU != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Yq = flag;
        }

        public void onGlobalLayout()
        {
            View view;
            if (ZU != null)
            {
                if ((view = (View)ZU.get()) != null)
                {
                    m(view);
                    return;
                }
            }
        }

        public void onViewAttachedToWindow(View view)
        {
            m(view);
        }

        public void onViewDetachedFromWindow(View view)
        {
            ZQ.lE();
            view.removeOnAttachStateChangeListener(this);
        }

        protected PopupManagerHCMR1(GamesClientImpl gamesclientimpl, int i)
        {
            super(gamesclientimpl, i, null);
            Yq = false;
        }
    }


    protected GamesClientImpl ZQ;
    protected PopupLocationInfo ZR;

    private PopupManager(GamesClientImpl gamesclientimpl, int i)
    {
        ZQ = gamesclientimpl;
        dY(i);
    }


    public static PopupManager a(GamesClientImpl gamesclientimpl, int i)
    {
        if (ll.ih())
        {
            return new PopupManagerHCMR1(gamesclientimpl, i);
        } else
        {
            return new PopupManager(gamesclientimpl, i);
        }
    }

    protected void dY(int i)
    {
        ZR = new PopupLocationInfo(i, new Binder());
    }

    public void l(View view)
    {
    }

    public void lT()
    {
        ZQ.a(ZR.ZS, ZR.lW());
    }

    public Bundle lU()
    {
        return ZR.lW();
    }

    public IBinder lV()
    {
        return ZR.ZS;
    }

    public void setGravity(int i)
    {
        ZR.gravity = i;
    }
}

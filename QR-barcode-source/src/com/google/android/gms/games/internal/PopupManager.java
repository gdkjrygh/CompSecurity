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
import com.google.android.gms.internal.kc;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl, GamesLog

public class PopupManager
{
    public static final class PopupLocationInfo
    {

        public IBinder Yb;
        public int Yc;
        public int bottom;
        public int gravity;
        public int left;
        public int right;
        public int top;

        public Bundle kP()
        {
            Bundle bundle = new Bundle();
            bundle.putInt("popupLocationInfo.gravity", gravity);
            bundle.putInt("popupLocationInfo.displayId", Yc);
            bundle.putInt("popupLocationInfo.left", left);
            bundle.putInt("popupLocationInfo.top", top);
            bundle.putInt("popupLocationInfo.right", right);
            bundle.putInt("popupLocationInfo.bottom", bottom);
            return bundle;
        }

        private PopupLocationInfo(int i, IBinder ibinder)
        {
            Yc = -1;
            left = 0;
            top = 0;
            right = 0;
            bottom = 0;
            gravity = i;
            Yb = ibinder;
        }

    }

    private static final class PopupManagerHCMR1 extends PopupManager
        implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        private boolean Wy;
        private WeakReference Yd;

        private void m(View view)
        {
            int j = -1;
            int i = j;
            if (kc.hG())
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
            Ya.Yc = i;
            Ya.Yb = ibinder;
            Ya.left = ai[0];
            Ya.top = ai[1];
            Ya.right = ai[0] + j;
            Ya.bottom = ai[1] + k;
            if (Wy)
            {
                kM();
                Wy = false;
            }
        }

        protected void dG(int i)
        {
            Ya = new PopupLocationInfo(i, null);
        }

        public void kM()
        {
            if (Ya.Yb != null)
            {
                kM();
                return;
            }
            boolean flag;
            if (Yd != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Wy = flag;
        }

        public void l(View view)
        {
            XZ.kx();
            if (Yd != null)
            {
                View view1 = (View)Yd.get();
                android.content.Context context1 = XZ.getContext();
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
                    if (kc.hF())
                    {
                        ((ViewTreeObserver) (obj)).removeOnGlobalLayoutListener(this);
                    } else
                    {
                        ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(this);
                    }
                }
            }
            Yd = null;
            context = XZ.getContext();
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
                    GamesLog.p("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view which may not work properly in future versions of the API. Use setViewForPopups() to set your content view.");
                    obj = view;
                }
            }
            if (obj != null)
            {
                m(((View) (obj)));
                Yd = new WeakReference(obj);
                ((View) (obj)).addOnAttachStateChangeListener(this);
                ((View) (obj)).getViewTreeObserver().addOnGlobalLayoutListener(this);
                return;
            } else
            {
                GamesLog.q("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
                return;
            }
        }

        public void onGlobalLayout()
        {
            View view;
            if (Yd != null)
            {
                if ((view = (View)Yd.get()) != null)
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
            XZ.kx();
            view.removeOnAttachStateChangeListener(this);
        }

        protected PopupManagerHCMR1(GamesClientImpl gamesclientimpl, int i)
        {
            super(gamesclientimpl, i, null);
            Wy = false;
        }
    }


    protected GamesClientImpl XZ;
    protected PopupLocationInfo Ya;

    private PopupManager(GamesClientImpl gamesclientimpl, int i)
    {
        XZ = gamesclientimpl;
        dG(i);
    }


    public static PopupManager a(GamesClientImpl gamesclientimpl, int i)
    {
        if (kc.hC())
        {
            return new PopupManagerHCMR1(gamesclientimpl, i);
        } else
        {
            return new PopupManager(gamesclientimpl, i);
        }
    }

    protected void dG(int i)
    {
        Ya = new PopupLocationInfo(i, new Binder());
    }

    public void kM()
    {
        XZ.a(Ya.Yb, Ya.kP());
    }

    public Bundle kN()
    {
        return Ya.kP();
    }

    public IBinder kO()
    {
        return Ya.Yb;
    }

    public void l(View view)
    {
    }

    public void setGravity(int i)
    {
        Ya.gravity = i;
    }
}

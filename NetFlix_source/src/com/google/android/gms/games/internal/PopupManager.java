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
import com.google.android.gms.internal.gr;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl, GamesLog

public class PopupManager
{
    public static final class PopupLocationInfo
    {

        public IBinder JM;
        public int JN;
        public int bottom;
        public int gravity;
        public int left;
        public int right;
        public int top;

        public Bundle gV()
        {
            Bundle bundle = new Bundle();
            bundle.putInt("popupLocationInfo.gravity", gravity);
            bundle.putInt("popupLocationInfo.displayId", JN);
            bundle.putInt("popupLocationInfo.left", left);
            bundle.putInt("popupLocationInfo.top", top);
            bundle.putInt("popupLocationInfo.right", right);
            bundle.putInt("popupLocationInfo.bottom", bottom);
            return bundle;
        }

        private PopupLocationInfo(int i, IBinder ibinder)
        {
            JN = -1;
            left = 0;
            top = 0;
            right = 0;
            bottom = 0;
            gravity = i;
            JM = ibinder;
        }

    }

    private static final class PopupManagerHCMR1 extends PopupManager
        implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        private boolean Iz;
        private WeakReference JO;

        private void h(View view)
        {
            int j = -1;
            int i = j;
            if (gr.fz())
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
            JL.JN = i;
            JL.JM = ibinder;
            JL.left = ai[0];
            JL.top = ai[1];
            JL.right = ai[0] + j;
            JL.bottom = ai[1] + k;
            if (Iz)
            {
                gS();
                Iz = false;
            }
        }

        protected void bc(int i)
        {
            JL = new PopupLocationInfo(i, null);
        }

        public void g(View view)
        {
            JK.gF();
            if (JO != null)
            {
                View view1 = (View)JO.get();
                android.content.Context context1 = JK.getContext();
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
                    if (gr.fy())
                    {
                        ((ViewTreeObserver) (obj)).removeOnGlobalLayoutListener(this);
                    } else
                    {
                        ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(this);
                    }
                }
            }
            JO = null;
            context = JK.getContext();
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
                    GamesLog.g("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view which may not work properly in future versions of the API. Use setViewForPopups() to set your content view.");
                    obj = view;
                }
            }
            if (obj != null)
            {
                h(((View) (obj)));
                JO = new WeakReference(obj);
                ((View) (obj)).addOnAttachStateChangeListener(this);
                ((View) (obj)).getViewTreeObserver().addOnGlobalLayoutListener(this);
                return;
            } else
            {
                GamesLog.h("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
                return;
            }
        }

        public void gS()
        {
            if (JL.JM != null)
            {
                gS();
                return;
            }
            boolean flag;
            if (JO != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Iz = flag;
        }

        public void onGlobalLayout()
        {
            View view;
            if (JO != null)
            {
                if ((view = (View)JO.get()) != null)
                {
                    h(view);
                    return;
                }
            }
        }

        public void onViewAttachedToWindow(View view)
        {
            h(view);
        }

        public void onViewDetachedFromWindow(View view)
        {
            JK.gF();
            view.removeOnAttachStateChangeListener(this);
        }

        protected PopupManagerHCMR1(GamesClientImpl gamesclientimpl, int i)
        {
            super(gamesclientimpl, i, null);
            Iz = false;
        }
    }


    protected GamesClientImpl JK;
    protected PopupLocationInfo JL;

    private PopupManager(GamesClientImpl gamesclientimpl, int i)
    {
        JK = gamesclientimpl;
        bc(i);
    }


    public static PopupManager a(GamesClientImpl gamesclientimpl, int i)
    {
        if (gr.fv())
        {
            return new PopupManagerHCMR1(gamesclientimpl, i);
        } else
        {
            return new PopupManager(gamesclientimpl, i);
        }
    }

    protected void bc(int i)
    {
        JL = new PopupLocationInfo(i, new Binder());
    }

    public void g(View view)
    {
    }

    public void gS()
    {
        JK.a(JL.JM, JL.gV());
    }

    public Bundle gT()
    {
        return JL.gV();
    }

    public IBinder gU()
    {
        return JL.JM;
    }

    public void setGravity(int i)
    {
        JL.gravity = i;
    }
}

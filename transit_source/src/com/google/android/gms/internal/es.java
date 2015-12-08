// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            ek, em, ep

public class es
{
    public static final class a
    {

        public int bottom;
        public int gravity;
        public int left;
        public IBinder nq;
        public int nr;
        public int right;
        public int top;

        public Bundle ca()
        {
            Bundle bundle = new Bundle();
            bundle.putInt("popupLocationInfo.gravity", gravity);
            bundle.putInt("popupLocationInfo.displayId", nr);
            bundle.putInt("popupLocationInfo.left", left);
            bundle.putInt("popupLocationInfo.top", top);
            bundle.putInt("popupLocationInfo.right", right);
            bundle.putInt("popupLocationInfo.bottom", bottom);
            return bundle;
        }

        private a(int i, IBinder ibinder)
        {
            nr = -1;
            left = 0;
            top = 0;
            right = 0;
            bottom = 0;
            gravity = i;
            nq = ibinder;
        }

    }

    private static final class b extends es
        implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        private boolean mK;
        private WeakReference ns;

        private void f(View view)
        {
            int j = -1;
            int i = j;
            if (ek.bO())
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
            np.nr = i;
            np.nq = ibinder;
            np.left = ai[0];
            np.top = ai[1];
            np.right = ai[0] + j;
            np.bottom = ai[1] + k;
            if (mK)
            {
                bX();
                mK = false;
            }
        }

        protected void Q(int i)
        {
            np = new a(i, null);
        }

        public void bX()
        {
            if (np.nq != null)
            {
                bX();
                return;
            }
            boolean flag;
            if (ns != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mK = flag;
        }

        public void e(View view)
        {
            mz.bT();
            if (ns != null)
            {
                View view1 = (View)ns.get();
                android.content.Context context1 = mz.getContext();
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
                    if (ek.bN())
                    {
                        ((ViewTreeObserver) (obj)).removeOnGlobalLayoutListener(this);
                    } else
                    {
                        ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(this);
                    }
                }
            }
            ns = null;
            context = mz.getContext();
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
                    ep.c("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view which may not work properly in future versions of the API. Use setViewForPopups() to set your content view.");
                    obj = view;
                }
            }
            if (obj != null)
            {
                f(((View) (obj)));
                ns = new WeakReference(obj);
                ((View) (obj)).addOnAttachStateChangeListener(this);
                ((View) (obj)).getViewTreeObserver().addOnGlobalLayoutListener(this);
                return;
            } else
            {
                ep.d("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
                return;
            }
        }

        public void onGlobalLayout()
        {
            View view;
            if (ns != null)
            {
                if ((view = (View)ns.get()) != null)
                {
                    f(view);
                    return;
                }
            }
        }

        public void onViewAttachedToWindow(View view)
        {
            f(view);
        }

        public void onViewDetachedFromWindow(View view)
        {
            mz.bT();
            view.removeOnAttachStateChangeListener(this);
        }

        protected b(em em1, int i)
        {
            super(em1, i, null);
            mK = false;
        }
    }


    protected em mz;
    protected a np;

    private es(em em1, int i)
    {
        mz = em1;
        Q(i);
    }


    public static es a(em em1, int i)
    {
        if (ek.bK())
        {
            return new b(em1, i);
        } else
        {
            return new es(em1, i);
        }
    }

    protected void Q(int i)
    {
        np = new a(i, new Binder());
    }

    public void bX()
    {
        mz.a(np.nq, np.ca());
    }

    public Bundle bY()
    {
        return np.ca();
    }

    public IBinder bZ()
    {
        return np.nq;
    }

    public void e(View view)
    {
    }

    public void setGravity(int i)
    {
        np.gravity = i;
    }
}

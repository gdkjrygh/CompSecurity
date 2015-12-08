// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.app.Activity;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.iq;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.games.internal:
//            PopupManager, GamesClientImpl, GamesLog

private static final class Ns extends PopupManager
    implements android.view.r, android.view.Listener
{

    private boolean Ns;
    private WeakReference OZ;

    private void h(View view)
    {
        int j = -1;
        int i = j;
        if (iq.gc())
        {
            Display display = view.getDisplay();
            i = j;
            if (display != null)
            {
                i = display.getDisplayId();
            }
        }
        android.os.IBinder ibinder = view.getWindowToken();
        int ai[] = new int[2];
        view.getLocationInWindow(ai);
        j = view.getWidth();
        int k = view.getHeight();
        OW.OY = i;
        OW.OX = ibinder;
        OW.left = ai[0];
        OW.top = ai[1];
        OW.right = ai[0] + j;
        OW.bottom = ai[1] + k;
        if (Ns)
        {
            hG();
            Ns = false;
        }
    }

    protected void cl(int i)
    {
        OW = new <init>(i, null, null);
    }

    public void g(View view)
    {
        OV.hr();
        if (OZ != null)
        {
            View view1 = (View)OZ.get();
            android.content.Context context1 = OV.getContext();
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
                if (iq.gb())
                {
                    ((ViewTreeObserver) (obj)).removeOnGlobalLayoutListener(this);
                } else
                {
                    ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(this);
                }
            }
        }
        OZ = null;
        context = OV.getContext();
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
                GamesLog.j("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view which may not work properly in future versions of the API. Use setViewForPopups() to set your content view.");
                obj = view;
            }
        }
        if (obj != null)
        {
            h(((View) (obj)));
            OZ = new WeakReference(obj);
            ((View) (obj)).addOnAttachStateChangeListener(this);
            ((View) (obj)).getViewTreeObserver().addOnGlobalLayoutListener(this);
            return;
        } else
        {
            GamesLog.k("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
            return;
        }
    }

    public void hG()
    {
        if (OW.OX != null)
        {
            super.hG();
            return;
        }
        boolean flag;
        if (OZ != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Ns = flag;
    }

    public void onGlobalLayout()
    {
        View view;
        if (OZ != null)
        {
            if ((view = (View)OZ.get()) != null)
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
        OV.hr();
        view.removeOnAttachStateChangeListener(this);
    }

    protected (GamesClientImpl gamesclientimpl, int i)
    {
        super(gamesclientimpl, i, null);
        Ns = false;
    }
}

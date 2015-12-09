// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            NavigationBarListener, TappableSurfaceView

public class NavigationBarListenerForJB extends NavigationBarListener
    implements android.view.View.OnSystemUiVisibilityChangeListener
{

    private boolean isLowPeofile;

    public NavigationBarListenerForJB(TappableSurfaceView tappablesurfaceview)
    {
        super(tappablesurfaceview);
        isLowPeofile = false;
    }

    public void onSystemUiVisibilityChange(int i)
    {
        int j = i & 2;
        if (Log.isLoggable("nf_navbar", 3))
        {
            Log.d("nf_navbar", (new StringBuilder()).append("onSystemUiVisibilityChange called: ").append(i).toString());
            Log.d("nf_navbar", (new StringBuilder()).append("onSystemUiVisibilityChange visibility mask: ").append(i & 0).toString());
            Log.d("nf_navbar", (new StringBuilder()).append("onSystemUiVisibilityChange hide mask: ").append(j).toString());
        }
        if (j != 0)
        {
            Log.d("nf_navbar", "onSystemUiVisibilityChange Navigation bar is hidden, do nothing");
            isLowPeofile = false;
            return;
        }
        if ((i & 1) != 0)
        {
            Log.d("nf_navbar", "onSystemUiVisibilityChange Navigation bar is low profile");
            isLowPeofile = true;
            return;
        }
        if ((i & 4) != 0)
        {
            Log.d("nf_navbar", "onSystemUiVisibilityChange SystemUI is full screen, do nothing");
            return;
        }
        if (!isLowPeofile)
        {
            Log.d("nf_navbar", "onSystemUiVisibilityChange Navigation bar is visible, execute onTouch event");
            owner.processOnTouchEvent(null);
        }
        isLowPeofile = false;
    }

    public void startListening()
    {
        Log.d("nf_navbar", "startListening: add itself to listen for navigation bar changes.");
        owner.setOnSystemUiVisibilityChangeListener(this);
        isLowPeofile = false;
    }

    public void stopListening()
    {
        Log.d("nf_navbar", "stopListening: remove listener");
        owner.setOnSystemUiVisibilityChangeListener(null);
    }
}

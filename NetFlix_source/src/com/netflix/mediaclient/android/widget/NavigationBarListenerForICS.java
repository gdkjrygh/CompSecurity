// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            NavigationBarListener, TappableSurfaceView

public class NavigationBarListenerForICS extends NavigationBarListener
    implements android.view.View.OnSystemUiVisibilityChangeListener
{

    public NavigationBarListenerForICS(TappableSurfaceView tappablesurfaceview)
    {
        super(tappablesurfaceview);
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
            Log.d("nf_navbar", "Navigation bar is hidden, do nothing");
            return;
        } else
        {
            Log.d("nf_navbar", "Navigation bar is visible, execute onTouch event");
            owner.processOnTouchEvent(null);
            return;
        }
    }

    public void startListening()
    {
        Log.d("nf_navbar", "startListening: add itself to listen for navigation bar changes.");
        owner.setOnSystemUiVisibilityChangeListener(this);
    }

    public void stopListening()
    {
        Log.d("nf_navbar", "stopListening: remove listener");
        owner.setOnSystemUiVisibilityChangeListener(null);
    }
}

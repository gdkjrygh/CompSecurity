// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics.scrollperf;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.pinterest.analytics.scrollperf:
//            ScrollPerfTracker, ScrollPerfTrackerConfig, ScrollPerfTrackerListener

class ScrollPerfAutoTracker extends ScrollPerfTracker
    implements android.view.ViewTreeObserver.OnScrollChangedListener
{

    private boolean c;
    private ScrollState d;

    public ScrollPerfAutoTracker(View view, ScrollPerfTrackerConfig scrollperftrackerconfig, ScrollPerfTrackerListener scrollperftrackerlistener)
    {
        super(view, scrollperftrackerconfig, scrollperftrackerlistener);
        c = false;
        d = ScrollState.a;
    }

    final void a()
    {
        ViewTreeObserver viewtreeobserver = b.getViewTreeObserver();
        if (viewtreeobserver != null)
        {
            viewtreeobserver.addOnScrollChangedListener(this);
        }
        super.a();
    }

    final void b()
    {
        ViewTreeObserver viewtreeobserver = b.getViewTreeObserver();
        if (viewtreeobserver != null)
        {
            viewtreeobserver.removeOnScrollChangedListener(this);
        }
        super.b();
    }

    public boolean onPreDraw()
    {
        while (!a || d == ScrollState.a) 
        {
            return true;
        }
        if (d == ScrollState.b)
        {
            if (c)
            {
                c = false;
            } else
            {
                d = ScrollState.a;
                d();
            }
        }
        return super.onPreDraw();
    }

    public void onScrollChanged()
    {
        if (d == ScrollState.a)
        {
            c();
            d = ScrollState.b;
        }
        c = true;
    }

    private class ScrollState extends Enum
    {

        public static final ScrollState a;
        public static final ScrollState b;
        private static final ScrollState c[];

        public static ScrollState valueOf(String s)
        {
            return (ScrollState)Enum.valueOf(com/pinterest/analytics/scrollperf/ScrollPerfAutoTracker$ScrollState, s);
        }

        public static ScrollState[] values()
        {
            return (ScrollState[])c.clone();
        }

        static 
        {
            a = new ScrollState("IDLE", 0);
            b = new ScrollState("SCROLL", 1);
            c = (new ScrollState[] {
                a, b
            });
        }

        private ScrollState(String s, int i)
        {
            super(s, i);
        }
    }

}

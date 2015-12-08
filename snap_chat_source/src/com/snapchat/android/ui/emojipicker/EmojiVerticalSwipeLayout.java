// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.emojipicker;

import Gp;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.snapchat.android.ui.VerticalSwipeLayout;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.snapchat.android.ui.emojipicker:
//            EmojiPickerView

public class EmojiVerticalSwipeLayout extends VerticalSwipeLayout
{
    public final class a extends android.view.GestureDetector.SimpleOnGestureListener
    {

        public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
        {
            return Math.abs(f2) > Math.abs(f1);
        }

        public a()
        {
        }
    }


    public Gp a;
    public EmojiPickerView b;
    public View e;
    public boolean f;
    public GestureDetector g;

    public EmojiVerticalSwipeLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = false;
    }

    public final void a(int i, double d)
    {
        super.a(i, d);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return super.onInterceptTouchEvent(motionevent) && g.onTouchEvent(motionevent);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getY() <= (float)e.getHeight())
        {
            return false;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    protected void onVisibilityChanged(View view, int i)
    {
        super.onVisibilityChanged(view, i);
        if (a != null)
        {
            for (view = a.a.iterator(); view.hasNext(); ((Gp.a)view.next()).a(i)) { }
        }
    }

    // Unreferenced inner class com/snapchat/android/ui/emojipicker/EmojiVerticalSwipeLayout$1

/* anonymous class */
    public final class _cls1
        implements com.snapchat.android.ui.VerticalSwipeLayout.a
    {

        private EmojiVerticalSwipeLayout a;

        public final void a(int i, int j, int k)
        {
        }

        public final void b(int i, int j, int k)
        {
        }

        public final void b_(int i)
        {
            if (i == 0)
            {
                a.setVisibility(4);
            }
        }

            public 
            {
                a = EmojiVerticalSwipeLayout.this;
                super();
            }
    }

}

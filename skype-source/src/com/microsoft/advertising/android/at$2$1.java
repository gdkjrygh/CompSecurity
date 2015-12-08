// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

// Referenced classes of package com.microsoft.advertising.android:
//            v, at

final class c
    implements c
{

    final avity a;
    private final v b;
    private final v c;

    public final void a()
    {
        b.setGravity(17);
        if (c.getTextSize() > b.getTextSize())
        {
            c.setTextSize(b.getTextSize());
        }
        c.setGravity(17);
    }

    outListener(outListener outlistener, v v1, v v2)
    {
        a = outlistener;
        b = v1;
        c = v2;
        super();
    }

    // Unreferenced inner class com/microsoft/advertising/android/at$2

/* anonymous class */
    final class at._cls2
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final at a;
        private final String b;
        private final String c;
        private final LinearLayout d;

        public final void onGlobalLayout()
        {
            if (b.equals(""))
            {
                v v1 = v.a(a.getContext(), c, 17, 12, a.getHeight(), true, 2);
                d.addView(v1);
                v1.setTextColor(-1);
                v1.setGravity(17);
                v1.setTextColor(Color.argb(255, 20, 184, 105));
            } else
            {
                v v2 = v.a(a.getContext(), c, 17, 13, a.getHeight() / 2, true, 1);
                d.addView(v2);
                v2.setTypeface(Typeface.DEFAULT_BOLD);
                v2.setTextColor(Color.argb(255, 20, 184, 105));
                v v3 = v.a(a.getContext(), b, 15, 12, a.getHeight() / 2, false, 1);
                d.addView(v3);
                v3.setTextColor(Color.argb(255, 73, 119, 193));
                v2.a(new at._cls2._cls1(this, v2, v3));
            }
            d.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }

            
            {
                a = at1;
                b = s;
                c = s1;
                d = linearlayout;
                super();
            }
    }

}

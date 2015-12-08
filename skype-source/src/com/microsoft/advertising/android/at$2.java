// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

// Referenced classes of package com.microsoft.advertising.android:
//            at, v

final class d
    implements android.view.reeObserver.OnGlobalLayoutListener
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
            v2.a(new v.a(v2, v3) {

                final at._cls2 a;
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

            
            {
                a = at._cls2.this;
                b = v1;
                c = v2;
                super();
            }
            });
        }
        d.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    _cls1.c(at at1, String s, String s1, LinearLayout linearlayout)
    {
        a = at1;
        b = s;
        c = s1;
        d = linearlayout;
        super();
    }
}

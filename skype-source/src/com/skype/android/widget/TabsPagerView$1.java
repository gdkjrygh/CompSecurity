// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.os.Handler;
import android.widget.TextView;
import com.skype.android.text.TypeFaceFactory;
import java.util.List;

// Referenced classes of package com.skype.android.widget:
//            TabsPagerView

final class a
    implements com.skype.android.widget.animator.etionListener
{

    final TabsPagerView a;

    public final void a()
    {
        TabsPagerView.d(a).post(new Runnable() {

            final TabsPagerView._cls1 a;

            public final void run()
            {
                int i = 0;
                while (i < TabsPagerView.a(a.a).size()) 
                {
                    TextView textview = TabsPagerView.a(a.a, i);
                    android.graphics.Typeface typeface;
                    if (i == TabsPagerView.b(a.a))
                    {
                        typeface = TabsPagerView.c(a.a).getBold(textview.getTextSize());
                    } else
                    {
                        typeface = TabsPagerView.c(a.a).getDefault(textview.getTextSize());
                    }
                    textview.setTypeface(typeface);
                    i++;
                }
            }

            
            {
                a = TabsPagerView._cls1.this;
                super();
            }
        });
    }

    _cls1.a(TabsPagerView tabspagerview)
    {
        a = tabspagerview;
        super();
    }
}

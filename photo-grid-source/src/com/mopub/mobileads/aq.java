// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Utils;
import com.mopub.mobileads.resource.CloseButtonDrawable;
import com.mopub.mobileads.resource.CountdownDrawable;
import com.mopub.mobileads.resource.LearnMoreDrawable;

// Referenced classes of package com.mopub.mobileads:
//            ar, ap, an

final class aq extends LinearLayout
{

    private final an a = (new ap(getContext())).a(2.0F).a(19).a().b().c();
    private final an b = (new ap(getContext())).a(1.0F).a(21).a("Learn More").a(new LearnMoreDrawable()).b(4).c();
    private final an c;
    private final an d = (new ap(getContext())).a(1.0F).a(21).a("Close").a(new CloseButtonDrawable()).b(8).c();

    public aq(Context context)
    {
        super(context);
        setId((int)Utils.generateUniqueId());
        setOnTouchListener(new ar(this));
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, Dips.dipsToIntPixels(44F, getContext())));
        setBackgroundColor(0xff000000);
        getBackground().setAlpha(180);
        context = new CountdownDrawable(getContext());
        c = (new ap(getContext())).a(1.0F).a(21).a("Skip in").a(context).b(4).c();
        addView(a);
        addView(b);
        addView(c);
        addView(d);
    }

    private static long a(long l)
    {
        return Math.round(Math.ceil((float)l / 1000F));
    }

    final void a()
    {
        c.setVisibility(8);
        b.setVisibility(0);
        d.setVisibility(0);
    }

    final void a(int i)
    {
        if (i >= 200)
        {
            an an1 = a;
            StringBuilder stringbuilder = new StringBuilder("Ends in ");
            long l = a(i);
            String s;
            if (l == 1L)
            {
                s = "1 second";
            } else
            {
                s = (new StringBuilder()).append(String.valueOf(l)).append(" seconds").toString();
            }
            an1.a(stringbuilder.append(s).toString());
        } else
        if (i >= 0)
        {
            a.a("Thanks for watching");
            return;
        }
    }

    final void a(android.view.View.OnTouchListener ontouchlistener)
    {
        d.setOnTouchListener(ontouchlistener);
    }

    final void a(String s)
    {
        b.a(s);
    }

    final void b(int i)
    {
        if (i >= 0 && c.getVisibility() == 4)
        {
            d.setVisibility(8);
            c.setVisibility(0);
        }
        c.b(String.valueOf(a(i)));
    }

    final void b(android.view.View.OnTouchListener ontouchlistener)
    {
        b.setOnTouchListener(ontouchlistener);
    }

    final void b(String s)
    {
        d.a(s);
    }

    final void c(String s)
    {
        d.c(s);
    }
}

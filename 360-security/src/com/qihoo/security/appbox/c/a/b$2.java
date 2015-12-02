// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.c.a;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.android.volley.VolleyError;
import com.qihoo.security.SecurityApplication;

// Referenced classes of package com.qihoo.security.appbox.c.a:
//            b

class d
    implements com.android.volley.toolbox.._cls2
{

    final ImageView a;
    final Integer b;
    final Drawable c;
    final Drawable d;
    final b e;

    private boolean a()
    {
        Integer integer = (Integer)a.getTag(0x7f0b0006);
        return integer != null && integer == b;
    }

    public void a(VolleyError volleyerror)
    {
        if (c != null && a())
        {
            a.setImageDrawable(c);
        }
    }

    public void a(com.android.volley.toolbox.._cls2 _pcls2, boolean flag)
    {
        if (a())
        {
            if (_pcls2.b() != null)
            {
                if (!flag && d != null)
                {
                    _pcls2 = new TransitionDrawable(new Drawable[] {
                        d, new BitmapDrawable(SecurityApplication.a().getResources(), _pcls2.b())
                    });
                    _pcls2.setCrossFadeEnabled(true);
                    a.setImageDrawable(_pcls2);
                    _pcls2.startTransition(100);
                    return;
                } else
                {
                    a.setImageBitmap(_pcls2.b());
                    return;
                }
            }
            if (d != null)
            {
                a.setImageDrawable(d);
                return;
            }
        }
    }

    (b b1, ImageView imageview, Integer integer, Drawable drawable, Drawable drawable1)
    {
        e = b1;
        a = imageview;
        b = integer;
        c = drawable;
        d = drawable1;
        super();
    }
}

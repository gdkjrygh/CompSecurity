// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.view.View;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.events.a;
import com.cardinalblue.android.piccollage.events.m;
import com.cardinalblue.android.piccollage.model.PhotoInfo;
import com.cardinalblue.android.piccollage.view.CheckableImageView;
import com.squareup.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            k

class a
    implements android.view..OnClickListener
{

    final PhotoInfo a;
    final com.cardinalblue.android.piccollage.view.a.k b;

    public void onClick(View view)
    {
        view = (CheckableImageView)view;
        int j = b.c;
        int i;
        if (view.a())
        {
            i = -1;
        } else
        {
            i = 1;
        }
        i += j;
        if (i <= b.d && i >= 0)
        {
            view.b();
            if (view.a())
            {
                view = b;
                view.c = ((com.cardinalblue.android.piccollage.view.a.k) (view)).c + 1;
                a.a(true);
                d.a().c(new a(a));
                return;
            } else
            {
                view = b;
                view.c = ((com.cardinalblue.android.piccollage.view.a.k) (view)).c - 1;
                a.a(false);
                d.a().c(new m(a));
                return;
            }
        } else
        {
            String s = String.format(view.getContext().getString(0x7f0702a4), new Object[] {
                Integer.valueOf(30)
            });
            k.a(view.getContext(), s, 0);
            return;
        }
    }

    Info(com.cardinalblue.android.piccollage.view.a.k k1, PhotoInfo photoinfo)
    {
        b = k1;
        a = photoinfo;
        super();
    }
}

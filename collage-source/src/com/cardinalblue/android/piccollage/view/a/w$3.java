// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.view.View;
import android.widget.Checkable;
import com.cardinalblue.android.piccollage.model.gson.Sticker;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            w

class b
    implements android.view..OnClickListener
{

    final Sticker a;
    final android.support.v7.widget.clerView.ViewHolder b;
    final w c;

    public void onClick(View view)
    {
        if (w.c(c) != null)
        {
            w.c(c).a(a, (Checkable)b.itemView);
        }
    }

    er(w w1, Sticker sticker, android.support.v7.widget.clerView.ViewHolder viewholder)
    {
        c = w1;
        a = sticker;
        b = viewholder;
        super();
    }
}

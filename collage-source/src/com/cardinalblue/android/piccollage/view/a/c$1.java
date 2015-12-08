// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.view.View;
import com.cardinalblue.android.piccollage.model.gson.ActionableBackground;
import com.cardinalblue.android.piccollage.model.gson.IBackground;
import com.cardinalblue.android.piccollage.model.gson.PurchasableBackground;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            c

class a
    implements android.view..OnClickListener
{

    final IBackground a;
    final c b;

    public void onClick(View view)
    {
        if (c.a(b) == null)
        {
            return;
        }
        if (a instanceof ActionableBackground)
        {
            c.a(b).a();
            return;
        }
        if (a instanceof PurchasableBackground)
        {
            c.a(b).a(((PurchasableBackground)a).getPurchaseInfo());
            return;
        } else
        {
            c.a(b).a(a);
            return;
        }
    }

    IBackground(c c1, IBackground ibackground)
    {
        b = c1;
        a = ibackground;
        super();
    }
}

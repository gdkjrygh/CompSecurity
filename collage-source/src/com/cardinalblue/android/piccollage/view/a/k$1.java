// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.view.View;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.events.n;
import com.squareup.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            k

class a
    implements android.view..OnClickListener
{

    final k a;

    public void onClick(View view)
    {
        d.a().c(new n());
    }

    d(k k1)
    {
        a = k1;
        super();
    }
}

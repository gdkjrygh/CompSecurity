// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.view.View;
import com.cardinalblue.android.piccollage.model.d;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            j

class b
    implements android.view..OnClickListener
{

    final int a;
    final d b;
    final j c;

    public void onClick(View view)
    {
        j.a(c, a);
        if (j.a(c) != null)
        {
            j.a(c).a(b);
        }
    }

    (j j1, int i, d d)
    {
        c = j1;
        a = i;
        b = d;
        super();
    }
}

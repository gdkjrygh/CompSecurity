// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.widget.ViewSwitcher;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.a.f;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            ai

class a
    implements i
{

    final ai a;

    public Void a(j j1)
        throws Exception
    {
        if (j1.d() || j1.c())
        {
            f.a(j1.f());
        }
        ai.c(a).setDisplayedChild(1);
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (ai ai1)
    {
        a = ai1;
        super();
    }
}

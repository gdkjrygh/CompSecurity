// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            ha, ge, PhotoGridActivity, rc

final class hb
    implements android.view.View.OnClickListener
{

    final int a;
    final ha b;

    hb(ha ha1, int i)
    {
        b = ha1;
        a = i;
        super();
    }

    public final void onClick(View view)
    {
        if (!ge.f(b.b).i)
        {
            view = b.b;
            rc.a(ge.f(b.b));
            ge.b(view, rc.e(), ge.i(b.b)[a]);
        }
    }
}

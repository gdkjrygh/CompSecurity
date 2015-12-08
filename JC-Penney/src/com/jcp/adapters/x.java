// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.view.View;
import com.jcp.util.au;

// Referenced classes of package com.jcp.adapters:
//            w

class x
    implements android.view.View.OnClickListener
{

    final w a;

    x(w w1)
    {
        a = w1;
        super();
    }

    public void onClick(View view)
    {
        au.a(w.a(a), w.a(a).getString(0x7f07021c), w.a(a).getString(0x7f07021b));
    }
}

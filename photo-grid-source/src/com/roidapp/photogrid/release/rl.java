// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.release:
//            ri

final class rl
    implements android.view.View.OnClickListener
{

    final ri a;

    rl(ri ri1)
    {
        a = ri1;
        super();
    }

    public final void onClick(View view)
    {
        if (ri.c(a).getVisibility() == 8 || ri.d(a).getVisibility() == 4)
        {
            ri.c(a).setVisibility(0);
            ri.d(a).setVisibility(0);
            ri.e(a).setText(0x7f07028c);
            return;
        } else
        {
            ri.a(a);
            return;
        }
    }
}

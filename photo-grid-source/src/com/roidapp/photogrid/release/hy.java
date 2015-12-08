// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.widget.Button;

// Referenced classes of package com.roidapp.photogrid.release:
//            hx

final class hy
    implements android.view.View.OnClickListener
{

    final Button a;
    final hx b;

    hy(hx hx1, Button button)
    {
        b = hx1;
        a = button;
        super();
    }

    public final void onClick(View view)
    {
        b.b = true;
        a.setEnabled(false);
    }
}

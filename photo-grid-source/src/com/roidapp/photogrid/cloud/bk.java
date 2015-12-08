// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.view.View;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            SelectorBaseActivity

final class bk
    implements android.view.View.OnClickListener
{

    final SelectorBaseActivity a;

    bk(SelectorBaseActivity selectorbaseactivity)
    {
        a = selectorbaseactivity;
        super();
    }

    public final void onClick(View view)
    {
        if (a.l != null && a.l.size() > 0)
        {
            a.i.setVisibility(0);
        }
    }
}

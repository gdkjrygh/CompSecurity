// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.AlertDialog;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.release:
//            ge

final class gu
    implements android.view.View.OnClickListener
{

    final ge a;

    gu(ge ge1)
    {
        a = ge1;
        super();
    }

    public final void onClick(View view)
    {
        if (ge.j(a) != null)
        {
            ge.j(a).findViewById(0x7f0d0047).setClickable(false);
            ((TextView)ge.j(a).findViewById(0x7f0d0048)).setTextColor(a.getResources().getColor(0x7f0c00c0));
        }
        ge.r(a);
    }
}

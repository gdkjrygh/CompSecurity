// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package com.roidapp.photogrid.release:
//            PickFolder

final class pu
    implements android.view.View.OnClickListener
{

    final PickFolder a;

    pu(PickFolder pickfolder)
    {
        a = pickfolder;
        super();
    }

    public final void onClick(View view)
    {
        if (a.u != null)
        {
            a.u.removeAllViews();
        }
        view = new Intent();
        view.putExtra("added", false);
        a.setResult(2, view);
        a.finish();
    }
}

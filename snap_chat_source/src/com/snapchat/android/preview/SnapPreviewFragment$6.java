// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import Bj;
import Bt;
import android.app.AlertDialog;
import android.view.View;
import java.util.List;

// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class a
    implements android.view.eviewFragment._cls6
{

    private SnapPreviewFragment a;

    public final void onClick(View view)
    {
        if (Bt.U())
        {
            SnapPreviewFragment.u(a).show();
            return;
        }
        if (SnapPreviewFragment.v(a).e().size() > 1)
        {
            SnapPreviewFragment.w(a);
            return;
        } else
        {
            SnapPreviewFragment.x(a);
            return;
        }
    }

    (SnapPreviewFragment snappreviewfragment)
    {
        a = snappreviewfragment;
        super();
    }
}

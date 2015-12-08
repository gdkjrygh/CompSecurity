// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import PI;
import android.view.View;

// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class a
    implements android.view.eviewFragment._cls4
{

    private SnapPreviewFragment a;

    public final void onClick(View view)
    {
        if (!SnapPreviewFragment.r(a).c())
        {
            if (SnapPreviewFragment.s(a))
            {
                SnapPreviewFragment.k(a);
            }
            SnapPreviewFragment.t(a);
        }
    }

    (SnapPreviewFragment snappreviewfragment)
    {
        a = snappreviewfragment;
        super();
    }
}

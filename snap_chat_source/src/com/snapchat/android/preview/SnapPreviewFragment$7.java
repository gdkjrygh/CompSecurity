// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import android.view.View;
import com.snapchat.android.analytics.framework.EasyMetric;
import lv;

// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class a
    implements android.view.eviewFragment._cls7
{

    private SnapPreviewFragment a;

    public final void onClick(View view)
    {
        if (!SnapPreviewFragment.y(a))
        {
            SnapPreviewFragment.z(a).mPrepareSnapMetric = com.snapchat.android.analytics.framework.actory.b("PREPARE_SNAP").b();
            SnapPreviewFragment.A(a);
        }
        SnapPreviewFragment.B(a);
    }

    (SnapPreviewFragment snappreviewfragment)
    {
        a = snappreviewfragment;
        super();
    }
}

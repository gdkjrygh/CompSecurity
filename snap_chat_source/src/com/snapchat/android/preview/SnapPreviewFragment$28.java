// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import android.view.View;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.ui.SnapEditorView;

// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class a
    implements android.view.viewFragment._cls28
{

    private SnapPreviewFragment a;

    public final void onClick(View view)
    {
        AnalyticsEvents.i();
        SnapPreviewFragment.f(a).j();
        SnapPreviewFragment.k(a);
    }

    _cls9(SnapPreviewFragment snappreviewfragment)
    {
        a = snappreviewfragment;
        super();
    }
}

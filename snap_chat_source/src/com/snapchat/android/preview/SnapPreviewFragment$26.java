// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import PI;
import android.view.View;
import com.snapchat.android.ui.SnapEditorView;
import com.snapchat.android.ui.caption.SnapCaptionView;

// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class a
    implements android.view.viewFragment._cls26
{

    private SnapPreviewFragment a;

    public final void onClick(View view)
    {
        SnapPreviewFragment.h(a).a(4);
        SnapPreviewFragment.f(a).j();
        if (SnapPreviewFragment.f(a).h.m() && !SnapPreviewFragment.f(a).h.i())
        {
            SnapPreviewFragment.f(a).h.h();
            return;
        } else
        {
            SnapPreviewFragment.f(a).a(true);
            return;
        }
    }

    _cls9(SnapPreviewFragment snappreviewfragment)
    {
        a = snappreviewfragment;
        super();
    }
}

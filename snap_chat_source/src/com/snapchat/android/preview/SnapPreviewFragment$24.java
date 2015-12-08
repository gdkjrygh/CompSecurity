// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import PI;
import android.os.SystemClock;
import android.view.View;
import com.snapchat.android.analytics.ui.EmojiPickerAnalytics;
import com.snapchat.android.ui.SnapEditorView;
import com.snapchat.android.ui.VerticalSwipeLayout;
import com.snapchat.android.ui.caption.SnapCaptionView;
import com.snapchat.android.ui.emojipicker.EmojiVerticalSwipeLayout;

// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class a
    implements android.view.viewFragment._cls24
{

    private SnapPreviewFragment a;

    public final void onClick(View view)
    {
        SnapPreviewFragment.f(a).h.a(true);
        SnapPreviewFragment.g(a);
        if (SnapPreviewFragment.h(a).c())
        {
            ((EmojiVerticalSwipeLayout)SnapPreviewFragment.h(a).a()).a(0, 0.0D);
            view = SnapPreviewFragment.i(a);
            view.c = ((EmojiPickerAnalytics) (view)).c + 1;
            view.a();
        } else
        {
            SnapPreviewFragment.h(a).a(0);
            ((EmojiVerticalSwipeLayout)SnapPreviewFragment.h(a).a()).a(1, 1.0D);
            view = SnapPreviewFragment.i(a);
            if (((EmojiPickerAnalytics) (view)).h == -1L)
            {
                view.a = ((EmojiPickerAnalytics) (view)).a + 1;
                view.h = SystemClock.elapsedRealtime();
                return;
            }
        }
    }

    cs(SnapPreviewFragment snappreviewfragment)
    {
        a = snappreviewfragment;
        super();
    }
}

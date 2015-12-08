// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;

import EU;
import android.view.View;
import com.snapchat.android.Timber;

// Referenced classes of package com.snapchat.android.stories.ui:
//            StoryThumbnailLayout

final class a
    implements android.view.yThumbnailLayout._cls1
{

    private int a;
    private StoryThumbnailLayout b;

    public final void onClick(View view)
    {
        if (StoryThumbnailLayout.a(b) == null)
        {
            Timber.c("StoryThumbnailLayout", "Cannot tap on thumbnail since listener is null.", new Object[0]);
            return;
        }
        if (StoryThumbnailLayout.b(b).f)
        {
            Timber.c("StoryThumbnailLayout", "Cannot tap on thumbnail since thumbnails are animating.", new Object[0]);
            return;
        } else
        {
            StoryThumbnailLayout.a(b).b(a);
            return;
        }
    }

    (StoryThumbnailLayout storythumbnaillayout, int i)
    {
        b = storythumbnaillayout;
        a = i;
        super();
    }
}

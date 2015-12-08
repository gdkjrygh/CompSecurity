// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import android.view.View;
import com.snapchat.android.model.MediaMailingMetadata;
import com.snapchat.android.model.Mediabryo;

// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class a
    implements android.view.eviewFragment._cls2
{

    private SnapPreviewFragment a;

    public final void onClick(View view)
    {
        SnapPreviewFragment.o(a);
        ((Mediabryo) (SnapPreviewFragment.p(a))).mMediaMailingMetadata.mSavedInGallery = true;
    }

    (SnapPreviewFragment snappreviewfragment)
    {
        a = snappreviewfragment;
        super();
    }
}

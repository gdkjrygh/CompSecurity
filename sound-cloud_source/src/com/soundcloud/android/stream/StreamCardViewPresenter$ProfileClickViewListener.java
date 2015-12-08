// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.view.View;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.stream:
//            StreamCardViewPresenter

private class userUrn
    implements android.view.lickViewListener
{

    final StreamCardViewPresenter this$0;
    private final Urn userUrn;

    public void onClick(View view)
    {
        StreamCardViewPresenter.access$000(StreamCardViewPresenter.this).openProfile(view.getContext(), userUrn);
    }

    (Urn urn)
    {
        this$0 = StreamCardViewPresenter.this;
        super();
        userUrn = urn;
    }
}

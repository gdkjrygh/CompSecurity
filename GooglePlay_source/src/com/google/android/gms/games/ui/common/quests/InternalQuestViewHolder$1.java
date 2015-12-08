// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.quests;

import android.graphics.drawable.Drawable;
import android.view.View;

// Referenced classes of package com.google.android.gms.games.ui.common.quests:
//            InternalQuestViewHolder

final class this._cls0
    implements com.google.android.gms.common.images.Listener
{

    final InternalQuestViewHolder this$0;

    public final void onImageLoaded$482c40fe(Drawable drawable)
    {
        mBackgroundGuardView.setVisibility(0);
    }

    ()
    {
        this$0 = InternalQuestViewHolder.this;
        super();
    }
}

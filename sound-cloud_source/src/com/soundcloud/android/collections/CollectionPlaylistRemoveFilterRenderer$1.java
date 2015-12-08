// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.view.View;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionPlaylistRemoveFilterRenderer

class this._cls0
    implements android.view.emoveFilterRenderer._cls1
{

    final CollectionPlaylistRemoveFilterRenderer this$0;

    public void onClick(View view)
    {
        if (CollectionPlaylistRemoveFilterRenderer.access$000(CollectionPlaylistRemoveFilterRenderer.this) != null)
        {
            CollectionPlaylistRemoveFilterRenderer.access$000(CollectionPlaylistRemoveFilterRenderer.this).onRemoveFilter();
        }
    }

    RemoveFilterListener()
    {
        this$0 = CollectionPlaylistRemoveFilterRenderer.this;
        super();
    }
}

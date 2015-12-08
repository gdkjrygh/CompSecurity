// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.view.View;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionPlaylistHeaderRenderer

class this._cls0
    implements android.view.ylistHeaderRenderer._cls1
{

    final CollectionPlaylistHeaderRenderer this$0;

    public void onClick(View view)
    {
        if (CollectionPlaylistHeaderRenderer.access$000(CollectionPlaylistHeaderRenderer.this) != null)
        {
            CollectionPlaylistHeaderRenderer.access$000(CollectionPlaylistHeaderRenderer.this).onSettingsClicked(view);
        }
    }

    SettingsClickListener()
    {
        this$0 = CollectionPlaylistHeaderRenderer.this;
        super();
    }
}

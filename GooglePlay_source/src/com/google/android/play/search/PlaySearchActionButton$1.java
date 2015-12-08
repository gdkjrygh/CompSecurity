// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.view.View;

// Referenced classes of package com.google.android.play.search:
//            PlaySearchActionButton, PlaySearchController

final class this._cls0
    implements android.view.rchActionButton._cls1
{

    final PlaySearchActionButton this$0;

    public final void onClick(View view)
    {
        if (PlaySearchActionButton.access$000(PlaySearchActionButton.this) != null)
        {
            if (PlaySearchActionButton.access$100(PlaySearchActionButton.this) == 1)
            {
                PlaySearchActionButton.access$000(PlaySearchActionButton.this).setQueryInternal("", true);
                return;
            }
            if (PlaySearchActionButton.access$100(PlaySearchActionButton.this) == 2)
            {
                PlaySearchActionButton.access$000(PlaySearchActionButton.this).setMode(4);
                return;
            }
        }
    }

    ()
    {
        this$0 = PlaySearchActionButton.this;
        super();
    }
}

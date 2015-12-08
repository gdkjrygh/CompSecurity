// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.app.Activity;
import android.view.View;
import com.pandora.android.util.ThumbImageButton;
import com.pandora.android.util.ae;

// Referenced classes of package com.pandora.android.view:
//            MiniPlayerView

class a
    implements android.view.ner
{

    final MiniPlayerView a;

    public void onClick(View view)
    {
        a.a((Activity)a.getContext(), MiniPlayerView.c(a));
        MiniPlayerView.c(a).setEnabled(false);
        ae.a(MiniPlayerView.c(a), a);
    }

    (MiniPlayerView miniplayerview)
    {
        a = miniplayerview;
        super();
    }
}

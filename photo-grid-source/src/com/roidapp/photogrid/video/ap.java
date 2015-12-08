// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.video:
//            TrackSelector

final class ap
    implements android.view.View.OnClickListener
{

    final TrackSelector a;

    ap(TrackSelector trackselector)
    {
        a = trackselector;
        super();
    }

    public final void onClick(View view)
    {
        a.setResult(0, null);
        a.finish();
    }
}

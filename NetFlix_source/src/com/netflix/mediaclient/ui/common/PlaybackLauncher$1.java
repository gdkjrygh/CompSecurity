// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.content.Context;
import com.netflix.mediaclient.ui.mdx.MdxMiniPlayerFrag;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            PlaybackLauncher

static final class val.context
    implements Runnable
{

    final Context val$context;

    public void run()
    {
        MdxMiniPlayerFrag.sendShowAndDisableIntent(val$context);
    }

    (Context context1)
    {
        val$context = context1;
        super();
    }
}

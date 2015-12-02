// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.broadcast;

import android.view.View;
import com.facebook.orca.compose.ComposeAttachmentContainer;
import com.facebook.orca.compose.k;
import com.facebook.ui.media.attachments.a;
import java.util.LinkedHashMap;

// Referenced classes of package com.facebook.orca.broadcast:
//            ComposeBroadcastFragment

class m
    implements k
{

    final ComposeBroadcastFragment a;

    m(ComposeBroadcastFragment composebroadcastfragment)
    {
        a = composebroadcastfragment;
        super();
    }

    public void a()
    {
        boolean flag = ComposeBroadcastFragment.c(a).getMediaAttachments().isEmpty();
        View view = ComposeBroadcastFragment.d(a);
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
    }

    public void a(a a1)
    {
    }
}

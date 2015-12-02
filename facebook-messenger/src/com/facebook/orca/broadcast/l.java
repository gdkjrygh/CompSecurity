// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.broadcast;

import android.support.v4.app.q;
import android.view.View;
import com.facebook.o;
import com.facebook.orca.compose.ComposeAttachmentContainer;
import com.facebook.orca.photos.picking.PickMediaOperation;
import com.facebook.orca.photos.picking.PickMediaParams;
import com.facebook.ui.d.a;
import java.util.LinkedHashMap;

// Referenced classes of package com.facebook.orca.broadcast:
//            ComposeBroadcastFragment

class l
    implements android.view.View.OnClickListener
{

    final ComposeBroadcastFragment a;

    l(ComposeBroadcastFragment composebroadcastfragment)
    {
        a = composebroadcastfragment;
        super();
    }

    public void onClick(View view)
    {
        if (!ComposeBroadcastFragment.b(a))
        {
            return;
        }
        if (ComposeBroadcastFragment.c(a).getMediaAttachments().size() >= 3)
        {
            com.facebook.ui.d.a.a(a.n()).a(o.broadcast_max_photos_title).b(a.a(o.broadcast_max_photos_message, new Object[] {
                Integer.valueOf(3)
            })).a();
            return;
        } else
        {
            view = new PickMediaParams(true);
            ((PickMediaOperation)a.q().a("pickMediaOperation")).a(view, 1);
            return;
        }
    }
}

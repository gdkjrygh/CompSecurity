// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.content.res.Resources;
import com.facebook.o;
import com.facebook.orca.common.ui.widgets.d;
import com.facebook.orca.photos.picking.i;
import com.facebook.ui.media.attachments.MediaResource;

// Referenced classes of package com.facebook.orca.compose:
//            ComposeFragment, ComposeAttachmentContainer

class r extends i
{

    final ComposeFragment a;

    r(ComposeFragment composefragment)
    {
        a = composefragment;
        super();
    }

    public void a()
    {
        ComposeFragment.a(a, ComposeFragment.b(a, a.o().getString(o.image_attachment_failed_network)), d.WARNING);
    }

    public void a(MediaResource mediaresource)
    {
        com.facebook.ui.media.attachments.a a1 = ComposeFragment.F(a).b(mediaresource);
        if (mediaresource != null)
        {
            ComposeFragment.y(a).a(a1, ComposeFragment.x(a));
        }
    }

    public void b()
    {
    }

    public void c()
    {
    }

    public void d()
    {
        ComposeFragment.y(a).a();
    }
}

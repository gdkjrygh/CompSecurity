// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view;

import android.widget.FrameLayout;

// Referenced classes of package com.facebook.video.view:
//            TextureViewHolder

class a
    implements nagedAttachment
{

    final TextureViewHolder a;

    public final void a()
    {
        TextureViewHolder.a(a, true);
    }

    public final void b()
    {
        TextureViewHolder.a(a, false);
        if (TextureViewHolder.c(a) != null)
        {
            TextureViewHolder.d(a).removeView(TextureViewHolder.c(a));
        }
    }

    nagedAttachment(TextureViewHolder textureviewholder)
    {
        a = textureviewholder;
        super();
    }
}

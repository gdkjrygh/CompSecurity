// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;

import android.content.Context;

// Referenced classes of package com.snapchat.videochat.view:
//            GlTextureView, LocalPreview

final class init> extends GlTextureView
{

    private LocalPreview b;

    public final void a()
    {
        LocalPreview.a(b);
    }

    public final void b()
    {
        LocalPreview.a(b, b.b);
    }

    protected (LocalPreview localpreview, Context context)
    {
        b = localpreview;
        super(context);
    }
}

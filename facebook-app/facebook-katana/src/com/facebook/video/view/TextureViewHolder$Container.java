// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view;

import android.content.Context;
import android.widget.FrameLayout;
import com.facebook.loom.logger.Logger;

// Referenced classes of package com.facebook.video.view:
//            TextureViewHolder

class <init> extends FrameLayout
{

    final TextureViewHolder a;

    protected void onAttachedToWindow()
    {
        int i = Logger.a(2, com.facebook.loom.logger._VIEW_START, 0x7d2643b4);
        super.onAttachedToWindow();
        TextureViewHolder.b(a).a(TextureViewHolder.a(a));
        Logger.a(2, com.facebook.loom.logger._VIEW_END, 0x5096a6f1, i);
    }

    protected void onDetachedFromWindow()
    {
        int i = Logger.a(2, com.facebook.loom.logger._VIEW_START, 0x1f4f20b8);
        TextureViewHolder.b(a).b(TextureViewHolder.a(a));
        super.onDetachedFromWindow();
        Logger.a(2, com.facebook.loom.logger._VIEW_END, 0xb897876c, i);
    }

    private ger(TextureViewHolder textureviewholder, Context context)
    {
        a = textureviewholder;
        super(context);
    }

    a(TextureViewHolder textureviewholder, Context context, byte byte0)
    {
        this(textureviewholder, context);
    }
}

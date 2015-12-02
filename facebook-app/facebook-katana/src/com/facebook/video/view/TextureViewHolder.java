// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

public class TextureViewHolder
{

    private final FrameLayout a;
    private final AttachManager b;
    private boolean c;
    private TextureView d;
    private int e;
    private ManagedAttachment f;

    public TextureViewHolder(Context context, AttachManager attachmanager)
    {
        f = new _cls1();
        a = new Container(context, (byte)0);
        b = attachmanager;
        d = null;
        c = true;
        e = 0;
    }

    static ManagedAttachment a(TextureViewHolder textureviewholder)
    {
        return textureviewholder.f;
    }

    static boolean a(TextureViewHolder textureviewholder, boolean flag)
    {
        textureviewholder.c = flag;
        return flag;
    }

    static AttachManager b(TextureViewHolder textureviewholder)
    {
        return textureviewholder.b;
    }

    static TextureView c(TextureViewHolder textureviewholder)
    {
        return textureviewholder.d;
    }

    static FrameLayout d(TextureViewHolder textureviewholder)
    {
        return textureviewholder.a;
    }

    private void e()
    {
        if (d == null)
        {
            d = new TextureView(a.getContext());
        }
        d();
    }

    public final TextureView a()
    {
        this;
        JVM INSTR monitorenter ;
        TextureView textureview;
        e();
        e = e + 1;
        textureview = d;
        this;
        JVM INSTR monitorexit ;
        return textureview;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        e = e - 1;
        if (d != null && e <= 0)
        {
            d.setSurfaceTextureListener(null);
            a.removeView(d);
            d = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final View c()
    {
        return a;
    }

    public final void d()
    {
        if (c && d != null && d.getParent() == null)
        {
            a.addView(d);
        }
    }

    private class _cls1
        implements ManagedAttachment
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

        _cls1()
        {
            a = TextureViewHolder.this;
            super();
        }
    }


    private class Container extends FrameLayout
    {

        final TextureViewHolder a;

        protected void onAttachedToWindow()
        {
            int i = Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_VIEW_START, 0x7d2643b4);
            super.onAttachedToWindow();
            TextureViewHolder.b(a).a(TextureViewHolder.a(a));
            Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_VIEW_END, 0x5096a6f1, i);
        }

        protected void onDetachedFromWindow()
        {
            int i = Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_VIEW_START, 0x1f4f20b8);
            TextureViewHolder.b(a).b(TextureViewHolder.a(a));
            super.onDetachedFromWindow();
            Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_VIEW_END, 0xb897876c, i);
        }

        private Container(Context context)
        {
            a = TextureViewHolder.this;
            super(context);
        }

        Container(Context context, byte byte0)
        {
            this(context);
        }

        private class AttachManager
        {

            public abstract void a(ManagedAttachment managedattachment);

            public abstract void b(ManagedAttachment managedattachment);
        }

    }

}

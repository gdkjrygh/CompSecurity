// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.ptr;

import afA;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import in.srain.cube.views.ptr.PtrFrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DancingGhostPtrHeader extends FrameLayout
    implements afA
{

    AnimationDrawable a;
    private final Set b = new HashSet();
    private ImageView c;

    public DancingGhostPtrHeader(Context context)
    {
        super(context);
        setBackgroundResource(0x7f0c004f);
    }

    static AnimationDrawable a(DancingGhostPtrHeader dancingghostptrheader)
    {
        return dancingghostptrheader.a;
    }

    private void a()
    {
        if (a != null)
        {
            a.stop();
        }
    }

    protected final void a(int i)
    {
        setBackgroundResource(i);
        TransitionDrawable transitiondrawable = (TransitionDrawable)getBackground();
        if (transitiondrawable != null)
        {
            transitiondrawable.setCrossFadeEnabled(true);
            transitiondrawable.startTransition(1000);
        }
        postDelayed(new Runnable(i) {

            private int a;
            private DancingGhostPtrHeader b;

            public final void run()
            {
                if (DancingGhostPtrHeader.a(b).isRunning())
                {
                    if (a == 0x7f020283)
                    {
                        b.a(0x7f020213);
                        return;
                    }
                    if (a == 0x7f020213)
                    {
                        b.a(0x7f02018c);
                        return;
                    }
                    if (a == 0x7f02018c)
                    {
                        b.a(0x7f02008c);
                        return;
                    }
                    if (a == 0x7f02008c)
                    {
                        b.a(0x7f02010c);
                        return;
                    }
                    if (a == 0x7f02010c)
                    {
                        b.a(0x7f020283);
                        return;
                    }
                }
            }

            
            {
                b = DancingGhostPtrHeader.this;
                a = i;
                super();
            }
        }, 1000L);
    }

    public final void a(PtrFrameLayout ptrframelayout)
    {
        for (ptrframelayout = b.iterator(); ptrframelayout.hasNext(); ptrframelayout.next()) { }
        if (a != null)
        {
            a.stop();
            a.selectDrawable(0);
        }
        setBackgroundResource(0x7f0c004f);
    }

    public final void a(PtrFrameLayout ptrframelayout, boolean flag, byte byte0, int i, int j, float f, float f1)
    {
        if (a == null)
        {
            c = (ImageView)((ViewGroup)LayoutInflater.from(getContext()).inflate(0x7f0400b6, this)).findViewById(0x7f0d03e5);
            a = (AnimationDrawable)c.getBackground();
        }
        f = Math.max(1.0F, f1);
        setTranslationY(((float)getHeight() * (1.0F - f)) / 2.0F);
        setScaleY(f);
        if (f >= 1.5F)
        {
            f1 = 1.5F / f;
            c.setScaleY(f1);
            setAlpha(Math.max(0.5F, 1.0F - (f - 1.5F) / 2.0F));
            return;
        } else
        {
            c.setScaleY(1.0F);
            setAlpha(1.0F);
            return;
        }
    }

    public final void b(PtrFrameLayout ptrframelayout)
    {
        a();
    }

    public final void c(PtrFrameLayout ptrframelayout)
    {
        if (a != null)
        {
            a.start();
        }
        a(0x7f020283);
    }

    public final void d(PtrFrameLayout ptrframelayout)
    {
        a();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.animator;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.ImageView;
import java.io.ByteArrayOutputStream;

public class SpriteAnimator
{

    protected int a;
    protected int b;
    protected int c;
    protected boolean d;
    private ImageView e;
    private Drawable f;
    private int g;
    private int h;
    private int i;
    private int j;
    private Rect k;
    private Handler l;
    private BitmapRegionDecoder m;
    private final Runnable n;

    public SpriteAnimator(Handler handler, ImageView imageview)
    {
        this(handler, imageview, 0x7f0201a2, 47);
    }

    public SpriteAnimator(Handler handler, ImageView imageview, byte byte0)
    {
        this(handler, imageview, 0x7f02019e, -1);
    }

    private SpriteAnimator(Handler handler, ImageView imageview, int i1, int j1)
    {
        n = new Runnable() {

            final SpriteAnimator a;

            public final void run()
            {
                SpriteAnimator.a(a);
            }

            
            {
                a = SpriteAnimator.this;
                super();
            }
        };
        l = handler;
        e = imageview;
        f = e.getResources().getDrawable(i1);
        h = 0;
        g = 33;
        a = j1;
        d = true;
        i = 0;
        k = new Rect(0, 0, 0, 0);
        handler = ((BitmapDrawable)f).getBitmap();
        a(handler);
        imageview = new ByteArrayOutputStream();
        handler.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, imageview);
        try
        {
            m = BitmapRegionDecoder.newInstance(imageview.toByteArray(), 0, imageview.size(), true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Handler handler)
        {
            m = null;
        }
    }

    static void a(SpriteAnimator spriteanimator)
    {
        if (spriteanimator.i >= spriteanimator.a)
        {
            spriteanimator.i = 0;
            spriteanimator.j = spriteanimator.j + 1;
        }
        if (spriteanimator.d)
        {
            spriteanimator.k.left = 0;
            spriteanimator.k.top = spriteanimator.i * spriteanimator.c;
            spriteanimator.k.right = spriteanimator.b;
            spriteanimator.k.bottom = spriteanimator.k.top + spriteanimator.c;
        } else
        {
            spriteanimator.k.left = spriteanimator.i * spriteanimator.b;
            spriteanimator.k.top = 0;
            spriteanimator.k.right = spriteanimator.k.left + spriteanimator.b;
            spriteanimator.k.bottom = spriteanimator.k.top + spriteanimator.c;
        }
        spriteanimator.e.setImageBitmap(spriteanimator.m.decodeRegion(spriteanimator.k, null));
        spriteanimator.i = spriteanimator.i + 1;
        if (spriteanimator.h != 0 && spriteanimator.j >= spriteanimator.h)
        {
            spriteanimator.b();
            return;
        } else
        {
            spriteanimator.l.postDelayed(spriteanimator.n, spriteanimator.g);
            return;
        }
    }

    public final void a()
    {
        l.postDelayed(n, g);
    }

    protected void a(Bitmap bitmap)
    {
        if (d)
        {
            b = bitmap.getWidth();
            c = bitmap.getHeight() / a;
            return;
        } else
        {
            c = bitmap.getHeight();
            b = bitmap.getWidth() / a;
            return;
        }
    }

    public final void b()
    {
        l.removeCallbacks(n);
    }
}

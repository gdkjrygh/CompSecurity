// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class dfw
{

    final Drawable a;
    final dfs b = new dfs();
    final Resources c;
    public final gwi d = new gwi() {

        private dfw a;

        public final void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
        {
            bitmap = new BitmapDrawable(a.c, bitmap);
            a.b.a(bitmap, true);
        }

        public final void a(Drawable drawable1)
        {
            a.b.a(a.a, true);
        }

        public final void b(Drawable drawable1)
        {
        }

            
            {
                a = dfw.this;
                super();
            }
    };

    public dfw(View view, Drawable drawable, int i)
    {
        a = drawable;
        c = view.getContext().getResources();
        b.setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_ATOP);
        b.a(drawable, false);
        dgo.a(view, b);
    }
}

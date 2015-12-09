// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import com.squareup.picasso.Picasso;

public final class fad extends LayerDrawable
{

    ColorDrawable a;
    dfs b;
    private ColorDrawable c;
    private final Resources d;
    private final gwi e;

    public fad(Resources resources, dfs dfs, ColorDrawable colordrawable, ColorDrawable colordrawable1, GradientDrawable gradientdrawable)
    {
        this(resources, new Drawable[] {
            dfs, gradientdrawable
        });
        a(dfs, colordrawable, colordrawable1);
    }

    fad(Resources resources, dfs dfs, ColorDrawable colordrawable, ColorDrawable colordrawable1, GradientDrawable gradientdrawable, dfx dfx)
    {
        this(resources, new Drawable[] {
            dfs, gradientdrawable, dfx
        });
        a(dfs, colordrawable, colordrawable1);
    }

    private fad(Resources resources, Drawable adrawable[])
    {
        super(adrawable);
        e = new gwi() {

            private fad a;

            public final void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
            {
                bitmap = new BitmapDrawable(fad.a(a), bitmap);
                fad.b(a).a(bitmap, true);
            }

            public final void a(Drawable drawable)
            {
                fad.b(a).a(fad.c(a), true);
            }

            public final void b(Drawable drawable)
            {
            }

            
            {
                a = fad.this;
                super();
            }
        };
        d = resources;
    }

    static Resources a(fad fad1)
    {
        return fad1.d;
    }

    private void a(dfs dfs, ColorDrawable colordrawable, ColorDrawable colordrawable1)
    {
        b = dfs;
        c = colordrawable;
        a = colordrawable1;
    }

    static dfs b(fad fad1)
    {
        return fad1.b;
    }

    static ColorDrawable c(fad fad1)
    {
        return fad1.c;
    }

    public final void a(Uri uri)
    {
        ((gft)dmz.a(gft)).a().a(uri).a(dgf.a).a(c).a(e);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (getClass() == obj.getClass())
                {
                    obj = (fad)obj;
                    flag = flag1;
                    if (a.equals(((fad) (obj)).a))
                    {
                        flag = flag1;
                        if (b.equals(((fad) (obj)).b))
                        {
                            flag = flag1;
                            if (c.equals(((fad) (obj)).c))
                            {
                                flag = flag1;
                                if (d.equals(((fad) (obj)).d))
                                {
                                    return e.equals(((fad) (obj)).e);
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return (((a.hashCode() * 31 + b.hashCode()) * 31 + c.hashCode()) * 31 + d.hashCode()) * 31 + e.hashCode();
    }
}

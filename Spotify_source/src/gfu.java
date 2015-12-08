// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public final class gfu
    implements gwi
{

    dfv a;
    gve b;
    private final ImageView c;
    private boolean d;

    gfu(ImageView imageview, dfv dfv1, boolean flag)
    {
        c = imageview;
        a = dfv1;
        d = flag;
    }

    public final void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        if (b != null)
        {
            b.a();
        }
        if (b instanceof dfr)
        {
            sv.a(bitmap).a(new sz() {

                private gfu a;

                public final void a(sv sv1)
                {
                    if (a.b instanceof dfr)
                    {
                        dfr dfr1 = (dfr)a.b;
                        sv1 = sv1.b.a();
                        int i;
                        if (sv1 != null)
                        {
                            i = ((ta) (sv1)).a;
                        } else
                        {
                            i = 0xff888888;
                        }
                        dfr1.a(i);
                    }
                }

            
            {
                a = gfu.this;
                super();
            }
            });
        }
        gdx.a(c, a.a(bitmap), loadedfrom, d);
    }

    public final void a(Drawable drawable)
    {
        if (b != null)
        {
            b.b();
        }
        c.setImageDrawable(drawable);
    }

    public final void b(Drawable drawable)
    {
        gdx.a(c, drawable);
    }

    public final boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof gfu))
        {
            obj = (gfu)obj;
            if (((gfu) (obj)).c == c && ((gfu) (obj)).a == a)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return c.hashCode();
    }
}

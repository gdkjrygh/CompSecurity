// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

public final class gji
{

    public final Context a;
    public final Picasso b = ((gft)dmz.a(gft)).a();

    public gji(Context context)
    {
        a = context;
    }

    public final void a(ImageView imageview, Uri uri)
    {
        b.a(uri).a(dgf.a).a(imageview, null);
    }

    public final void a(ImageView imageview, Uri uri, Drawable drawable, dfv dfv)
    {
        uri = b.a(uri).b(drawable).a(drawable);
        if (dfv != null)
        {
            uri.a(gft.a(imageview, dfv));
            return;
        } else
        {
            uri.a(imageview, null);
            return;
        }
    }

    public final void a(ImageView imageview, Uri uri, Drawable drawable, dfv dfv, gve gve)
    {
        uri = b.a(uri).b(drawable).a(drawable);
        if (dfv != null)
        {
            uri.a(gft.a(imageview, dfv, gve));
            return;
        }
        if (gve instanceof dfr)
        {
            uri.a(gft.a(imageview, (dfr)gve));
            return;
        } else
        {
            uri.a(imageview, gve);
            return;
        }
    }

    public final void a(ImageView imageview, String s)
    {
        b.a(s).a(dgf.a).a(imageview, null);
    }

    public final void a(ImageView imageview, String s, Drawable drawable, dfv dfv)
    {
        s = b.a(s).b(drawable).a(drawable);
        if (dfv != null)
        {
            s.a(gft.a(imageview, dfv));
            return;
        } else
        {
            s.a(imageview, null);
            return;
        }
    }

    public final void b(ImageView imageview, Uri uri)
    {
        a(imageview, uri, dff.j(a), dfo.a());
    }

    public final void b(ImageView imageview, String s)
    {
        a(imageview, s, dff.j(a), dfo.a());
    }

    public final void c(ImageView imageview, Uri uri)
    {
        a(imageview, uri, dff.a(a), dfo.a());
    }

    public final void c(ImageView imageview, String s)
    {
        a(imageview, s, dff.a(a), dfo.a());
    }

    public final void d(ImageView imageview, Uri uri)
    {
        a(imageview, uri, dff.g(a), dfo.a());
    }

    public final void d(ImageView imageview, String s)
    {
        a(imageview, s, dff.i(a), null);
    }

    public final void e(ImageView imageview, Uri uri)
    {
        a(imageview, uri, dff.b(a), null);
    }

    public final void e(ImageView imageview, String s)
    {
        a(imageview, s, dff.b(a), null);
    }

    public final void f(ImageView imageview, Uri uri)
    {
        b.a(uri).a(0x7f02006b).a(imageview, null);
    }

    public final void f(ImageView imageview, String s)
    {
        b.a(s).a(0x7f02006b).a(imageview, null);
    }
}

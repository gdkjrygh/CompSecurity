// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

final class mun
    implements nbe
{

    private mui a;

    mun(mui mui1)
    {
        a = mui1;
        super();
    }

    public final Object a(nbg nbg, Object obj)
    {
        nbg = null;
        if (obj instanceof Bitmap)
        {
            nbg = (Bitmap)obj;
        } else
        if (obj instanceof naw)
        {
            naw naw1 = (naw)obj;
            nbg = ((naw)obj).a;
            if (naw1.b < nbg.getWidth() || naw1.c < nbg.getHeight())
            {
                nbg = Bitmap.createBitmap(nbg, 0, 0, naw1.b, naw1.c);
            }
        }
        if (nbg == null)
        {
            return obj;
        } else
        {
            obj = mui.a(a).a(nbg.getWidth(), nbg.getHeight());
            obj = oiq.a(nbg, b.p(mui.b(a)), ((Bitmap) (obj)));
            mui.a(a).a(nbg);
            return obj;
        }
    }
}

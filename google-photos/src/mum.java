// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

final class mum
    implements nbe
{

    private mui a;

    mum(mui mui1)
    {
        a = mui1;
        super();
    }

    public final Object a(nbg nbg, Object obj)
    {
        Bitmap bitmap = null;
        if (!(obj instanceof Bitmap)) goto _L2; else goto _L1
_L1:
        bitmap = (Bitmap)obj;
_L4:
        if (bitmap == null)
        {
            return obj;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (obj instanceof naw)
        {
            naw naw1 = (naw)obj;
            bitmap = ((naw)obj).a;
            if (naw1.b < bitmap.getWidth() || naw1.c < bitmap.getHeight())
            {
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, naw1.b, naw1.c);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
label0:
        {
            int i = ((njv) ((muk)nbg)).h;
            if (bitmap.getWidth() >= i)
            {
                nbg = bitmap;
                if (bitmap.getHeight() >= i)
                {
                    break label0;
                }
            }
            nbg = mui.a(a).a(i, i);
            obj = oqj.a(bitmap, i, i, nbg);
            if (obj != nbg)
            {
                mui.a(a).a(nbg);
            }
            nbg = bitmap;
            if (obj != bitmap)
            {
                mui.a(a).a(bitmap);
                nbg = ((nbg) (obj));
            }
        }
        return oiq.a(nbg);
    }
}

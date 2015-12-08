// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

public final class ahv extends ahu
{

    public ahv(agu agu1)
    {
        super(agu1);
    }

    public final void a(Bitmap bitmap)
    {
        Object obj = a.a;
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        switch (((aif) (obj)).a)
        {
        default:
            bitmap = String.valueOf(obj);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(bitmap).length() + 48)).append("Unsupported frame type '").append(bitmap).append("' for bitmap assignment!").toString());

        case 301: 
            obj = bitmap;
            break;
        }
        if (config != android.graphics.Bitmap.Config.ARGB_8888)
        {
            bitmap = bitmap.copy(android.graphics.Bitmap.Config.ARGB_8888, false);
            obj = bitmap;
            if (bitmap == null)
            {
                throw new RuntimeException("Could not convert bitmap to frame-type RGBA8888!");
            }
        }
        bitmap = a.b;
        if (((Bitmap) (obj)).getWidth() != bitmap[0] || ((Bitmap) (obj)).getHeight() != bitmap[1])
        {
            int i = ((Bitmap) (obj)).getWidth();
            int j = ((Bitmap) (obj)).getHeight();
            int k = bitmap[0];
            int l = bitmap[1];
            throw new IllegalArgumentException((new StringBuilder(94)).append("Cannot assign bitmap of size ").append(i).append("x").append(j).append(" to frame of size ").append(k).append("x").append(l).append("!").toString());
        } else
        {
            a.b(2, 16).a(obj);
            a.a();
            return;
        }
    }

    public final ajz o()
    {
        return (ajz)a.a(1, 2);
    }

    public final ajv p()
    {
        return (ajv)a.a(2, 4);
    }

    public final Bitmap q()
    {
        Bitmap bitmap = (Bitmap)a.a(1, 16);
        a.a();
        return bitmap;
    }
}

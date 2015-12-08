// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

public final class cea
{

    public final Bitmap a;
    public final float b;

    public cea(Bitmap bitmap, float f)
    {
        a = (Bitmap)b.a(bitmap, "lookupTableBitmap", null);
        b = f;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof cea))
            {
                return false;
            }
            obj = (cea)obj;
            if (!a.sameAs(((cea) (obj)).a) || b != ((cea) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return b.a(b, b.h(a, 17));
    }

    public final String toString()
    {
        return b.a(getClass(), new Object[] {
            a, Float.valueOf(b)
        });
    }
}

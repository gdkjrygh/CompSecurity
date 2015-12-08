// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

final class awb
    implements avr
{

    private final avy a;
    private final bab b;

    public awb(avy avy1, bab bab1)
    {
        a = avy1;
        b = bab1;
    }

    public final void a()
    {
        a.a();
    }

    public final void a(aqm aqm1, Bitmap bitmap)
    {
        java.io.IOException ioexception = b.a;
        if (ioexception != null)
        {
            if (bitmap != null)
            {
                aqm1.a(bitmap);
            }
            throw ioexception;
        } else
        {
            return;
        }
    }
}

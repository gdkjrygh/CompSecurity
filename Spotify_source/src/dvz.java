// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;

final class dvz
    implements gwi
{

    Uri a;
    private dvy b;

    private dvz(dvy dvy1)
    {
        b = dvy1;
        super();
    }

    dvz(dvy dvy1, byte byte0)
    {
        this(dvy1);
    }

    public final void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        loadedfrom = ((com.squareup.picasso.Picasso.LoadedFrom) (dvy.c(b)));
        loadedfrom;
        JVM INSTR monitorenter ;
        if (a == null || !a.equals(dvy.d(b)))
        {
            break MISSING_BLOCK_LABEL_53;
        }
        dvy.a(b, bitmap);
_L2:
        dvy.e(b);
        return;
        dvy.a(b, null);
        if (dvy.a(b))
        {
            dvy.b(b).sendEmptyMessage(1001);
        }
        if (true) goto _L2; else goto _L1
_L1:
        bitmap;
        loadedfrom;
        JVM INSTR monitorexit ;
        throw bitmap;
    }

    public final void a(Drawable drawable)
    {
        synchronized (dvy.c(b))
        {
            dvy.e(b);
        }
        return;
        exception;
        drawable;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(Drawable drawable)
    {
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (dvz)obj;
            return a.equals(((dvz) (obj)).a);
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}

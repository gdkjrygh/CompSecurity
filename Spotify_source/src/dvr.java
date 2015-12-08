// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;

final class dvr
    implements gwi
{

    private final Uri a;
    private dvq b;

    private dvr(dvq dvq1, Uri uri)
    {
        b = dvq1;
        super();
        a = uri;
    }

    dvr(dvq dvq1, Uri uri, byte byte0)
    {
        this(dvq1, uri);
    }

    public final void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        if (a == null || !a.equals(dvq.b(b))) goto _L2; else goto _L1
_L1:
        dvq.d(b).removeCallbacks(dvq.c(b));
        dvq.a(b, dvq.b(b, bitmap));
_L4:
        dvq.f(b);
        return;
_L2:
        dvq.a(b, null);
        if (dvq.e(b))
        {
            dvq.d(b).postDelayed(dvq.c(b), 2000L);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(Drawable drawable)
    {
    }

    public final void b(Drawable drawable)
    {
        dvq.f(b);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (dvr)obj;
        if (a == null) goto _L4; else goto _L3
_L3:
        if (a.equals(((dvr) (obj)).a)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((dvr) (obj)).a == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final int hashCode()
    {
        if (a != null)
        {
            return a.hashCode();
        } else
        {
            return 0;
        }
    }
}

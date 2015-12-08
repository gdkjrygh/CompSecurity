// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.video.exo.prefetch.SegmentCacheDataSource;
import java.io.IOException;

public final class glr
    implements bdc
{

    private final glt a;
    private final bdc b;
    private final bdc c;
    private final gls d;
    private boolean e;
    private long f;
    private bdc g;
    private long h;
    private bde i;

    public glr(glt glt1, bdc bdc1, gls gls1)
    {
        a = glt1;
        b = bdc1;
        e = false;
        c = new SegmentCacheDataSource(glt1);
        d = gls1;
    }

    private void a()
    {
        if (!e && a.a(i))
        {
            android.net.Uri uri = i.a;
            g = c;
        } else
        {
            android.net.Uri uri1 = i.a;
            g = b;
        }
        g.a(i);
    }

    private void c()
    {
        if (g != null)
        {
            g.b();
            g = null;
        }
    }

    public final int a(byte abyte0[], int j, int k)
    {
_L6:
        int l = g.a(abyte0, j, k);
        if (l < 0) goto _L2; else goto _L1
_L1:
        if (g == c)
        {
            h = h + (long)l;
        }
        if (f != -1L)
        {
            f = f - (long)l;
        }
_L4:
        return l;
_L2:
        c();
        if (f <= 0L || f == -1L) goto _L4; else goto _L3
_L3:
        a();
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final long a(bde bde1)
    {
        long l;
        try
        {
            i = bde1;
            f = bde1.d;
            a();
            l = bde1.d;
        }
        // Misplaced declaration of an exception variable
        catch (bde bde1)
        {
            e = true;
            throw bde1;
        }
        return l;
    }

    public final void b()
    {
        if (d != null && h > 0L)
        {
            d.a(h);
            h = 0L;
        }
        c();
    }
}

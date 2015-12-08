// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import android.graphics.BitmapFactory;
import android.os.SystemClock;
import com.google.android.m4b.maps.ac.a;
import java.io.IOException;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            ae, q, s, d, 
//            ad

final class e
    implements e
{

    private final f a;
    private final f b;
    private final Object c;
    private int d;
    private boolean e;
    private ae f;

    public final void a()
    {
        if (a != null && d != 1 && c != null && c.equals(ae.c(f)))
        {
            a.a(true, null);
        }
        com.google.android.m4b.maps.bv.ae.a(f, c);
    }

    public final void a(q q1, a a1)
    {
        d = d + 1;
        if (a != null && c != null && c.equals(ae.c(f)))
        {
            q1.p = e;
            a.a(false, q1);
        }
        q1 = com.google.android.m4b.maps.bv.q.a(q1.i);
        try
        {
            SystemClock.uptimeMillis();
            a1 = a1.c();
            com.google.android.m4b.maps.bv.ae.a(f).a(a1, q1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (q q1)
        {
            com.google.android.m4b.maps.bv.d.a("PM failed to cache config", q1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (q q1)
        {
            com.google.android.m4b.maps.bv.d.b("PM was interrupted caching config");
        }
        Thread.currentThread().interrupt();
    }

    public final void a(String s1, int i, int j, int k, int l, byte abyte0[])
    {
        s1 = new ad(s1, j, k, l, i);
        if (b != null)
        {
            Object obj = new android.graphics.pFactory.Options();
            obj.inDither = true;
            obj.inPreferredConfig = android.graphics.p.Config.RGB_565;
            obj.inPurgeable = true;
            obj = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, ((android.graphics.pFactory.Options) (obj)));
            b.a(s1, ((android.graphics.Bitmap) (obj)));
        }
        try
        {
            s s2 = com.google.android.m4b.maps.bv.ae.a(f);
            String s3 = ((ad) (s1)).a;
            i = ((ad) (s1)).e;
            j = ((ad) (s1)).b;
            k = ((ad) (s1)).c;
            s2.a(abyte0, (new StringBuilder(String.valueOf(s3).length() + 41)).append("tile_").append(s3).append("_").append(i).append("_").append(j).append("_").append(k).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            s1 = String.valueOf(s1);
            com.google.android.m4b.maps.bv.d.a((new StringBuilder(String.valueOf(s1).length() + 24)).append("PM failed to cache tile ").append(s1).toString(), abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            s1 = String.valueOf(s1);
        }
        com.google.android.m4b.maps.bv.d.b((new StringBuilder(String.valueOf(s1).length() + 32)).append("PM was interrupted caching tile ").append(s1).toString());
        Thread.currentThread().interrupt();
    }

    public ns(ae ae1, ns ns, ns ns1, Object obj, boolean flag)
    {
        f = ae1;
        super();
        d = 0;
        a = ns;
        b = ns1;
        c = obj;
        e = flag;
    }
}

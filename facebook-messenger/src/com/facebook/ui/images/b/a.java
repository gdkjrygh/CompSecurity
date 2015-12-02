// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.b;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import com.facebook.ui.media.a.c;
import com.facebook.ui.media.a.d;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.ui.images.b:
//            l, m, r, v, 
//            t, u, aa, b, 
//            p

public class a
    implements l
{

    private static Class a = com/facebook/ui/images/b/a;
    private static final ae b = n.a("android_webp");
    private final com.facebook.ui.images.cache.a c;
    private final aa d;
    private final av e;
    private final javax.inject.a f;
    private final com.facebook.prefs.shared.d g;

    public a(com.facebook.ui.images.cache.a a1, aa aa1, av av1, javax.inject.a a2, com.facebook.prefs.shared.d d1)
    {
        c = a1;
        d = aa1;
        e = av1;
        f = a2;
        g = d1;
    }

    private Uri a(Uri uri)
    {
        if (!b(uri))
        {
            return uri;
        } else
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Original jpg URI : ").append(uri).toString());
            String s = uri.getPath();
            s = (new StringBuilder()).append(s.substring(1, s.length())).append(".webp").toString();
            uri = (new android.net.Uri.Builder()).scheme(uri.getScheme()).authority(uri.getAuthority()).query(uri.getQuery()).fragment(uri.getFragment()).appendEncodedPath(s).build();
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("New webp URI: ").append(uri).toString());
            return uri;
        }
    }

    private r a(m m1)
    {
        r r1;
        com.facebook.ui.images.cache.d d1;
        r1 = null;
        d1 = m1.j();
        if (!c.g(d1)) goto _L2; else goto _L1
_L1:
        m1 = r.a(d1).a(v.ERROR).a(u.PREV_FAILURE_RETRY_BLOCKED).a();
_L4:
        return m1;
_L2:
        e e1 = com.facebook.debug.d.e.a("Download image");
        c c1;
        Object obj;
        obj = a(m1.a());
        c1 = d.a(((Uri) (obj)));
        if (c1.a() != d.UNSUPPORTED_URI)
        {
            break; /* Loop/switch isn't completed */
        }
        com.facebook.debug.log.b.e(a, "Unsupported scheme: %s", new Object[] {
            obj
        });
        r1 = r.a(d1).a(v.ERROR).a(u.DOWNLOAD_PIPELINE_ERROR).a();
        obj = c1;
        e1.a();
        m1 = r1;
        if (c1 != null)
        {
            c1.c();
            return r1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        obj = c1;
        e1.a();
        obj = c1;
        a(m1, c1);
        obj = c1;
        e1 = com.facebook.debug.d.e.a("Insert into cache");
        b.a[c1.a().ordinal()];
        JVM INSTR tableswitch 1 3: default 715
    //                   1 278
    //                   2 578
    //                   3 630;
           goto _L5 _L6 _L7 _L8
_L5:
        a(m1, 20000L);
        r1 = r.a(d1).a(v.ERROR).a(u.DOWNLOAD_PIPELINE_ERROR).a();
        obj = c1;
        e1.a();
        m1 = r1;
        if (c1 == null) goto _L4; else goto _L9
_L9:
        c1.c();
        return r1;
        m1;
        c1 = null;
_L27:
        obj = c1;
        e1.a();
        obj = c1;
        throw m1;
        m1;
_L26:
        if (obj != null)
        {
            ((c) (obj)).c();
        }
        throw m1;
_L6:
        boolean flag;
        long l1;
        if (m1.g() && m1.a().getScheme().equals("file"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L11; else goto _L10
_L10:
        obj = c.a(d1, c1.b());
_L28:
        l1 = c1.d();
        if (l1 < 0L) goto _L13; else goto _L12
_L12:
        if (m1.e()) goto _L15; else goto _L14
_L14:
        if (!flag) goto _L17; else goto _L16
_L16:
        m1 = (Bitmap)c.a(d1, new File(m1.a().getPath()));
        obj = r1;
_L22:
        if (obj != null || m1 != null) goto _L19; else goto _L18
_L18:
        r1 = r.a(d1).a(v.ERROR).a(u.DOWNLOAD_PIPELINE_ERROR).a(l1).a();
        obj = c1;
        e1.a();
        m1 = r1;
        if (c1 != null)
        {
            c1.c();
            return r1;
        }
          goto _L4
_L13:
        if (obj == null) goto _L21; else goto _L20
_L20:
        l1 = ((File) (obj)).length();
          goto _L12
_L17:
        m1 = (Bitmap)c.d(d1);
        obj = r1;
          goto _L22
_L19:
        r1 = r.a(d1).a(((File) (obj))).a(m1).a(v.DOWNLOADED).a(l1).a();
        obj = c1;
        e1.a();
        m1 = r1;
        if (c1 != null)
        {
            c1.c();
            return r1;
        }
          goto _L4
        m1;
        com.facebook.debug.log.b.d(a, "Failed to insert into cache", m1);
        r1 = r.a(d1).a(v.ERROR).a(u.DOWNLOAD_PIPELINE_ERROR).a();
        obj = c1;
        e1.a();
        m1 = r1;
        if (c1 == null) goto _L4; else goto _L23
_L23:
        c1.c();
        return r1;
_L7:
        a(m1, 0x493e0L);
        r1 = r.a(d1).a(v.ERROR).a(u.DOWNLOAD_PIPELINE_ERROR).a();
        obj = c1;
        e1.a();
        m1 = r1;
        if (c1 == null) goto _L4; else goto _L24
_L24:
        c1.c();
        return r1;
_L8:
        a(m1, 0x36ee80L);
        r1 = r.a(d1).a(v.ERROR).a(u.DOWNLOAD_NOT_FOUND).a();
        obj = c1;
        e1.a();
        m1 = r1;
        if (c1 == null) goto _L4; else goto _L25
_L25:
        c1.c();
        return r1;
        m1;
        obj = c1;
        e1.a();
        obj = c1;
        throw m1;
        m1;
        obj = null;
          goto _L26
        m1;
          goto _L27
_L15:
        m1 = null;
          goto _L22
_L11:
        obj = null;
          goto _L28
_L21:
        l1 = 0L;
          goto _L12
    }

    private r a(m m1, boolean flag)
    {
        e e2 = com.facebook.debug.d.e.a("fetchImageAndDecode");
        Object obj;
        com.facebook.ui.images.cache.d d1;
        d1 = m1.i();
        obj = (Bitmap)c.d(d1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        m1 = m1.b();
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        e e1 = com.facebook.debug.d.e.a("Running processor");
        com.facebook.debug.log.b.a(a, "Processing image");
        m1.a(((Bitmap) (obj)));
        e1.a();
        m1 = r.a(d1).a(((Bitmap) (obj))).a(v.CACHE).a();
        e2.a();
        return m1;
        Bitmap bitmap;
        obj = m1.j();
        bitmap = (Bitmap)c.d(((com.facebook.ui.media.cache.l) (obj)));
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        m1 = r.a(d1).a(v.NOT_IN_CACHE_NOT_DOWNLOADED).a();
        e2.a();
        return m1;
        obj = a(m1);
        bitmap = ((r) (obj)).a();
_L4:
        Object obj1;
        obj1 = obj;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        com.facebook.ui.images.base.b b1 = m1.b();
        obj1 = obj;
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        m1 = com.facebook.debug.d.e.a("Running processor");
        com.facebook.debug.log.b.a(a, "Processing image");
        bitmap = b1.a(bitmap);
        m1.a();
        m1 = r.a(d1).a(bitmap).a(((r) (obj)).b()).a(((r) (obj)).d()).a();
        obj = b1.a();
        obj1 = m1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        obj1 = m1;
        if (obj == com.facebook.ui.images.base.b.d)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        obj = com.facebook.debug.d.e.a("Inserting processed image into cache");
        c.a(d1, bitmap);
        ((e) (obj)).a();
        obj1 = m1;
        e2.a();
        return ((r) (obj1));
_L2:
        obj = r.a(d1).a(bitmap).a(v.UNDERLYING_IMAGE_IN_CACHE).a();
        if (true) goto _L4; else goto _L3
_L3:
        m1;
        e2.a();
        throw m1;
    }

    private void a(m m1, long l1)
    {
        if (!m1.h())
        {
            m1 = m1.j();
            c.a(m1, l1);
        }
    }

    private void a(m m1, c c1)
    {
        if (f.b() == null || !m1.a().toString().startsWith("http://maps.google.com/maps/api/staticmap"))
        {
            return;
        } else
        {
            m1 = (new cb("counters")).f("google_static_maps").g((String)f.b()).b("result", c1.a().toString());
            e.a(m1);
            return;
        }
    }

    private r b(m m1, boolean flag)
    {
        e e1 = com.facebook.debug.d.e.a("fetchImageNoDecode");
        com.facebook.ui.images.cache.d d1;
        Object obj;
        d1 = m1.i();
        obj = c.e(d1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        m1 = r.a(d1).a(((File) (obj))).a(v.CACHE).a();
        e1.a();
        return m1;
        obj = m1.j();
        obj = c.e(((com.facebook.ui.media.cache.l) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        m1 = r.a(d1).a(((File) (obj))).a(v.UNDERLYING_IMAGE_IN_CACHE).a();
        e1.a();
        return m1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        m1 = r.a(d1).a(v.NOT_IN_CACHE_NOT_DOWNLOADED).a();
        e1.a();
        return m1;
        m1 = a(m1);
        e1.a();
        return m1;
        m1;
        e1.a();
        throw m1;
    }

    private boolean b(Uri uri)
    {
        String s = uri.getScheme();
        if (!"http".equals(s) && !"https".equals(s))
        {
            return false;
        }
        s = uri.getHost();
        if (s == null || !s.contains("photos") && !s.contains("profile"))
        {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            return false;
        }
        if (!g.a(b, false))
        {
            return false;
        }
        com.facebook.debug.log.b.b(a, "webp pref enabled");
        if (!uri.getLastPathSegment().endsWith(".jpg"))
        {
            return false;
        }
        for (Iterator iterator = uri.getPathSegments().iterator(); iterator.hasNext();)
        {
            if ("v".equals((String)iterator.next()))
            {
                return false;
            }
        }

        for (uri = uri.getQueryParameterNames().iterator(); uri.hasNext();)
        {
            if ("oh".equals((String)uri.next()))
            {
                return false;
            }
        }

        return true;
    }

    public r a(p p1)
    {
        e e1 = com.facebook.debug.d.e.a("fetchImage");
        m m1 = p1.a();
        boolean flag;
        if (!p1.b() && !m1.f())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!m1.e())
        {
            break MISSING_BLOCK_LABEL_57;
        }
        p1 = b(m1, flag);
        e1.a();
        return p1;
        p1 = a(m1, flag);
        e1.a();
        return p1;
        p1;
        e1.a();
        throw p1;
    }

}

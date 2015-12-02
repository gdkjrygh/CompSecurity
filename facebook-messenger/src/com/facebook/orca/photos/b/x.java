// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.b;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.debug.log.b;
import com.facebook.debug.log.l;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.t;
import com.facebook.http.protocol.i;
import com.facebook.nativejpeg.BitmapFactory;
import com.facebook.orca.j.c;
import com.facebook.orca.protocol.methods.ab;
import com.facebook.orca.protocol.methods.ac;
import com.facebook.orca.server.aq;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.g;
import com.google.common.base.Throwables;
import java.io.File;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.photos.b:
//            aa, a, e, z, 
//            w, h

public class x
    implements e
{

    private static final Class a = com/facebook/orca/photos/b/x;
    private static final l b = new l();
    private final i c;
    private final ab d;
    private final com.facebook.common.time.a e;
    private final h f;
    private final c g;
    private final com.facebook.ui.media.b.a h;
    private final com.facebook.common.executors.a i;
    private final a j;
    private final com.facebook.orca.photos.b.a k;
    private final aa l;

    public x(i i1, ab ab, c c1, com.facebook.ui.media.b.a a1, com.facebook.common.time.a a2, h h1, com.facebook.common.executors.a a3, 
            a a4, com.facebook.orca.photos.b.a a5, aa aa1)
    {
        c = i1;
        d = ab;
        g = c1;
        h = a1;
        e = a2;
        f = h1;
        i = a3;
        j = a4;
        k = a5;
        l = aa1;
    }

    static com.facebook.common.time.a a(x x1)
    {
        return x1.e;
    }

    private void a(MediaResource mediaresource)
    {
        String s = mediaresource.j();
        if (s != null) goto _L2; else goto _L1
_L1:
        com.facebook.debug.log.b.a(b, a, "A mediaResource didn't have a filename");
_L4:
        return;
_L2:
        File file;
        com.facebook.nativejpeg.b b1;
        if (!g.c(s, true))
        {
            break MISSING_BLOCK_LABEL_102;
        }
        file = new File(s);
        if (file.length() == 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        b1 = new com.facebook.nativejpeg.b();
        b1.inJustDecodeBounds = true;
        BitmapFactory.a(s, b1);
        if (b1.outWidth != 0 && b1.outHeight != 0) goto _L4; else goto _L3
_L3:
        file.delete();
        l.c(mediaresource);
        l.b(mediaresource);
        File file1 = g.a("resize_", ".jpg", Boolean.valueOf(true));
        try
        {
            com.facebook.orca.photos.b.e e1 = k.a();
            int i1 = Math.max(e1.a(), e1.b());
            com.facebook.j.a.a.c c1 = new com.facebook.j.a.a.c(i1, i1, e1.c());
            c1 = ((com.facebook.j.a.a.a)j.b()).a(mediaresource.d().getPath(), file1.getPath(), c1);
            l.a(mediaresource, e1, c1, file1);
            if (!file1.renameTo(g.a(s, true)))
            {
                l.d(mediaresource);
                return;
            }
        }
        catch (Throwable throwable)
        {
            file1.delete();
            l.a(mediaresource, throwable);
            Throwables.propagateIfPossible(throwable, java/lang/Exception);
            throw Throwables.propagate(throwable);
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private OperationResult b(ad ad1)
    {
        com.facebook.http.protocol.l l1;
        int i1;
        int j1;
        ad1 = (MediaResource)ad1.b().getParcelable("mediaResource");
        if (ad1.c() != g.PHOTO)
        {
            return OperationResult.a(t.OTHER, "MediaResource is not a photo.");
        }
        a(ad1);
        l1 = new com.facebook.http.protocol.l();
        l1.a(new z(this, ad1, null));
        i1 = 0;
        j1 = 0;
_L2:
        String s;
        l.a(ad1);
        s = (String)c.a(d, new ac(ad1, 0), l1);
        l.a(ad1, s);
        f.a(new w(ad1, true));
        return OperationResult.a(s);
        Exception exception;
        exception;
        l.a(ad1, exception, j1);
        if (j1 < 5)
        {
            j1++;
            i1 = (int)((long)i1 + (long)j1 * 1000L);
            i.a(i1);
        } else
        {
            throw exception;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    static h b(x x1)
    {
        return x1.f;
    }

    public OperationResult a(ad ad1)
    {
        OperationType operationtype = ad1.a();
        if (aq.L.equals(operationtype))
        {
            return b(ad1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown operation type: ").append(operationtype).toString());
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.net.Uri;
import com.facebook.common.executors.n;
import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import com.facebook.ui.media.a.c;
import com.facebook.ui.media.a.d;
import com.google.common.d.a.s;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.facebook.orca.d:
//            bc, a, ay, c, 
//            r, bb, ba

public class az
{

    private static final Class a = com/facebook/orca/d/az;
    private final a b;
    private final ay c;
    private final r d;
    private final n e;

    public az(a a1, ay ay1, n n1, r r1)
    {
        b = a1;
        c = ay1;
        d = r1;
        e = n1;
    }

    static Uri a(az az1, bc bc1)
    {
        return az1.b(bc1);
    }

    private Uri b(bc bc1)
    {
        Object obj = bc1.b();
        Uri uri = b.f(((com.facebook.ui.media.cache.l) (obj)));
        if (uri != null)
        {
            c.a(bc1.a(), uri);
            return uri;
        } else
        {
            com.facebook.debug.log.b.a(a, (new StringBuilder()).append("Miss to hit the audio cache. Start downloading ").append(((com.facebook.orca.d.c) (obj)).a()).toString());
            obj = Uri.fromFile(c(bc1));
            c.a(bc1.a(), ((Uri) (obj)));
            return ((Uri) (obj));
        }
    }

    private File c(bc bc1)
    {
        bc bc2;
        Object obj;
        Object obj1;
        Uri uri;
        obj1 = bc1.b();
        if (b.g(((com.facebook.ui.media.cache.l) (obj1))))
        {
            throw new IOException((new StringBuilder()).append("Fetching ").append(((com.facebook.orca.d.c) (obj1)).a()).append(" was failed recently. Waiting for retrying.").toString());
        }
        uri = bc1.a();
        bc2 = null;
        obj = null;
        e e1 = com.facebook.debug.d.e.a("Download audio");
        bc1 = d.a(bc1.a());
        obj = bc1;
        if (bc1.a() != d.UNSUPPORTED_URI)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        obj = bc1;
        com.facebook.debug.log.b.e(a, "All audio clip URLs should be using http or https: %s", new Object[] {
            uri
        });
        obj = bc1;
        throw new IOException((new StringBuilder()).append("Fetching ").append(uri).append(" failed due to unsupported url schema. Should be using http or https.").toString());
        bc1;
        bc2 = ((bc) (obj));
        e1.a();
        bc2 = ((bc) (obj));
        throw bc1;
        bc1;
        if (bc2 != null)
        {
            bc2.c();
        }
        throw bc1;
        bc2 = bc1;
        e1.a();
        bc2 = bc1;
        obj = com.facebook.debug.d.e.a("Insert into cache");
        bb.a[bc1.a().ordinal()];
        JVM INSTR tableswitch 1 5: default 488
    //                   1 290
    //                   2 323
    //                   3 363
    //                   4 408
    //                   5 448;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        b.a(((com.facebook.ui.media.cache.l) (obj1)), 20000L);
        throw new IOException((new StringBuilder()).append("Other errors for ").append(uri).toString());
        obj1;
        bc2 = bc1;
        ((e) (obj)).a();
        bc2 = bc1;
        throw obj1;
_L2:
        obj1 = b.a(((com.facebook.ui.media.cache.l) (obj1)), bc1.b());
        bc2 = bc1;
        ((e) (obj)).a();
        if (bc1 != null)
        {
            bc1.c();
        }
        return ((File) (obj1));
_L3:
        b.a(((com.facebook.ui.media.cache.l) (obj1)), 0x493e0L);
        throw new IOException((new StringBuilder()).append("DECODE_ERROR for: ").append(uri).toString());
_L4:
        b.a(((com.facebook.ui.media.cache.l) (obj1)), 0x36ee80L);
        throw new IOException((new StringBuilder()).append("Resource file at ").append(uri).append(" can't be found.").toString());
_L5:
        b.a(((com.facebook.ui.media.cache.l) (obj1)), 0x36ee80L);
        throw new IOException((new StringBuilder()).append("Fetching is forbidden (permission denial) for ").append(uri).toString());
_L6:
        b.a(((com.facebook.ui.media.cache.l) (obj1)), 20000L);
        throw new IOException((new StringBuilder()).append("I/O exception occurs for ").append(uri).toString());
    }

    public s a(bc bc1)
    {
        Object obj;
label0:
        {
            com.facebook.orca.d.c c1 = bc1.b();
            Object obj1 = e.a(c1);
            if (obj1 != null)
            {
                obj = obj1;
                if (!((s) (obj1)).isCancelled())
                {
                    break label0;
                }
            }
            obj = new ba(this, bc1);
            obj1 = (new StringBuilder()).append("audio-message-").append(Math.abs(c1.a().hashCode() % 3)).toString();
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Create async task for downloading ").append(((String) (obj1))).toString());
            bc1 = bc1.a().toString();
            obj = e.a(obj1, c1, ((java.util.concurrent.Callable) (obj)), bc1);
        }
        return ((s) (obj));
    }

}

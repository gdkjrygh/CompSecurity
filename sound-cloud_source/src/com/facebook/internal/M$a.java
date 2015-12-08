// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.FacebookContentProvider;
import com.facebook.p;
import com.facebook.s;
import java.util.UUID;

// Referenced classes of package com.facebook.internal:
//            M, U

public static final class <init>
{

    final UUID a;
    public final String b;
    final String c;
    Bitmap d;
    Uri e;
    boolean f;
    boolean g;

    private ntProvider(UUID uuid, Bitmap bitmap, Uri uri)
    {
        boolean flag;
        flag = true;
        super();
        a = uuid;
        d = bitmap;
        e = uri;
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        bitmap = uri.getScheme();
        if (!"content".equalsIgnoreCase(bitmap)) goto _L2; else goto _L1
_L1:
        f = true;
        if (uri.getAuthority() == null || uri.getAuthority().startsWith("media"))
        {
            flag = false;
        }
        g = flag;
_L5:
        if (!g)
        {
            bitmap = null;
        } else
        {
            bitmap = UUID.randomUUID().toString();
        }
        c = bitmap;
        if (!g)
        {
            uuid = e.toString();
        } else
        {
            uuid = FacebookContentProvider.a(s.h(), uuid, c);
        }
        b = uuid;
        return;
_L2:
        if (!"file".equalsIgnoreCase(uri.getScheme())) goto _L4; else goto _L3
_L3:
        g = true;
          goto _L5
_L4:
        if (U.b(uri)) goto _L5; else goto _L6
_L6:
        throw new p((new StringBuilder("Unsupported scheme for media Uri : ")).append(bitmap).toString());
        if (bitmap != null)
        {
            g = true;
        } else
        {
            throw new p("Cannot share media without a bitmap or Uri set");
        }
          goto _L5
    }

    g(UUID uuid, Bitmap bitmap, Uri uri, byte byte0)
    {
        this(uuid, bitmap, uri);
    }
}

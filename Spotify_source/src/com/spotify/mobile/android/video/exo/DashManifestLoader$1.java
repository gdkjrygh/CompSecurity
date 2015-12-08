// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.exo;

import bat;
import bdx;
import gcf;
import gkx;
import glg;
import glh;
import glk;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.video.exo:
//            DashManifestLoader, InvalidResponseCodeException, ManifestResponseException

final class c
    implements bdx
{

    private glk a;
    private String b;
    private gkx c;
    private DashManifestLoader d;

    public final void a(IOException ioexception)
    {
        Object obj = ioexception;
        if (ioexception instanceof InvalidResponseCodeException)
        {
            ioexception = (InvalidResponseCodeException)ioexception;
            obj = new ManifestResponseException(((InvalidResponseCodeException) (ioexception)).mResponseCode, ((InvalidResponseCodeException) (ioexception)).mResponseBody);
        }
        c.a(b, ((Exception) (obj)));
    }

    public final void a(Object obj)
    {
        bat bat1 = (bat)obj;
        long l = a.b;
        glg glg1 = d.a;
        String s = b;
        synchronized (glg1.a)
        {
            if (!glg1.a(s))
            {
                glg1.a.put(s, new glh(s, bat1, l + gcf.a()));
            }
        }
        c.a(b, bat1);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    tion(DashManifestLoader dashmanifestloader, glk glk1, String s, gkx gkx1)
    {
        d = dashmanifestloader;
        a = glk1;
        b = s;
        c = gkx1;
        super();
    }
}

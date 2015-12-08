// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.exo;

import android.os.Looper;
import bat;
import bau;
import bdw;
import bdx;
import ctz;
import dmz;
import gcf;
import gcl;
import gkx;
import glg;
import glh;
import gli;
import glk;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.video.exo:
//            InvalidResponseCodeException, ManifestResponseException

public final class DashManifestLoader
{

    final glg a = (glg)dmz.a(glg);
    private final Looper b;
    private String c;

    public DashManifestLoader(Looper looper)
    {
        dmz.a(gli);
        b = looper;
    }

    public final void a(String s)
    {
        ctz.a(s);
        c = s.replace("{type}", "dash");
    }

    public final void a(String s, gkx gkx1)
    {
        if (gcl.a)
        {
            gkx1.a(s, new UnsupportedOperationException("Error: current api < 16"));
            return;
        }
        if (a.a(s))
        {
            gkx1.a(s, a.b(s));
            return;
        }
        try
        {
            ctz.a(s);
            if (c == null)
            {
                throw new NoVideoManifestUrlException("The Video Manifest URL has not been set properly!");
            }
        }
        catch (Exception exception)
        {
            gkx1.a(s, exception);
            return;
        }
        String s1 = c.replace("{source_id}", s);
        bau bau1 = new bau();
        glk glk1 = new glk("ExoPlayer (Android)");
        gli.a(s1, glk1, bau1).a(b, new bdx(glk1, s, gkx1) {

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
                String s2 = b;
                synchronized (glg1.a)
                {
                    if (!glg1.a(s2))
                    {
                        glg1.a.put(s2, new glh(s2, bat1, l + gcf.a()));
                    }
                }
                c.a(b, bat1);
                return;
                exception1;
                obj;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                d = DashManifestLoader.this;
                a = glk1;
                b = s;
                c = gkx1;
                super();
            }
        });
        return;
    }

    private class NoVideoManifestUrlException extends Exception
    {

        private static final long serialVersionUID = 0x125ffL;

        NoVideoManifestUrlException(String s)
        {
            super(s);
        }
    }

}

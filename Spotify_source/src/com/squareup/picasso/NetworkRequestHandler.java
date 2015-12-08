// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import gvm;
import gvz;
import gwc;
import gwd;
import gwf;
import gwm;

// Referenced classes of package com.squareup.picasso:
//            Downloader

public final class NetworkRequestHandler extends gwc
{

    private final Downloader a;
    private final gwf b;

    public NetworkRequestHandler(Downloader downloader, gwf gwf1)
    {
        a = downloader;
        b = gwf1;
    }

    final int a()
    {
        return 2;
    }

    final boolean a(NetworkInfo networkinfo)
    {
        return networkinfo == null || networkinfo.isConnected();
    }

    public final boolean a(gvz gvz1)
    {
        gvz1 = gvz1.d.getScheme();
        return "http".equals(gvz1) || "https".equals(gvz1);
    }

    public final gwd b(gvz gvz1)
    {
        gvm gvm1 = a.a(gvz1.d, gvz1.c);
        java.io.InputStream inputstream;
        if (gvm1.b)
        {
            gvz1 = Picasso.LoadedFrom.b;
        } else
        {
            gvz1 = Picasso.LoadedFrom.c;
        }
        inputstream = gvm1.a;
        if (inputstream == null)
        {
            return null;
        }
        if (gvz1 == Picasso.LoadedFrom.b && gvm1.c == 0L)
        {
            gwm.a(inputstream);
            throw new ContentLengthException("Received response with 0 content-length header.");
        }
        if (gvz1 == Picasso.LoadedFrom.c && gvm1.c > 0L)
        {
            gwf gwf1 = b;
            long l = gvm1.c;
            gwf1.b.sendMessage(gwf1.b.obtainMessage(4, Long.valueOf(l)));
        }
        return new gwd(inputstream, gvz1);
    }

    final boolean b()
    {
        return true;
    }

    private class ContentLengthException extends IOException
    {

        public ContentLengthException(String s)
        {
            super(s);
        }
    }

}

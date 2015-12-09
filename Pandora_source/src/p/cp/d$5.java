// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cp;

import android.webkit.WebView;
import com.pandora.android.provider.b;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.y;
import java.util.HashMap;
import p.cw.c;
import p.dd.bh;
import p.df.a;

// Referenced classes of package p.cp:
//            d

class .Object
    implements .Object
{

    final WebView a;
    final String b;
    final String c;
    final d d;

    private void a()
    {
        if (b.a.b() != null)
        {
            b.a.b().c(this);
        }
    }

    public void nowPlayingTrackData(bh bh1)
    {
        Object obj = null;
        if (bh1 != null && bh1.a == p.dd..a)
        {
            return;
        }
        HashMap hashmap;
        if (bh1 != null)
        {
            bh1 = bh1.b;
        } else
        {
            bh1 = null;
        }
        hashmap = obj;
        if (bh1 != null)
        {
            hashmap = obj;
            if (!bh1.M())
            {
                hashmap = new HashMap();
                y y1 = b.a.b().d().t();
                hashmap.put("musicToken", bh1.w());
                hashmap.put("songName", bh1.s());
                hashmap.put("albumName", bh1.u());
                hashmap.put("artistName", bh1.t());
                hashmap.put("albumArtUrl", bh1.v());
                if (y1 != null)
                {
                    bh1 = y1.c();
                } else
                {
                    bh1 = "";
                }
                hashmap.put("stationToken", bh1);
            }
        }
        try
        {
            d.a(a, b, c, hashmap);
        }
        // Misplaced declaration of an exception variable
        catch (bh bh1)
        {
            p.df.a.c("WebViewClientBase", "callback exception", bh1);
        }
        a();
    }

    .String(d d1, WebView webview, String s, String s1)
    {
        d = d1;
        a = webview;
        b = s;
        c = s1;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.device.a;

import com.samsung.multiscreen.device.f;
import com.samsung.multiscreen.device.g;
import com.samsung.multiscreen.net.a.a.a;
import com.samsung.multiscreen.net.b.b;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class c
    implements Runnable
{

    private static final Logger a;
    private URI b;
    private String c;
    private f d;

    public c(URI uri, String s, f f1)
    {
        b = uri;
        c = s;
        d = f1;
    }

    public void run()
    {
        Object obj;
        Object obj1;
        obj1 = new b(com.samsung.multiscreen.net.b.c.a, "ms.device.getChannelInfo");
        ((b) (obj1)).c().put("id", c);
        obj = new a();
        java.net.URL url = b.toURL();
        obj1 = ((a) (obj)).a(url, com.samsung.multiscreen.net.a.a.a.d(url), ((b) (obj1)).f().getBytes("UTF-8"));
        if (obj1 == null)
        {
            int i;
            try
            {
                d.onError(new g(((a) (obj)).a()));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                d.onError(new g(((MalformedURLException) (obj)).getLocalizedMessage()));
                return;
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                d.onError(new g(unsupportedencodingexception.getLocalizedMessage()));
            }
            break MISSING_BLOCK_LABEL_296;
        }
        i = ((com.samsung.multiscreen.net.a.a.b) (obj1)).a;
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        obj = com.samsung.multiscreen.net.b.b.a(new String(((com.samsung.multiscreen.net.a.a.b) (obj1)).d, "UTF-8"));
        a.info((new StringBuilder("GetChannelRequest result rpcMessage: ")).append(obj).toString());
        if (((b) (obj)).a())
        {
            a.info((new StringBuilder("GetChannelRequest result rpc error: ")).append(((b) (obj)).e()).toString());
            d.onError(g.a(((b) (obj)).e()));
            return;
        }
        break MISSING_BLOCK_LABEL_235;
_L1:
        d.onError(new g(((UnsupportedEncodingException) (obj)).getLocalizedMessage()));
        return;
        try
        {
            obj = com.samsung.multiscreen.b.b.a.a(((b) (obj)).d());
            d.onResult(obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
          goto _L1
        d.onError(new g(((com.samsung.multiscreen.net.a.a.b) (obj1)).c));
        return;
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/device/a/c.getName());
        a = logger;
        logger.setLevel(Level.OFF);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.device.a;

import com.samsung.multiscreen.device.f;
import com.samsung.multiscreen.device.g;
import com.samsung.multiscreen.device.h;
import com.samsung.multiscreen.net.a.a.a;
import com.samsung.multiscreen.net.b.b;
import com.samsung.multiscreen.net.b.c;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;

public class d
    implements Runnable
{

    private static final Logger a;
    private f b;
    private URI c;

    public d(URI uri, f f1)
    {
        c = uri;
        b = f1;
    }

    public void run()
    {
        Object obj1 = new b(c.a, "ms.device.getInfo");
        Object obj;
        java.net.URL url = c.toURL();
        java.util.Map map = com.samsung.multiscreen.net.a.a.a.d(url);
        obj = new a();
        obj1 = ((a) (obj)).a(url, map, ((b) (obj1)).f().getBytes("UTF-8"));
        if (obj1 == null)
        {
            int i;
            try
            {
                b.onError(new g(((a) (obj)).a()));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                b.onError(new g(((MalformedURLException) (obj)).getLocalizedMessage()));
                return;
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                b.onError(new g(unsupportedencodingexception.getLocalizedMessage()));
            }
            break MISSING_BLOCK_LABEL_299;
        }
        i = ((com.samsung.multiscreen.net.a.a.b) (obj1)).a;
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        obj = com.samsung.multiscreen.net.b.b.a(new String(((com.samsung.multiscreen.net.a.a.b) (obj1)).d, "UTF-8"));
        a.info((new StringBuilder("getDevice() rpcMessage: ")).append(obj).toString());
        if (((b) (obj)).a())
        {
            b.onError(g.a(((b) (obj)).e()));
            return;
        }
        break MISSING_BLOCK_LABEL_182;
        obj;
        ((UnsupportedEncodingException) (obj)).printStackTrace();
        return;
        obj = h.a(((b) (obj)).d());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        b.onResult(obj);
        return;
        a.info("GetDeviceRequest FAILED TO CREATE DEVICE");
        b.onError(new g("Could not create device"));
        return;
        a.info((new StringBuilder("GetDeviceRequest ERROR: ")).append(((com.samsung.multiscreen.net.a.a.b) (obj1)).a).toString());
        b.onError(new g(((com.samsung.multiscreen.net.a.a.b) (obj1)).c));
        return;
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/device/a/d.getName());
        a = logger;
        logger.setLevel(Level.OFF);
    }
}

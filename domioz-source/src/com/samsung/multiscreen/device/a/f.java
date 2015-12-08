// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.device.a;

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

public class f
    implements Runnable
{

    private static final Logger a;
    private boolean b;
    private com.samsung.multiscreen.device.f c;
    private com.samsung.multiscreen.device.a.a.b d;

    public f(com.samsung.multiscreen.device.a.a.b b1, com.samsung.multiscreen.device.f f1)
    {
        d = b1;
        c = f1;
        b = false;
    }

    public void run()
    {
        Object obj;
        Object obj1;
        obj1 = new b(c.a, "ms.device.getInfo");
        obj = new a();
        java.net.URL url = d.a().toURL();
        java.util.Map map = com.samsung.multiscreen.net.a.a.a.d(url);
        ((a) (obj)).a(2000);
        obj1 = ((a) (obj)).a(url, map, ((b) (obj1)).f().getBytes("UTF-8"));
        if (obj1 == null)
        {
            int i;
            try
            {
                c.onError(new g(((a) (obj)).a()));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                c.onError(new g(((MalformedURLException) (obj)).getLocalizedMessage()));
                return;
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                c.onError(new g(unsupportedencodingexception.getLocalizedMessage()));
            }
            break MISSING_BLOCK_LABEL_345;
        }
        if (((com.samsung.multiscreen.net.a.a.b) (obj1)).a != 200)
        {
            break MISSING_BLOCK_LABEL_346;
        }
        if (b)
        {
            break MISSING_BLOCK_LABEL_366;
        }
        b = true;
        a.info((new StringBuilder("response() status: ")).append(((com.samsung.multiscreen.net.a.a.b) (obj1)).a).toString());
        i = ((com.samsung.multiscreen.net.a.a.b) (obj1)).a;
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        obj = com.samsung.multiscreen.net.b.b.a(new String(((com.samsung.multiscreen.net.a.a.b) (obj1)).d, "UTF-8"));
        a.info((new StringBuilder("getDevice() rpcMessage: ")).append(obj).toString());
        if (((b) (obj)).a())
        {
            c.onError(g.a(((b) (obj)).e()));
            return;
        }
        break MISSING_BLOCK_LABEL_253;
        obj;
        c.onError(new g("Could not create device"));
        return;
        obj = h.a(((b) (obj)).d());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_276;
        }
        c.onResult(obj);
        return;
        a.info("GetDialDeviceRequest FAILED TO CREATE DEVICE");
        c.onError(new g("Could not create device"));
        return;
        c.onError(new g(((com.samsung.multiscreen.net.a.a.b) (obj1)).c));
        return;
        return;
        c.onError(new g(((com.samsung.multiscreen.net.a.a.b) (obj1)).c));
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/device/a/f.getName());
        a = logger;
        logger.setLevel(Level.OFF);
    }
}

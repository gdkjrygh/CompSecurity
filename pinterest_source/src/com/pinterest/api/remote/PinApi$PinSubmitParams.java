// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import android.graphics.Bitmap;
import android.util.Base64;
import com.pinterest.kit.log.PLog;
import com.pinterest.network.json.PinterestJsonObject;
import java.io.ByteArrayOutputStream;

public class m
{

    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public Bitmap g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;

    public static m a(PinterestJsonObject pinterestjsonobject)
    {
        m m1 = new <init>();
        try
        {
            m1.i = pinterestjsonobject.a("sdk_package_id", "");
            m1.j = pinterestjsonobject.a("sdk_client_id", "");
            m1.a = pinterestjsonobject.a("board_id", "");
            m1.b = pinterestjsonobject.a("summary", "");
            m1.e = pinterestjsonobject.a("share_facebook", 0);
            m1.f = pinterestjsonobject.a("share_twitter", 0);
            m1.c = pinterestjsonobject.a("source_url", "");
            m1.d = pinterestjsonobject.a("image_url", "");
            m1.k = pinterestjsonobject.a("place", "");
            m1.h = pinterestjsonobject.a("imageData", "");
            m1.l = pinterestjsonobject.a("method", "");
            m1.m = pinterestjsonobject.a("parent_csr_id", "");
        }
        // Misplaced declaration of an exception variable
        catch (PinterestJsonObject pinterestjsonobject)
        {
            PLog.error(pinterestjsonobject, "PinApi#fromJSON", new Object[0]);
            return m1;
        }
        return m1;
    }

    public final PinterestJsonObject a()
    {
        PinterestJsonObject pinterestjsonobject = new PinterestJsonObject();
        try
        {
            pinterestjsonobject.b("sdk_client_id", j);
            pinterestjsonobject.b("sdk_package_id", i);
            pinterestjsonobject.b("board_id", a);
            pinterestjsonobject.b("summary", b);
            pinterestjsonobject.b("source_url", c);
            pinterestjsonobject.b("image_url", d);
            pinterestjsonobject.b("share_facebook", String.valueOf(e));
            pinterestjsonobject.b("share_twitter", String.valueOf(f));
            pinterestjsonobject.b("place", k);
            pinterestjsonobject.b("method", l);
            pinterestjsonobject.b("parent_csr_id", m);
            if (g != null)
            {
                ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                g.compress(android.graphics.PEG, 90, bytearrayoutputstream);
                bytearrayoutputstream.flush();
                byte abyte0[] = bytearrayoutputstream.toByteArray();
                bytearrayoutputstream.close();
                pinterestjsonobject.b("imageData", Base64.encodeToString(abyte0, 0));
            }
        }
        catch (Exception exception)
        {
            PLog.error(exception, "exception occurred", new Object[0]);
            return pinterestjsonobject;
        }
        return pinterestjsonobject;
    }

    public ()
    {
        a = "";
        b = "";
        c = "";
        d = "";
        e = 0;
        f = 0;
        g = null;
        h = "";
        i = "";
        j = "";
        k = "";
        l = "";
        m = "";
    }
}

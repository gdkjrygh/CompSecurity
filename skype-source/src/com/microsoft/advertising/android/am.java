// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import java.io.InputStream;
import org.apache.http.client.methods.HttpGet;

// Referenced classes of package com.microsoft.advertising.android:
//            ag, al, ab, bx, 
//            by, d, l, av

final class am
    implements Runnable
{

    private final String a = "ImageRequest";
    private String b;
    private final Handler c;
    private final d d;

    public am(Handler handler, String s, d d1)
    {
        b = null;
        b = s;
        c = handler;
        d = d1;
    }

    public final void run()
    {
        Object obj;
        Object obj2;
        Object obj3;
        obj2 = null;
        obj3 = null;
        obj = obj2;
        Object obj1 = new HttpGet(b);
        obj = obj2;
        ag.a().e();
        obj = obj2;
        al.a a1 = al.b(((HttpGet) (obj1)));
        obj = obj2;
        if (a1.a() != 200) goto _L2; else goto _L1
_L1:
        obj = obj2;
        if (a1.b() == null) goto _L2; else goto _L3
_L3:
        obj = obj2;
        if (!ab.a().b("RECORD_ADS")) goto _L5; else goto _L4
_L4:
        obj = obj2;
        byte abyte0[] = by.a(a1.b());
        obj = obj2;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        obj = obj2;
        d.c().a(b, abyte0);
        obj = obj2;
        abyte0 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
        obj = abyte0;
        try
        {
            a1.b().close();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            av.c("ImageRequest", (new StringBuilder("Image request failed ")).append(abyte0.getMessage()).toString());
            abyte0 = ((byte []) (obj));
        }
_L7:
        c.obtainMessage(0, abyte0).sendToTarget();
        return;
_L5:
        obj = obj2;
        abyte0 = BitmapFactory.decodeStream(a1.b());
        obj = abyte0;
        a1.b().close();
        continue; /* Loop/switch isn't completed */
_L2:
        abyte0 = obj3;
        obj = obj2;
        if (d == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = obj2;
        d.c().a(b, null);
        abyte0 = obj3;
        if (true) goto _L7; else goto _L6
_L6:
    }
}

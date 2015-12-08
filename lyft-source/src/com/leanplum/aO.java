// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.HashSet;
import org.apache.http.client.methods.HttpPost;

// Referenced classes of package com.leanplum:
//            aJ, aP

final class aO extends Thread
{

    private aJ a;

    aO(aJ aj)
    {
        a = aj;
        super();
    }

    public final void run()
    {
        HttpPost httppost = new HttpPost(a.a);
        String as[];
        String s;
        try
        {
            as = aJ.a(httppost).split(":");
            a.c = as[0];
        }
        catch (Exception exception)
        {
            a.b.a(exception);
            return;
        }
        s = as[1];
        if (!"".equals(s))
        {
            a.d = (Integer.parseInt(s) / 2) * 1000;
        }
        if (!(new HashSet(Arrays.asList(as[3].split(",")))).contains("websocket"))
        {
            throw new Exception("websocket not supported");
        }
        Looper.prepare();
        a.g = Looper.myLooper();
        a.f = new Handler();
        aJ.b(a);
        Looper.loop();
        return;
    }
}

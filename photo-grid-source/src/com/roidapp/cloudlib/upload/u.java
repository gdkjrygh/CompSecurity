// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.roidapp.cloudlib.upload:
//            v, w, UploadPhotoService

final class u extends v
{

    final String a;
    final String b;
    final boolean c;
    final String d;
    final String e;
    final String f;
    final CountDownLatch g;
    final UploadPhotoService h;

    u(UploadPhotoService uploadphotoservice, String s, String s1, boolean flag, String s2, String s3, String s4, 
            CountDownLatch countdownlatch)
    {
        h = uploadphotoservice;
        a = s;
        b = s1;
        c = flag;
        d = s2;
        e = s3;
        f = s4;
        g = countdownlatch;
        super(uploadphotoservice, (byte)0);
    }

    public final void run()
    {
        i = a;
        if (!b.equals("facebook")) goto _L2; else goto _L1
_L1:
        if (!c)
        {
            i = w.a(a, 960);
        }
        j = h.a(i, d, c, f);
_L4:
        g.countDown();
        return;
_L2:
        if (b.equals("twitter"))
        {
            i = w.a(a, 1024);
            j = h.a(i, d, f);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.upload;

import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.sns.aa;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.roidapp.cloudlib.sns.upload:
//            UploadPGService, e

final class d extends aa
{

    final UploadPGService a;

    private d(UploadPGService uploadpgservice)
    {
        a = uploadpgservice;
        super();
    }

    d(UploadPGService uploadpgservice, byte byte0)
    {
        this(uploadpgservice);
    }

    public final void a(int i, Exception exception)
    {
        TreeMap treemap = new TreeMap();
        treemap.put(Integer.valueOf(1), String.valueOf(i));
        if (exception != null && exception.getMessage() != null)
        {
            treemap.put(Integer.valueOf(2), exception.getMessage());
        }
        al.g().a(aj.a(), "SNS", "upload", "Result/Failed", Long.valueOf(1L), treemap);
        if (i == 501 || i == 502 || exception != null && exception.getMessage() != null && exception.getMessage().contains("EPIPE"))
        {
            UploadPGService.a();
        }
        e.a().e();
    }

    public final void a(Object obj)
    {
        aj.a();
        b.a("SNS", "upload", "Result/Success");
        al.g().a(aj.a(), "SNS", "upload", "Result/Success", Long.valueOf(1L));
        e.a().f();
    }
}

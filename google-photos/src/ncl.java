// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;

public final class ncl
{

    private static final long d;
    private static final long e;
    private static final long f;
    public ncm a;
    public nci b;
    public nci c;

    public ncl(Context context)
    {
        Object obj = new nco();
        obj.a = b.z(context);
        if (((nco) (obj)).a < 48)
        {
            obj = context.getApplicationContext().getResources();
            context = new ncn();
            context.a = ((Resources) (obj)).getInteger(b.Fp);
            context.c = ((Resources) (obj)).getInteger(b.Fn);
            context.b = ((Resources) (obj)).getInteger(b.Fo);
            context.e = ((Resources) (obj)).getInteger(b.Fq);
            context.d = ((Resources) (obj)).getInteger(b.Fq);
        } else
        if (((nco) (obj)).a < 64)
        {
            context = ((nco) (obj)).a(context, b.Ff, b.Fe);
        } else
        {
            context = ((nco) (obj)).a(context, b.Fh, b.Fg);
        }
        context.f = true;
        a = context.a();
        context = new ncj();
        context.a = "media";
        context.b = d;
        context.c = e;
        context.d = 0.1F;
        b = context.a();
        context = new ncj();
        context.a = "media_sync";
        context.b = 0L;
        context.c = f;
        context.d = 0.25F;
        c = context.a();
    }

    static 
    {
        d = oqm.c.f * 5L;
        e = oqm.c.f * 100L;
        f = oqm.c.f * 512L;
    }
}

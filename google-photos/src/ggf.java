// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

public final class ggf extends mtf
{

    private final int a;
    private final String b;
    private final Uri c;

    public ggf(int i, String s, Uri uri)
    {
        super("UploadPreviewTask");
        a = i;
        b = (String)p.b(s, "mediakey must not be null");
        c = (Uri)p.b(uri, "mediaUri must not be null");
    }

    protected final mue a(Context context)
    {
        noz noz1;
        Object obj;
        noz1 = noz.a(context, "UploadPreviewTask", new String[0]);
        obj = new pkw();
        obj.d = b;
        obj.a = Boolean.valueOf(true);
        obj.b = Integer.valueOf(320);
        obj.c = Integer.valueOf(240);
        Object obj1 = new nnd();
        obj1.g = false;
        obj1.a = c;
        obj1.h = ((pkw) (obj));
        obj1.d = "albumless";
        obj1.c = "video/mp4";
        obj1.f = false;
        obj = ((nnd) (obj1)).a();
        obj1 = (ggd)olm.a(context, ggd);
        context = (new nmr(context)).a(a);
        context.f = (nnb)p.a(nnb.c);
        context = context.a(new ggg(this, ((ggd) (obj1)))).a();
        context.a(((nnc) (obj)));
        boolean flag = true;
_L2:
        context = new mue(flag);
        context.a().putParcelable("media_uri", c);
        context.a().putString("mediakey", b);
        return context;
        context;
        if (noz1.a())
        {
            noy.a("mediaKey", b);
            noy.a("mediaUri", c);
        }
        flag = false;
        continue; /* Loop/switch isn't completed */
        context;
        if (noz1.a())
        {
            noy.a("mediaKey", b);
            noy.a("mediaUri", c);
        }
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import java.io.IOException;

public final class bgj extends mtf
{

    private final Uri a;
    private final noz b;

    public bgj(Context context, Uri uri)
    {
        super(context, "LoadVideoTask");
        boolean flag;
        if (!b.c(uri))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Missing video URI");
        a = uri;
        b = noz.a(context, "LoadVideoTask", new String[0]);
    }

    protected final mue a()
    {
        Object obj;
        Object obj1;
        orr orr;
        mue mue1;
        mue1 = null;
        orr = null;
        obj1 = orr;
        obj = mue1;
        ote ote = otb.a(d(), a);
        obj1 = orr;
        obj = mue1;
        ort ort1 = new ort();
        obj1 = orr;
        obj = mue1;
        ort1.a = ote;
        obj1 = orr;
        obj = mue1;
        ort1.b = false;
        obj1 = orr;
        obj = mue1;
        orr = ort1.a();
        obj1 = orr;
        obj = orr;
        mue1 = new mue(true);
        obj = orr;
        obj1 = mue1;
_L2:
        ((mue) (obj1)).a().putParcelable("result_video", ((android.os.Parcelable) (obj)));
        ((mue) (obj1)).a().putParcelable("result_video_uri", a);
        return ((mue) (obj1));
        RuntimeException runtimeexception;
        runtimeexception;
        obj = obj1;
        obj1 = runtimeexception;
_L3:
        IOException ioexception;
        if (b.a())
        {
            noy.a("videoUri", a);
        }
        ioexception = new mue(0, ioexception, d().getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_load_video_error));
        if (true) goto _L2; else goto _L1
_L1:
        ioexception;
          goto _L3
    }
}

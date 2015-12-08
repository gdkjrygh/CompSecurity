// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;

public final class gae extends mtf
{

    private final int a;
    private final String b;
    private final String c;
    private final String j;

    public gae(int i, String s, String s1, String s2)
    {
        super("com.google.android.apps.photos.mediadetails.mediacaption.PhotosEditCaptionTask");
        boolean flag;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        p.a(TextUtils.isEmpty(s2) ^ TextUtils.isEmpty(s1));
        a = i;
        b = s;
        c = s1;
        j = s2;
    }

    protected final mue a(Context context)
    {
        noz noz1;
        noz noz2 = noz.a(context, "PhotosEditCaptionTask", new String[0]);
        noz1 = noz.a(context, 5, "PhotosEditCaptionTask", new String[0]);
        gad gad1;
        if (TextUtils.isEmpty(j))
        {
            gad1 = gad.a(context, a, b, c);
        } else
        {
            gad1 = gad.b(context, a, b, j);
        }
        gad1.d();
        if (gad1.l())
        {
            if (noz2.a())
            {
                context = ((nxx) (gad1)).n;
                noy.a("tag", "com.google.android.apps.photos.mediadetails.mediacaption.PhotosEditCaptionTask");
                noy.a("error", ((nxx) (gad1)).m);
            }
            context = new mue(((nxx) (gad1)).l, ((nxx) (gad1)).n, null);
            context.a().putString("photos_mediadetails_mediacaption_caption", b);
            return context;
        }
        ((gcc)olm.a(context, gcc)).a(a, get.k);
_L2:
        context = new mue(true);
        context.a().putString("photos_mediadetails_mediacaption_caption", b);
        return context;
        context;
        if (noz1.a())
        {
            context = String.valueOf("Error performing all photos delta sync during remote media syncing for account: ");
            int i = a;
            (new StringBuilder(String.valueOf(context).length() + 11)).append(context).append(i);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}

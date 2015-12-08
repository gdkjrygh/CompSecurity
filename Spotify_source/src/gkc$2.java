// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.File;
import java.io.IOException;
import java.util.Set;

public final class nit> extends hff
{

    private gkc a;

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
        Logger.c("Error subscribing to video feature flags. VideoPlayer cannot initialize.", new Object[0]);
        a.c();
    }

    public final void onNext(Object obj)
    {
        obj = (gka)obj;
        gkc gkc1 = a;
        gkc1.r = ((gka) (obj)).c;
        gkc1.f = ((gkg)dmz.a(gkg)).a(gkc1.a);
        gkq gkq1 = new gkq(new Handler(gkc1.b));
        gkv gkv1 = new gkv(((gka) (obj)).b);
        Object obj1 = gkc1.k;
        obj1 = gkc1.a;
        gcf gcf = gkc1.i;
        gkc1.l = gki.a(((Context) (obj1)), gkc1, null);
        dmz.a(gkz);
        gkc1.d = gkz.a();
        gkc1.g.a.add(gkc1);
        gkc1.d.a(gkc1);
        try
        {
            gkc1.m = new glt(new File(gkc1.a.getExternalCacheDir(), "video/segments"));
            gkc1.j = glx.a(gkc1.a, gkc1.m, new Handler(gkc1.b), gkc1, gkq1, gkc1.d.a(), gkv1, ((gka) (obj)).a);
            gkc1.j.start();
        }
        catch (IOException ioexception)
        {
            Logger.c("Could not create segment cache. No segment prefetch / cache will be used.", new Object[0]);
            gkc1.m = null;
        }
        gkc1.h = glo.a(gkc1.a, gkc1.b, gkc1, gkc1.m, gkc1.d.a(), gkq1, gkv1, ((gka) (obj)));
        gkc1.t = gkc1.f.a().b(gkc1.c.a()).a(gkc1.c.c()).a(gkc1.u);
        gkc1.n = true;
        unsubscribe();
    }

    public (gkc gkc1)
    {
        a = gkc1;
        super();
    }
}

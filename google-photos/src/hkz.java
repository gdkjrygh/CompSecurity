// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Arrays;

public final class hkz
    implements dir, hpo
{

    final hlh a;
    private final Context b;
    private final int c;

    hkz(Context context, int i, hlh hlh1)
    {
        b = context;
        c = i;
        a = hlh1;
    }

    public final nxx a()
    {
        return new hky(b, c, Arrays.asList(a.b));
    }

    public final String ao_()
    {
        return "com.google.android.apps.photos.remotemedia.removefromalbum.RemoveFromCollectionOptimisticAction";
    }

    public final din b()
    {
        ((eto)olm.a(b, eto)).a(c, Arrays.asList(a.b), Arrays.asList(a.c), true);
        return din.a(null);
    }

    public final diq c()
    {
        return diq.a((hky)((hpp)olm.a(b, hpp)).a(this).a);
    }

    public final boolean d()
    {
        boolean flag1 = false;
        Object obj = new hgg();
        obj.b = b;
        obj.a = c;
        obj.c = a.a;
        obj.f = false;
        obj.g = false;
        obj = ((hgg) (obj)).a();
        obj = mtj.b(b, ((mtf) (obj)));
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (!((mue) (obj)).c())
            {
                flag = true;
            }
        }
        return flag;
    }
}

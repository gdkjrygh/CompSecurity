// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.cosmos.android.RxTypedResolver;
import com.spotify.cosmos.router.Request;

final class fei
    implements hfw
{

    private final fee a;

    fei(fee fee1)
    {
        a = fee1;
    }

    public final Object call(Object obj)
    {
        fee fee1 = a;
        obj = (Request)obj;
        return fee1.d.resolve(((Request) (obj)));
    }
}

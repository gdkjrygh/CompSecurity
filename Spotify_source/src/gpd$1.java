// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.common.datasource.CosmosError;
import com.spotify.mobile.android.util.logging.Logger;

final class ang.Object
    implements eqn
{

    private gpf a;
    private String b;

    public final void a(Object obj)
    {
        obj = (CosmosError)obj;
        Logger.b("Failed to call uri '%s'. Error was: '%s'", new Object[] {
            b, obj
        });
        a.a();
    }

    public final void b(Object obj)
    {
        a.a(obj);
    }

    (gpf gpf1, String s)
    {
        a = gpf1;
        b = s;
        super();
    }
}

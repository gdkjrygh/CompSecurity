// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcelable;
import com.spotify.mobile.android.spotlets.common.datasource.CosmosError;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.Set;

final class ang.Object
    implements eqn
{

    private String a;
    private String b;
    private dop c;

    public final void a(Object obj)
    {
        obj = (CosmosError)obj;
        dop.b(c).remove(a);
        Logger.c("Request to %s failed: %s", new Object[] {
            b, obj
        });
    }

    public final void b(Object obj)
    {
        obj = (Parcelable)obj;
        dop.b(c).remove(a);
        dop.a(c, ((Parcelable) (obj)));
    }

    (dop dop1, String s, String s1)
    {
        c = dop1;
        a = s;
        b = s1;
        super();
    }
}

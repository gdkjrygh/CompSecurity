// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.nb;
import com.google.android.gms.internal.nc;
import com.google.android.gms.internal.no;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            g, PutDataRequest, Asset

public final class p
{

    private final PutDataRequest a;
    private final g b = new g();

    private p(PutDataRequest putdatarequest)
    {
        a = putdatarequest;
    }

    public static p a(String s)
    {
        return new p(PutDataRequest.a(s));
    }

    public final Uri a()
    {
        return a.a();
    }

    public final g b()
    {
        return b;
    }

    public final PutDataRequest c()
    {
        nc nc1 = nb.a(b);
        a.a(no.a(nc1.a));
        int j = nc1.b.size();
        for (int i = 0; i < j; i++)
        {
            String s = Integer.toString(i);
            Asset asset = (Asset)nc1.b.get(i);
            if (s == null)
            {
                throw new IllegalStateException((new StringBuilder("asset key cannot be null: ")).append(asset).toString());
            }
            if (asset == null)
            {
                throw new IllegalStateException((new StringBuilder("asset cannot be null: key=")).append(s).toString());
            }
            if (Log.isLoggable("DataMap", 3))
            {
                Log.d("DataMap", (new StringBuilder("asPutDataRequest: adding asset: ")).append(s).append(" ").append(asset).toString());
            }
            a.a(s, asset);
        }

        return a;
    }
}

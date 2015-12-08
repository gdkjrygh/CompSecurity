// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.util.Log;
import com.google.android.gms.internal.kq;
import com.google.android.gms.internal.lb;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            h, PutDataRequest, Asset

public final class n
{

    private final PutDataRequest a;
    private final h b = new h();

    private n(PutDataRequest putdatarequest)
    {
        a = putdatarequest;
    }

    public static n a(String s)
    {
        return new n(PutDataRequest.a(s));
    }

    public final h a()
    {
        return b;
    }

    public final PutDataRequest b()
    {
        com.google.android.gms.internal.kq.a a1 = kq.a(b);
        a.a(lb.a(a1.a));
        int j = a1.b.size();
        for (int i = 0; i < j; i++)
        {
            String s = Integer.toString(i);
            Asset asset = (Asset)a1.b.get(i);
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
                (new StringBuilder("asPutDataRequest: adding asset: ")).append(s).append(" ").append(asset);
            }
            a.a(s, asset);
        }

        return a;
    }
}

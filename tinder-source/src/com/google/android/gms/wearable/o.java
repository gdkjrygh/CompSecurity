// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.util.Log;
import com.google.android.gms.internal.eu;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.fd;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            i, PutDataRequest, Asset

public final class o
{

    public final i a = new i();
    private final PutDataRequest b;

    public o(PutDataRequest putdatarequest, i j)
    {
        b = putdatarequest;
        if (j != null)
        {
            a.a(j);
        }
    }

    public static o a(String s)
    {
        return new o(PutDataRequest.a(s), null);
    }

    public final PutDataRequest a()
    {
        Object obj = a;
        ev ev1 = new ev();
        ArrayList arraylist = new ArrayList();
        ev1.a = eu.a(((i) (obj)), arraylist);
        obj = new com.google.android.gms.internal.eu.a(ev1, arraylist);
        b.d = fd.a(((com.google.android.gms.internal.eu.a) (obj)).a);
        int k = ((com.google.android.gms.internal.eu.a) (obj)).b.size();
        for (int j = 0; j < k; j++)
        {
            String s = Integer.toString(j);
            Asset asset = (Asset)((com.google.android.gms.internal.eu.a) (obj)).b.get(j);
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
            b.a(s, asset);
        }

        return b;
    }
}

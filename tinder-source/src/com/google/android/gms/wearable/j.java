// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.eu;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.fd;
import com.google.android.gms.internal.zzsd;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.wearable:
//            g, i, h, Asset

public final class j
{

    public final Uri a;
    public final i b;

    private j(g g1)
    {
        a = g1.b();
        b = b((g)g1.a());
    }

    public static j a(g g1)
    {
        if (g1 == null)
        {
            throw new IllegalStateException("provided dataItem is null");
        } else
        {
            return new j(g1);
        }
    }

    private static i b(g g1)
    {
        if (g1.c() == null && g1.d().size() > 0)
        {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        }
        if (g1.c() == null)
        {
            return new i();
        }
        Object obj;
        int l;
        obj = new ArrayList();
        l = g1.d().size();
        int k = 0;
_L2:
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        h h1 = (h)g1.d().get(Integer.toString(k));
        if (h1 == null)
        {
            byte abyte0[];
            try
            {
                throw new IllegalStateException((new StringBuilder("Cannot find DataItemAsset referenced in data at ")).append(k).append(" for ").append(g1).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            Log.w("DataItem", (new StringBuilder("Unable to parse datamap from dataItem. uri=")).append(g1.b()).append(", data=").append(Base64.encodeToString(g1.c(), 0)).toString());
            throw new IllegalStateException((new StringBuilder("Unable to parse datamap from dataItem.  uri=")).append(g1.b()).toString(), ((Throwable) (obj)));
        }
        ((List) (obj)).add(Asset.a(h1.b()));
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        abyte0 = g1.c();
        obj = eu.a(new com.google.android.gms.internal.eu.a((ev)fd.a(new ev(), abyte0, abyte0.length), ((List) (obj))));
        return ((i) (obj));
    }

    public final i a()
    {
        return b;
    }
}

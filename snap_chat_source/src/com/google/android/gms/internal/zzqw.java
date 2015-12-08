// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzrc, zzqx, zzqy

public final class zzqw
    implements zzrc
{

    private static final Uri zzarS;
    private final LogPrinter zzarT = new LogPrinter(4, "GA/LogCatTransport");

    public zzqw()
    {
    }

    public final void zza(zzqx zzqx1)
    {
        Object obj = new ArrayList(zzqx1.zzqQ());
        Collections.sort(((List) (obj)), new Comparator() {

            final zzqw zzarU;

            public int compare(Object obj1, Object obj2)
            {
                return zza((zzqy)obj1, (zzqy)obj2);
            }

            public int zza(zzqy zzqy1, zzqy zzqy2)
            {
                return zzqy1.getClass().getCanonicalName().compareTo(zzqy2.getClass().getCanonicalName());
            }

            
            {
                zzarU = zzqw.this;
                super();
            }
        });
        zzqx1 = new StringBuilder();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = ((zzqy)((Iterator) (obj)).next()).toString();
            if (!TextUtils.isEmpty(s))
            {
                if (zzqx1.length() != 0)
                {
                    zzqx1.append(", ");
                }
                zzqx1.append(s);
            }
        } while (true);
        zzarT.println(zzqx1.toString());
    }

    public final Uri zzqP()
    {
        return zzarS;
    }

    static 
    {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        zzarS = builder.build();
    }
}

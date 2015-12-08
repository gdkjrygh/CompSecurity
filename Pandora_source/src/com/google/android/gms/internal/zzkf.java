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
//            zzkm, zzkg, zzki

public final class zzkf
    implements zzkm
{

    private static final Uri zzavU;
    private final LogPrinter zzavV = new LogPrinter(4, "GA/LogCatTransport");

    public zzkf()
    {
    }

    public void zzb(zzkg zzkg1)
    {
        Object obj = new ArrayList(zzkg1.zzua());
        Collections.sort(((List) (obj)), new Comparator() {

            final zzkf a;

            public int a(zzki zzki1, zzki zzki2)
            {
                return zzki1.getClass().getCanonicalName().compareTo(zzki2.getClass().getCanonicalName());
            }

            public int compare(Object obj1, Object obj2)
            {
                return a((zzki)obj1, (zzki)obj2);
            }

            
            {
                a = zzkf.this;
                super();
            }
        });
        zzkg1 = new StringBuilder();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = ((zzki)((Iterator) (obj)).next()).toString();
            if (!TextUtils.isEmpty(s))
            {
                if (zzkg1.length() != 0)
                {
                    zzkg1.append(", ");
                }
                zzkg1.append(s);
            }
        } while (true);
        zzavV.println(zzkg1.toString());
    }

    public Uri zzfR()
    {
        return zzavU;
    }

    static 
    {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        zzavU = builder.build();
    }
}

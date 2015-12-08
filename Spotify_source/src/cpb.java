// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class cpb
    implements cpj
{

    private static final Uri a;
    private final LogPrinter b = new LogPrinter(4, "GA/LogCatTransport");

    public cpb()
    {
    }

    public final Uri a()
    {
        return a;
    }

    public final void a(cpc cpc1)
    {
        Object obj = new ArrayList(cpc1.h.values());
        Collections.sort(((List) (obj)), new Comparator() {

            public final int compare(Object obj1, Object obj2)
            {
                obj1 = (cpd)obj1;
                obj2 = (cpd)obj2;
                return obj1.getClass().getCanonicalName().compareTo(obj2.getClass().getCanonicalName());
            }

        });
        cpc1 = new StringBuilder();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = ((cpd)((Iterator) (obj)).next()).toString();
            if (!TextUtils.isEmpty(s))
            {
                if (cpc1.length() != 0)
                {
                    cpc1.append(", ");
                }
                cpc1.append(s);
            }
        } while (true);
        b.println(cpc1.toString());
    }

    static 
    {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        a = builder.build();
    }
}

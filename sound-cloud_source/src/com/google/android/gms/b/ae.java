// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.b:
//            am, ag, af, ah

public final class ae
    implements am
{

    private static final Uri a;
    private final LogPrinter b = new LogPrinter(4, "GA/LogCatTransport");

    public ae()
    {
    }

    public final Uri a()
    {
        return a;
    }

    public final void a(ag ag1)
    {
        Object obj = new ArrayList(ag1.h.values());
        Collections.sort(((List) (obj)), new af(this));
        ag1 = new StringBuilder();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = ((ah)((Iterator) (obj)).next()).toString();
            if (!TextUtils.isEmpty(s))
            {
                if (ag1.length() != 0)
                {
                    ag1.append(", ");
                }
                ag1.append(s);
            }
        } while (true);
        b.println(ag1.toString());
    }

    static 
    {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        a = builder.build();
    }
}

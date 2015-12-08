// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.c;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.c:
//            l, c, b, d

public final class a
    implements l
{

    private static final Uri a;
    private final LogPrinter b = new LogPrinter(4, "GA/LogCatTransport");

    public a()
    {
    }

    public final Uri a()
    {
        return a;
    }

    public final void a(c c1)
    {
        Object obj = new ArrayList(c1.b());
        Collections.sort(((List) (obj)), new b(this));
        c1 = new StringBuilder();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = ((d)((Iterator) (obj)).next()).toString();
            if (!TextUtils.isEmpty(s))
            {
                if (c1.length() != 0)
                {
                    c1.append(", ");
                }
                c1.append(s);
            }
        } while (true);
        b.println(c1.toString());
    }

    static 
    {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        a = builder.build();
    }
}

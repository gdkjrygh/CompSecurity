// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.d:
//            ak, z, y, ab

public final class x
    implements ak
{

    private static final Uri a;
    private final LogPrinter b = new LogPrinter(4, "GA/LogCatTransport");

    public x()
    {
    }

    public Uri a()
    {
        return a;
    }

    public void a(z z1)
    {
        Object obj = new ArrayList(z1.b());
        Collections.sort(((List) (obj)), new y(this));
        z1 = new StringBuilder();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = ((ab)((Iterator) (obj)).next()).toString();
            if (!TextUtils.isEmpty(s))
            {
                if (z1.length() != 0)
                {
                    z1.append(", ");
                }
                z1.append(s);
            }
        } while (true);
        b.println(z1.toString());
    }

    static 
    {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        a = builder.build();
    }
}

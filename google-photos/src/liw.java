// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class liw
    implements ljh
{

    private static final Uri a;
    private final LogPrinter b = new LogPrinter(4, "GA/LogCatTransport");

    public liw()
    {
    }

    public final Uri a()
    {
        return a;
    }

    public final void a(liy liy1)
    {
        Object obj = new ArrayList(liy1.h.values());
        Collections.sort(((List) (obj)), new lix(this));
        liy1 = new StringBuilder();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = ((liz)((Iterator) (obj)).next()).toString();
            if (!TextUtils.isEmpty(s))
            {
                if (liy1.length() != 0)
                {
                    liy1.append(", ");
                }
                liy1.append(s);
            }
        } while (true);
        b.println(liy1.toString());
    }

    static 
    {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        a = builder.build();
    }
}

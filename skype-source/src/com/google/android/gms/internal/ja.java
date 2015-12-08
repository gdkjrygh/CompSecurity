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
//            jf, jb, jc

public final class ja
    implements jf
{

    private static final Uri a;
    private final LogPrinter b = new LogPrinter(4, "GA/LogCatTransport");

    public ja()
    {
    }

    public final Uri a()
    {
        return a;
    }

    public final void a(jb jb1)
    {
        Object obj = new ArrayList(jb1.b());
        Collections.sort(((List) (obj)), new Comparator() {

            final ja a;

            public final int compare(Object obj1, Object obj2)
            {
                obj1 = (jc)obj1;
                obj2 = (jc)obj2;
                return obj1.getClass().getCanonicalName().compareTo(obj2.getClass().getCanonicalName());
            }

            
            {
                a = ja.this;
                super();
            }
        });
        jb1 = new StringBuilder();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = ((jc)((Iterator) (obj)).next()).toString();
            if (!TextUtils.isEmpty(s))
            {
                if (jb1.length() != 0)
                {
                    jb1.append(", ");
                }
                jb1.append(s);
            }
        } while (true);
        b.println(jb1.toString());
    }

    static 
    {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        a = builder.build();
    }
}

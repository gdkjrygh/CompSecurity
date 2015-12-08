// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class nkn
{

    private static final Set a;

    public static String a(String s)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            Uri uri = Uri.parse(s);
            String s1 = uri.getHost();
            if (s1 != null && s1.contains("google"))
            {
                android.net.Uri.Builder builder = uri.buildUpon();
                builder.clearQuery();
                Iterator iterator = uri.getQueryParameterNames().iterator();
                boolean flag = false;
                while (iterator.hasNext()) 
                {
                    String s2 = (String)iterator.next();
                    if (a.contains(s2))
                    {
                        flag = true;
                    } else
                    {
                        Iterator iterator1 = uri.getQueryParameters(s2).iterator();
                        while (iterator1.hasNext()) 
                        {
                            builder.appendQueryParameter(s2, (String)iterator1.next());
                        }
                    }
                }
                if (flag)
                {
                    return builder.toString();
                }
            }
        }
        return s;
    }

    static 
    {
        lvg lvg1 = new lvg();
        a = lvg1;
        lvg1.addAll(Arrays.asList(new String[] {
            "expire", "signature"
        }));
    }
}

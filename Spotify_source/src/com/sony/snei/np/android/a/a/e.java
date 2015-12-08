// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sony.snei.np.android.a.a;

import android.content.Context;
import android.drm.DrmManagerClient;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.sony.snei.np.android.a.a:
//            c

class e
    implements c
{

    private static String a = null;

    public e(Context context)
    {
    }

    static String a(Context context)
    {
        return b(context);
    }

    static String a(String s)
    {
        a = s;
        return s;
    }

    static String b()
    {
        return a;
    }

    private static String b(Context context)
    {
        context = (new DrmManagerClient(context)).getAvailableDrmEngines();
        int j = context.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = context[i];
            obj = Pattern.compile("^Marlin BB plug-in/([0-9a-fA-F]+)(/([0-2]+))*$").matcher(((CharSequence) (obj)));
            if (((Matcher) (obj)).matches() && ((Matcher) (obj)).groupCount() > 0)
            {
                return ((Matcher) (obj)).group(1);
            }
        }

        return null;
    }

    public String a()
    {
        return a;
    }

}

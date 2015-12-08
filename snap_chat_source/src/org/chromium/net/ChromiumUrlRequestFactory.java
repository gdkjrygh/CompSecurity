// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;

// Referenced classes of package org.chromium.net:
//            HttpUrlRequestFactory, UserAgent, ChromiumUrlRequestContext

public class ChromiumUrlRequestFactory extends HttpUrlRequestFactory
{

    public ChromiumUrlRequestFactory(Context context, CronetEngine.Builder builder)
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            String s1 = builder.a();
            String s = s1;
            if (s1.isEmpty())
            {
                s = UserAgent.a(context);
            }
            new ChromiumUrlRequestContext(context, s, builder);
        }
    }
}

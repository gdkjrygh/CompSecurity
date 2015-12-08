// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.a;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.NSLogger.NSLoggerClient;

// Referenced classes of package com.cardinalblue.android.piccollage.a:
//            f

private static class 
{

    private static NSLoggerClient a = null;

    public static void a(Context context, String s)
    {
        if (a == null)
        {
            a = new NSLoggerClient(context);
            a.a(null, Build.MODEL, false);
        }
        a.a(s);
    }

    public static void a(String s)
    {
        Log.w("PC", s);
    }


    private ()
    {
    }
}

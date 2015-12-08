// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.util;

import android.util.Log;

// Referenced classes of package com.googlecode.mp4parser.util:
//            Logger

public class AndroidLogger extends Logger
{

    private static final String TAG = "isoparser";
    String name;

    public AndroidLogger(String s)
    {
        name = s;
    }

    public void logDebug(String s)
    {
        (new StringBuilder(String.valueOf(name))).append(":").append(s);
    }

    public void logError(String s)
    {
        Log.e("isoparser", (new StringBuilder(String.valueOf(name))).append(":").append(s).toString());
    }

    public void logWarn(String s)
    {
        Log.w("isoparser", (new StringBuilder(String.valueOf(name))).append(":").append(s).toString());
    }
}

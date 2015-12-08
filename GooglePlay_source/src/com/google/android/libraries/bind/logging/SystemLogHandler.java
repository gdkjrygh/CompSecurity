// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.logging;

import android.util.Log;

// Referenced classes of package com.google.android.libraries.bind.logging:
//            LogHandler

public final class SystemLogHandler
    implements LogHandler
{

    public SystemLogHandler()
    {
    }

    public final void log(int i, String s, String s1)
    {
        Log.println(6, s, s1);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.io.InputStream;

// Referenced classes of package com.crashlytics.android:
//            LogFileManager

class b
    implements io.fabric.sdk.android.services.common.Reader
{

    final byte a[];
    final int b[];
    final LogFileManager c;

    public void a(InputStream inputstream, int i)
    {
        int ai[];
        inputstream.read(a, b[0], i);
        ai = b;
        ai[0] = ai[0] + i;
        inputstream.close();
        return;
        Exception exception;
        exception;
        inputstream.close();
        throw exception;
    }

    ueFile.ElementReader(LogFileManager logfilemanager, byte abyte0[], int ai[])
    {
        c = logfilemanager;
        a = abyte0;
        b = ai;
        super();
    }
}

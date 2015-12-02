// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.logcat.raw;

import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.facebook.debug.logcat.raw:
//            LogcatProcess

public class RawLogcatDumper
{

    private static final Class a = com/facebook/debug/logcat/raw/RawLogcatDumper;
    private static final String b[] = {
        "-d", "-v", "threadtime"
    };
    private LogcatProcess c;

    public RawLogcatDumper()
    {
        c = new LogcatProcess(Arrays.asList(b));
    }

    public final List a()
    {
        ArrayList arraylist;
        c.a();
        arraylist = new ArrayList();
        Object obj = new BufferedReader(new InputStreamReader(c.b(), "US-ASCII"));
_L1:
        String s = ((BufferedReader) (obj)).readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        arraylist.add(s);
          goto _L1
        IOException ioexception2;
        ioexception2;
        Log.e(a.getSimpleName(), "unexpected error", ioexception2);
        Exception exception;
        try
        {
            ((BufferedReader) (obj)).close();
        }
        catch (IOException ioexception) { }
        c.c();
        return arraylist;
        obj;
        Log.e(a.getSimpleName(), "unexpected error", ((Throwable) (obj)));
        c.c();
        return arraylist;
        exception;
        obj = null;
_L3:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            catch (IOException ioexception1) { }
        }
        c.c();
        throw exception;
        exception;
        if (true) goto _L3; else goto _L2
_L2:
    }

}

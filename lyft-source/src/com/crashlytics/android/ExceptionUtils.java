// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

final class ExceptionUtils
{

    private static String a(Throwable throwable)
    {
        throwable = throwable.getLocalizedMessage();
        if (throwable == null)
        {
            return null;
        } else
        {
            return throwable.replaceAll("(\r\n|\n|\f)", " ");
        }
    }

    public static void a(Throwable throwable, OutputStream outputstream)
    {
        if (outputstream != null)
        {
            b(throwable, outputstream);
        }
    }

    private static void a(Throwable throwable, Writer writer)
    {
        int i = 1;
_L4:
        if (throwable == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = a(throwable);
        String s;
        int j;
        if (obj == null)
        {
            obj = "";
        }
        break MISSING_BLOCK_LABEL_151;
        writer.write((new StringBuilder()).append(s).append(throwable.getClass().getName()).append(": ").append(((String) (obj))).append("\n").toString());
        obj = throwable.getStackTrace();
        j = obj.length;
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = obj[i];
        writer.write((new StringBuilder()).append("\tat ").append(s.toString()).append("\n").toString());
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        throwable = throwable.getCause();
        i = 0;
        if (true) goto _L4; else goto _L3
        throwable;
        Fabric.g().d("Fabric", "Could not write stack trace", throwable);
_L3:
        return;
        if (i != 0)
        {
            s = "";
        } else
        {
            s = "Caused by: ";
        }
        break MISSING_BLOCK_LABEL_19;
    }

    private static void b(Throwable throwable, OutputStream outputstream)
    {
        PrintWriter printwriter = new PrintWriter(outputstream);
        outputstream = printwriter;
        a(throwable, printwriter);
        CommonUtils.a(printwriter, "Failed to close stack trace writer.");
        return;
        Exception exception;
        exception;
        throwable = null;
_L4:
        outputstream = throwable;
        Fabric.g().d("Fabric", "Failed to create PrintWriter", exception);
        CommonUtils.a(throwable, "Failed to close stack trace writer.");
        return;
        throwable;
        outputstream = null;
_L2:
        CommonUtils.a(outputstream, "Failed to close stack trace writer.");
        throw throwable;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        throwable = printwriter;
        if (true) goto _L4; else goto _L3
_L3:
    }
}

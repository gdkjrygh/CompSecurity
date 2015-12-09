// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

final class amg
{

    public static void a(Throwable throwable, OutputStream outputstream)
    {
        if (outputstream == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        PrintWriter printwriter = new PrintWriter(outputstream);
        outputstream = printwriter;
        a(throwable, ((Writer) (printwriter)));
        CommonUtils.a(printwriter, "Failed to close stack trace writer.");
        return;
        Exception exception;
        exception;
        throwable = null;
_L4:
        outputstream = throwable;
        gya.a().c("CrashlyticsCore", "Failed to create PrintWriter", exception);
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

    private static void a(Throwable throwable, Writer writer)
    {
        Throwable throwable1;
        int i;
        i = 1;
        throwable1 = throwable;
_L5:
        if (throwable1 == null) goto _L2; else goto _L1
_L1:
        throwable = throwable1.getLocalizedMessage();
        break MISSING_BLOCK_LABEL_14;
_L6:
        String s;
        writer.write((new StringBuilder()).append(s).append(throwable1.getClass().getName()).append(": ").append(throwable).append("\n").toString());
        throwable = throwable1.getStackTrace();
        j = throwable.length;
        i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = throwable[i];
        writer.write((new StringBuilder("\tat ")).append(s.toString()).append("\n").toString());
        i++;
        if (true) goto _L4; else goto _L3
        int j;
        if (throwable == null)
        {
            throwable = null;
            break MISSING_BLOCK_LABEL_164;
        }
        try
        {
            throwable = throwable.replaceAll("(\r\n|\n|\f)", " ");
            break MISSING_BLOCK_LABEL_164;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            gya.a().c("CrashlyticsCore", "Could not write stack trace", throwable);
        }
          goto _L2
_L3:
        throwable1 = throwable1.getCause();
        i = 0;
          goto _L5
_L2:
        return;
        if (throwable == null)
        {
            throwable = "";
        }
        if (i != 0)
        {
            s = "";
        } else
        {
            s = "Caused by: ";
        }
          goto _L6
    }
}

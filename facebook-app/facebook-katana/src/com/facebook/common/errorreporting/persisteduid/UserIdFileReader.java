// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.errorreporting.persisteduid;

import android.content.Context;
import com.facebook.acra.CustomReportDataSupplier;
import java.io.File;
import java.io.RandomAccessFile;

// Referenced classes of package com.facebook.common.errorreporting.persisteduid:
//            UserIdFileUtils

public class UserIdFileReader
    implements CustomReportDataSupplier
{

    private String a;
    private final Context b;

    public UserIdFileReader(Context context)
    {
        a = null;
        b = context;
    }

    private static String a(File file)
    {
        file = new RandomAccessFile(file, "r");
        String s;
        byte abyte0[] = new byte[(int)file.length()];
        file.readFully(abyte0);
        s = new String(abyte0, "UTF-8");
        file.close();
        return s;
        Exception exception;
        exception;
        file.close();
        throw exception;
    }

    public String getCustomData(Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        throwable = a;
        if (throwable != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        throwable = UserIdFileUtils.a(b);
        if (!throwable.exists())
        {
            break MISSING_BLOCK_LABEL_43;
        }
        a = a(throwable);
_L1:
        throwable = a;
        this;
        JVM INSTR monitorexit ;
        return throwable;
        a = null;
          goto _L1
        throwable;
        throw new RuntimeException(throwable);
        throwable;
        this;
        JVM INSTR monitorexit ;
        throw throwable;
    }
}

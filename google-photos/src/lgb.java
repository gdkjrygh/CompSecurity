// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class lgb
{

    public static final Integer a = Integer.valueOf(0);
    public static final Integer b = Integer.valueOf(1);
    final Context c;
    final ExecutorService d;

    public lgb(Context context)
    {
        this(context, Executors.newSingleThreadExecutor());
    }

    private lgb(Context context, ExecutorService executorservice)
    {
        c = context;
        d = executorservice;
    }

    static byte[] a(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        c.a(inputstream, bytearrayoutputstream);
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            lqh.b("Error closing stream for reading resource from disk");
            return null;
        }
_L2:
        return bytearrayoutputstream.toByteArray();
        IOException ioexception;
        ioexception;
        lqh.b("Failed to read the resource from disk");
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            lqh.b("Error closing stream for reading resource from disk");
            return null;
        }
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            lqh.b("Error closing stream for reading resource from disk");
            return null;
        }
        throw exception;
    }

    static String c(String s)
    {
        return (new StringBuilder("resource_")).append(s).toString();
    }

    public final long a(String s)
    {
        s = b(s);
        if (s.exists())
        {
            return s.lastModified();
        } else
        {
            return 0L;
        }
    }

    final File b(String s)
    {
        return new File(c.getDir("google_tagmanager", 0), c(s));
    }

}

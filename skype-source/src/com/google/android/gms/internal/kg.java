// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.ak;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.internal:
//            iq, ka, kf

public final class kg
{

    public static final Integer a = Integer.valueOf(0);
    public static final Integer b = Integer.valueOf(1);
    private final Context c;
    private final ExecutorService d;

    public kg(Context context)
    {
        this(context, Executors.newSingleThreadExecutor());
    }

    private kg(Context context, ExecutorService executorservice)
    {
        c = context;
        d = executorservice;
    }

    private static byte[] a(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        iq.a(inputstream, bytearrayoutputstream, false);
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            ak.b("Error closing stream for reading resource from disk");
            return null;
        }
_L2:
        return bytearrayoutputstream.toByteArray();
        IOException ioexception;
        ioexception;
        ak.b("Failed to read the resource from disk");
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            ak.b("Error closing stream for reading resource from disk");
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
            ak.b("Error closing stream for reading resource from disk");
            return null;
        }
        throw exception;
    }

    private File b(String s)
    {
        return new File(c.getDir("google_tagmanager", 0), c(s));
    }

    private static String c(String s)
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

    public final void a(String s, Integer integer, ka ka1, kf kf1)
    {
        d.execute(new Runnable(s, integer, ka1, kf1) {

            final String a;
            final Integer b;
            final ka c;
            final kf d;
            final kg e;

            public final void run()
            {
                e.b(a, b, c, d);
            }

            
            {
                e = kg.this;
                a = s;
                b = integer;
                c = ka1;
                d = kf1;
                super();
            }
        });
    }

    public final void a(String s, byte abyte0[])
    {
        d.execute(new Runnable(s, abyte0) {

            final String a;
            final byte b[];
            final kg c;

            public final void run()
            {
                c.b(a, b);
            }

            
            {
                c = kg.this;
                a = s;
                b = abyte0;
                super();
            }
        });
    }

    final void b(String s, Integer integer, ka ka1, kf kf1)
    {
        ak.b();
        Object obj = ka1.a(a(new FileInputStream(b(s))));
        if (obj != null)
        {
            try
            {
                (new StringBuilder("Saved resource loaded: ")).append(c(s));
                ak.b();
                kf1.a(Status.a, obj, b, a(s));
                return;
            }
            catch (FileNotFoundException filenotfoundexception)
            {
                ak.a((new StringBuilder("Saved resource not found: ")).append(c(s)).toString());
            }
            catch (ke.g g)
            {
                ak.a((new StringBuilder("Saved resource is corrupted: ")).append(c(s)).toString());
            }
        }
        if (integer == null)
        {
            kf1.a(Status.c, null, null, 0L);
            return;
        }
        s = c.getResources().openRawResource(integer.intValue());
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        s = ((String) (ka1.a(a(s))));
        if (s != null)
        {
            try
            {
                (new StringBuilder("Default resource loaded: ")).append(c.getResources().getResourceEntryName(integer.intValue()));
                ak.b();
                kf1.a(Status.a, s, a, 0L);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                ak.a((new StringBuilder("Default resource not found. ID: ")).append(integer).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                ak.a((new StringBuilder("Default resource resource is corrupted: ")).append(integer).toString());
            }
        }
        kf1.a(Status.c, null, null, 0L);
        return;
    }

    final void b(String s, byte abyte0[])
    {
        FileOutputStream fileoutputstream;
        File file;
        file = b(s);
        try
        {
            fileoutputstream = new FileOutputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ak.a("Error opening resource file for writing");
            return;
        }
        fileoutputstream.write(abyte0);
        try
        {
            fileoutputstream.close();
            (new StringBuilder("Resource ")).append(s).append(" saved on Disk.");
            ak.b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ak.a("Error closing stream for writing resource to disk");
        }
        return;
        abyte0;
        ak.a("Error writing resource to disk. Removing resource from disk");
        file.delete();
        try
        {
            fileoutputstream.close();
            (new StringBuilder("Resource ")).append(s).append(" saved on Disk.");
            ak.b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ak.a("Error closing stream for writing resource to disk");
        }
        return;
        abyte0;
        try
        {
            fileoutputstream.close();
            (new StringBuilder("Resource ")).append(s).append(" saved on Disk.");
            ak.b();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ak.a("Error closing stream for writing resource to disk");
        }
        throw abyte0;
    }

}

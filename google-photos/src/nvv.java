// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.EnumMap;
import java.util.HashSet;

public final class nvv
{

    private static EnumMap d;
    private HashSet a;
    private final File b;
    private final String c;

    private nvv(Context context, String s, String s1)
    {
        b = new File(new File(context.getCacheDir(), s), s1);
        c = b.toString();
    }

    public static nvv a(Context context, nvx nvx1)
    {
        nvv;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = new EnumMap(nvx);
        }
        if (!d.containsKey(nvx1)) goto _L2; else goto _L1
_L1:
        context = (nvv)d.get(nvx1);
_L5:
        nvv;
        JVM INSTR monitorexit ;
        return context;
_L2:
        Context context1;
        context1 = context.getApplicationContext();
        switch (nvw.a[nvx1.ordinal()])
        {
        default:
            break MISSING_BLOCK_LABEL_126;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break;
        }
          goto _L3
_L6:
        context = new nvv(context1, "local_media_meta_data", context);
        d.put(nvx1, context);
        if (true) goto _L5; else goto _L4
        context;
        throw context;
_L4:
        context = "pano_data";
          goto _L6
_L3:
        context = "pano_360_data";
          goto _L6
        context = null;
          goto _L6
    }

    private void a()
    {
        if (a == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a = new HashSet();
        if (!b.exists()) goto _L1; else goto _L3
_L3:
        Object obj1 = null;
        Object obj = new BufferedReader(new FileReader(b));
        obj1 = ((BufferedReader) (obj)).readLine();
_L5:
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        a.add(obj1);
        obj1 = ((BufferedReader) (obj)).readLine();
        if (true) goto _L5; else goto _L4
_L4:
        try
        {
            ((BufferedReader) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj;
        obj = null;
_L9:
        try
        {
            ((BufferedReader) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj;
_L7:
        try
        {
            ((BufferedReader) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        throw obj;
        Exception exception1;
        exception1;
        obj1 = obj;
        obj = exception1;
        if (true) goto _L7; else goto _L6
_L6:
        Exception exception;
        exception;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        a();
        flag = a.contains(s);
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj = new FileOutputStream(c, true);
_L4:
        obj = new BufferedWriter(new OutputStreamWriter(((java.io.OutputStream) (obj))));
        ((BufferedWriter) (obj)).write(s);
        ((BufferedWriter) (obj)).newLine();
        try
        {
            ((BufferedWriter) (obj)).close();
            a.add(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally
        {
            this;
        }
          goto _L1
        obj;
        obj = (new File(c)).getParentFile();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        if (((File) (obj)).exists())
        {
            break MISSING_BLOCK_LABEL_135;
        }
        ((File) (obj)).mkdirs();
        obj = new FileOutputStream(c);
        if (true) goto _L4; else goto _L3
_L3:
        JVM INSTR monitorexit ;
        throw s;
        s;
        ((BufferedWriter) (obj)).close();
        throw s;
        obj = null;
          goto _L4
    }
}

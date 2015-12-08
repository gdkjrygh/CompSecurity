// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ap.c;
import com.google.android.m4b.maps.cq.g;
import com.google.android.m4b.maps.y.j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            az

public final class bw
    implements com.google.android.m4b.maps.ay.f.a
{

    private a a;
    private boolean b;
    private String c;
    private Context d;

    public bw(Context context, String s)
    {
        Object obj;
        String s1;
        j.a(s, "Package name is null");
        d = context;
        obj = String.valueOf("event_store_v2_");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = ((String) (obj)).concat(s);
        } else
        {
            s = new String(((String) (obj)));
        }
        c = s;
        s = a(context);
        if (s != null)
        {
            int i = s.indexOf(':');
            if (i == -1 || i >= s.length())
            {
                s = "";
            } else
            {
                s = String.valueOf(s.substring(i + 1));
                s = (new StringBuilder(String.valueOf(s).length() + 1)).append("_").append(s).toString();
            }
        } else
        {
            s = "";
        }
        obj = com.google.android.m4b.maps.cg.az.c();
        s1 = String.valueOf("event_store_v2");
        s = String.valueOf(s);
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        s = s1.concat(s);
_L1:
        context = context.getFileStreamPath(s);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        if (context.exists())
        {
            context.delete();
        }
        com.google.android.m4b.maps.cg.az.a(obj);
        return;
        s = new String(s1);
          goto _L1
        context;
        com.google.android.m4b.maps.cg.az.a(obj);
        throw context;
    }

    private static String a(Context context)
    {
        context = (ActivityManager)context.getSystemService("activity");
        int i = Process.myPid();
        for (context = context.getRunningAppProcesses().iterator(); context.hasNext();)
        {
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)context.next();
            if (runningappprocessinfo.pid == i)
            {
                return runningappprocessinfo.processName;
            }
        }

        return null;
    }

    private void c()
    {
        java.io.FileInputStream fileinputstream = null;
        this;
        JVM INSTR monitorenter ;
        if (c == null) goto _L2; else goto _L1
_L1:
        Object obj1 = com.google.android.m4b.maps.cg.az.a();
        java.io.FileInputStream fileinputstream1 = d.openFileInput(c);
        if (fileinputstream1 == null) goto _L4; else goto _L3
_L3:
        Object obj;
        fileinputstream = fileinputstream1;
        obj = fileinputstream1;
        a = new a(g.a);
        fileinputstream = fileinputstream1;
        obj = fileinputstream1;
        a.a(com.google.android.m4b.maps.ap.c.a(fileinputstream1));
_L6:
        com.google.android.m4b.maps.cg.az.a(obj1);
        com.google.android.m4b.maps.ap.c.b(fileinputstream1);
_L2:
        b = true;
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        fileinputstream = fileinputstream1;
        obj = fileinputstream1;
        Exception exception;
        try
        {
            a = null;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = fileinputstream;
        }
        finally
        {
            if (true) goto _L0; else goto _L0
        }
        a = null;
        obj = fileinputstream;
        d.deleteFile(c);
        com.google.android.m4b.maps.cg.az.a(obj1);
        com.google.android.m4b.maps.ap.c.b(fileinputstream);
          goto _L2
        exception;
        throw exception;
        exception;
        obj = null;
        com.google.android.m4b.maps.cg.az.a(obj1);
        com.google.android.m4b.maps.ap.c.b(((java.io.InputStream) (obj)));
        throw exception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final a a()
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        if (!b)
        {
            c();
        }
        a1 = a;
        this;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        a = a1;
        b = true;
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    public final void b()
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        if (c == null) goto _L2; else goto _L1
_L1:
        if (a != null) goto _L4; else goto _L3
_L3:
        d.deleteFile(c);
_L2:
        a = null;
        b = false;
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        Object obj2 = az.b();
        FileOutputStream fileoutputstream = d.openFileOutput(c, 0);
        Object obj1;
        obj = fileoutputstream;
        obj1 = fileoutputstream;
        fileoutputstream.write(a.c());
        com.google.android.m4b.maps.cg.az.a(obj2);
        com.google.android.m4b.maps.ap.c.a(fileoutputstream);
          goto _L2
        obj;
        throw obj;
        obj1;
        obj1 = obj;
        d.deleteFile(c);
        com.google.android.m4b.maps.cg.az.a(obj2);
        com.google.android.m4b.maps.ap.c.a(((java.io.OutputStream) (obj)));
          goto _L2
_L6:
        Exception exception;
        com.google.android.m4b.maps.cg.az.a(obj2);
        com.google.android.m4b.maps.ap.c.a(((java.io.OutputStream) (obj1)));
        throw exception;
        exception;
        continue; /* Loop/switch isn't completed */
        exception;
        obj1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }
}

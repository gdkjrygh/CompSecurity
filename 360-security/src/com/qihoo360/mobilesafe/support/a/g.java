// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

// Referenced classes of package com.qihoo360.mobilesafe.support.a:
//            c, h

public class g extends c
{

    public g(Context context)
    {
        super(context);
        d = "com.qihoo.rt_server";
    }

    private void a(BufferedWriter bufferedwriter, int i)
        throws IOException
    {
    }

    private void a(String s)
    {
    }

    private void g()
    {
    }

    protected boolean a(String s, String s1)
    {
        String s2 = (new StringBuilder(String.valueOf(g.getApplicationInfo().dataDir))).append("/auth.jar").toString();
        if (!a(true, 10000)) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        arraylist = new ArrayList();
        arraylist.add(s);
        arraylist.add("-server");
        arraylist.add(s1);
        arraylist.add(s2);
        if (!a(h.a(s, arraylist), 5000)) goto _L2; else goto _L3
_L3:
        return true;
_L2:
        s2 = String.format("%s -server %s %s&\n", new Object[] {
            s, s1, s2
        });
        int i;
        try
        {
            a(String.format("export _LD_LIBRARY_PATH=%s\n", new Object[] {
                System.getenv("LD_LIBRARY_PATH")
            }));
            a("ls>/data/step\n");
            a("rm /data/step\n");
            s1 = h.a(g);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        s = s1;
        if (s1 == null)
        {
            return false;
        }
          goto _L4
_L7:
        b = Runtime.getRuntime().exec(s);
        s1 = new BufferedWriter(new OutputStreamWriter(b.getOutputStream(), "UTF-8"), 512);
        a(((BufferedWriter) (s1)), 0);
        s1.write(String.format("export _LD_LIBRARY_PATH=%s\n", new Object[] {
            System.getenv("LD_LIBRARY_PATH")
        }));
        a(((BufferedWriter) (s1)), 1);
        s1.write(String.format("export LD_LIBRARY_PATH=%s\n", new Object[] {
            System.getenv("LD_LIBRARY_PATH")
        }));
        a(((BufferedWriter) (s1)), 2);
        s1.write(String.format("export BOOTCLASSPATH=%s\n", new Object[] {
            System.getenv("BOOTCLASSPATH")
        }));
        a(((BufferedWriter) (s1)), 3);
        s1.write(String.format("export PATH=%s\n", new Object[] {
            System.getenv("PATH")
        }));
        a(((BufferedWriter) (s1)), 4);
        s1.write(s2);
        a(((BufferedWriter) (s1)), 5);
        s1.write("exit 100\n");
        s1.flush();
        i = b.waitFor();
        g();
        try
        {
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        if (i == 100) goto _L3; else goto _L5
_L5:
        if (!s.endsWith("360s"))
        {
            break MISSING_BLOCK_LABEL_382;
        }
        s = "su";
_L4:
        if (s != null) goto _L7; else goto _L6
_L6:
        return true;
        return false;
    }
}

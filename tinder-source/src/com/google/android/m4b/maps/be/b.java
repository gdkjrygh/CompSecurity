// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.be;

import android.util.Log;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.cq.ae;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

// Referenced classes of package com.google.android.m4b.maps.be:
//            d

public final class b
{

    private static final Locale a;
    private final int b = 512;
    private final d c;
    private final k d;
    private boolean e;

    private b(File file, k k1, e e1)
    {
        d = k1;
        long l = k.c();
        k1 = new com.google.android.m4b.maps.au.a.a(file);
        try
        {
            file = com.google.android.m4b.maps.be.d.a("r", k1, null, e1);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            try
            {
                file = com.google.android.m4b.maps.be.d.a("r", b, 0, a, k1, null, e1);
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                if (ab.a("DiskResourceCache", 6))
                {
                    Log.e("DiskResourceCache", "Error creating the cache", file);
                }
                file = null;
            }
        }
        if (file != null)
        {
            long l1 = k.c();
            if (ab.a("DiskResourceCache", 3))
            {
                int i = file.a();
                Log.d("DiskResourceCache", (new StringBuilder(50)).append("Loaded ").append(i).append(" entries, ").append(l1 - l).append("ms").toString());
            }
            e = true;
        }
        c = file;
    }

    public static b a(File file, e e1)
    {
        return new b(file, k.a(), e1);
    }

    public final com.google.android.m4b.maps.bg.a a(String s)
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        boolean flag = e;
        if (flag) goto _L2; else goto _L1
_L1:
        com.google.android.m4b.maps.bg.a a1 = obj;
_L4:
        this;
        JVM INSTR monitorexit ;
        return a1;
_L2:
        byte abyte0[] = c.a(com.google.android.m4b.maps.al.b.a(s), null);
        a1 = obj;
        if (abyte0 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        a1 = obj;
        if (abyte0.length <= 9)
        {
            continue; /* Loop/switch isn't completed */
        }
        a1 = obj;
        if (abyte0[0] != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        a a2;
        long l;
        l = com.google.android.m4b.maps.be.d.c(abyte0, 1);
        a2 = new a(ae.b);
        a2.a(new ByteArrayInputStream(abyte0, 9, abyte0.length - 9));
        a1 = obj;
        if (s.equals(a2.g(2)))
        {
            a1 = new com.google.android.m4b.maps.bg.a();
            a1.c = true;
            a1.a(a2);
            a1.g = l;
        }
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
        s;
        a1 = obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        c.a(0, a);
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        if (ab.a("DiskResourceCache", 6))
        {
            String s = String.valueOf(obj);
            Log.e("DiskResourceCache", (new StringBuilder(String.valueOf(s).length() + 16)).append("Clearing cache: ").append(s).toString());
        }
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    public final void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        String s = a1.g(2);
        byte abyte0[];
        long l;
        l = k.b();
        abyte0 = a1.c();
        a1 = new byte[abyte0.length + 9];
        a1[0] = 1;
        try
        {
            com.google.android.m4b.maps.be.d.a(a1, 1, l);
            System.arraycopy(abyte0, 0, a1, 9, abyte0.length);
            ArrayList arraylist = new ArrayList(1);
            arraylist.add(com.google.android.m4b.maps.be.d.a(com.google.android.m4b.maps.al.b.a(s), a1));
            c.a(arraylist);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (a a1) { }
        finally
        {
            this;
        }
        if (ab.a("DiskResourceCache", 6))
        {
            a1 = String.valueOf(a1);
            Log.e("DiskResourceCache", (new StringBuilder(String.valueOf(s).length() + 20 + String.valueOf(a1).length())).append("Error inserting: ").append(s).append(" : ").append(a1).toString());
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw a1;
    }

    static 
    {
        a = Locale.ENGLISH;
    }
}

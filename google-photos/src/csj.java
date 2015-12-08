// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class csj
{

    private static final String b = csj.getSimpleName();
    final File a;
    private final csn c;
    private final int d;
    private final csm e;
    private final Object f = new Object();

    public csj(int i, csm csm1, File file)
    {
        d = b.a(i, "capacity");
        c = new csn(i);
        e = (csm)b.a(csm1, "trackFetcher", null);
        a = (File)b.a(file, "cacheDirectory", null);
        a();
    }

    private void a()
    {
        File afile[] = a.listFiles();
        Object obj = new ArrayList();
        int j = afile.length;
        int i = 0;
        while (i < j) 
        {
            File file = afile[i];
            int k = (int)file.length();
            if (k == 0)
            {
                file.delete();
            } else
            {
                csl csl1 = new csl();
                csl1.a = k;
                csl1.b = file;
                ((ArrayList) (obj)).add(csl1);
            }
            i++;
        }
        Collections.sort(((java.util.List) (obj)), new csk(this));
        for (Iterator iterator = ((ArrayList) (obj)).iterator(); iterator.hasNext(); c.put(Long.valueOf((new BigInteger(((csl) (obj)).b.getName(), 16)).longValue()), obj))
        {
            obj = (csl)iterator.next();
        }

    }

    private boolean b(long l, int i)
    {
        csl csl1;
        if (i > d)
        {
            Log.e(b, (new StringBuilder(74)).append("Requested track byte count ").append(i).append(" was greater than the cache capacity").toString());
            return false;
        }
        csl1 = (csl)c.get(Long.valueOf(l));
        if (csl1 == null) goto _L2; else goto _L1
_L1:
        if (csl1.a >= i)
        {
            csl1.b.setLastModified(System.currentTimeMillis());
            return true;
        }
        csl1.b.setLastModified(System.currentTimeMillis());
_L4:
        int j = csl1.a;
        c.trimToSize(d - (i - j));
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        e.a(l, csl1.b, csl1.a, i);
        csl1.a = i;
        c.put(Long.valueOf(l), csl1);
        return true;
_L2:
        csl csl2 = new csl();
        csl2.a = 0;
        csl2.b = new File(a, Long.toHexString(l));
        csl1 = csl2;
        if (csl2.b.length() != 0L)
        {
            c.a((new StringBuilder()).append("entry.file.length()").append(" must be equal to ").append(0L), null);
            csl1 = csl2;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        Log.e(b, (new StringBuilder(49)).append("Failure while fetching track ").append(l).toString(), exception);
        csl1.b.delete();
        return false;
    }

    public final boolean a(long l, int i)
    {
        boolean flag;
        synchronized (f)
        {
            flag = b(l, i);
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}

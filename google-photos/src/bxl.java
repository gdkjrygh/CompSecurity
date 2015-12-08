// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.util.Log;
import android.util.LongSparseArray;
import java.io.File;
import java.io.IOException;

final class bxl extends AsyncTask
{

    private bxj a;

    bxl(bxj bxj1)
    {
        a = bxj1;
        super();
    }

    private transient Exception a(long al[][])
    {
        int i = 0;
        Object obj = bxj.a(a);
        obj;
        JVM INSTR monitorenter ;
        al = al[0];
        int j = al.length;
_L3:
        if (i >= j) goto _L2; else goto _L1
_L1:
        long l = al[i];
        if (!isCancelled())
        {
            break MISSING_BLOCK_LABEL_45;
        }
        obj;
        JVM INSTR monitorexit ;
        return null;
        try
        {
            c.a(bxj.g(a), "httpFetcher", null);
            File file = bxj.h(a).b(l);
            if (file.length() != 0L)
            {
                continue; /* Loop/switch isn't completed */
            }
            String s = bxj.a(a, l);
            bxj.g(a).a(s, file);
            c.a(file.exists(), "file should exist");
            if (file.length() == 0L)
            {
                file.delete();
                throw new IOException("Downloaded file had length 0");
            }
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (long al[][]) { }
        finally { }
        Log.w(bxj.b(), (new StringBuilder(45)).append("Failed downloading asset ").append(l).toString());
        obj;
        JVM INSTR monitorexit ;
        return al;
        obj;
        JVM INSTR monitorexit ;
        throw al;
          goto _L3
_L2:
        obj;
        JVM INSTR monitorexit ;
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((long[][])aobj);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Exception)obj;
        bxj.b(a);
        if (obj == null)
        {
            obj = bxj.d(a);
            ddj ddj1 = bxj.c(a);
            int j = ddj1.a.size();
            for (int i = 0; i < j; i++)
            {
                long l = ddj1.a.keyAt(i);
                if (((ddj) (obj)).a.indexOfKey(l) < 0)
                {
                    ((ddj) (obj)).a.put(l, null);
                }
            }

            bxj.c(a).a.clear();
            bxj.e(a).n(true);
            return;
        } else
        {
            bxj.f(a).o(true);
            return;
        }
    }
}

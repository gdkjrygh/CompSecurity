// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.util.Log;

public class crx
{

    private static final String d = crx.getSimpleName();
    public final crn a;
    public final Object b = new Object();
    public chq c;
    private final crt e;
    private final crn f;
    private final cry g = new cry();

    public crx(crt crt1, crn crn1, crn crn2)
    {
        e = (crt)b.a(crt1, "posterExtractor", null);
        f = (crn)b.a(crn1, "posterCache", null);
        a = (crn)b.a(crn2, "lowResPosterCache", null);
    }

    private chq a()
    {
        chq chq;
        synchronized (b)
        {
            chq = c;
        }
        return chq;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(coa coa1, int i, int j, cry cry1)
    {
        b.a(cry1, "posterInfoOut", null);
        float f1 = crt.a(coa1.a, i, j);
        j = csc.a(coa1.a);
        i = csc.b(coa1.a);
        j = (int)Math.floor((float)j * f1);
        i = (int)Math.floor(f1 * (float)i);
        cry1.a = coa1;
        cry1.b = j;
        cry1.c = i;
    }

    public final csb a(int i, coa coa1, int j, int k)
    {
        if (a() == null)
        {
            Log.w(d, "getPoster called with released PosterStore. Returning null.");
            return null;
        }
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        a(coa1, j, k, g);
        coa1 = (csb)f.a(g);
        if (coa1 == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        obj;
        JVM INSTR monitorexit ;
        return coa1;
        coa1;
        obj;
        JVM INSTR monitorexit ;
        throw coa1;
        cry cry1 = new cry(g);
        obj;
        JVM INSTR monitorexit ;
        aln.a("extractPoster");
        coa1 = a();
        if (coa1 != null) goto _L2; else goto _L1
_L1:
        coa1 = null;
_L3:
        aln.a();
        return coa1;
_L2:
        obj = e.a(i, coa1, cry1);
label0:
        {
            if (obj != null)
            {
                break label0;
            }
            coa1 = null;
        }
          goto _L3
        f.a(cry1, ((crz) (obj)));
        i = ((csb) (obj)).d().getWidth();
        j = ((csb) (obj)).d().getHeight();
        coa1 = ((coa) (obj));
        if (i <= 0) goto _L3; else goto _L4
_L4:
        coa1 = ((coa) (obj));
        if (j <= 0) goto _L3; else goto _L5
_L5:
        float f1 = Math.max(128F / (float)i, 128F / (float)j);
        coa1 = new csb(b.a(((csb) (obj)).d(), (int)((float)i * f1), (int)((float)j * f1)));
        a.a(cry1.a, coa1);
        coa1.b();
        coa1 = ((coa) (obj));
          goto _L3
        coa1;
        aln.a();
        throw coa1;
    }

    public final csb a(coa coa1, int i, int j)
    {
        synchronized (g)
        {
            a(coa1, i, j, g);
            coa1 = (csb)f.a(g);
        }
        return coa1;
        coa1;
        cry1;
        JVM INSTR monitorexit ;
        throw coa1;
    }

}

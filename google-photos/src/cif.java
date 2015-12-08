// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.util.SparseArray;

public final class cif
{

    private static final String d = cif.getSimpleName();
    final ddx a = new deb(8, new cii());
    final SparseArray b = new SparseArray(8);
    final SparseArray c = new SparseArray(8);

    public cif()
    {
        a(1, 64);
        a(2, 64);
        a(3, 64);
        a(4, 64);
        a(9, 64);
        b(1, 64);
        b(2, 64);
        b(3, 64);
        b(4, 64);
    }

    private ddx a(int i, int j)
    {
        deb deb1 = new deb(j, new cig(i));
        b.append(i, deb1);
        return deb1;
    }

    private ddx b(int i, int j)
    {
        deb deb1 = new deb(j, new cih(i));
        c.append(i, deb1);
        return deb1;
    }

    public final cie a()
    {
        cie cie1;
        synchronized (a)
        {
            cie1 = (cie)a.a();
        }
        return cie1;
        exception;
        ddx1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final float[] a(int i)
    {
        SparseArray sparsearray = b;
        sparsearray;
        JVM INSTR monitorenter ;
        ddx ddx2 = (ddx)b.get(i);
        ddx ddx1;
        ddx1 = ddx2;
        if (ddx2 != null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        ddx1 = a(i, 4);
        Log.w(d, (new StringBuilder(53)).append("Created a new float pool of element count ").append(i).toString());
        float af[] = (float[])ddx1.a();
        sparsearray;
        JVM INSTR monitorexit ;
        return af;
        Exception exception;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int[] b(int i)
    {
        SparseArray sparsearray = c;
        sparsearray;
        JVM INSTR monitorenter ;
        ddx ddx2 = (ddx)c.get(1);
        ddx ddx1;
        ddx1 = ddx2;
        if (ddx2 != null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ddx1 = b(1, 4);
        Log.w(d, (new StringBuilder(55)).append("Created a new integer pool of element count 1").toString());
        int ai[] = (int[])ddx1.a();
        sparsearray;
        JVM INSTR monitorexit ;
        return ai;
        Exception exception;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
    }

}

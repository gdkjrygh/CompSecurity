// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Matrix;
import android.util.SparseArray;
import java.util.Map;

public final class cie
    implements ded
{

    public static final cif a = new cif();
    public final Object b[] = new Object[64];
    cij c;

    cie()
    {
    }

    public static cie a(cij cij1)
    {
        b.a(cij1, "shaderProgram", null);
        cie cie1 = a.a();
        c.b(cie1.c, "ShaderInstance was re-initialized before being released", null);
        cie1.c = cij1;
        return cie1;
    }

    public cie a(String s, float f, boolean flag)
    {
        b();
        s = a(s, flag);
        if (s != null)
        {
            a(s.intValue(), 1, 1);
            float af[] = a.a(1);
            af[0] = f;
            b[s.intValue()] = af;
        }
        return this;
    }

    public cie a(String s, int i, boolean flag)
    {
        b();
        s = a(s, flag);
        if (s != null)
        {
            a(s.intValue(), 2, 1);
            int ai[] = a.b(1);
            ai[0] = i;
            b[s.intValue()] = ai;
        }
        return this;
    }

    public cie a(String s, Matrix matrix, boolean flag)
    {
        b();
        s = a(s, flag);
        if (s != null)
        {
            a(s.intValue(), 1, 9);
            float af[] = a.a(9);
            matrix.getValues(af);
            float f = af[1];
            float f1 = af[2];
            float f2 = af[5];
            af[1] = af[3];
            af[2] = af[6];
            af[5] = af[7];
            af[3] = f;
            af[6] = f1;
            af[7] = f2;
            b[s.intValue()] = af;
        }
        return this;
    }

    public final cie a(String s, cin cin)
    {
        b();
        s = a(s, false);
        if (s != null)
        {
            a(s.intValue(), 0, 1);
            b[s.intValue()] = cin;
        }
        return this;
    }

    public Integer a(String s, boolean flag)
    {
        Integer integer = (Integer)c.b.get(s);
        if (!flag && integer == null)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Unknown uniform with name: ".concat(s);
            } else
            {
                s = new String("Unknown uniform with name: ");
            }
            throw b.a(s);
        } else
        {
            return integer;
        }
    }

    public final void a()
    {
        cil acil[];
        int i;
        if (c == null)
        {
            throw c.a("ShaderInstance released twice");
        }
        acil = c.a;
        i = 0;
_L2:
        if (i >= acil.length)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        int j = b.j(acil[i].c);
        obj = b[i];
        switch (j)
        {
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break;
        }
        break MISSING_BLOCK_LABEL_138;
_L3:
        b[i] = null;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        cif cif1 = a;
        float af[] = (float[])obj;
        synchronized (cif1.b)
        {
            ((ddx)cif1.b.get(af.length)).a(af);
        }
          goto _L3
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        cif cif2 = a;
        int ai[] = (int[])obj;
        synchronized (cif2.c)
        {
            ((ddx)cif2.c.get(ai.length)).a(ai);
        }
          goto _L3
        exception1;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception1;
        c = null;
        cif cif3 = a;
        synchronized (cif3.a)
        {
            cif3.a.a(this);
        }
        return;
        exception2;
        ddx1;
        JVM INSTR monitorexit ;
        throw exception2;
    }

    public void a(int i, int j, int k)
    {
        Object obj = c.a[i];
        if (b[i] != null)
        {
            obj = ((cil) (obj)).a;
            throw b.a((new StringBuilder(String.valueOf(obj).length() + 24)).append("Uniform '").append(((String) (obj))).append("' already added").toString());
        } else
        {
            b.a(((cil) (obj)).a, j, k, ((cil) (obj)).c, ((cil) (obj)).d);
            return;
        }
    }

    public final cie b(String s, cin cin)
    {
        b();
        s = a(s, true);
        if (s != null)
        {
            a(s.intValue(), 0, 1);
            b[s.intValue()] = cin;
        }
        return this;
    }

    public void b()
    {
        c.a(c, "Attempting to use a ShaderProgram after it has been released", null);
    }

    protected final void finalize()
    {
        if (c != null)
        {
            throw new RuntimeException("ShaderInstance was not released before being finalized");
        } else
        {
            super.finalize();
            return;
        }
    }

}

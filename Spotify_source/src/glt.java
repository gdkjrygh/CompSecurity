// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;

public final class glt
{

    public cvq a;
    private HashMap b;

    public glt(File file)
    {
        a = cvq.a(file, 2, 0x2faf080L);
        b = new HashMap();
    }

    private static String e(bde bde1)
    {
        return hda.a((new StringBuilder()).append(bde1.a).append(bde1.e).toString());
    }

    public final OutputStream a(bde bde1, long l)
    {
        this;
        JVM INSTR monitorenter ;
        bde1 = e(bde1);
        if (b.containsKey(bde1))
        {
            throw new IllegalStateException("Cache already started for this segment");
        }
        break MISSING_BLOCK_LABEL_33;
        bde1;
        this;
        JVM INSTR monitorexit ;
        throw bde1;
        cvr cvr1 = a.b(bde1);
        OutputStreamWriter outputstreamwriter = new OutputStreamWriter(cvr1.a(1), cvw.b);
        outputstreamwriter.write(String.valueOf(l));
        cvw.a(outputstreamwriter);
        b.put(bde1, cvr1);
        bde1 = cvr1.a(0);
        this;
        JVM INSTR monitorexit ;
        return bde1;
        bde1;
        outputstreamwriter = null;
_L2:
        cvw.a(outputstreamwriter);
        throw bde1;
        bde1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final boolean a(bde bde1)
    {
        Object obj;
        obj = e(bde1);
        bde1 = null;
        boolean flag;
        try
        {
            obj = a.a(((String) (obj)));
        }
        catch (IOException ioexception)
        {
            if (bde1 != null)
            {
                bde1.close();
            }
            return false;
        }
        finally
        {
            ioexception = null;
        }
        bde1 = ((bde) (obj));
        if (bde1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (bde1 != null)
        {
            bde1.close();
        }
        return flag;
        if (ioexception != null)
        {
            ioexception.close();
        }
        throw bde1;
    }

    public final void b(bde bde1)
    {
        this;
        JVM INSTR monitorenter ;
        bde1 = e(bde1);
        bde1 = (cvr)b.remove(bde1);
        if (bde1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        bde1.a();
        this;
        JVM INSTR monitorexit ;
        return;
        bde1;
        throw bde1;
    }

    public final void c(bde bde1)
    {
        this;
        JVM INSTR monitorenter ;
        bde1 = e(bde1);
        bde1 = (cvr)b.remove(bde1);
        if (bde1 != null)
        {
            try
            {
                bde1.b();
            }
            // Misplaced declaration of an exception variable
            catch (bde bde1) { }
            finally
            {
                this;
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        throw bde1;
    }

    public final cvu d(bde bde1)
    {
        this;
        JVM INSTR monitorenter ;
        bde1 = a.a(e(bde1));
        this;
        JVM INSTR monitorexit ;
        return bde1;
        bde1;
        throw bde1;
    }
}

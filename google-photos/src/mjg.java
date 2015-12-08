// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;

class mjg
    implements ann
{

    final mjd a;
    final mjc b;
    final ata c;
    ano d;

    public mjg(mjd mjd1, mjc mjc1, ata ata1)
    {
        a = mjd1;
        b = mjc1;
        c = ata1;
    }

    public void a()
    {
    }

    public void a(amb amb, ano ano1)
    {
        mjd mjd1;
        d = ano1;
        mjd1 = a;
        ata ata1 = c;
        mjd1;
        JVM INSTR monitorenter ;
        ano1 = (mje)mjd1.c.get(ata1);
        if (ano1 != null) goto _L2; else goto _L1
_L1:
        boolean flag = true;
        ano1 = mjd1.b.a(ata1);
        mjd1.c.put(ata1, ano1);
_L4:
        synchronized (((mje) (ano1)).f)
        {
            ((mje) (ano1)).a.add(this);
        }
        mjd1;
        JVM INSTR monitorexit ;
        if (flag)
        {
            if (Log.isLoggable("ChromiumSerializer", 2))
            {
                obj = String.valueOf("Fetching image url using cronet url: ");
                String s = String.valueOf(ata1);
                (new StringBuilder(String.valueOf(obj).length() + 0 + String.valueOf(s).length())).append(((String) (obj))).append(s);
            }
            mje.a(ano1, mjd1.e.a(mjd1.d, ata1.a(), ((Integer)mjd.a.get(amb)).intValue(), ata1.b(), ano1));
            mje.a(ano1).g();
            if (mje.b(ano1))
            {
                mje.a(ano1).h();
            }
        }
        return;
        amb;
        obj;
        JVM INSTR monitorexit ;
        throw amb;
        amb;
        mjd1;
        JVM INSTR monitorexit ;
        throw amb;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(Exception exception)
    {
        d.a(exception);
    }

    public void a(ByteBuffer bytebuffer)
    {
        d.a(b.a(bytebuffer));
    }

    public void b()
    {
        mjd1 = a;
        Object obj = c;
        mjd1;
        JVM INSTR monitorenter ;
        obj = (mje)mjd1.c.get(obj);
        mjd1;
        JVM INSTR monitorexit ;
        if (obj != null)
        {
            synchronized (((mje) (obj)).f)
            {
                ((mje) (obj)).a.remove(this);
                if (((mje) (obj)).a.isEmpty())
                {
                    obj.e = true;
                    ((mje) (obj)).f.c.remove(((mje) (obj)).b);
                }
            }
            if (((mje) (obj)).e && ((mje) (obj)).d != null)
            {
                ((mje) (obj)).d.h();
            }
        }
        return;
        Exception exception;
        exception;
        mjd1;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        mjd1;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public amz c()
    {
        return amz.b;
    }

    public Class d()
    {
        return b.b();
    }
}

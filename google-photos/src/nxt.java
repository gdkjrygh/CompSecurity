// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.util.List;

public final class nxt
    implements nxv
{

    private final Context a;
    private nya b[];

    public nxt(Context context)
    {
        a = context;
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        List list = olm.c(a, nya);
        b = (nya[])list.toArray(new nya[list.size()]);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(nxx nxx1)
    {
        if (b == null)
        {
            a();
        }
        nya anya[] = b;
        int k = anya.length;
        for (int i = 0; i < k; i++)
        {
            nxx1 = anya[i].a(nxx1.g, nxx1);
        }

        nxx1.k = nxx1.h.f;
        if (Log.isLoggable("HttpOperation", 3))
        {
            Object obj = String.valueOf(nxx1.g());
            Object obj1;
            String as[];
            nxz nxz1;
            int j;
            if (((String) (obj)).length() != 0)
            {
                "Starting op: ".concat(((String) (obj)));
            } else
            {
                new String("Starting op: ");
            }
        }
        if (nxx1.h.e)
        {
            nxx1.o = 2;
        }
        nxx1.e();
        if (nxx1.k != null)
        {
            obj = nxx1.k;
            obj1 = nxx1.f();
            as = nxx1.h();
            obj.b = (nxz)((nxy) (obj)).a.get(obj1);
            if (((nxy) (obj)).b == null)
            {
                obj.b = new nxz();
                ((nxy) (obj)).b.a = ((String) (obj1));
                ((nxy) (obj)).b.j = as;
                ((nxy) (obj)).a.put(obj1, ((nxy) (obj)).b);
            }
            obj.c = System.currentTimeMillis();
            obj.e = 0L;
        }
        nxx1.m();
        nxx1.n();
        if (nxx1.k != null)
        {
            obj = nxx1.k;
            obj1 = nxx1.p;
            nxz1 = ((nxy) (obj)).b;
            nxz1.e = nxz1.e + ((nyc) (obj1)).b;
            nxz1 = ((nxy) (obj)).b;
            nxz1.f = nxz1.f + ((nyc) (obj1)).a;
            nxz1 = ((nxy) (obj)).b;
            nxz1.d = nxz1.d + (long)((nyc) (obj1)).c;
            ((nxy) (obj)).b.i = ((nyc) (obj1)).d;
            ((nxy) (obj)).b.g = ((nyc) (obj1)).e;
            ((nxy) (obj)).b.h.a(((nyc) (obj1)).f);
            nxx1.p.a();
            obj = nxx1.k;
            if (((nxy) (obj)).e != 0L)
            {
                obj1 = ((nxy) (obj)).b;
                obj1.c = ((nxz) (obj1)).c + (System.currentTimeMillis() - ((nxy) (obj)).e);
                obj.e = 0L;
            }
            obj.f = System.currentTimeMillis();
            obj1 = ((nxy) (obj)).b;
            obj1.b = ((nxz) (obj1)).b + (System.currentTimeMillis() - ((nxy) (obj)).c);
            nxx1.p();
            if (nxx1.h.f == null)
            {
                nxx1.k.a("HttpOperation", "");
            }
        }
        if (nxx1.l() && Log.isLoggable("HttpOperation", 4))
        {
            obj = String.valueOf(nxx1.f());
            j = nxx1.l;
            nxx1 = String.valueOf(nxx1.n);
            (new StringBuilder(String.valueOf(obj).length() + 36 + String.valueOf(nxx1).length())).append("[").append(((String) (obj))).append("] failed due to error: ").append(j).append(" ").append(nxx1);
        }
    }
}

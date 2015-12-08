// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.LruCache;

public final class clu
    implements cmf
{

    private static LruCache f = new clv(1000);
    private static LruCache g = new clw(36000);
    private final Uri a;
    private final bjp b;
    private cmb c;
    private boolean d;
    private byte e[];

    public clu(Uri uri, bjp bjp1)
    {
        a = uri;
        b = bjp1;
    }

    private cwb f()
    {
        this;
        JVM INSTR monitorenter ;
        cwb cwb1 = b.a(a);
        this;
        JVM INSTR monitorexit ;
        return cwb1;
        Exception exception;
        exception;
        throw exception;
    }

    private void g()
    {
        if (!d)
        {
            d = true;
            cwb cwb1 = f();
            if (cwb1 != null)
            {
                e = cwb1.h;
            }
        }
    }

    public final void a(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        f.remove(uri);
        g.remove(uri);
        this;
        JVM INSTR monitorexit ;
        return;
        uri;
        throw uri;
    }

    public final boolean a()
    {
        g();
        return e != null;
    }

    public final byte[] b()
    {
        g();
        return e;
    }

    public final cmb c()
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        if (c != null) goto _L2; else goto _L1
_L1:
        cwb cwb1 = f();
        if (cwb1 != null) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return ((cmb) (obj));
_L4:
        long l;
        long l1;
        long l2;
        l = cmb.a(cwb1);
        l1 = cwb1.b;
        l2 = cwb1.g;
        if (cwb1.e != null) goto _L6; else goto _L5
_L5:
        obj = null;
_L7:
        c = new cmb(l, l1, l2, ((cea) (obj)), cwb1.f);
_L2:
        obj = c;
        continue; /* Loop/switch isn't completed */
_L6:
        obj = cwb1.e;
        byte abyte0[] = ((cvv) (obj)).b;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inScaled = false;
        obj = new cea(BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options), ((cvv) (obj)).a);
          goto _L7
        Exception exception;
        exception;
        throw exception;
        if (true) goto _L3; else goto _L8
_L8:
    }

    public final cmi d()
    {
        this;
        JVM INSTR monitorenter ;
        cmi cmi1 = (cmi)g.get(a);
        Object obj = cmi1;
        if (cmi1 != null) goto _L2; else goto _L1
_L1:
        obj = f();
        if (obj != null) goto _L4; else goto _L3
_L3:
        obj = null;
_L2:
        this;
        JVM INSTR monitorexit ;
        return ((cmi) (obj));
_L4:
        obj = new cmi(((cwb) (obj)));
        g.put(a, obj);
        if (true) goto _L2; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public final cmd e()
    {
        this;
        JVM INSTR monitorenter ;
        cmd cmd1 = (cmd)f.get(a);
        Object obj = cmd1;
        if (cmd1 != null) goto _L2; else goto _L1
_L1:
        obj = f();
        if (obj != null) goto _L4; else goto _L3
_L3:
        obj = null;
_L2:
        this;
        JVM INSTR monitorexit ;
        return ((cmd) (obj));
_L4:
        obj = new cmd(((cwb) (obj)));
        f.put(a, obj);
        if (true) goto _L2; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

}

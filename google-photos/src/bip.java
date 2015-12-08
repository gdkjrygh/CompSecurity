// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.NotificationManager;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;
import java.util.concurrent.ExecutionException;

final class bip extends Binder
    implements bis
{

    private final Object a = new Object();
    private final bjw b;
    private final bio c;
    private final bio d = new bit();
    private final ajr e;
    private final noj f;
    private bin g;

    public bip(bin bin1, bld bld, bmm bmm, buf buf, bkq bkq, NotificationManager notificationmanager, bjn abjn[], 
            bjn abjn1[], bjx abjx[], bjx abjx1[], cko cko, noj noj1)
    {
        g = bin1;
        super();
        ajs ajs1 = new ajs();
        ajs1.a = false;
        ajs1.b = false;
        e = new ajr(g, ajs1);
        b = new bkl(bin1, bld, bmm, buf, e, abjn, abjx, abjn1, abjx1, bkq, cko);
        c = new biu(notificationmanager);
        f = (noj)b.a(noj1, "movieMakerProvider", null);
    }

    static bjw a(bip bip1)
    {
        return bip1.b;
    }

    static ajr b(bip bip1)
    {
        return bip1.e;
    }

    private bio b()
    {
        bqz bqz1 = bin.a(g);
        if (bqz1.a.getBoolean(bqz1.c, false))
        {
            return c;
        } else
        {
            return d;
        }
    }

    public final cmf a(Uri uri, bim bim, biv biv)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        bio bio1 = b();
        boolean flag2;
        bio1.a(g, uri, bim);
        biv = new bir(this, uri, biv);
        b.a(f.a(uri), bim, biv);
        biv.c();
        flag2 = biv.b();
        boolean flag3 = flag2;
        biv = biv.a();
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        bio1.b(g, uri, bim);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return biv;
        bio1.d(g, uri, bim);
          goto _L1
        uri;
        obj;
        JVM INSTR monitorexit ;
        throw uri;
        biv;
        flag2 = false;
_L8:
        flag = true;
        flag3 = flag2;
        throw biv;
        biv;
_L6:
        if (!flag3) goto _L3; else goto _L2
_L2:
        bio1.b(g, uri, bim);
_L4:
        throw biv;
_L3:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        bio1.c(g, uri, bim);
          goto _L4
        bio1.d(g, uri, bim);
          goto _L4
        biv;
        flag3 = false;
        flag = flag1;
        if (true) goto _L6; else goto _L5
_L5:
        biv;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final cmf a(Uri uri, cmf cmf, bim bim, biv biv)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        bio bio1 = b();
        boolean flag2;
        bio1.a(g, uri, bim);
        biv = new bir(this, uri, biv);
        b.a(f.a(uri), bim, cmf, biv);
        biv.c();
        flag2 = biv.b();
        boolean flag3 = flag2;
        cmf = biv.a();
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        bio1.b(g, uri, bim);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return cmf;
        bio1.d(g, uri, bim);
          goto _L1
        uri;
        obj;
        JVM INSTR monitorexit ;
        throw uri;
        cmf;
        flag2 = false;
_L8:
        flag = true;
        flag3 = flag2;
        throw cmf;
        cmf;
_L6:
        if (!flag3) goto _L3; else goto _L2
_L2:
        bio1.b(g, uri, bim);
_L4:
        throw cmf;
_L3:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        bio1.c(g, uri, bim);
          goto _L4
        bio1.d(g, uri, bim);
          goto _L4
        cmf;
        flag3 = false;
        flag = flag1;
        if (true) goto _L6; else goto _L5
_L5:
        cmf;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a()
    {
        b.a();
    }
}

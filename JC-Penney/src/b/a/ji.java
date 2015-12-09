// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.Adler32;

// Referenced classes of package b.a:
//            jr, kc, kf, ko, 
//            kq, kj, jp, kb, 
//            ja, kk, oo, op, 
//            nv, ob, oa, jw, 
//            pd, oz, ga, nr

public final class ji
{

    ga a;
    final kc b;
    final kc c;
    final kc d;
    final kc e;
    final ko f = new ko(this);
    final kq g = new kq(this);
    final kj h = new kj(this);
    final jp i = new jp(this);
    final kb j = new kb(this);
    public final ja k = new ja(this);
    final kc l;
    final kc m;
    private final jr n = new jr(this);
    private final kk o[];
    private int p;
    private int q;

    public ji(ga ga)
    {
        a = ga;
        c = new kc(null, this, 4, kf.a);
        b = new kc("word_data", this, 4, kf.b);
        e = new kc("string_data", this, 1, kf.c);
        l = new kc(null, this, 1, kf.a);
        m = new kc("byte_data", this, 1, kf.b);
        d = new kc("map", this, 4, kf.a);
        o = (new kk[] {
            n, f, g, h, i, j, k, b, c, e, 
            m, l, d
        });
        p = -1;
        q = 79;
    }

    final int a()
    {
        if (p < 0)
        {
            throw new RuntimeException("file size not yet known");
        } else
        {
            return p;
        }
    }

    final void a(nr nr)
    {
        if (nr instanceof oo)
        {
            f.a((oo)nr);
        } else
        {
            if (nr instanceof op)
            {
                g.a((op)nr);
                return;
            }
            if (nr instanceof nv)
            {
                j.a((nv)nr);
                return;
            }
            if (nr instanceof ob)
            {
                i.a((ob)nr);
                return;
            }
            if (nr instanceof oa)
            {
                i.a(((oa)nr).f());
                return;
            }
            if (nr == null)
            {
                throw new NullPointerException("cst == null");
            }
        }
    }

    public final oz b()
    {
        Object obj;
        oz oz1;
        int i1;
        int j2;
        boolean flag = false;
        k.f();
        l.f();
        b.f();
        m.f();
        j.f();
        i.f();
        h.f();
        c.f();
        g.f();
        f.f();
        e.f();
        n.f();
        j2 = o.length;
        i1 = 0;
        int l1 = 0;
        while (i1 < j2) 
        {
            kk kk1 = o[i1];
            if (l1 < 0)
            {
                throw new IllegalArgumentException("fileOffset < 0");
            }
            if (kk1.c >= 0)
            {
                throw new RuntimeException("fileOffset already set");
            }
            int k2 = kk1.b - 1;
            k2 = ~k2 & l1 + k2;
            kk1.c = k2;
            if (k2 < l1)
            {
                throw new RuntimeException((new StringBuilder("bogus placement for section ")).append(i1).toString());
            }
            try
            {
                if (kk1 == d)
                {
                    jw.a(o, d);
                    d.f();
                }
                if (kk1 instanceof kc)
                {
                    ((kc)kk1).d();
                }
                l1 = kk1.j_();
            }
            catch (RuntimeException runtimeexception)
            {
                throw pd.a(runtimeexception, (new StringBuilder("...while writing section ")).append(i1).toString());
            }
            i1++;
            l1 = k2 + l1;
        }
        p = l1;
        obj = new byte[p];
        oz1 = new oz(((byte []) (obj)));
        i1 = ((flag) ? 1 : 0);
_L2:
        if (i1 >= j2)
        {
            break; /* Loop/switch isn't completed */
        }
        kk kk2;
        int i2;
        kk2 = o[i1];
        i2 = kk2.e() - oz1.b;
        if (i2 < 0)
        {
            try
            {
                throw new pd((new StringBuilder("excess write of ")).append(-i2).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            if (obj instanceof pd)
            {
                obj = (pd)obj;
            } else
            {
                obj = new pd(((Throwable) (obj)));
            }
            ((pd) (obj)).a((new StringBuilder("...while writing section ")).append(i1).toString());
            throw obj;
        }
        oz1.g(kk2.e() - oz1.b);
        kk2.c(oz1);
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (oz1.b != p)
        {
            throw new RuntimeException("foreshortened write");
        }
        MessageDigest messagedigest;
        int j1;
        try
        {
            messagedigest = MessageDigest.getInstance("SHA-1");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        messagedigest.update(((byte []) (obj)), 32, obj.length - 32);
        try
        {
            j1 = messagedigest.digest(((byte []) (obj)), 12, 20);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        if (j1 == 20)
        {
            break MISSING_BLOCK_LABEL_556;
        }
        throw new RuntimeException((new StringBuilder("unexpected digest write: ")).append(j1).append(" bytes").toString());
        Adler32 adler32 = new Adler32();
        adler32.update(((byte []) (obj)), 12, obj.length - 12);
        int k1 = (int)adler32.getValue();
        obj[8] = (byte)k1;
        obj[9] = (byte)(k1 >> 8);
        obj[10] = (byte)(k1 >> 16);
        obj[11] = (byte)(k1 >> 24);
        return oz1;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            jt, jv, ji, kc, 
//            kk, ga, ow, oo, 
//            pf, ko, kq, kj, 
//            jp, kb, ja

public final class jq extends jt
{

    public jq()
    {
    }

    public final jv a()
    {
        return jv.a;
    }

    public final void a(ji ji1)
    {
    }

    public final void a(ji ji1, ow ow1)
    {
        int j = ji1.d.e();
        Object obj = ji1.b;
        kc kc1 = ji1.d;
        int k = ((kk) (obj)).e();
        int l = (kc1.e() + kc1.j_()) - k;
        if (ji1.a.a >= 14)
        {
            obj = "036";
        } else
        {
            obj = "035";
        }
        obj = (new StringBuilder("dex\n")).append(((String) (obj))).append("\0").toString();
        if (ow1.a())
        {
            ow1.a(8, (new StringBuilder("magic: ")).append((new oo(((String) (obj)))).f()).toString());
            ow1.a(4, "checksum");
            ow1.a(20, "signature");
            ow1.a(4, (new StringBuilder("file_size:       ")).append(pf.a(ji1.a())).toString());
            ow1.a(4, (new StringBuilder("header_size:     ")).append(pf.a(112)).toString());
            ow1.a(4, (new StringBuilder("endian_tag:      ")).append(pf.a(0x12345678)).toString());
            ow1.a(4, "link_size:       0");
            ow1.a(4, "link_off:        0");
            ow1.a(4, (new StringBuilder("map_off:         ")).append(pf.a(j)).toString());
        }
        for (int i = 0; i < 8; i++)
        {
            ow1.b(((String) (obj)).charAt(i));
        }

        ow1.g(24);
        ow1.d(ji1.a());
        ow1.d(112);
        ow1.d(0x12345678);
        ow1.g(8);
        ow1.d(j);
        ji1.f.b(ow1);
        ji1.g.b(ow1);
        ji1.h.b(ow1);
        ji1.i.a(ow1);
        ji1.j.a(ow1);
        ji1.k.a(ow1);
        if (ow1.a())
        {
            ow1.a(4, (new StringBuilder("data_size:       ")).append(pf.a(l)).toString());
            ow1.a(4, (new StringBuilder("data_off:        ")).append(pf.a(k)).toString());
        }
        ow1.d(l);
        ow1.d(k);
    }

    public final int i_()
    {
        return 112;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.net.Uri;

public final class eui
    implements nlv
{

    private static final ive d = new ive();
    public ContentValues a;
    public ContentValues b;
    public ContentValues c;
    private ContentValues e;

    public eui()
    {
        a = new ContentValues();
        c = new ContentValues();
        b = new ContentValues();
        e = new ContentValues();
    }

    static eui a(qgg qgg1, String s, byte abyte0[])
    {
        int k;
        boolean flag1;
        boolean flag = false;
        eui eui1 = new eui();
        qeq qeq1 = qgg1.c;
        long l1 = qeq1.f.longValue();
        euv euv1 = b.a(qgg1);
        fzw fzw1 = b.d(qgg1);
        String s1 = qgg1.b.a;
        eui1.b(l1);
        if (qgg1.c.g != null)
        {
            l1 = qgg1.c.g.longValue();
        } else
        {
            l1 = 0L;
        }
        eui1.a(l1);
        eui1.a(s);
        eui1.a(euv1.g);
        if (euv1 == euv.d)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        eui1.a(flag1);
        if (qeq1.k != null && qeq1.k.a != null)
        {
            double d1;
            String s2;
            if (qeq1.k.a.length != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            eui1.a.put("is_hidden", Boolean.valueOf(flag1));
            eui1.c.put("is_hidden", Boolean.valueOf(flag1));
        }
        if (qeq1.a != null && qeq1.a.length > 0)
        {
            s = qeq1.a[0];
        } else
        {
            s = null;
        }
        if (s != null)
        {
            s2 = ((qcm) (s)).a;
            eui1.c.put("collection_id", s2);
            s = ((qcm) (s)).b;
            eui1.c.put("position", s);
        }
        p.a(s1);
        eui1.c.put("media_key", s1);
        s = qgg1.b.b.b;
        p.a(s);
        eui1.c.put("photo_id", s);
        s = b.a(euv1, qgg1);
        p.a(s);
        eui1.c.put("remote_url", s);
        eui1.f(qeq1.h.longValue());
        qlw.a(qgg1, abyte0, 0, abyte0.length);
        eui1.c.put("protobuf", abyte0);
        eui1.g(qeq1.c);
        if (qgg1.e != null)
        {
            eui1.a(qgg1.e.a);
            int l;
            if (qgg1.e.a == 8 && qgg1.e.b != null && qgg1.e.b.c != null && qgg1.e.b.c.a != null)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            s = eui1.a;
            if (k != 0)
            {
                l = 1;
            } else
            {
                l = 0;
            }
            s.put("has_storyboard", Integer.valueOf(l));
            s = eui1.c;
            if (k != 0)
            {
                l = 1;
            } else
            {
                l = 0;
            }
            s.put("has_storyboard", Integer.valueOf(l));
            if (k != 0)
            {
                eui1.g(qgg1.e.b.c.a.f);
            }
        }
        s = qeq1.i;
        if (s != null)
        {
            abyte0 = ((qbg) (s)).a;
            eui1.c.put("cluster_id", abyte0);
            d1 = ((qbg) (s)).b.floatValue();
            eui1.c.put("cluster_score", Double.valueOf(d1));
        }
        eui1.h(qeq1.d);
        eui1.c(fzw1.a);
        eui1.d(fzw1.b);
        if (fzw1.d != null && fzw1.e != null)
        {
            eui1.a(Integer.valueOf(fzw1.d.intValue()));
            eui1.b(Integer.valueOf(fzw1.e.intValue()));
        }
        s = fzw1.m;
        eui1.c.put("iso", s);
        eui1.b.put("iso", s);
        s = fzw1.n;
        eui1.c.put("camera_make", s);
        eui1.b.put("camera_make", s);
        s = fzw1.o;
        eui1.c.put("camera_model", s);
        eui1.b.put("camera_model", s);
        if (fzw1.j != null)
        {
            s = Integer.valueOf(fzw1.j.intValue());
            eui1.c.put("focal_length", s);
            eui1.b.put("focal_length", s);
        }
        s = fzw1.k;
        eui1.c.put("f_stop", s);
        eui1.b.put("f_stop", s);
        eui1.b(fzw1.q);
        if (euv1 != euv.b && euv1 != euv.e && euv1 != euv.d) goto _L2; else goto _L1
_L1:
        s = qgg1.d.b.a;
        if (s != null && ((qdz) (s)).e != null) goto _L4; else goto _L3
_L3:
        flag1 = false;
_L7:
        eui1.c.put("is_edited", Boolean.valueOf(flag1));
        qgg1 = qgg1.d.b.a;
        int i1;
        if (((qdz) (qgg1)).d == null)
        {
            qgg1 = null;
        } else
        {
            qgg1 = ((qdz) (qgg1)).d.d;
        }
        if (qgg1 != null)
        {
            qgg1 = ((qgd) (qgg1)).c;
            eui1.c.put("lens", qgg1);
            eui1.b.put("lens", qgg1);
        }
_L2:
        if (qeq1.j != null && qeq1.j.a == 2)
        {
            eui1.a(eun.b);
        }
        if (qeq1.m != null && qeq1.m.a != null)
        {
            flag1 = qeq1.m.a.booleanValue();
            eui1.c.put("is_shared", Boolean.valueOf(flag1));
        }
        if (qeq1.e == null) goto _L6; else goto _L5
_L5:
        qgg1 = qeq1.e;
        l = qgg1.length;
        k = ((flag) ? 1 : 0);
_L9:
        if (k < l)
        {
            if (((pzy) (qgg1[k])).a != 2)
            {
                break MISSING_BLOCK_LABEL_1183;
            }
            eui1.c.put("is_from_drive", Boolean.valueOf(true));
        }
_L6:
        return eui1;
_L4:
        s = ((qdz) (s)).e;
        i1 = s.length;
        k = 0;
_L8:
label0:
        {
            if (k >= i1)
            {
                break MISSING_BLOCK_LABEL_1166;
            }
            abyte0 = s[k];
            if (abyte0 == null || ((qea) (abyte0)).a != 1)
            {
                break label0;
            }
            flag1 = true;
        }
          goto _L7
        k++;
          goto _L8
        flag1 = false;
          goto _L7
        k++;
          goto _L9
    }

    private eui b(Long long1)
    {
        b.put("duration", long1);
        c.put("duration", long1);
        return this;
    }

    private eui c(Double double1)
    {
        c.put("latitude", double1);
        b.put("latitude", double1);
        return this;
    }

    private eui d(Double double1)
    {
        c.put("longitude", double1);
        b.put("longitude", double1);
        return this;
    }

    private eui f(long l)
    {
        c.put("size_bytes", Long.valueOf(l));
        b.put("size_bytes", Long.valueOf(l));
        return this;
    }

    private eui f(String s)
    {
        p.a(s);
        b.put("content_uri", s);
        return this;
    }

    private eui g(String s)
    {
        c.put("caption", s);
        return this;
    }

    private eui h(String s)
    {
        c.put("filename", s);
        b.put("filename", s);
        return this;
    }

    private void i()
    {
        long l = j();
        a.put("capture_timestamp", Long.valueOf(l));
        c.put("capture_timestamp", Long.valueOf(l));
        b.put("capture_timestamp", Long.valueOf(l));
        e.put("capture_timestamp", Long.valueOf(l));
        l = d.b(j());
        a.put("month_random_timestamp", Long.valueOf(l));
    }

    private long j()
    {
        long l1 = 0L;
        long l;
        if (g() == null)
        {
            l = 0L;
        } else
        {
            l = g().longValue();
        }
        if (f() != null)
        {
            l1 = f().longValue();
        }
        return ivc.a(Long.valueOf(l).longValue(), Long.valueOf(l1).longValue());
    }

    public final eui a(int k)
    {
        b.put("composition_type", Integer.valueOf(k));
        c.put("composition_type", Integer.valueOf(k));
        return this;
    }

    public final eui a(long l)
    {
        c.put("timezone_offset", Long.valueOf(l));
        b.put("timezone_offset", Long.valueOf(l));
        a.put("timezone_offset", Long.valueOf(l));
        i();
        return this;
    }

    public final eui a(eun eun1)
    {
        p.a(eun1);
        c.put("state", Integer.valueOf(eun1.c));
        b.put("state", Integer.valueOf(eun1.c));
        return this;
    }

    public final eui a(Integer integer)
    {
        c.put("width", integer);
        b.put("width", integer);
        return this;
    }

    public final eui a(String s)
    {
        p.a(s);
        a.put("dedup_key", s);
        c.put("dedup_key", s);
        b.put("dedup_key", s);
        e.put("dedup_key", s);
        return this;
    }

    public final eui a(njx njx)
    {
        p.a(njx);
        njx = euv.a(njx);
        a.put("type", Integer.valueOf(((euv) (njx)).f));
        c.put("type", Integer.valueOf(((euv) (njx)).f));
        b.put("type", Integer.valueOf(((euv) (njx)).f));
        return this;
    }

    public final eui a(boolean flag)
    {
        c.put("photosphere", Boolean.valueOf(flag));
        b.put("photosphere", Boolean.valueOf(flag));
        return this;
    }

    public final String a()
    {
        return a.getAsString("dedup_key");
    }

    public final nlv a(Uri uri)
    {
        p.a(uri);
        return f(uri.toString());
    }

    public final nlv a(Double double1)
    {
        return d(double1);
    }

    public final nlv a(Long long1)
    {
        return b(long1);
    }

    public final int b()
    {
        return a.getAsInteger("type").intValue();
    }

    public final eui b(long l)
    {
        c.put("utc_timestamp", Long.valueOf(l));
        b.put("utc_timestamp", Long.valueOf(l));
        a.put("utc_timestamp", Long.valueOf(l));
        i();
        return this;
    }

    public final eui b(Integer integer)
    {
        c.put("height", integer);
        b.put("height", integer);
        return this;
    }

    public final nlv b(int k)
    {
        b.put("signature", Integer.valueOf(k));
        return this;
    }

    public final nlv b(Double double1)
    {
        return c(double1);
    }

    public final nlv b(String s)
    {
        return h(s);
    }

    public final nlv b(njx njx)
    {
        return a(njx);
    }

    public final String c()
    {
        return b.getAsString("content_uri");
    }

    public final nlv c(long l)
    {
        return a(0L);
    }

    public final nlv c(Integer integer)
    {
        return a(integer);
    }

    public final nlv c(String s)
    {
        b.put("filepath", s);
        return this;
    }

    public final String d()
    {
        return c.getAsString("media_key");
    }

    public final nlv d(long l)
    {
        return b(l);
    }

    public final nlv d(Integer integer)
    {
        return b(integer);
    }

    public final nlv d(String s)
    {
        return f(s);
    }

    public final String e()
    {
        return c.getAsString("collection_id");
    }

    public final nlv e(long l)
    {
        return f(l);
    }

    public final nlv e(String s)
    {
        b.put("bucket_id", s);
        return this;
    }

    public final Long f()
    {
        return c.getAsLong("timezone_offset");
    }

    public final Long g()
    {
        return c.getAsLong("utc_timestamp");
    }

    public final String h()
    {
        return b.getAsString("filepath");
    }

}

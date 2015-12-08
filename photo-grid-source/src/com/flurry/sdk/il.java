// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.CRC32;

// Referenced classes of package com.flurry.sdk:
//            jv, jo, lg, lh, 
//            kc, lp, im, ik, 
//            ji, kj, kt, jm, 
//            jl, jp, jc, hr, 
//            jk, ie

public class il
{

    private static final String b = com/flurry/sdk/il.getName();
    private static il c = null;
    private String a;
    private jv d;
    private List e;
    private boolean f;

    private il()
    {
    }

    public static il a()
    {
        com/flurry/sdk/il;
        JVM INSTR monitorenter ;
        il il2;
        if (c == null)
        {
            il il1 = new il();
            c = il1;
            il1.e();
        }
        il2 = c;
        com/flurry/sdk/il;
        JVM INSTR monitorexit ;
        return il2;
        Exception exception;
        exception;
        throw exception;
    }

    static List a(il il1)
    {
        return il1.e;
    }

    static jv b(il il1)
    {
        return il1.d;
    }

    static String d()
    {
        return b;
    }

    private void e()
    {
        d = new jv(jo.a().c().getFileStreamPath(f()), ".yflurrypulselogging.", 1, new _cls1());
        f = ((Boolean)lg.a().a("UseHttps")).booleanValue();
        kc.a(4, b, (new StringBuilder("initSettings, UseHttps = ")).append(f).toString());
        e = (List)d.a();
        if (e == null)
        {
            e = new ArrayList();
        }
    }

    private String f()
    {
        return (new StringBuilder(".yflurrypulselogging.")).append(Long.toString(lp.i(jo.a().d()), 16)).toString();
    }

    private String g()
    {
        if (a != null)
        {
            return a;
        }
        if (f)
        {
            return "https://data.flurry.com/pcr.do";
        } else
        {
            return "https://data.flurry.com/pcr.do";
        }
    }

    public void a(ik ik1)
    {
        this;
        JVM INSTR monitorenter ;
        ik1 = new im(ik1.h());
        e.add(ik1);
        kc.a(4, b, "Saving persistent Pulse logging data.");
        d.a(e);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        ik1;
        kc.a(6, b, "Error when generating pulse log report in addReport part");
        if (true) goto _L2; else goto _L1
_L1:
        ik1;
        throw ik1;
    }

    public void a(String s)
    {
        if (s != null && !s.endsWith(".do"))
        {
            kc.a(5, b, "overriding analytics agent report URL without an endpoint, are you sure?");
        }
        a = s;
    }

    public void a(byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        if (ji.a().c()) goto _L2; else goto _L1
_L1:
        kc.a(5, b, "Reports were not sent! No Internet connection!");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        if (abyte0.length != 0)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        kc.a(3, b, "No report need be sent");
          goto _L3
        abyte0;
        throw abyte0;
        String s = g();
        kc.a(4, b, (new StringBuilder("PulseLoggingManager: start upload data ")).append(abyte0).append(" to ").append(s).toString());
        kj kj1 = new kj();
        kj1.a(s);
        kj1.d(0x186a0);
        kj1.a(kl.a.c);
        kj1.b(true);
        kj1.a("Content-Type", "application/octet-stream");
        kj1.a(new kt());
        kj1.a(abyte0);
        kj1.a(new _cls2());
        jm.a().a(this, kj1);
          goto _L3
    }

    public byte[] b()
    {
        Object obj = null;
        Object obj1;
        Object obj2;
        obj2 = new ByteArrayOutputStream();
        obj1 = new DataOutputStream(((java.io.OutputStream) (obj2)));
        if (e != null && !e.isEmpty())
        {
            break MISSING_BLOCK_LABEL_49;
        }
        obj = ((ByteArrayOutputStream) (obj2)).toByteArray();
        lp.a(((java.io.Closeable) (obj1)));
        return ((byte []) (obj));
        Iterator iterator;
        ((DataOutputStream) (obj1)).writeShort(1);
        ((DataOutputStream) (obj1)).writeShort(1);
        ((DataOutputStream) (obj1)).writeLong(System.currentTimeMillis());
        ((DataOutputStream) (obj1)).writeUTF(jo.a().d());
        ((DataOutputStream) (obj1)).writeUTF(jl.a().e());
        ((DataOutputStream) (obj1)).writeShort(jp.a());
        ((DataOutputStream) (obj1)).writeShort(3);
        ((DataOutputStream) (obj1)).writeUTF(jl.a().d());
        ((DataOutputStream) (obj1)).writeBoolean(jc.a().e());
        obj = new ArrayList();
        iterator = jc.a().h().entrySet().iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        java.util.Map.Entry entry;
        hr hr2;
        entry = (java.util.Map.Entry)iterator.next();
        hr2 = new hr();
        hr2.a = ((jk)entry.getKey()).d;
        if (!((jk)entry.getKey()).e) goto _L4; else goto _L3
_L3:
        hr2.b = new String((byte[])entry.getValue());
_L6:
        ((List) (obj)).add(hr2);
          goto _L5
        obj2;
        obj = obj1;
        obj1 = obj2;
_L10:
        kc.a(6, b, "Error when generating report", ((Throwable) (obj1)));
        throw obj1;
        obj2;
        obj1 = obj;
        obj = obj2;
_L9:
        lp.a(((java.io.Closeable) (obj1)));
        throw obj;
_L4:
        hr2.b = lp.b((byte[])entry.getValue());
          goto _L6
_L2:
        ((DataOutputStream) (obj1)).writeShort(((List) (obj)).size());
        byte abyte0[];
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((DataOutputStream) (obj1)).write(abyte0))
        {
            hr hr1 = (hr)((Iterator) (obj)).next();
            ((DataOutputStream) (obj1)).writeShort(hr1.a);
            abyte0 = hr1.b.getBytes();
            ((DataOutputStream) (obj1)).writeShort(abyte0.length);
        }

        ((DataOutputStream) (obj1)).writeShort(6);
        ((DataOutputStream) (obj1)).writeShort(ie.b.a());
        ((DataOutputStream) (obj1)).writeUTF(Build.MODEL);
        ((DataOutputStream) (obj1)).writeShort(ie.c.a());
        ((DataOutputStream) (obj1)).writeUTF(Build.BOARD);
        ((DataOutputStream) (obj1)).writeShort(ie.d.a());
        ((DataOutputStream) (obj1)).writeUTF(Build.ID);
        ((DataOutputStream) (obj1)).writeShort(ie.e.a());
        ((DataOutputStream) (obj1)).writeUTF(Build.DEVICE);
        ((DataOutputStream) (obj1)).writeShort(ie.f.a());
        ((DataOutputStream) (obj1)).writeUTF(Build.PRODUCT);
        ((DataOutputStream) (obj1)).writeShort(ie.g.a());
        ((DataOutputStream) (obj1)).writeUTF(android.os.Build.VERSION.RELEASE);
        ((DataOutputStream) (obj1)).writeShort(e.size());
        int i = 0;
_L8:
        if (i >= e.size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((DataOutputStream) (obj1)).write(((im)e.get(i)).a());
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        obj = ((ByteArrayOutputStream) (obj2)).toByteArray();
        CRC32 crc32 = new CRC32();
        crc32.update(((byte []) (obj)));
        ((DataOutputStream) (obj1)).writeInt((int)crc32.getValue());
        obj = ((ByteArrayOutputStream) (obj2)).toByteArray();
        lp.a(((java.io.Closeable) (obj1)));
        return ((byte []) (obj));
        obj;
        obj1 = null;
          goto _L9
        obj1;
          goto _L10
        obj;
          goto _L9
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        a(b());
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        kc.a(6, b, "Report not send due to exception in generate data");
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }


    private class _cls1
        implements la
    {

        final il a;

        public kx a(int i)
        {
            return new kw(new im.a());
        }

        _cls1()
        {
            a = il.this;
            super();
        }
    }


    private class _cls2
        implements kj.a
    {

        final il a;

        public volatile void a(kj kj1, Object obj)
        {
            a(kj1, (Void)obj);
        }

        public void a(kj kj1, Void void1)
        {
            int i = kj1.h();
            if (i > 0)
            {
                if (i >= 200 && i < 300)
                {
                    kc.a(3, il.d(), (new StringBuilder("Pulse logging report sent successfully HTTP response:")).append(i).toString());
                    il.a(a).clear();
                    il.b(a).a(il.a(a));
                    return;
                } else
                {
                    kc.a(3, il.d(), (new StringBuilder("Pulse logging report sent unsuccessfully, HTTP response:")).append(i).toString());
                    return;
                }
            } else
            {
                kc.e(il.d(), (new StringBuilder("Server Error: ")).append(i).toString());
                return;
            }
        }

        _cls2()
        {
            a = il.this;
            super();
        }
    }

}

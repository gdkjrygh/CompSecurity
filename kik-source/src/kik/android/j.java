// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.kik.l.am;
import com.kik.m.e;
import java.io.File;
import java.security.MessageDigest;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import kik.a.c;
import kik.a.e.f;
import kik.a.e.i;
import kik.a.e.l;
import kik.a.e.o;
import kik.a.e.p;
import kik.a.e.q;
import kik.a.e.r;
import kik.a.e.t;
import kik.a.e.u;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.e.x;
import kik.a.e.y;
import kik.a.g.az;
import kik.android.a.b;
import kik.android.chat.KikApplication;
import kik.android.d.a;
import kik.android.d.d;
import kik.android.d.k;
import kik.android.util.DeviceUtils;
import kik.android.util.aq;
import kik.android.util.cr;

// Referenced classes of package kik.android:
//            a, i, k, l, 
//            m, n

public final class j extends c
    implements y
{

    private KikApplication a;
    private boolean b;
    private aq c;
    private String d;
    private q e;

    public j(KikApplication kikapplication, aq aq, String s, q q1)
    {
        a = kikapplication;
        b = DeviceUtils.d(kikapplication);
        c = aq;
        d = s;
        e = q1;
    }

    public final kik.a.e.b a(v v, f f1, w w)
    {
        kik.android.d.c c1 = kik.android.d.d.a(a);
        v = new kik.android.a(c1, v, f1, new kik.android.i(a), w, cr.a(a));
        f1 = a;
        w = new kik.android.k(this, v);
        aq aq = c;
        c1.a(new k(f1, "address-update-interval", Long.valueOf(0x5265c00L), new Long[] {
            Long.valueOf(0x5265c00L), Long.valueOf(0x36ee80L), Long.valueOf(60000L)
        }, w, aq));
        f1 = a;
        w = new kik.android.l(this, v);
        aq = c;
        c1.a(new k(f1, "address-full-update-interval", Long.valueOf(0x9a7ec800L), new Long[] {
            Long.valueOf(0x9a7ec800L), Long.valueOf(0x5265c00L), Long.valueOf(0x36ee80L), Long.valueOf(0x493e0L)
        }, w, aq));
        c1.a(new a(a, "matching-opt-in", false, new m(this, c1, v), c));
        return v;
    }

    public final kik.a.e.d a(f f1, v v, t t, w w)
    {
        return new com.kik.cards.web.auth.a(f1, v, t, w);
    }

    public final kik.a.e.e a(v v, f f1, kik.a.f.k k1, com.kik.g.e e1)
    {
        return new b(a, k1.i(), f1.b(), v, e1, b, c, e);
    }

    public final f a()
    {
        return new kik.android.net.communicator.a(a, DeviceUtils.b(a), this, c);
    }

    public final i a(f f1, r r, v v, o o, p p, w w, l l1, 
            ExecutorService executorservice)
    {
        return new kik.a.b.a.a(f1, v, o, p, r, w, l1, executorservice);
    }

    public final u a(f f1)
    {
        return new com.kik.android.stickers.c(a, f1);
    }

    public final v a(t t, ExecutorService executorservice, kik.a.f.k k1)
    {
        a a1 = new a(a, "sticker-store-on-dev", false, null, c);
        kik.android.d.d.a(a).a(a1);
        return new am(a, t, executorservice, k1, c, e, d);
    }

    public final w a(v v, f f1)
    {
        return new az(v, f1);
    }

    public final kik.a.e.k b()
    {
        return new n();
    }

    public final t c()
    {
        com.kik.m.b b1 = new com.kik.m.b();
        b1.a();
        return b1;
    }

    public final String d()
    {
        PackageInfo packageinfo;
        byte abyte0[];
        MessageDigest messagedigest;
        String s;
        Signature asignature[];
        int i1;
        int j1;
        try
        {
            messagedigest = MessageDigest.getInstance("SHA-1");
            packageinfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 64);
            s = ((Attributes)(new JarFile(packageinfo.applicationInfo.sourceDir)).getManifest().getEntries().get("classes.dex")).getValue("SHA1-Digest");
            messagedigest.update("hello".getBytes());
            asignature = packageinfo.signatures;
            j1 = asignature.length;
        }
        catch (Throwable throwable)
        {
            return "2jmj7l5rSw0yVb/vlWAYkK/YBwk=";
        }
        i1 = 0;
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        messagedigest.update(asignature[i1].toByteArray());
        i1++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_85;
_L1:
        messagedigest.update(packageinfo.versionName.getBytes());
        messagedigest.update(s.getBytes());
        if (Build.MODEL.equals("google_sdk") || Build.MODEL.equals("sdk"))
        {
            abyte0 = "foo".getBytes();
        } else
        {
            abyte0 = "bar".getBytes();
        }
        messagedigest.update(abyte0);
        return com.kik.m.e.a(messagedigest.digest());
    }

    public final kik.a.f.k e()
    {
        return (kik.a.f.k)kik.android.d.d.a(a).b().get(kik.android.d.d.a(a).a(c));
    }

    public final x f()
    {
        File file = e.a("xdata_cache");
        kik.android.util.d.a(new File(new File(a.getApplicationInfo().dataDir), "xdata_cache"), file);
        return new kik.a.j.a(file);
    }

    public final kik.a.e.c g()
    {
        return new kik.android.h.a(a, e);
    }
}

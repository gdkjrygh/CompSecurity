// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.flurry.sdk:
//            jy, jo, lp, kc, 
//            lo, jd, je, lm, 
//            jk, jx

public class jc
{

    private static final String a = com/flurry/sdk/jc.getSimpleName();
    private static jc b;
    private final Set c = v();
    private final Map d = new HashMap();
    private final jx e = new _cls1();
    private a f;
    private com.google.android.gms.ads.identifier.AdvertisingIdClient.Info g;
    private String h;
    private byte i[];

    private jc()
    {
        f = a.a;
        jy.a().a("com.flurry.android.sdk.FlurrySessionEvent", e);
        jo.a().b(new _cls2());
    }

    public static jc a()
    {
        com/flurry/sdk/jc;
        JVM INSTR monitorenter ;
        jc jc1;
        if (b == null)
        {
            b = new jc();
        }
        jc1 = b;
        com/flurry/sdk/jc;
        JVM INSTR monitorexit ;
        return jc1;
        Exception exception;
        exception;
        throw exception;
    }

    private String a(DataInput datainput)
    {
        if (1 != datainput.readInt())
        {
            return null;
        } else
        {
            return datainput.readUTF();
        }
    }

    static void a(jc jc1)
    {
        jc1.j();
    }

    private void a(String s1, DataOutput dataoutput)
    {
        dataoutput.writeInt(1);
        dataoutput.writeUTF(s1);
    }

    private void a(String s1, File file)
    {
        DataOutputStream dataoutputstream = new DataOutputStream(new FileOutputStream(file));
        file = dataoutputstream;
        a(s1, ((DataOutput) (dataoutputstream)));
        lp.a(dataoutputstream);
        return;
        Throwable throwable;
        throwable;
        s1 = null;
_L4:
        file = s1;
        kc.a(6, a, "Error when saving deviceId", throwable);
        lp.a(s1);
        return;
        s1;
        file = null;
_L2:
        lp.a(file);
        throw s1;
        s1;
        if (true) goto _L2; else goto _L1
_L1:
        throwable;
        s1 = dataoutputstream;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean a(String s1)
    {
        while (TextUtils.isEmpty(s1) || c(s1.toLowerCase(Locale.US))) 
        {
            return false;
        }
        return true;
    }

    private String b(DataInput datainput)
    {
        while (46586 != datainput.readUnsignedShort() || 2 != datainput.readUnsignedShort()) 
        {
            return null;
        }
        datainput.readUTF();
        return datainput.readUTF();
    }

    public static void b()
    {
        b = null;
    }

    static void b(jc jc1)
    {
        jc1.i();
    }

    private void b(String s1)
    {
        File file;
        if (!TextUtils.isEmpty(s1))
        {
            if (lo.a(file = jo.a().c().getFileStreamPath(u())))
            {
                a(s1, file);
                return;
            }
        }
    }

    private boolean c(String s1)
    {
        return c.contains(s1);
    }

    private void i()
    {
_L13:
        if (a.f.equals(f))
        {
            break; /* Loop/switch isn't completed */
        }
        _cls4.b[f.ordinal()];
        JVM INSTR tableswitch 1 5: default 60
    //                   1 146
    //                   2 156
    //                   3 166
    //                   4 176
    //                   5 186;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        _cls4.b[f.ordinal()];
        JVM INSTR tableswitch 2 5: default 233
    //                   2 100
    //                   3 196
    //                   4 203
    //                   5 210;
           goto _L7 _L8 _L9 _L10 _L11
_L7:
        if (false)
        {
        }
        continue; /* Loop/switch isn't completed */
_L8:
        Exception exception;
        j();
        continue; /* Loop/switch isn't completed */
_L2:
        f = a.b;
          goto _L1
_L3:
        f = a.c;
          goto _L1
_L4:
        f = a.d;
          goto _L1
_L5:
        f = a.e;
          goto _L1
_L6:
        f = a.f;
          goto _L1
_L9:
        try
        {
            k();
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            kc.a(4, a, (new StringBuilder("Exception during id fetch:")).append(f).append(", ").append(exception).toString());
        }
        continue; /* Loop/switch isn't completed */
_L10:
        l();
        continue; /* Loop/switch isn't completed */
_L11:
        x();
        if (true) goto _L13; else goto _L12
_L12:
        jd jd1 = new jd();
        jy.a().a(jd1);
        return;
    }

    private void j()
    {
        lp.b();
        if (m())
        {
            g = n();
            if (c())
            {
                x();
                je je1 = new je();
                jy.a().a(je1);
                return;
            }
        }
    }

    private void k()
    {
        lp.b();
        h = o();
    }

    private void l()
    {
        if (jo.a().c().checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") != 0)
        {
            return;
        } else
        {
            w();
            return;
        }
    }

    private boolean m()
    {
        int i1;
        try
        {
            i1 = GooglePlayServicesUtil.isGooglePlayServicesAvailable(jo.a().c());
        }
        catch (NoClassDefFoundError noclassdeffounderror)
        {
            kc.b(a, "There is a problem with the Google Play Services library, which is required for Android Advertising ID support. The Google Play Services library should be integrated in any app shipping in the Play Store that uses analytics or advertising.");
            return false;
        }
        catch (Exception exception)
        {
            kc.b(a, (new StringBuilder("GOOGLE PLAY SERVICES EXCEPTION: ")).append(exception.getMessage()).toString());
            kc.b(a, "There is a problem with the Google Play Services library, which is required for Android Advertising ID support. The Google Play Services library should be integrated in any app shipping in the Play Store that uses analytics or advertising.");
            return false;
        }
        if (i1 == 0)
        {
            return true;
        }
        kc.e(a, (new StringBuilder("Google Play Services not available - connection result: ")).append(i1).toString());
        return false;
    }

    private com.google.android.gms.ads.identifier.AdvertisingIdClient.Info n()
    {
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        try
        {
            info = AdvertisingIdClient.getAdvertisingIdInfo(jo.a().c());
        }
        catch (Exception exception)
        {
            kc.b(a, (new StringBuilder("GOOGLE PLAY SERVICES ERROR: ")).append(exception.getMessage()).toString());
            kc.b(a, "There is a problem with the Google Play Services library, which is required for Android Advertising ID support. The Google Play Services library should be integrated in any app shipping in the Play Store that uses analytics or advertising.");
            return null;
        }
        return info;
    }

    private String o()
    {
        String s1 = p();
        if (!TextUtils.isEmpty(s1))
        {
            return s1;
        } else
        {
            return q();
        }
    }

    private String p()
    {
        String s1 = android.provider.Settings.Secure.getString(jo.a().c().getContentResolver(), "android_id");
        if (!a(s1))
        {
            return null;
        } else
        {
            return (new StringBuilder("AND")).append(s1).toString();
        }
    }

    private String q()
    {
        String s2 = s();
        String s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            String s3 = t();
            s1 = s3;
            if (TextUtils.isEmpty(s3))
            {
                s1 = r();
            }
            b(s1);
        }
        return s1;
    }

    private String r()
    {
        long l1 = Double.doubleToLongBits(Math.random());
        long l2 = System.nanoTime();
        long l3 = lp.i(lm.c(jo.a().c()));
        return (new StringBuilder("ID")).append(Long.toString(l1 + (l2 + l3 * 37L) * 37L, 16)).toString();
    }

    private String s()
    {
        Object obj;
        obj = jo.a().c().getFileStreamPath(u());
        if (obj == null || !((File) (obj)).exists())
        {
            return null;
        }
        Object obj1 = new DataInputStream(new FileInputStream(((File) (obj))));
        obj = obj1;
        Object obj2 = a(((DataInput) (obj1)));
        lp.a(((java.io.Closeable) (obj1)));
        return ((String) (obj2));
        Object obj3;
        obj3;
        obj1 = null;
_L4:
        obj = obj1;
        kc.a(6, a, "Error when loading deviceId", ((Throwable) (obj3)));
        lp.a(((java.io.Closeable) (obj1)));
        return null;
        obj;
        obj3 = null;
        obj1 = obj;
_L2:
        lp.a(((java.io.Closeable) (obj3)));
        throw obj1;
        obj1;
        obj3 = obj;
        if (true) goto _L2; else goto _L1
_L1:
        obj3;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private String t()
    {
        Object obj = jo.a().c().getFilesDir();
        if (obj != null) goto _L2; else goto _L1
_L1:
        String as[];
        return null;
_L2:
        if ((as = ((File) (obj)).list(new _cls3())) == null || as.length == 0) goto _L1; else goto _L3
_L3:
        as = as[0];
        as = jo.a().c().getFileStreamPath(as);
        if (as == null || !as.exists()) goto _L1; else goto _L4
_L4:
        Object obj1 = new DataInputStream(new FileInputStream(as));
        as = ((String []) (obj1));
        Object obj2 = b(((DataInput) (obj1)));
        lp.a(((java.io.Closeable) (obj1)));
        return ((String) (obj2));
        Object obj3;
        obj3;
        obj1 = null;
_L8:
        as = ((String []) (obj1));
        kc.a(6, a, "Error when loading deviceId", ((Throwable) (obj3)));
        lp.a(((java.io.Closeable) (obj1)));
        return null;
        as;
        obj3 = null;
        obj1 = as;
_L6:
        lp.a(((java.io.Closeable) (obj3)));
        throw obj1;
        obj1;
        obj3 = as;
        if (true) goto _L6; else goto _L5
_L5:
        obj3;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private String u()
    {
        return ".flurryb.";
    }

    private Set v()
    {
        HashSet hashset = new HashSet();
        hashset.add("null");
        hashset.add("9774d56d682e549c");
        hashset.add("dead00beef");
        return Collections.unmodifiableSet(hashset);
    }

    private void w()
    {
        Object obj = (TelephonyManager)jo.a().c().getSystemService("phone");
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((obj = ((TelephonyManager) (obj)).getDeviceId()) == null || ((String) (obj)).trim().length() <= 0) goto _L1; else goto _L3
_L3:
        try
        {
            obj = lp.f(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            kc.a(6, a, "Exception in generateHashedImei()");
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (obj.length == 20)
        {
            i = ((byte []) (obj));
            return;
        }
        kc.a(6, a, (new StringBuilder("sha1 is not 20 bytes long: ")).append(Arrays.toString(((byte []) (obj)))).toString());
        return;
    }

    private void x()
    {
        String s1 = d();
        if (s1 != null)
        {
            kc.a(3, a, "Fetched advertising id");
            d.put(jk.c, lp.e(s1));
        }
        s1 = f();
        if (s1 != null)
        {
            kc.a(3, a, "Fetched device id");
            d.put(jk.a, lp.e(s1));
        }
        byte abyte0[] = g();
        if (abyte0 != null)
        {
            kc.a(3, a, "Fetched hashed IMEI");
            d.put(jk.b, abyte0);
        }
    }

    public boolean c()
    {
        return a.f.equals(f);
    }

    public String d()
    {
        if (g == null)
        {
            return null;
        } else
        {
            return g.getId();
        }
    }

    public boolean e()
    {
        while (g == null || !g.isLimitAdTrackingEnabled()) 
        {
            return true;
        }
        return false;
    }

    public String f()
    {
        return h;
    }

    public byte[] g()
    {
        return i;
    }

    public Map h()
    {
        return Collections.unmodifiableMap(d);
    }


    private class _cls1
        implements jx
    {

        final jc a;

        public volatile void a(jw jw)
        {
            a((lc)jw);
        }

        public void a(lc lc1)
        {
            _cls4.a[lc1.c.ordinal()];
            JVM INSTR tableswitch 1 1: default 28
        //                       1 29;
               goto _L1 _L2
_L1:
            return;
_L2:
            if (a.c())
            {
                class _cls1 extends lr
                {

                    final _cls1 a;

                    public void a()
                    {
                        jc.a(a.a);
                    }

                _cls1()
                {
                    a = _cls1.this;
                    super();
                }
                }

                jo.a().b(new _cls1());
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        _cls1()
        {
            a = jc.this;
            super();
        }
    }


    private class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        private static final a g[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/flurry/sdk/jc$a, s1);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        static 
        {
            a = new a("NONE", 0);
            b = new a("ADVERTISING", 1);
            c = new a("DEVICE", 2);
            d = new a("HASHED_IMEI", 3);
            e = new a("REPORTED_IDS", 4);
            f = new a("FINISHED", 5);
            g = (new a[] {
                a, b, c, d, e, f
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class _cls2 extends lr
    {

        final jc a;

        public void a()
        {
            jc.b(a);
        }

        _cls2()
        {
            a = jc.this;
            super();
        }
    }


    private class _cls4
    {

        static final int a[];
        static final int b[];

        static 
        {
            b = new int[a.values().length];
            try
            {
                b[a.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                b[a.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                b[a.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                b[a.d.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                b[a.e.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            a = new int[lc.a.values().length];
            try
            {
                a[lc.a.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls3
        implements FilenameFilter
    {

        final jc a;

        public boolean accept(File file, String s1)
        {
            return s1.startsWith(".flurryagent.");
        }

        _cls3()
        {
            a = jc.this;
            super();
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.e;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.flurry.sdk:
//            fp, hp, gd, ho, 
//            ff, fz, hm, fl, 
//            hq

public class fe
{
    static final class a extends Enum
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
            return (a)Enum.valueOf(com/flurry/sdk/fe$a, s1);
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


    private static final String a = com/flurry/sdk/fe.getSimpleName();
    private static fe b;
    private final Set c = v();
    private final Map d = new HashMap();
    private a e;
    private com.google.android.gms.ads.identifier.AdvertisingIdClient.Info f;
    private String g;
    private byte h[];

    private fe()
    {
        e = a.a;
        fp.a().b(new hq() {

            final fe a;

            public void safeRun()
            {
                fe.a(a);
            }

            
            {
                a = fe.this;
                super();
            }
        });
    }

    public static fe a()
    {
        com/flurry/sdk/fe;
        JVM INSTR monitorenter ;
        fe fe1;
        if (b == null)
        {
            b = new fe();
        }
        fe1 = b;
        com/flurry/sdk/fe;
        JVM INSTR monitorexit ;
        return fe1;
        Exception exception;
        exception;
        throw exception;
    }

    private String a(DataInput datainput)
        throws IOException
    {
        if (1 != datainput.readInt())
        {
            return null;
        } else
        {
            return datainput.readUTF();
        }
    }

    static void a(fe fe1)
    {
        fe1.i();
    }

    private void a(String s1, DataOutput dataoutput)
        throws IOException
    {
        dataoutput.writeInt(1);
        dataoutput.writeUTF(s1);
    }

    private void a(String s1, File file)
    {
        DataOutputStream dataoutputstream = new DataOutputStream(new FileOutputStream(file));
        file = dataoutputstream;
        a(s1, ((DataOutput) (dataoutputstream)));
        hp.a(dataoutputstream);
        return;
        Throwable throwable;
        throwable;
        s1 = null;
_L4:
        file = s1;
        gd.a(6, a, "Error when saving deviceId", throwable);
        hp.a(s1);
        return;
        s1;
        file = null;
_L2:
        hp.a(file);
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
        throws IOException
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

    private void b(String s1)
    {
        File file;
        if (!TextUtils.isEmpty(s1))
        {
            if (ho.a(file = fp.a().c().getFileStreamPath(u())))
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
        if (a.f.equals(e))
        {
            break; /* Loop/switch isn't completed */
        }
        static class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.flurry.sdk.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3.a[e.ordinal()];
        JVM INSTR tableswitch 1 5: default 60
    //                   1 149
    //                   2 159
    //                   3 169
    //                   4 179
    //                   5 189;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        _cls3.a[e.ordinal()];
        JVM INSTR tableswitch 2 5: default 236
    //                   2 100
    //                   3 199
    //                   4 206
    //                   5 213;
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
        e = a.b;
          goto _L1
_L3:
        e = a.c;
          goto _L1
_L4:
        e = a.d;
          goto _L1
_L5:
        e = com.flurry.sdk.a.e;
          goto _L1
_L6:
        e = a.f;
          goto _L1
_L9:
        try
        {
            k();
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            gd.a(4, a, (new StringBuilder()).append("Exception during id fetch:").append(e).append(", ").append(exception).toString());
        }
        continue; /* Loop/switch isn't completed */
_L10:
        l();
        continue; /* Loop/switch isn't completed */
_L11:
        x();
        if (true) goto _L13; else goto _L12
_L12:
        ff ff1 = new ff();
        fz.a().a(ff1);
        return;
    }

    private void j()
    {
        hp.b();
        if (!m())
        {
            return;
        } else
        {
            f = n();
            return;
        }
    }

    private void k()
    {
        hp.b();
        g = o();
    }

    private void l()
    {
        if (fp.a().c().checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") != 0)
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
            i1 = com.google.android.gms.common.e.a(fp.a().c());
        }
        catch (NoClassDefFoundError noclassdeffounderror)
        {
            gd.b(a, "There is a problem with the Google Play Services library, which is required for Android Advertising ID support. The Google Play Services library should be integrated in any app shipping in the Play Store that uses analytics or advertising.");
            return false;
        }
        catch (Exception exception)
        {
            gd.b(a, (new StringBuilder()).append("GOOGLE PLAY SERVICES EXCEPTION: ").append(exception.getMessage()).toString());
            gd.b(a, "There is a problem with the Google Play Services library, which is required for Android Advertising ID support. The Google Play Services library should be integrated in any app shipping in the Play Store that uses analytics or advertising.");
            return false;
        }
        if (i1 == 0)
        {
            return true;
        }
        com.flurry.sdk.gd.e(a, (new StringBuilder()).append("Google Play Services not available - connection result: ").append(i1).toString());
        return false;
    }

    private com.google.android.gms.ads.identifier.AdvertisingIdClient.Info n()
    {
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        try
        {
            info = AdvertisingIdClient.getAdvertisingIdInfo(fp.a().c());
        }
        catch (Exception exception)
        {
            gd.b(a, (new StringBuilder()).append("GOOGLE PLAY SERVICES ERROR: ").append(exception.getMessage()).toString());
            gd.b(a, "There is a problem with the Google Play Services library, which is required for Android Advertising ID support. The Google Play Services library should be integrated in any app shipping in the Play Store that uses analytics or advertising.");
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
        String s1 = android.provider.Settings.Secure.getString(fp.a().c().getContentResolver(), "android_id");
        if (!a(s1))
        {
            return null;
        } else
        {
            return (new StringBuilder()).append("AND").append(s1).toString();
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
        long l3 = hp.i(hm.c(fp.a().c()));
        return (new StringBuilder()).append("ID").append(Long.toString(l1 + (l2 + l3 * 37L) * 37L, 16)).toString();
    }

    private String s()
    {
        Object obj;
        obj = fp.a().c().getFileStreamPath(u());
        if (obj == null || !((File) (obj)).exists())
        {
            return null;
        }
        Object obj1 = new DataInputStream(new FileInputStream(((File) (obj))));
        obj = obj1;
        Object obj2 = a(((DataInput) (obj1)));
        hp.a(((java.io.Closeable) (obj1)));
        return ((String) (obj2));
        Object obj3;
        obj3;
        obj1 = null;
_L4:
        obj = obj1;
        gd.a(6, a, "Error when loading deviceId", ((Throwable) (obj3)));
        hp.a(((java.io.Closeable) (obj1)));
        return null;
        obj;
        obj3 = null;
        obj1 = obj;
_L2:
        hp.a(((java.io.Closeable) (obj3)));
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
        Object obj = fp.a().c().getFilesDir();
        if (obj != null) goto _L2; else goto _L1
_L1:
        class _cls2
            implements FilenameFilter
        {

            final fe a;

            public boolean accept(File file, String s1)
            {
                return s1.startsWith(".flurryagent.");
            }

            
            {
                a = fe.this;
                super();
            }
        }

        String as[];
        return null;
_L2:
        if ((as = ((File) (obj)).list(new _cls2())) == null || as.length == 0) goto _L1; else goto _L3
_L3:
        as = as[0];
        as = fp.a().c().getFileStreamPath(as);
        if (as == null || !as.exists()) goto _L1; else goto _L4
_L4:
        Object obj1 = new DataInputStream(new FileInputStream(as));
        as = ((String []) (obj1));
        Object obj2 = b(((DataInput) (obj1)));
        hp.a(((java.io.Closeable) (obj1)));
        return ((String) (obj2));
        Object obj3;
        obj3;
        obj1 = null;
_L8:
        as = ((String []) (obj1));
        gd.a(6, a, "Error when loading deviceId", ((Throwable) (obj3)));
        hp.a(((java.io.Closeable) (obj1)));
        return null;
        as;
        obj3 = null;
        obj1 = as;
_L6:
        hp.a(((java.io.Closeable) (obj3)));
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
        Object obj = (TelephonyManager)fp.a().c().getSystemService("phone");
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((obj = ((TelephonyManager) (obj)).getDeviceId()) == null || ((String) (obj)).trim().length() <= 0) goto _L1; else goto _L3
_L3:
        try
        {
            obj = hp.f(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            gd.a(6, a, "Exception in generateHashedImei()");
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (obj.length == 20)
        {
            h = ((byte []) (obj));
            return;
        }
        gd.a(6, a, (new StringBuilder()).append("sha1 is not ").append(20).append(" bytes long: ").append(Arrays.toString(((byte []) (obj)))).toString());
        return;
    }

    private void x()
    {
        String s1 = d();
        if (s1 != null)
        {
            gd.a(3, a, "Fetched advertising id");
            d.put(fl.c, com.flurry.sdk.hp.e(s1));
        }
        s1 = f();
        if (s1 != null)
        {
            gd.a(3, a, "Fetched device id");
            d.put(fl.a, com.flurry.sdk.hp.e(s1));
        }
        byte abyte0[] = g();
        if (abyte0 != null)
        {
            gd.a(3, a, "Fetched hashed IMEI");
            d.put(fl.b, abyte0);
        }
    }

    public boolean c()
    {
        return a.f.equals(e);
    }

    public String d()
    {
        if (f == null)
        {
            return null;
        } else
        {
            return f.getId();
        }
    }

    public boolean e()
    {
        while (f == null || !f.isLimitAdTrackingEnabled()) 
        {
            return true;
        }
        return false;
    }

    public String f()
    {
        return g;
    }

    public byte[] g()
    {
        return h;
    }

    public Map h()
    {
        return Collections.unmodifiableMap(d);
    }

}

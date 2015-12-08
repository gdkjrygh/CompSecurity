// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bmwgroup.connected.car.app;

import ado;
import afe;
import aff;
import ago;
import ahk;
import ahn;
import aia;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Environment;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.bmwgroup.connected.car.app:
//            BrandType, ApplicationType

public final class ApplicationManager extends Enum
{

    public static final ApplicationManager a;
    private static final ahn b = ahn.a("connected.car.sdk");
    private static final ApplicationManager c[];
    public String mAppId;
    public ado mApplication;
    public Context mContext;
    public final BroadcastReceiver mDisconnectReceiver = new BroadcastReceiver() {

        private ApplicationManager a;

        public final void onReceive(Context context, Intent intent)
        {
            aia.a(ApplicationManager.a(a)).c();
            ApplicationManager.b(a).unregisterReceiver(this);
        }

            
            {
                a = ApplicationManager.this;
                super();
            }
    };
    private final Key mKey = new SecretKeySpec(new byte[] {
        102, -32, 95, -17, -80, 45, -17, -18, -83, 96, 
        -46, -44, -25, -92, -95, -33
    }, "AES");

    private ApplicationManager(String s)
    {
        super(s, 0);
    }

    static String a(ApplicationManager applicationmanager)
    {
        return applicationmanager.mAppId;
    }

    static String a(BrandType brandtype)
    {
        return b(brandtype);
    }

    static void a(ApplicationManager applicationmanager, Context context, boolean flag)
    {
        BrandType abrandtype[];
        int i;
        int j;
        abrandtype = BrandType.values();
        j = abrandtype.length;
        i = 0;
_L3:
        if (i >= j) goto _L2; else goto _L1
_L1:
        Object obj1 = b(abrandtype[i]);
        b.b("appId %s - writeHmiResourcesToExternalStorage(%s) - current brand=%s", new Object[] {
            applicationmanager.mAppId, Boolean.valueOf(flag), obj1
        });
        byte abyte0[];
        Object obj;
        File file;
        if (!flag)
        {
            obj = aff.a(context, ((String) (obj1)));
            abyte0 = aff.b(context, ((String) (obj1)));
        } else
        {
            obj = afe.a(context, applicationmanager.mAppId, ((String) (obj1)));
            abyte0 = afe.b(context, applicationmanager.mAppId, ((String) (obj1)));
        }
        if (obj == null || abyte0 == null || obj.length <= 0 || abyte0.length <= 0 || !c())
        {
            continue; /* Loop/switch isn't completed */
        }
        file = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/bmwgroup/").append(applicationmanager.mAppId).append(File.separator).append(((String) (obj1))).toString());
        file.mkdirs();
        b.b("appId %s - writeHmiResourcesToExternalStorage(%s) - current brand=%s, writing to directory %s", new Object[] {
            applicationmanager.mAppId, Boolean.valueOf(flag), obj1, file
        });
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        obj1 = new FileOutputStream(new File(file, "images.zip"));
        ((FileOutputStream) (obj1)).write(((byte []) (obj)));
        ((FileOutputStream) (obj1)).close();
        if (abyte0 != null)
        {
            try
            {
                obj = new FileOutputStream(new File(file, "texts.zip"));
                ((FileOutputStream) (obj)).write(abyte0);
                ((FileOutputStream) (obj)).close();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        i++;
          goto _L3
_L2:
    }

    static boolean a()
    {
        return c();
    }

    public static byte[] a(Context context, int i)
    {
        InputStream inputstream;
        inputstream = null;
        Resources resources = context.getResources();
        context = inputstream;
        if (resources == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        inputstream = resources.openRawResource(i);
        context = new ByteArrayOutputStream();
        i = inputstream.read();
_L2:
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        context.write(i);
        i = inputstream.read();
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            inputstream.close();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        context = context.toByteArray();
        return context;
    }

    static ahn b()
    {
        return b;
    }

    static Context b(ApplicationManager applicationmanager)
    {
        return applicationmanager.mContext;
    }

    public static String b(Context context, int i)
    {
        Object obj = null;
        Resources resources = context.getResources();
        context = obj;
        if (resources != null)
        {
            context = resources.getString(i);
        }
        return context;
    }

    private static String b(BrandType brandtype)
    {
        final class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[BrandType.values().length];
                try
                {
                    a[BrandType.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[BrandType.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[BrandType.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3.a[brandtype.ordinal()])
        {
        default:
            return "common";

        case 1: // '\001'
            return "bmw";

        case 2: // '\002'
            return "mini";

        case 3: // '\003'
            return "common";
        }
    }

    private static boolean c()
    {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static ApplicationManager valueOf(String s)
    {
        return (ApplicationManager)Enum.valueOf(com/bmwgroup/connected/car/app/ApplicationManager, s);
    }

    public static ApplicationManager[] values()
    {
        return (ApplicationManager[])c.clone();
    }

    static 
    {
        a = new ApplicationManager("INSTANCE");
        c = (new ApplicationManager[] {
            a
        });
    }

    // Unreferenced inner class com/bmwgroup/connected/car/app/ApplicationManager$2

/* anonymous class */
    public final class _cls2
        implements Runnable
    {

        private BrandType a;
        private Context b;
        private int c;
        private int d;
        private ApplicationType e;
        private String f;
        private String g;
        private ApplicationManager h;

        public final void run()
        {
            Object obj;
            Object obj2;
            obj = ApplicationManager.a(a);
            byte abyte0[] = ApplicationManager.a(b, c);
            obj2 = afe.a(b, ApplicationManager.a(h));
            Object obj1;
            File file;
            String s;
            Object obj3;
            if (obj2 == null)
            {
                obj1 = aff.a(b, ((String) (obj)));
                obj = aff.b(b, ((String) (obj)));
            } else
            {
                obj1 = afe.a(b, ApplicationManager.a(h), ((String) (obj)));
                obj = afe.b(b, ApplicationManager.a(h), ((String) (obj)));
            }
            s = ApplicationManager.b(b, d);
            if (!ApplicationManager.a()) goto _L2; else goto _L1
_L1:
            file = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/bmwgroup/").append(ApplicationManager.a(h)).toString());
            file.mkdirs();
            ApplicationManager.b().b("registering mAppId=%s - creating folder %s", new Object[] {
                ApplicationManager.a(h), file.getAbsolutePath()
            });
            boolean flag;
            try
            {
                if (e != null)
                {
                    obj3 = new FileWriter(new File(file, "category.txt"));
                    ((FileWriter) (obj3)).write(e.toString());
                    ((FileWriter) (obj3)).close();
                }
                if (a != null)
                {
                    obj3 = new FileWriter(new File(file, "brand.txt"));
                    ((FileWriter) (obj3)).write(a.toString());
                    ((FileWriter) (obj3)).close();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
                return;
            }
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_276;
            }
            obj3 = new FileOutputStream(new File(file, "images.zip"));
            ((FileOutputStream) (obj3)).write(((byte []) (obj1)));
            ((FileOutputStream) (obj3)).close();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_308;
            }
            obj1 = new FileOutputStream(new File(file, "texts.zip"));
            ((FileOutputStream) (obj1)).write(((byte []) (obj)));
            ((FileOutputStream) (obj1)).close();
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_342;
            }
            obj = new FileWriter(new File(file, "title.txt"));
            ((FileWriter) (obj)).write(s);
            ((FileWriter) (obj)).close();
            if (abyte0 == null)
            {
                break MISSING_BLOCK_LABEL_376;
            }
            obj = new FileOutputStream(new File(file, "icon.png"));
            ((FileOutputStream) (obj)).write(abyte0);
            ((FileOutputStream) (obj)).close();
            if (f != null && g != null)
            {
                ago.a(f, g, file);
            }
            if (obj2 == null)
            {
                break MISSING_BLOCK_LABEL_514;
            }
            obj1 = new File(file, "key.p7b");
            obj = ahk.a(((byte []) (obj2)));
            obj1 = new FileOutputStream(((File) (obj1)));
            ((FileOutputStream) (obj1)).write(((byte []) (obj)));
            ((FileOutputStream) (obj1)).close();
_L3:
            obj1 = h;
            obj2 = b;
            if (obj != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ApplicationManager.a(((ApplicationManager) (obj1)), ((Context) (obj2)), flag);
_L2:
            return;
            obj = obj2;
              goto _L3
        }

            public 
            {
                h = ApplicationManager.this;
                a = brandtype;
                b = context;
                c = 0x7f020085;
                d = 0x7f08061c;
                e = applicationtype;
                f = s;
                g = s1;
                super();
            }
    }

}

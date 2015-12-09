// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bmwgroup.connected.car.app;

import afe;
import aff;
import ago;
import ahk;
import ahn;
import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

// Referenced classes of package com.bmwgroup.connected.car.app:
//            ApplicationManager, ApplicationType, BrandType

public final class g
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

    public _cls9(ApplicationManager applicationmanager, BrandType brandtype, Context context, ApplicationType applicationtype, String s, String s1)
    {
        h = applicationmanager;
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

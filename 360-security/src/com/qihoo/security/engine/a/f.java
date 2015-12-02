// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.qihoo.security.engine.ClassesDexInfo;
import com.qihoo.security.engine.ave.dejavu.Dalvik;
import com.qihoo360.common.utils.FileUtil;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

// Referenced classes of package com.qihoo.security.engine.a:
//            c, e, b, a

public class f
{

    private static final String a = com/qihoo/security/engine/a/f.getSimpleName();
    private final Context b;
    private final c c;
    private boolean d;

    public f(Context context)
    {
        d = false;
        b = context;
        c = new c(context);
    }

    public static InputStream a(Context context, String s)
    {
        Object obj1 = null;
        Object obj = obj1;
        if (FileUtil.getFileTimestamp(context, s) >= FileUtil.getAssetTimestamp(context, s))
        {
            try
            {
                obj = context.openFileInput(s);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = obj1;
            }
        }
        obj1 = obj;
        if (obj == null)
        {
            try
            {
                obj1 = context.getAssets().open(s);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return ((InputStream) (obj));
            }
        }
        return ((InputStream) (obj1));
    }

    private void a(e e1, PackageManager packagemanager, ClassesDexInfo classesdexinfo, String s)
    {
        int i;
        int j;
        j = 0;
        i = 0;
        if (packagemanager.checkPermission("android.permission.INTERNET", s) != -1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        b ab[];
        ab = c.a();
        obj = null;
        if (TextUtils.isEmpty(classesdexinfo.filePath)) goto _L4; else goto _L3
_L3:
        classesdexinfo = new Dalvik(classesdexinfo.filePath);
_L11:
        int j1 = ab.length;
        int k = 0;
          goto _L5
_L30:
        e1.a(j);
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!com.qihoo.security.engine.a.b.a(i, 1)) goto _L7; else goto _L6
_L6:
        k = 0;
        j = k;
        if (!a("android.permission.READ_PHONE_STATE", s, packagemanager)) goto _L9; else goto _L8
_L8:
        j = k;
        if (classesdexinfo.find("getLine1Number", 0, 0) != -1)
        {
            j = 1;
        }
          goto _L9
_L29:
        i = j;
        if (!com.qihoo.security.engine.a.b.a(j, 2))
        {
            break MISSING_BLOCK_LABEL_161;
        }
        i = j;
        if (!a("android.permission.CALL_PHONE", s, packagemanager))
        {
            i = j & -3;
        }
        j = i;
        if (!com.qihoo.security.engine.a.b.a(i, 4))
        {
            break MISSING_BLOCK_LABEL_197;
        }
        j = i;
        if (!a("android.permission.SEND_SMS", s, packagemanager))
        {
            j = i & -5;
        }
        i = j;
        if (!com.qihoo.security.engine.a.b.a(j, 8))
        {
            break MISSING_BLOCK_LABEL_250;
        }
        i = j;
        if (a("android.permission.READ_SMS", s, packagemanager))
        {
            break MISSING_BLOCK_LABEL_250;
        }
        i = j;
        if (!a("android.permission.WRITE_SMS", s, packagemanager))
        {
            i = j & -9;
        }
        j = i;
        if (!com.qihoo.security.engine.a.b.a(i, 16))
        {
            break MISSING_BLOCK_LABEL_303;
        }
        j = i;
        if (a("android.permission.READ_CONTACTS", s, packagemanager))
        {
            break MISSING_BLOCK_LABEL_303;
        }
        j = i;
        if (!a("android.permission.WRITE_CONTACTS", s, packagemanager))
        {
            j = i & 0xffffffef;
        }
        e1.b(j);
        if (classesdexinfo == null) goto _L1; else goto _L10
_L10:
        classesdexinfo.close();
        return;
_L4:
        if (classesdexinfo.memoryPtr == 0L)
        {
            continue; /* Loop/switch isn't completed */
        }
        classesdexinfo = new Dalvik(classesdexinfo.memoryPtr, classesdexinfo.memorySize);
          goto _L11
        e1;
        e1 = ((e) (obj));
_L38:
        if (e1 == null) goto _L1; else goto _L12
_L12:
        e1.close();
        return;
        if (true) goto _L1; else goto _L13
_L13:
        throw new NullPointerException();
_L31:
        b b1 = ab[k];
        obj = b1.a;
        if (obj != null) goto _L15; else goto _L14
_L15:
        a.a aa[] = ((a) (obj)).a;
        if (aa == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int k1 = aa.length;
        int l;
        l = 0;
        obj = null;
_L35:
        if (l < k1) goto _L17; else goto _L16
_L16:
        if (obj == null) goto _L14; else goto _L18
_L18:
        e1.a(b1.b(), ((Set) (obj)), b1.c());
        i = b1.a() | i;
          goto _L14
_L34:
        a.a a1;
        String as[];
        String as1[];
        as = a1.a;
        as1 = a1.b;
        if (as.length != 0) goto _L20; else goto _L19
_L19:
        Object obj1;
        int i1;
        obj1 = obj;
        i1 = j;
        if (as1.length == 0) goto _L21; else goto _L20
_L20:
        if (as.length <= 0) goto _L23; else goto _L22
_L22:
        obj1 = obj;
        i1 = j;
        if (classesdexinfo.findAll(as, 0) < 0) goto _L21; else goto _L23
_L23:
        if (as1.length <= 0) goto _L25; else goto _L24
_L24:
        obj1 = obj;
        i1 = j;
        if (d) goto _L21; else goto _L26
_L26:
        boolean flag = true;
        int l1 = as1.length;
        i1 = 0;
          goto _L27
_L25:
        i1 = j | a1.d;
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_579;
        }
        obj1 = new HashSet();
        ((Set) (obj1)).add(a1.c);
          goto _L21
_L37:
        int i2 = classesdexinfo.find(as1[i1], 0, 2);
        if (i2 < 0)
        {
            flag = false;
            break; /* Loop/switch isn't completed */
        }
        i1++;
        continue; /* Loop/switch isn't completed */
        e1;
        classesdexinfo = null;
_L28:
        if (classesdexinfo != null)
        {
            classesdexinfo.close();
        }
        throw e1;
        e1;
        if (true) goto _L28; else goto _L7
_L7:
        j = i;
          goto _L29
_L5:
        if (k < j1) goto _L31; else goto _L30
_L9:
        if (j != 0) goto _L7; else goto _L32
_L32:
        j = i & -2;
          goto _L29
_L14:
        k++;
          goto _L5
_L17:
        a1 = aa[l];
        if (a1 != null) goto _L34; else goto _L33
_L33:
        i1 = j;
        obj1 = obj;
_L21:
        l++;
        obj = obj1;
        j = i1;
          goto _L35
_L27:
        if (i1 < l1) goto _L37; else goto _L36
_L36:
        obj1 = obj;
        i1 = j;
        if (!flag) goto _L21; else goto _L25
        e1;
        e1 = classesdexinfo;
          goto _L38
    }

    private boolean a(String s, String s1, PackageManager packagemanager)
    {
        return packagemanager.checkPermission(s, s1) == 0;
    }

    private final byte[] a(ZipInputStream zipinputstream)
        throws IOException
    {
        zipinputstream = new InflaterInputStream(zipinputstream);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[1024];
        do
        {
            int i = zipinputstream.read(abyte0);
            if (i == -1)
            {
                return bytearrayoutputstream.toByteArray();
            }
            bytearrayoutputstream.write(abyte0, 0, i);
        } while (true);
    }

    private e b(String s, ClassesDexInfo classesdexinfo)
    {
        PackageManager packagemanager = b.getPackageManager();
        e e1 = new e();
        a(e1, packagemanager, classesdexinfo, s);
        return e1;
    }

    public e a(String s, ClassesDexInfo classesdexinfo)
    {
        return b(s, classesdexinfo);
    }

    public void a()
    {
        d = true;
    }

    public void b()
    {
        Object obj;
        Object obj1;
        long l;
        obj = a(b, "adx.dat");
        l = Math.max(FileUtil.getAssetTimestamp(b, "adx.dat"), FileUtil.getFileTimestamp(b, "adx.dat"));
        obj1 = null;
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = new ZipInputStream(new BufferedInputStream(((InputStream) (obj))));
        c.b();
_L7:
        obj1 = ((ZipInputStream) (obj)).getNextEntry();
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        if (obj == null) goto _L2; else goto _L5
_L5:
        ((ZipInputStream) (obj)).close();
_L2:
        return;
_L4:
        if (!"adr.dat".equals(((ZipEntry) (obj1)).getName())) goto _L7; else goto _L6
_L6:
        c.a(new String(a(((ZipInputStream) (obj)))), l);
          goto _L7
        obj1;
_L11:
        if (obj == null) goto _L2; else goto _L8
_L8:
        try
        {
            ((ZipInputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj;
_L10:
        if (obj1 != null)
        {
            try
            {
                ((ZipInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        throw obj;
        obj;
        return;
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
        if (true) goto _L10; else goto _L9
_L9:
        IOException ioexception;
        ioexception;
        ioexception = null;
          goto _L11
    }

}

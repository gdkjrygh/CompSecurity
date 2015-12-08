// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a;

import a.a.a.a.a.b.l;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

// Referenced classes of package a.a.a.a:
//            f, s, r

final class k
    implements Callable
{

    final String a;

    k(String s1)
    {
        a = s1;
    }

    private static r a(ZipEntry zipentry, ZipFile zipfile)
    {
        java.io.InputStream inputstream = zipfile.getInputStream(zipentry);
        zipfile = inputstream;
        Object obj1 = new Properties();
        zipfile = inputstream;
        ((Properties) (obj1)).load(inputstream);
        zipfile = inputstream;
        Object obj = ((Properties) (obj1)).getProperty("fabric-identifier");
        zipfile = inputstream;
        String s1 = ((Properties) (obj1)).getProperty("fabric-version");
        zipfile = inputstream;
        obj1 = ((Properties) (obj1)).getProperty("fabric-build-type");
        zipfile = inputstream;
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
        zipfile = inputstream;
        if (!TextUtils.isEmpty(s1)) goto _L3; else goto _L2
_L2:
        zipfile = inputstream;
        try
        {
            throw new IllegalStateException((new StringBuilder("Invalid format of fabric file,")).append(zipentry.getName()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally { }
_L5:
        zipfile = inputstream;
        f.d().b("Fabric", (new StringBuilder("Error when parsing fabric properties ")).append(zipentry.getName()).toString(), ((Throwable) (obj)));
        l.a(inputstream);
        return null;
_L3:
        zipfile = inputstream;
        obj = new r(((String) (obj)), s1, ((String) (obj1)));
        l.a(inputstream);
        return ((r) (obj));
        zipentry;
        zipfile = null;
        l.a(zipfile);
        throw zipentry;
        obj;
        inputstream = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private Map a()
    {
        HashMap hashmap = new HashMap();
        long l1 = SystemClock.elapsedRealtime();
        ZipFile zipfile = new ZipFile(a);
        Enumeration enumeration = zipfile.entries();
        int i;
        for (i = 0; enumeration.hasMoreElements(); i++)
        {
            Object obj = (ZipEntry)enumeration.nextElement();
            if (!((ZipEntry) (obj)).getName().startsWith("fabric/") || ((ZipEntry) (obj)).getName().length() <= 7)
            {
                continue;
            }
            obj = a(((ZipEntry) (obj)), zipfile);
            if (obj != null)
            {
                hashmap.put(((r) (obj)).a(), obj);
                f.d();
                String.format("Found kit:[%s] version:[%s]", new Object[] {
                    ((r) (obj)).a(), ((r) (obj)).b()
                });
            }
        }

        try
        {
            zipfile.close();
        }
        catch (IOException ioexception) { }
        f.d();
        (new StringBuilder("finish scanning in ")).append(SystemClock.elapsedRealtime() - l1).append(" reading:").append(i);
        return hashmap;
    }

    public final Object call()
    {
        return a();
    }
}

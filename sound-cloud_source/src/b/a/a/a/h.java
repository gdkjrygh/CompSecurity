// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import android.os.SystemClock;
import android.text.TextUtils;
import b.a.a.a.a.b.j;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

// Referenced classes of package b.a.a.a:
//            d, n

final class h
    implements Callable
{

    final String a;

    h(String s)
    {
        a = s;
    }

    private static n a(ZipEntry zipentry, ZipFile zipfile)
    {
        zipfile = zipfile.getInputStream(zipentry);
        Object obj;
        String s;
        Object obj1;
        obj1 = new Properties();
        ((Properties) (obj1)).load(zipfile);
        obj = ((Properties) (obj1)).getProperty("fabric-identifier");
        s = ((Properties) (obj1)).getProperty("fabric-version");
        obj1 = ((Properties) (obj1)).getProperty("fabric-build-type");
        if (TextUtils.isEmpty(((CharSequence) (obj))) || TextUtils.isEmpty(s))
        {
            throw new IllegalStateException((new StringBuilder("Invalid format of fabric file,")).append(zipentry.getName()).toString());
        }
          goto _L1
        obj;
_L5:
        d.a();
        (new StringBuilder("Error when parsing fabric properties ")).append(zipentry.getName());
        j.b(zipfile);
        return null;
_L1:
        obj = new n(((String) (obj)), s, ((String) (obj1)));
        j.b(zipfile);
        return ((n) (obj));
        zipentry;
        zipfile = null;
_L3:
        j.b(zipfile);
        throw zipentry;
        zipentry;
        continue; /* Loop/switch isn't completed */
        zipentry;
        if (true) goto _L3; else goto _L2
_L2:
        zipfile;
        zipfile = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private Map a()
        throws Exception
    {
        HashMap hashmap = new HashMap();
        long l = SystemClock.elapsedRealtime();
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
                hashmap.put(((n) (obj)).a, obj);
                d.a();
                String.format("Found kit:[%s] version:[%s]", new Object[] {
                    ((n) (obj)).a, ((n) (obj)).b
                });
            }
        }

        try
        {
            zipfile.close();
        }
        catch (IOException ioexception) { }
        d.a();
        (new StringBuilder("finish scanning in ")).append(SystemClock.elapsedRealtime() - l).append(" reading:").append(i);
        return hashmap;
    }

    public final Object call()
        throws Exception
    {
        return a();
    }
}

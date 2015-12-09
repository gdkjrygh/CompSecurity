// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.text.TextUtils;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

final class gyd
    implements Callable
{

    private String a;

    gyd(String s)
    {
        a = s;
    }

    private static gyj a(ZipEntry zipentry, ZipFile zipfile)
    {
        java.io.InputStream inputstream = zipfile.getInputStream(zipentry);
        zipfile = inputstream;
        Object obj1 = new Properties();
        zipfile = inputstream;
        ((Properties) (obj1)).load(inputstream);
        zipfile = inputstream;
        Object obj = ((Properties) (obj1)).getProperty("fabric-identifier");
        zipfile = inputstream;
        String s = ((Properties) (obj1)).getProperty("fabric-version");
        zipfile = inputstream;
        obj1 = ((Properties) (obj1)).getProperty("fabric-build-type");
        zipfile = inputstream;
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
        zipfile = inputstream;
        if (!TextUtils.isEmpty(s)) goto _L3; else goto _L2
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
        gya.a().c("Fabric", (new StringBuilder("Error when parsing fabric properties ")).append(zipentry.getName()).toString(), ((Throwable) (obj)));
        CommonUtils.a(inputstream);
        return null;
_L3:
        zipfile = inputstream;
        obj = new gyj(((String) (obj)), s, ((String) (obj1)));
        CommonUtils.a(inputstream);
        return ((gyj) (obj));
        zipentry;
        zipfile = null;
        CommonUtils.a(zipfile);
        throw zipentry;
        obj;
        inputstream = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private Map a()
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
                hashmap.put(((gyj) (obj)).a, obj);
                gya.a().b("Fabric", String.format("Found kit:[%s] version:[%s]", new Object[] {
                    ((gyj) (obj)).a, ((gyj) (obj)).b
                }));
            }
        }

        try
        {
            zipfile.close();
        }
        catch (IOException ioexception) { }
        gya.a().b("Fabric", (new StringBuilder("finish scanning in ")).append(SystemClock.elapsedRealtime() - l).append(" reading:").append(i).toString());
        return hashmap;
    }

    public final Object call()
    {
        return a();
    }
}

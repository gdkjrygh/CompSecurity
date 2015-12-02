// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.common.a.fi;
import com.google.common.a.kl;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

// Referenced classes of package com.facebook.selfupdate:
//            ai, o

public class g
{

    static final Set a = fi.a("META-INF/MANIFEST.MF", "AndroidManifest.xml", "classes.dex");
    static final Set b = fi.a("META-INF/MANIFEST.MF", "metadata.txt");
    private final Context c;
    private final ai d;
    private final o e;

    public g(Context context, ai ai1, o o1)
    {
        c = context;
        d = ai1;
        e = o1;
    }

    private boolean a(Signature signature)
    {
        return d.a(signature).contains("CN=Android Debug");
    }

    private boolean a(Signature asignature[], Signature asignature1[])
    {
        boolean flag = false;
        if (asignature == null)
        {
            if (asignature1 == null)
            {
                flag = true;
            }
        } else
        if (asignature1 != null)
        {
            HashSet hashset = new HashSet();
            hashset.addAll(Arrays.asList(asignature));
            asignature = new HashSet();
            asignature.addAll(Arrays.asList(asignature1));
            return hashset.equals(asignature);
        }
        return flag;
    }

    private Signature[] a(Context context)
    {
        if (context == null)
        {
            return null;
        }
        String s = context.getPackageName();
        try
        {
            context = context.getPackageManager().getPackageInfo(s, 64).signatures;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            e.a("PackageManager.NameNotFoundException", context);
            return null;
        }
        return context;
    }

    private Signature[] a(JarFile jarfile)
    {
        Object obj;
        Certificate acertificate[];
        Enumeration enumeration;
        JarEntry jarentry;
        Object obj1;
        Certificate certificate;
        int k;
        int l;
        try
        {
            enumeration = jarfile.entries();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            e.a((new StringBuilder()).append("RuntimeException reading ").append(jarfile.getName()).toString(), ((Exception) (obj)));
            return null;
        }
        obj = null;
_L10:
        if (!enumeration.hasMoreElements()) goto _L2; else goto _L1
_L1:
        jarentry = (JarEntry)enumeration.nextElement();
        if (jarentry.isDirectory() || jarentry.getName().startsWith("META-INF/"))
        {
            break MISSING_BLOCK_LABEL_8;
        }
        acertificate = d.a(jarfile, jarentry);
        if (acertificate != null) goto _L4; else goto _L3
_L3:
        e.a((new StringBuilder()).append(jarfile.getName()).append(" has no certificates").toString());
        return null;
_L9:
        k = obj.length;
        int j;
        for (int i = 0; i >= k; i++)
        {
            break MISSING_BLOCK_LABEL_8;
        }

        obj1 = obj[i];
        l = acertificate.length;
        j = 0;
_L11:
        if (j >= l) goto _L6; else goto _L5
_L5:
        certificate = acertificate[j];
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        if (!((Certificate) (obj1)).equals(certificate))
        {
            break MISSING_BLOCK_LABEL_273;
        }
        j = 1;
_L7:
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        if (obj.length == acertificate.length)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        e.a((new StringBuilder()).append("Package ").append(jarfile.getName()).append(" has mismatched certificates at entry ").append(jarentry.getName()).toString());
        return null;
_L2:
        obj = d.a(((Certificate []) (obj)));
        return ((Signature []) (obj));
_L6:
        j = 0;
        if (true) goto _L7; else goto _L4
_L4:
        if (obj != null) goto _L9; else goto _L8
_L8:
        obj = acertificate;
          goto _L10
        j++;
          goto _L11
    }

    private boolean b(JarFile jarfile, String s)
    {
        if (s.equals("application/java-archive"))
        {
            s = kl.a(b);
        } else
        {
            s = kl.a(a);
        }
        for (jarfile = jarfile.entries(); jarfile.hasMoreElements();)
        {
            Object obj = (JarEntry)jarfile.nextElement();
            if (!((JarEntry) (obj)).isDirectory())
            {
                obj = ((JarEntry) (obj)).getName();
                if (s.contains(obj))
                {
                    s.remove(obj);
                }
                if (s.size() == 0)
                {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean a(JarFile jarfile, String s)
    {
        boolean flag;
        if (jarfile == null)
        {
            flag = false;
        } else
        {
            boolean flag1 = b(jarfile, s);
            flag = flag1;
            if (flag1)
            {
                s = a(c);
                flag = flag1;
                if (s != null)
                {
                    flag = flag1;
                    if (s.length > 0)
                    {
                        flag = flag1;
                        if (!a(s[0]))
                        {
                            return a(((Signature []) (s)), a(jarfile));
                        }
                    }
                }
            }
        }
        return flag;
    }

}

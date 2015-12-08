// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.unveil.env:
//            af

public final class v
{

    private static final af a = new af();

    public static InputStream a(Resources resources, boolean flag, String s)
    {
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        return resources.getAssets().open(s);
        resources = new FileInputStream(s);
        return resources;
        IOException ioexception;
        ioexception;
        af af1 = a;
        if (flag)
        {
            resources = " (from assets)";
        } else
        {
            resources = "";
        }
        af1.c("Exception reading file%s: %s", new Object[] {
            resources, s
        });
        throw ioexception;
    }

    public static String a(Resources resources, int i)
    {
        StringBuilder stringbuilder = new StringBuilder();
        resources = new BufferedReader(new InputStreamReader(resources.openRawResource(i)));
_L1:
        String s = resources.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        stringbuilder.append(s);
        stringbuilder.append('\n');
          goto _L1
        resources;
        a.e("Error reading input ", new Object[0]);
        return stringbuilder.toString();
    }

    private static void a(AssetManager assetmanager, ArrayList arraylist, String s, FilenameFilter filenamefilter)
    {
        String as[] = assetmanager.list(s);
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String s1 = as[i];
            String s2 = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("/").append(s1).toString();
            if ((new File(s2)).isDirectory())
            {
                a(assetmanager, arraylist, s2, filenamefilter);
            } else
            if (filenamefilter == null || filenamefilter.accept(new File(s), s1))
            {
                arraylist.add(s2);
            }
            i++;
        }
    }

    public static void a(Closeable closeable)
    {
        try
        {
            closeable.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            a.f("Failed to close stream", new Object[0]);
        }
    }

    private static void a(List list, File file, FilenameFilter filenamefilter)
    {
        File afile[] = file.listFiles();
        int j = afile.length;
        int i = 0;
        while (i < j) 
        {
            File file1 = afile[i];
            if (file1.isDirectory())
            {
                a(list, file1, filenamefilter);
            } else
            if (filenamefilter == null || filenamefilter.accept(file, file1.getName()))
            {
                list.add(file1.getAbsolutePath());
            }
            i++;
        }
    }

    public static boolean a(String s)
    {
        return s.startsWith("assets:");
    }

    public static String[] a(Resources resources, boolean flag, String s, FilenameFilter filenamefilter)
    {
        ArrayList arraylist = new ArrayList();
        if (flag)
        {
            a(resources.getAssets(), arraylist, s, filenamefilter);
        } else
        {
            a(((List) (arraylist)), new File(s), filenamefilter);
        }
        return (String[])arraylist.toArray(new String[1]);
    }

    public static String b(String s)
    {
        String as[] = s.split(":");
        if (as.length < 2)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Can not extract path from: ".concat(s);
            } else
            {
                s = new String("Can not extract path from: ");
            }
            throw new IllegalArgumentException(s);
        } else
        {
            return as[1];
        }
    }

    public static void c(String s)
    {
        try
        {
            System.loadLibrary(s);
            return;
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            a.e("Error loading native library '%s'.", new Object[] {
                s
            });
        }
    }

}

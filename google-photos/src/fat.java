// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class fat
{

    final Context a;
    private final noz b;

    fat(Context context)
    {
        a = context;
        b = noz.a(context, 3, "CheckSdcardWriteManager", new String[0]);
    }

    private static boolean a(File file, File file1)
    {
        p.a(file1.isDirectory());
        File file2;
        do
        {
            if (file.equals(file1))
            {
                return true;
            }
            file2 = file.getParentFile();
            file = file2;
        } while (file2 != null);
        return false;
    }

    private static boolean b(File file, File file1)
    {
        return file != null && file.getAbsolutePath().contains(file1.getAbsolutePath());
    }

    public final List a(List list)
    {
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            return list;
        }
        File file = Environment.getExternalStorageDirectory();
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Uri uri = (Uri)list.next();
            String s = c.a(a, uri);
            if (TextUtils.isEmpty(s))
            {
                arraylist.add(uri);
            } else
            if (a(new File(s), file))
            {
                arraylist.add(uri);
            }
        } while (true);
        return arraylist;
    }

    final void a()
    {
        Object obj1 = null;
        int k = fas.c.d;
        File afile[] = a.getExternalFilesDirs(null);
        File file = Environment.getExternalStorageDirectory();
        if (b.a())
        {
            String s = String.valueOf(file);
            (new StringBuilder(String.valueOf(s).length() + 32)).append("Found primary external storage: ").append(s);
        }
        int l = afile.length;
        int j = 0;
        do
        {
label0:
            {
                Object obj = obj1;
                int i = k;
                if (j < l)
                {
                    obj = afile[j];
                    if (b.a())
                    {
                        String s3 = String.valueOf(obj);
                        (new StringBuilder(String.valueOf(s3).length() + 34)).append("Found external storage directory: ").append(s3);
                    }
                    if (b(((File) (obj)), file))
                    {
                        break label0;
                    }
                    obj = ((File) (obj)).getAbsolutePath();
                    if (((String) (obj)).indexOf(a.getPackageName()) != -1)
                    {
                        obj = ((String) (obj)).substring(0, ((String) (obj)).indexOf(a.getPackageName()));
                    }
                    obj = new File(((String) (obj)), "tmp_external_dir");
                    if (((File) (obj)).mkdir())
                    {
                        if (b.a())
                        {
                            String s1 = String.valueOf(((File) (obj)).getAbsolutePath());
                            if (s1.length() != 0)
                            {
                                "Successfully created new directory: ".concat(s1);
                            } else
                            {
                                new String("Successfully created new directory: ");
                            }
                        }
                        i = fas.a.d;
                    } else
                    {
                        if (b.a())
                        {
                            String s2 = String.valueOf(((File) (obj)).getAbsolutePath());
                            if (s2.length() != 0)
                            {
                                "Failed to create new directory: ".concat(s2);
                            } else
                            {
                                new String("Failed to create new directory: ");
                            }
                        }
                        i = fas.b.d;
                    }
                }
                if (obj != null && ((File) (obj)).exists())
                {
                    if (b.a())
                    {
                        s1 = String.valueOf(((File) (obj)).getAbsolutePath());
                        if (s1.length() != 0)
                        {
                            "Temporary directory exists, deleting: ".concat(s1);
                        } else
                        {
                            new String("Temporary directory exists, deleting: ");
                        }
                    }
                    ((File) (obj)).delete();
                }
                if (b.a())
                {
                    (new StringBuilder(42)).append("Writing to shared preferences: ").append(i);
                }
                far.a(a, i);
                return;
            }
            j++;
        } while (true);
    }
}

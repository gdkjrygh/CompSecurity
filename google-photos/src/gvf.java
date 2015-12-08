// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;

public class gvf
{

    private final Context a;
    private final ContentResolver b;

    public gvf(Context context)
    {
        this(context, context.getContentResolver());
    }

    private gvf(Context context, ContentResolver contentresolver)
    {
        a = context;
        b = contentresolver;
    }

    private static int a(File file, String s)
    {
        file = file.getAbsolutePath();
        int j = Math.min(file.length(), s.length());
        for (int i = 0; i < j; i++)
        {
            if (file.charAt(i) != s.charAt(i))
            {
                return i;
            }
        }

        return j;
    }

    private static File a(String s, String s1)
    {
        Object obj;
        int i;
        int k;
        byte byte0 = 2;
        k = s.lastIndexOf('~');
        i = byte0;
        obj = s;
        if (k == -1)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        i = byte0;
        obj = s;
        if (k >= s.length() - 1)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        obj = s.substring(k + 1);
        i = byte0;
        int j = Integer.parseInt(((String) (obj))) + 1;
        i = j;
        obj = s.substring(0, k);
        i = j;
_L2:
        do
        {
            s = new File((new StringBuilder(String.valueOf(obj).length() + 12 + String.valueOf(s1).length())).append(((String) (obj))).append('~').append(i).append(s1).toString());
            i++;
        } while (s.exists());
        return s;
        NumberFormatException numberformatexception;
        numberformatexception;
        numberformatexception = s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static String a(String s)
    {
        int i = s.lastIndexOf('.');
        String s1 = s;
        if (i != -1)
        {
            s1 = s.substring(0, i);
        }
        return s1;
    }

    private boolean a(File file)
    {
        Exception exception;
        Object obj;
        boolean flag;
        if (!file.exists())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        obj = Uri.fromFile(file);
        try
        {
            obj = b.openOutputStream(((Uri) (obj)));
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            if (file.exists())
            {
                file.delete();
            }
            return false;
        }
        finally
        {
            if (!file.exists()) goto _L0; else goto _L0
        }
        if (obj != null)
        {
            ((OutputStream) (obj)).close();
        }
        if (file.exists())
        {
            file.delete();
        }
        return true;
        file.delete();
        throw exception;
    }

    private static String b(String s)
    {
        int i = s.lastIndexOf('.');
        if (i > 0 && i < s.length() - 1)
        {
            return s.substring(i);
        } else
        {
            return ".jpg";
        }
    }

    public final File a(Uri uri)
    {
        Object obj;
        Object obj1;
        File file;
        String s1;
        int i;
        int j;
        if (oql.b(uri))
        {
            obj = b(uri);
        } else
        if (oql.a(uri))
        {
            obj = uri.getPath();
        } else
        {
            return null;
        }
        uri = a(a(((String) (obj))), b(((String) (obj))));
        if (a(((File) (uri))))
        {
            return uri;
        }
        file = a.getFilesDir();
        j = a(file, ((String) (obj)));
        obj1 = a;
        s1 = Environment.DIRECTORY_PICTURES;
        i = android.os.Build.VERSION.SDK_INT;
        if (i < 19) goto _L2; else goto _L1
_L1:
        obj1 = ((Context) (obj1)).getExternalFilesDirs(s1);
_L4:
        int l = obj1.length;
        boolean flag = false;
        i = j;
        j = ((flag) ? 1 : 0);
        uri = file;
        for (; j < l; j++)
        {
            File file1 = obj1[j];
            if (file1 != null)
            {
                int k = a(file1, ((String) (obj)));
                if (k > i)
                {
                    uri = file1;
                    i = k;
                }
            }
        }

        break MISSING_BLOCK_LABEL_286;
_L2:
        if (i < 8)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = ((Context) (obj1)).getExternalFilesDir(s1);
_L6:
        uri = new File[1];
        uri[0] = obj1;
        obj1 = uri;
        if (true) goto _L4; else goto _L3
_L3:
        String s2;
        uri = Environment.getExternalStorageDirectory();
        s2 = ((Context) (obj1)).getPackageName();
        i = 0;
_L7:
        obj1 = uri;
        if (i >= 5) goto _L6; else goto _L5
_L5:
        String s = (new String[] {
            "Android", "data", s2, "files", s1
        })[i];
        if (uri == null)
        {
            uri = new File(s);
        } else
        if (s != null)
        {
            uri = new File(uri, s);
        }
        i++;
          goto _L7
          goto _L6
        obj = new File(((String) (obj)));
        uri = String.valueOf(uri.getAbsolutePath());
        uri = (new StringBuilder(String.valueOf(uri).length() + 1)).append(uri).append("/").toString().concat(((File) (obj)).getName());
        return a(a(((String) (uri))), b(uri));
    }

    public final String b(Uri uri)
    {
        return oql.a(b, uri);
    }
}

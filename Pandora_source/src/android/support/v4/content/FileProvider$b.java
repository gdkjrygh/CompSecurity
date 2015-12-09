// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

// Referenced classes of package android.support.v4.content:
//            FileProvider

static class a
    implements a
{

    private final String a;
    private final HashMap b = new HashMap();

    public File a(Uri uri)
    {
        Object obj1 = uri.getEncodedPath();
        int i = ((String) (obj1)).indexOf('/', 1);
        Object obj = Uri.decode(((String) (obj1)).substring(1, i));
        obj1 = Uri.decode(((String) (obj1)).substring(i + 1));
        obj = (File)b.get(obj);
        if (obj == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unable to find configured root for ").append(uri).toString());
        }
        uri = new File(((File) (obj)), ((String) (obj1)));
        try
        {
            obj1 = uri.getCanonicalFile();
        }
        catch (IOException ioexception)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Failed to resolve canonical path for ").append(uri).toString());
        }
        if (!((File) (obj1)).getPath().startsWith(((File) (obj)).getPath()))
        {
            throw new SecurityException("Resolved path jumped beyond configured root");
        } else
        {
            return ((File) (obj1));
        }
    }

    public void a(String s, File file)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Name must not be empty");
        }
        File file1;
        try
        {
            file1 = file.getCanonicalFile();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Failed to resolve canonical path for ").append(file).toString(), s);
        }
        b.put(s, file1);
    }

    public (String s)
    {
        a = s;
    }
}

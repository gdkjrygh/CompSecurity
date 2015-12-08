// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

// Referenced classes of package android.support.v4.content:
//            i

final class j
    implements i
{

    final HashMap a = new HashMap();
    private final String b;

    public j(String s)
    {
        b = s;
    }

    public final File a(Uri uri)
    {
        Object obj1 = uri.getEncodedPath();
        int k = ((String) (obj1)).indexOf('/', 1);
        Object obj = Uri.decode(((String) (obj1)).substring(1, k));
        obj1 = Uri.decode(((String) (obj1)).substring(k + 1));
        obj = (File)a.get(obj);
        if (obj == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Unable to find configured root for ")).append(uri).toString());
        }
        uri = new File(((File) (obj)), ((String) (obj1)));
        try
        {
            obj1 = uri.getCanonicalFile();
        }
        catch (IOException ioexception)
        {
            throw new IllegalArgumentException((new StringBuilder("Failed to resolve canonical path for ")).append(uri).toString());
        }
        if (!((File) (obj1)).getPath().startsWith(((File) (obj)).getPath()))
        {
            throw new SecurityException("Resolved path jumped beyond configured root");
        } else
        {
            return ((File) (obj1));
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;

public class eje
    implements eit
{

    private final Context a;
    private final gfq b;

    eje(Context context)
    {
        a = context;
        b = (gfq)olm.a(context, gfq);
    }

    private boolean b(File file)
    {
        String s;
        String s1;
        try
        {
            s1 = a.getCacheDir().getCanonicalPath();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return false;
        }
        s = s1;
        if (!s1.endsWith(File.separator))
        {
            s = String.valueOf(s1);
            s1 = String.valueOf(File.separator);
            if (s1.length() != 0)
            {
                s = s.concat(s1);
            } else
            {
                s = new String(s);
            }
        }
        return file.getCanonicalPath().startsWith(s);
    }

    public final boolean a(File file)
    {
        return b(file) || b.a(Uri.fromFile(file));
    }
}

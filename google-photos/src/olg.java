// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class olg
{

    final Context a;
    final String b;

    public olg(Context context, String s)
    {
        a = context;
        b = s;
    }

    public InputStream a(olh olh1)
    {
        if (b == null)
        {
            return new okp(a, null, olh1.a, olh1.c, olh1.d, olh1.b);
        }
        File file = new File(b);
        if (!file.exists())
        {
            olh1 = String.valueOf(file.getAbsolutePath());
            if (olh1.length() != 0)
            {
                olh1 = "File not found: ".concat(olh1);
            } else
            {
                olh1 = new String("File not found: ");
            }
            throw new FileNotFoundException(olh1);
        }
        if (!file.canRead())
        {
            olh1 = String.valueOf(file.getAbsolutePath());
            if (olh1.length() != 0)
            {
                olh1 = "File cannot be read: ".concat(olh1);
            } else
            {
                olh1 = new String("File cannot be read: ");
            }
            throw new IOException(olh1);
        } else
        {
            return new okp(a, file, olh1.a, olh1.c, olh1.d, olh1.b);
        }
    }
}

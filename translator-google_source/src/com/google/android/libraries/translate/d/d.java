// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.d;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

// Referenced classes of package com.google.android.libraries.translate.d:
//            c

public class d extends c
{

    public d(String s)
    {
        super(s);
    }

    public final InputStream a(Context context)
    {
        return new FileInputStream(b(context));
    }

    public File b(Context context)
    {
        context = new File(a);
        File file = context.getParentFile();
        if (file != null && !file.exists())
        {
            file.mkdirs();
        }
        return context;
    }
}

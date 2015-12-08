// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.b;

import android.content.Context;
import java.io.File;

// Referenced classes of package com.bumptech.glide.load.engine.b:
//            f

class b
    implements b
{

    final Context a;
    final String b;

    public File a()
    {
        File file = a.getCacheDir();
        if (file == null)
        {
            return null;
        }
        if (b != null)
        {
            return new File(file, b);
        } else
        {
            return file;
        }
    }

    (Context context, String s)
    {
        a = context;
        b = s;
        super();
    }
}

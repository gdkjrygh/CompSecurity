// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.b;

import android.content.Context;
import java.io.File;

// Referenced classes of package com.bumptech.glide.load.engine.b:
//            d

public final class f extends d
{

    public f(Context context)
    {
        this(context, "image_manager_disk_cache", 0xfa00000);
    }

    public f(Context context, String s, int i)
    {
        super(new d.a(context, s) {

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

            
            {
                a = context;
                b = s;
                super();
            }
        }, i);
    }
}

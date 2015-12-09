// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.dextricks;

import android.content.Context;
import com.facebook.dalvik.DalvikInternals;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

final class a extends a
{

    private static String a = "/data/local/tmp/exopackage";
    private final File b;

    public final InputStream a(String s)
    {
        return new FileInputStream(new File(b, s));
    }

    public final void a(String s, File file)
    {
        if (s.endsWith(".xz"))
        {
            super.b(s, file);
        }
        DalvikInternals.link((new File(b, s)).getAbsolutePath(), file.getAbsolutePath(), true);
    }

    public final boolean a()
    {
        return false;
    }

    public final boolean b()
    {
        return false;
    }


    (Context context)
    {
        super((byte)0);
        b = new File((new StringBuilder()).append(a).append("/").append(context.getPackageName()).append("/secondary-dex").toString());
    }
}

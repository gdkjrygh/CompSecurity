// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.File;

class gtz
    implements eit
{

    private final gwk a;

    gtz(Context context)
    {
        a = (gwk)olm.a(context, gwk);
    }

    public final boolean a(File file)
    {
        File file1 = new File(a.a.getFilesDir(), "shadowcopies");
        return file.getPath().startsWith(file1.getPath());
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.File;

final class aro
    implements arl
{

    private Context a;
    private String b;

    aro(Context context, String s)
    {
        a = context;
        b = s;
        super();
    }

    public final File a()
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
}

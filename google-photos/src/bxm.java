// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.io.File;

final class bxm
    implements boh
{

    private final File a;

    public bxm(File file)
    {
        a = (File)b.a(file, "cacheDir", null);
    }

    public final nob a(long l)
    {
        return new nob(Uri.fromFile(b(l)), nod.b);
    }

    File b(long l)
    {
        return new File(a, Long.toString(l));
    }
}

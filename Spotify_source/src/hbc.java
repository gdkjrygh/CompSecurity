// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.File;

public final class hbc
    implements hbb
{

    private final Context a;

    public hbc(gyh gyh1)
    {
        if (gyh1.k == null)
        {
            throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
        } else
        {
            a = gyh1.k;
            gyh1.k();
            (new StringBuilder("Android/")).append(a.getPackageName());
            return;
        }
    }

    public final File a()
    {
        File file = a.getFilesDir();
        if (file != null)
        {
            if (file.exists() || file.mkdirs())
            {
                return file;
            }
            gya.a().d("Fabric", "Couldn't create file");
        } else
        {
            gya.a().a("Fabric", "Null File");
        }
        return null;
    }
}

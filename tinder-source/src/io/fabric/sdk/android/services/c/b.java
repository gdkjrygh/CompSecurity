// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.c;

import android.content.Context;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import java.io.File;

// Referenced classes of package io.fabric.sdk.android.services.c:
//            a

public final class b
    implements a
{

    private final Context a;
    private final String b;
    private final String c;

    public b(h h1)
    {
        if (h1.n == null)
        {
            throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
        } else
        {
            a = h1.n;
            b = h1.k();
            c = (new StringBuilder("Android/")).append(a.getPackageName()).toString();
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
            io.fabric.sdk.android.c.a().d("Fabric", "Couldn't create file");
        } else
        {
            io.fabric.sdk.android.c.a().a("Fabric", "Null File");
        }
        return null;
    }
}

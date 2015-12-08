// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.f;

import a.a.a.a.f;
import a.a.a.a.p;
import a.a.a.a.s;
import android.content.Context;
import java.io.File;

// Referenced classes of package a.a.a.a.a.f:
//            a

public final class b
    implements a
{

    private final Context a;
    private final String b;
    private final String c;

    public b(p p1)
    {
        if (p1.v() == null)
        {
            throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
        } else
        {
            a = p1.v();
            b = p1.x();
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
            f.d().b("Fabric", "Couldn't create file");
        } else
        {
            f.d();
        }
        return null;
    }
}

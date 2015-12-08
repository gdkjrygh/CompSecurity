// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.u;

import android.content.Context;
import java.io.File;

// Referenced classes of package p.u:
//            f

class g.Object
    implements g.Object
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

    g.String(Context context, String s)
    {
        a = context;
        b = s;
        super();
    }
}

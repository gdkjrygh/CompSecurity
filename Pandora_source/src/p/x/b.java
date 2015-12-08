// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.x;

import android.net.Uri;
import java.io.File;
import p.r.c;

// Referenced classes of package p.x:
//            j

public class b
    implements j
{

    private final j a;

    public b(j j1)
    {
        a = j1;
    }

    public c a(File file, int i, int k)
    {
        return a.a(Uri.fromFile(file), i, k);
    }

    public volatile c a(Object obj, int i, int k)
    {
        return a((File)obj, i, k);
    }
}

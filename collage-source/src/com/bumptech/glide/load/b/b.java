// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import android.net.Uri;
import com.bumptech.glide.load.a.c;
import java.io.File;

// Referenced classes of package com.bumptech.glide.load.b:
//            l

public class b
    implements l
{

    private final l a;

    public b(l l1)
    {
        a = l1;
    }

    public c a(File file, int i, int j)
    {
        return a.a(Uri.fromFile(file), i, j);
    }

    public volatile c a(Object obj, int i, int j)
    {
        return a((File)obj, i, j);
    }
}

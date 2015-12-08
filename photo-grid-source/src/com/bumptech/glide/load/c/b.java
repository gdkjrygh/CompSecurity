// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c;

import android.net.Uri;
import com.bumptech.glide.load.a.c;
import java.io.File;

// Referenced classes of package com.bumptech.glide.load.c:
//            s

public class b
    implements s
{

    private final s a;

    public b(s s1)
    {
        a = s1;
    }

    public final c a(Object obj, int i, int j)
    {
        obj = (File)obj;
        return a.a(Uri.fromFile(((File) (obj))), i, j);
    }
}

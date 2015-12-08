// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import android.text.TextUtils;
import com.cm.kinfoc.a.f;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.cm.kinfoc:
//            d, i, z

final class aa
    implements d
{

    final z a;

    aa(z z1)
    {
        a = z1;
        super();
    }

    public final void a(long l, i j)
    {
        if (j != null)
        {
            f.a((new StringBuilder("Post successed, server Priority: ")).append(j.g()).append(", table: ").append(j.b()).append(", last time: ").append(l).toString());
            if (!j.c() && j.i() != null)
            {
                Iterator iterator = j.i().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    File file = new File((String)iterator.next());
                    if (file.exists() && file.isFile())
                    {
                        file.delete();
                    }
                } while (true);
            }
            l = j.e();
            if (l > 0L && z.a(a) && j.a() != null && j.g() != -1)
            {
                a.a(j.b(), j.c(), l, j.g());
            }
            if (l > 0L && z.a(a) && !TextUtils.isEmpty(j.f()))
            {
                a.a(j.b(), j.c(), l, -1);
                return;
            }
        }
    }

    public final void a(i j)
    {
        if (j != null)
        {
            f.a((new StringBuilder("Post failed, server Priority: ")).append(j.g()).append(", table: ").append(j.b()).toString());
            if (j.e() == 0L && z.a(a) && j.c())
            {
                if (j.a() != null && j.g() != -1)
                {
                    a.a(j.a(), j.b(), j.c(), j.g());
                }
                if (!TextUtils.isEmpty(j.f()))
                {
                    a.a(j.f().getBytes(), j.b(), j.c(), -1);
                    return;
                }
            }
        }
    }
}

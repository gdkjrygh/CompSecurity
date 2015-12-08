// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package crittercism.android:
//            di, bg, az, br

static final class nit> extends di
{

    final List a;
    final az b;

    public final void a()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            synchronized ((bg)iterator.next())
            {
                if (bg.a(bg1) == b)
                {
                    b.o.b(bg1);
                }
            }
        }

    }

    (List list, az az1)
    {
        a = list;
        b = az1;
        super();
    }
}

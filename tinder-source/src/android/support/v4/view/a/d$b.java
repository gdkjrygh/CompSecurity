// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.view.a:
//            d, c

static final class _cls1.a extends _cls1.a
{

    public final Object a(d d1)
    {
        return new <init>(new e.a(d1) {

            final d a;
            final d.b b;

            public final Object a(int i)
            {
                c c1 = a.a(i);
                if (c1 == null)
                {
                    return null;
                } else
                {
                    return c1.b;
                }
            }

            public final List a()
            {
                d.a();
                new ArrayList();
                throw new NullPointerException();
            }

            public final boolean a(int i, int j, Bundle bundle)
            {
                return a.a(i, j, bundle);
            }

            
            {
                b = d.b.this;
                a = d1;
                super();
            }
        });
    }

    _cls1.a()
    {
    }
}

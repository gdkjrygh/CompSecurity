// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.Collections;

final class bsc
    implements mti
{

    private bsa a;

    bsc(bsa bsa1)
    {
        a = bsa1;
        super();
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (bni.a.equals(s))
        {
            mua = a;
            if (!mue1.c())
            {
                mue1 = (cnq)mue1.a().getParcelable("clip");
                s = ((bsa) (mua)).c.c.e;
                bsi bsi1;
                int i;
                int j;
                if (s != null)
                {
                    s = Collections.unmodifiableMap(((cqf) (s)).a);
                } else
                {
                    s = Collections.emptyMap();
                }
                s = bsa.a(s, mue1);
                bsi1 = (bsi)((bsa) (mua)).f.b;
                i = bsi1.b();
                j = bsi1.a();
                if (i == 0 && j == 0)
                {
                    s = null;
                } else
                {
                    s = ((bsa) (mua)).a.a(s, j, i);
                }
                if (s != null)
                {
                    ((bsi)((bsa) (mua)).f.b).a(mue1, s);
                }
            }
            a.g.a();
        }
    }
}

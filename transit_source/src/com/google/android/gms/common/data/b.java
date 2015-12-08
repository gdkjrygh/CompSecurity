// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dm;

// Referenced classes of package com.google.android.gms.common.data:
//            d

public abstract class b
{

    protected final d jf;
    protected final int ji;
    private final int jj;

    public b(d d1, int i)
    {
        jf = (d)dm.e(d1);
        boolean flag;
        if (i >= 0 && i < d1.getCount())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.k(flag);
        ji = i;
        jj = d1.q(ji);
    }

    protected void a(String s, CharArrayBuffer chararraybuffer)
    {
        jf.a(s, ji, jj, chararraybuffer);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof b)
        {
            obj = (b)obj;
            flag = flag1;
            if (dl.equal(Integer.valueOf(((b) (obj)).ji), Integer.valueOf(ji)))
            {
                flag = flag1;
                if (dl.equal(Integer.valueOf(((b) (obj)).jj), Integer.valueOf(jj)))
                {
                    flag = flag1;
                    if (((b) (obj)).jf == jf)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    protected boolean getBoolean(String s)
    {
        return jf.d(s, ji, jj);
    }

    protected byte[] getByteArray(String s)
    {
        return jf.e(s, ji, jj);
    }

    protected int getInteger(String s)
    {
        return jf.b(s, ji, jj);
    }

    protected long getLong(String s)
    {
        return jf.a(s, ji, jj);
    }

    protected String getString(String s)
    {
        return jf.c(s, ji, jj);
    }

    public int hashCode()
    {
        return dl.hashCode(new Object[] {
            Integer.valueOf(ji), Integer.valueOf(jj), jf
        });
    }

    public boolean isDataValid()
    {
        return !jf.isClosed();
    }

    protected Uri u(String s)
    {
        return jf.f(s, ji, jj);
    }

    protected boolean v(String s)
    {
        return jf.g(s, ji, jj);
    }
}

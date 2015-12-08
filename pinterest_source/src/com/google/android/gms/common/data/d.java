// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public abstract class d
{

    protected final DataHolder JG;
    protected int KZ;
    private int La;

    public d(DataHolder dataholder, int i)
    {
        JG = (DataHolder)jx.i(dataholder);
        as(i);
    }

    protected void a(String s, CharArrayBuffer chararraybuffer)
    {
        JG.a(s, KZ, La, chararraybuffer);
    }

    public boolean aQ(String s)
    {
        return JG.aQ(s);
    }

    protected Uri aR(String s)
    {
        return JG.g(s, KZ, La);
    }

    protected boolean aS(String s)
    {
        return JG.h(s, KZ, La);
    }

    protected void as(int i)
    {
        boolean flag;
        if (i >= 0 && i < JG.getCount())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.K(flag);
        KZ = i;
        La = JG.au(KZ);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof d)
        {
            obj = (d)obj;
            flag = flag1;
            if (jv.equal(Integer.valueOf(((d) (obj)).KZ), Integer.valueOf(KZ)))
            {
                flag = flag1;
                if (jv.equal(Integer.valueOf(((d) (obj)).La), Integer.valueOf(La)))
                {
                    flag = flag1;
                    if (((d) (obj)).JG == JG)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    protected int gW()
    {
        return KZ;
    }

    protected boolean getBoolean(String s)
    {
        return JG.d(s, KZ, La);
    }

    protected byte[] getByteArray(String s)
    {
        return JG.f(s, KZ, La);
    }

    protected float getFloat(String s)
    {
        return JG.e(s, KZ, La);
    }

    protected int getInteger(String s)
    {
        return JG.b(s, KZ, La);
    }

    protected long getLong(String s)
    {
        return JG.a(s, KZ, La);
    }

    protected String getString(String s)
    {
        return JG.c(s, KZ, La);
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Integer.valueOf(KZ), Integer.valueOf(La), JG
        });
    }

    public boolean isDataValid()
    {
        return !JG.isClosed();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public abstract class d
{

    protected final DataHolder II;
    protected int JX;
    private int JY;

    public d(DataHolder dataholder, int i)
    {
        II = (DataHolder)o.i(dataholder);
        ap(i);
    }

    protected void a(String s, CharArrayBuffer chararraybuffer)
    {
        II.a(s, JX, JY, chararraybuffer);
    }

    public boolean aQ(String s)
    {
        return II.aQ(s);
    }

    protected Uri aR(String s)
    {
        return II.g(s, JX, JY);
    }

    protected boolean aS(String s)
    {
        return II.h(s, JX, JY);
    }

    protected void ap(int i)
    {
        boolean flag;
        if (i >= 0 && i < II.getCount())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.I(flag);
        JX = i;
        JY = II.ar(JX);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof d)
        {
            obj = (d)obj;
            flag = flag1;
            if (n.equal(Integer.valueOf(((d) (obj)).JX), Integer.valueOf(JX)))
            {
                flag = flag1;
                if (n.equal(Integer.valueOf(((d) (obj)).JY), Integer.valueOf(JY)))
                {
                    flag = flag1;
                    if (((d) (obj)).II == II)
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
        return II.d(s, JX, JY);
    }

    protected byte[] getByteArray(String s)
    {
        return II.f(s, JX, JY);
    }

    protected float getFloat(String s)
    {
        return II.e(s, JX, JY);
    }

    protected int getInteger(String s)
    {
        return II.b(s, JX, JY);
    }

    protected long getLong(String s)
    {
        return II.a(s, JX, JY);
    }

    protected String getString(String s)
    {
        return II.c(s, JX, JY);
    }

    protected int gz()
    {
        return JX;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Integer.valueOf(JX), Integer.valueOf(JY), II
        });
    }

    public boolean isDataValid()
    {
        return !II.isClosed();
    }
}

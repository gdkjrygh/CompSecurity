// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.internal.hl;
import com.google.android.gms.internal.hn;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public abstract class d
{

    protected final DataHolder DD;
    private int EA;
    protected int Ez;

    public d(DataHolder dataholder, int i)
    {
        DD = (DataHolder)hn.f(dataholder);
        ac(i);
    }

    protected void a(String s, CharArrayBuffer chararraybuffer)
    {
        DD.a(s, Ez, EA, chararraybuffer);
    }

    protected void ac(int i)
    {
        boolean flag;
        if (i >= 0 && i < DD.getCount())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.A(flag);
        Ez = i;
        EA = DD.ae(Ez);
    }

    public boolean av(String s)
    {
        return DD.av(s);
    }

    protected Uri aw(String s)
    {
        return DD.g(s, Ez, EA);
    }

    protected boolean ax(String s)
    {
        return DD.h(s, Ez, EA);
    }

    protected int eQ()
    {
        return Ez;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof d)
        {
            obj = (d)obj;
            flag = flag1;
            if (hl.equal(Integer.valueOf(((d) (obj)).Ez), Integer.valueOf(Ez)))
            {
                flag = flag1;
                if (hl.equal(Integer.valueOf(((d) (obj)).EA), Integer.valueOf(EA)))
                {
                    flag = flag1;
                    if (((d) (obj)).DD == DD)
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
        return DD.d(s, Ez, EA);
    }

    protected byte[] getByteArray(String s)
    {
        return DD.f(s, Ez, EA);
    }

    protected float getFloat(String s)
    {
        return DD.e(s, Ez, EA);
    }

    protected int getInteger(String s)
    {
        return DD.b(s, Ez, EA);
    }

    protected long getLong(String s)
    {
        return DD.a(s, Ez, EA);
    }

    protected String getString(String s)
    {
        return DD.c(s, Ez, EA);
    }

    public int hashCode()
    {
        return hl.hashCode(new Object[] {
            Integer.valueOf(Ez), Integer.valueOf(EA), DD
        });
    }

    public boolean isDataValid()
    {
        return !DD.isClosed();
    }
}

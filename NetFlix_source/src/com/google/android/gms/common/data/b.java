// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.internal.fo;
import com.google.android.gms.internal.fq;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public abstract class b
{

    protected final DataHolder BB;
    protected final int BD;
    private final int BE;

    public b(DataHolder dataholder, int i)
    {
        BB = (DataHolder)fq.f(dataholder);
        boolean flag;
        if (i >= 0 && i < dataholder.getCount())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.x(flag);
        BD = i;
        BE = dataholder.G(BD);
    }

    protected void a(String s, CharArrayBuffer chararraybuffer)
    {
        BB.copyToBuffer(s, BD, BE, chararraybuffer);
    }

    protected Uri ah(String s)
    {
        return BB.parseUri(s, BD, BE);
    }

    protected boolean ai(String s)
    {
        return BB.hasNull(s, BD, BE);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof b)
        {
            obj = (b)obj;
            flag = flag1;
            if (fo.equal(Integer.valueOf(((b) (obj)).BD), Integer.valueOf(BD)))
            {
                flag = flag1;
                if (fo.equal(Integer.valueOf(((b) (obj)).BE), Integer.valueOf(BE)))
                {
                    flag = flag1;
                    if (((b) (obj)).BB == BB)
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
        return BB.getBoolean(s, BD, BE);
    }

    protected byte[] getByteArray(String s)
    {
        return BB.getByteArray(s, BD, BE);
    }

    protected int getInteger(String s)
    {
        return BB.getInteger(s, BD, BE);
    }

    protected long getLong(String s)
    {
        return BB.getLong(s, BD, BE);
    }

    protected String getString(String s)
    {
        return BB.getString(s, BD, BE);
    }

    public boolean hasColumn(String s)
    {
        return BB.hasColumn(s);
    }

    public int hashCode()
    {
        return fo.hashCode(new Object[] {
            Integer.valueOf(BD), Integer.valueOf(BE), BB
        });
    }

    public boolean isDataValid()
    {
        return !BB.isClosed();
    }
}

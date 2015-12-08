// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import java.util.Map;

class mak
{

    private Map a;
    private Map b;

    public mak()
    {
        a = new jk();
        b = new jk();
    }

    public jyh a(lzp lzp)
    {
        if (lzp instanceof mai)
        {
            return ((mai)lzp).a();
        } else
        {
            return null;
        }
    }

    public jyn a(lzq lzq)
    {
        if (lzq instanceof mat)
        {
            return ((mat)lzq).d();
        } else
        {
            return null;
        }
    }

    public jyq a(lzt lzt)
    {
        if (a.containsKey(lzt))
        {
            return (jyq)a.get(lzt);
        } else
        {
            mal mal1 = new mal(this, lzt);
            a.put(lzt, mal1);
            return mal1;
        }
    }

    public jys a(lzu lzu)
    {
        if (b.containsKey(lzu))
        {
            return (jys)b.get(lzu);
        } else
        {
            mam mam1 = new mam(this, lzu);
            b.put(lzu, mam1);
            return mam1;
        }
    }

    public lzh a(ConnectionResult connectionresult)
    {
        return new maj(connectionresult);
    }

    public lzv a(jyt jyt)
    {
        return new lzv(jyt, maq.a);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import com.aviary.android.feather.common.utils.e;
import java.io.Serializable;

// Referenced classes of package com.aviary.android.feather.cds:
//            h

public static final class a
    implements Serializable
{

    public String a;
    public a b;

    public boolean equals(Object obj)
    {
        if (obj instanceof a)
        {
            if (e.a(((tils.e.a) (obj = (tils.e.a)obj)).b, b) && e.a(((tils.e.a) (obj)).a, a))
            {
                return true;
            }
        }
        return false;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PackOptionWithPrice{ option: ").append(b.name()).append(", price: ").append(a).append("}").toString();
    }

    public tils.e(tils.e e1)
    {
        this(e1, null);
    }

    public <init>(<init> <init>1, String s)
    {
        b = <init>1;
        a = s;
    }
}

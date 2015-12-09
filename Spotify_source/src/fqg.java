// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

public final class fqg
    implements faj
{

    private final int a;
    private final String b;

    public fqg(String s, int i)
    {
        a = i;
        b = s;
    }

    public final String a(Context context)
    {
        if (!TextUtils.isEmpty(b))
        {
            return b;
        }
        if (a != 0)
        {
            return context.getString(a);
        } else
        {
            return "";
        }
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (fqg)obj;
            if (!cty.a(Integer.valueOf(a), Integer.valueOf(((fqg) (obj)).a)) || !cty.a(b, ((fqg) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a), b
        });
    }

    public final String toString()
    {
        return (new StringBuilder("StringWithDefaultHolder{mDefault=")).append(a).append(", mString='").append(b).append('\'').append('}').toString();
    }
}

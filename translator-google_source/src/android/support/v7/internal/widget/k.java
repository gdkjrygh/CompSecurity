// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

// Referenced classes of package android.support.v7.internal.widget:
//            j

public final class k
    implements Comparable
{

    public final ResolveInfo a;
    public float b;
    final j c;

    public k(j j, ResolveInfo resolveinfo)
    {
        c = j;
        super();
        a = resolveinfo;
    }

    public final int compareTo(Object obj)
    {
        return Float.floatToIntBits(((k)obj).b) - Float.floatToIntBits(b);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (k)obj;
            if (Float.floatToIntBits(b) != Float.floatToIntBits(((k) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Float.floatToIntBits(b) + 31;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[");
        stringbuilder.append("resolveInfo:").append(a.toString());
        stringbuilder.append("; weight:").append(new BigDecimal(b));
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}

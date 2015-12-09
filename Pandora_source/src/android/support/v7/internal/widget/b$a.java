// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

// Referenced classes of package android.support.v7.internal.widget:
//            b

public final class a
    implements Comparable
{

    public final ResolveInfo a;
    public float b;
    final b c;

    public int a(a a1)
    {
        return Float.floatToIntBits(a1.b) - Float.floatToIntBits(b);
    }

    public int compareTo(Object obj)
    {
        return a((a)obj);
    }

    public boolean equals(Object obj)
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
            obj = (a)obj;
            if (Float.floatToIntBits(b) != Float.floatToIntBits(((b) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Float.floatToIntBits(b) + 31;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[");
        stringbuilder.append("resolveInfo:").append(a.toString());
        stringbuilder.append("; weight:").append(new BigDecimal(b));
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public (b b1, ResolveInfo resolveinfo)
    {
        c = b1;
        super();
        a = resolveinfo;
    }
}

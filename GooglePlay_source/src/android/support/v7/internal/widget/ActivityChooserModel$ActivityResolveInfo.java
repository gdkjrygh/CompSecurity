// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

// Referenced classes of package android.support.v7.internal.widget:
//            ActivityChooserModel

public final class Q
    implements Comparable
{

    public final ResolveInfo resolveInfo;

    public final volatile int compareTo(Object obj)
    {
        return Float.floatToIntBits(0.0F) - Float.floatToIntBits(0.0F);
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
            if (Float.floatToIntBits(0.0F) != Float.floatToIntBits(0.0F))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Float.floatToIntBits(0.0F) + 31;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[");
        stringbuilder.append("resolveInfo:").append(resolveInfo.toString());
        stringbuilder.append("; weight:").append(new BigDecimal(0.0D));
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}

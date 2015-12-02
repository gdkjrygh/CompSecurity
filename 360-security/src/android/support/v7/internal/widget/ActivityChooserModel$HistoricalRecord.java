// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.ComponentName;
import java.math.BigDecimal;

// Referenced classes of package android.support.v7.internal.widget:
//            ActivityChooserModel

public static final class <init>
{

    public final ComponentName activity;
    public final long time;
    public final float weight;

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
            obj = (<init>)obj;
            if (activity == null)
            {
                if (((activity) (obj)).activity != null)
                {
                    return false;
                }
            } else
            if (!activity.equals(((activity) (obj)).activity))
            {
                return false;
            }
            if (time != ((time) (obj)).time)
            {
                return false;
            }
            if (Float.floatToIntBits(weight) != Float.floatToIntBits(((weight) (obj)).weight))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int i;
        if (activity == null)
        {
            i = 0;
        } else
        {
            i = activity.hashCode();
        }
        return ((i + 31) * 31 + (int)(time ^ time >>> 32)) * 31 + Float.floatToIntBits(weight);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[");
        stringbuilder.append("; activity:").append(activity);
        stringbuilder.append("; time:").append(time);
        stringbuilder.append("; weight:").append(new BigDecimal(weight));
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public (ComponentName componentname, long l, float f)
    {
        activity = componentname;
        time = l;
        weight = f;
    }

    public weight(String s, long l, float f)
    {
        this(ComponentName.unflattenFromString(s), l, f);
    }
}

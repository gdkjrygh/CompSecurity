// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.util.Locale;

// Referenced classes of package org.joda.time.format:
//            DateTimeFormat

static class combinedTypeAndStyle
{

    private final int combinedTypeAndStyle;
    private final Locale locale;

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof combinedTypeAndStyle))
        {
            return false;
        }
        obj = (combinedTypeAndStyle)obj;
        if (combinedTypeAndStyle != ((combinedTypeAndStyle) (obj)).combinedTypeAndStyle)
        {
            return false;
        }
        if (locale != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((locale) (obj)).locale == null) goto _L1; else goto _L3
_L3:
        return false;
        if (locale.equals(((locale) (obj)).locale)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int j = combinedTypeAndStyle;
        int i;
        if (locale == null)
        {
            i = 0;
        } else
        {
            i = locale.hashCode();
        }
        return i + (j + 31) * 31;
    }

    public (int i, int j, int k, Locale locale1)
    {
        locale = locale1;
        combinedTypeAndStyle = (j << 4) + i + (k << 8);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseIntArray;
import java.util.Locale;

public final class fgo
{

    public final Locale a;
    private final boolean b;
    private final SparseIntArray c = new SparseIntArray(128);

    public fgo(Locale locale)
    {
        a = (Locale)ctz.a(locale);
        locale = locale.getLanguage();
        boolean flag;
        if ("tr".equals(locale) || "az".equals(locale) || "tl".equals(locale))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }

    public final int a(int i)
    {
        int j = c.indexOfKey(i);
        if (j >= 0)
        {
            return c.valueAt(j);
        }
        if (b)
        {
            ctz.a(a);
            j = (new String(Character.toChars(i))).toLowerCase(a).codePointAt(0);
        } else
        if (i == 304)
        {
            j = 105;
        } else
        if (i == 931)
        {
            j = 962;
        } else
        {
            j = Character.toLowerCase(i);
        }
        c.put(i, j);
        return j;
    }
}

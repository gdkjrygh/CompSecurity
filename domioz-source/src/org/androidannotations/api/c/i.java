// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.api.c;

import android.content.SharedPreferences;

// Referenced classes of package org.androidannotations.api.c:
//            b, m

public final class i extends b
{

    i(SharedPreferences sharedpreferences, String s, Integer integer)
    {
        super(sharedpreferences, s, integer);
    }

    private Integer a(Integer integer)
    {
        int j;
        try
        {
            j = b.getInt(c, integer.intValue());
        }
        catch (ClassCastException classcastexception)
        {
            int k;
            try
            {
                k = Integer.parseInt(b.getString(c, String.valueOf(integer)));
            }
            // Misplaced declaration of an exception variable
            catch (Integer integer)
            {
                throw classcastexception;
            }
            return Integer.valueOf(k);
        }
        return Integer.valueOf(j);
    }

    public final volatile Object a(Object obj)
    {
        return a((Integer)obj);
    }

    protected final void c(Object obj)
    {
        obj = (Integer)obj;
        m.a(e().putInt(c, ((Integer) (obj)).intValue()));
    }
}

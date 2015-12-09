// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.api.c;

import android.content.SharedPreferences;

// Referenced classes of package org.androidannotations.api.c:
//            b, m

public final class g extends b
{

    g(SharedPreferences sharedpreferences, String s, Float float1)
    {
        super(sharedpreferences, s, float1);
    }

    private Float a(Float float1)
    {
        float f;
        try
        {
            f = b.getFloat(c, float1.floatValue());
        }
        catch (ClassCastException classcastexception)
        {
            float f1;
            try
            {
                f1 = Float.parseFloat(b.getString(c, String.valueOf(float1)));
            }
            // Misplaced declaration of an exception variable
            catch (Float float1)
            {
                throw classcastexception;
            }
            return Float.valueOf(f1);
        }
        return Float.valueOf(f);
    }

    public final volatile Object a(Object obj)
    {
        return a((Float)obj);
    }

    protected final void c(Object obj)
    {
        obj = (Float)obj;
        m.a(e().putFloat(c, ((Float) (obj)).floatValue()));
    }
}

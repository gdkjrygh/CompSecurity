// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.anim;

import android.view.View;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.translate.anim:
//            f, d

public final class c extends f
{

    private final List a = new ArrayList();
    private final android.view.ViewGroup.LayoutParams b;
    private final View c;

    public c(View view)
    {
        c = view;
        b = view.getLayoutParams();
        a(view.getContext(), 0x10e0000);
    }

    public final c a(String s, int i)
    {
        int j;
        try
        {
            s = b.getClass().getField(s);
            j = s.getInt(b);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return this;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return this;
        }
        i -= j;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        a.add(new d(s, j, i));
        return this;
    }

    public final void a(float f1)
    {
        if (!a.isEmpty())
        {
            for (Iterator iterator = a.iterator(); iterator.hasNext();)
            {
                d d1 = (d)iterator.next();
                try
                {
                    Field field = d1.a;
                    android.view.ViewGroup.LayoutParams layoutparams = b;
                    int i = d1.b;
                    field.setInt(layoutparams, (int)((float)d1.c * f1) + i);
                }
                catch (IllegalAccessException illegalaccessexception) { }
            }

            c.requestLayout();
        }
    }
}

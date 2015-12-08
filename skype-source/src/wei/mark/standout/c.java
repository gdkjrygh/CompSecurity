// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package wei.mark.standout;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import wei.mark.standout.ui.Window;

public final class c
{

    public Map a;

    public c()
    {
        a = new HashMap();
    }

    public final int a()
    {
        return a.size();
    }

    public final boolean a(int i, Class class1)
    {
        return b(i, class1) != null;
    }

    public final Window b(int i, Class class1)
    {
        class1 = (SparseArray)a.get(class1);
        if (class1 == null)
        {
            return null;
        } else
        {
            return (Window)class1.get(i);
        }
    }

    public final void c(int i, Class class1)
    {
        SparseArray sparsearray = (SparseArray)a.get(class1);
        if (sparsearray != null)
        {
            sparsearray.remove(i);
            if (sparsearray.size() == 0)
            {
                a.remove(class1);
            }
        }
    }
}

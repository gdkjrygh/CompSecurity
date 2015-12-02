// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.listview;

import android.view.View;
import com.google.common.a.au;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.widget.listview:
//            j

public class i
{

    private static int a = 6;
    private final Map b;

    public View a(Class class1, Integer integer, int k)
    {
        class1 = (au)b.get(class1);
        if (class1 != null)
        {
            class1 = class1.a(integer);
            for (int l = class1.size() - 1; l >= 0; l--)
            {
                if (j.a((j)class1.get(l)) == k)
                {
                    return j.b((j)class1.remove(l));
                }
            }

            if (!class1.isEmpty())
            {
                return j.b((j)class1.remove(0));
            }
        }
        return null;
    }

}

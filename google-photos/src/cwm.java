// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class cwm
{

    final List a;
    final float b;

    public cwm(List list, List list1, float f)
    {
        b.a(list, "features", null);
        b.a(list1, "weights", null);
        b.a(list.size(), "features.size()", list1.size(), "weights.size()");
        b = f;
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            arraylist.add(new cwk(((Float)list1.get(i)).floatValue(), (cdo)list.get(i)));
        }

        a = Collections.unmodifiableList(arraylist);
    }

    public float a(cof cof)
    {
        float f = b;
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cwk cwk1 = (cwk)iterator.next();
            if (cwk1.b.a(cof))
            {
                float f1 = cwk1.a;
                f = cwk1.b.b(cof) * f1 + f;
            }
        } while (true);
        return f;
    }

    public boolean a()
    {
        return !a.isEmpty();
    }
}

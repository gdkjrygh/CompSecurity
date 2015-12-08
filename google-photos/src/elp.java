// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class elp
{

    private final Map a = new HashMap();
    private final Class b;

    public elp(Context context, Class class1)
    {
        b = class1;
        for (context = olm.c(context, class1).iterator(); context.hasNext();)
        {
            class1 = (ell)context.next();
            Class class2 = class1.b();
            if (class2 == null)
            {
                throw new IllegalArgumentException("Feature key must not be null");
            }
            if (a.put(class2, class1) != null)
            {
                throw new IllegalArgumentException("Instantiating multiple FeatureFactories with the same key");
            }
        }

    }

    public final elm a(int i, Object obj, ekk ekk1)
    {
        Object obj1;
        ekf ekf;
        Class class1;
        obj1 = ekk1.a();
        if (((Collection) (obj1)).size() != 1)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        class1 = (Class)((Collection) (obj1)).iterator().next();
        obj1 = (ell)a.get(class1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        ekf = ((ell) (obj1)).a(i, obj);
        if (ekf == null && ekk1.a(class1))
        {
            throw new ao(((ell) (obj1)), class1);
        }
        if (!(ekf instanceof elx)) goto _L2; else goto _L1
_L1:
        obj = (elm)ekf;
_L4:
        return ((elm) (obj));
_L2:
        ekk1 = new elq();
        obj = ekk1;
        if (ekf == null) goto _L4; else goto _L3
_L3:
        ekk1.a(((ell) (obj1)).b(), ekf);
        return ekk1;
        if (ekk1.a(class1))
        {
            throw new ekh(class1, b);
        } else
        {
            return elm.a;
        }
        elq elq1;
label0:
        {
            elq1 = new elq();
            Class class2;
label1:
            do
            {
                ell ell1;
label2:
                do
                {
                    ekf ekf1;
                    for (Iterator iterator = ekk1.a().iterator(); iterator.hasNext(); elq1.a(ell1.b(), ekf1))
                    {
                        class2 = (Class)iterator.next();
                        ell1 = (ell)a.get(class2);
                        if (ell1 == null)
                        {
                            continue label1;
                        }
                        ekf1 = ell1.a(i, obj);
                        if (ekf1 instanceof elx)
                        {
                            throw new IllegalArgumentException("You can only request MultiFeatures if no other features are requested");
                        }
                        if (ekf1 == null)
                        {
                            continue label2;
                        }
                    }

                    break label0;
                } while (!ekk1.a(class2));
                throw new ao(ell1, class2);
            } while (!ekk1.a(class2));
            throw new ekh(class2, b);
        }
        return elq1;
    }

    public final String[] a(Set set, ekk ekk1)
    {
label0:
        {
            set = new HashSet(set);
            Class class1;
label1:
            do
            {
                ell ell1;
                for (Iterator iterator = ekk1.a().iterator(); iterator.hasNext(); set.addAll(ell1.a()))
                {
                    class1 = (Class)iterator.next();
                    ell1 = (ell)a.get(class1);
                    if (ell1 == null)
                    {
                        continue label1;
                    }
                }

                break label0;
            } while (!ekk1.a(class1));
            throw new ekh(class1, b);
        }
        return (String[])set.toArray(new String[set.size()]);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.experience;

import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.pinterest.experience:
//            DisplayDataBase, Experiences, ExperienceValue, NuxStep

public class NuxDisplayData extends DisplayDataBase
{

    public ArrayList a;
    public boolean b;

    public NuxDisplayData(PinterestJsonObject pinterestjsonobject)
    {
        super(pinterestjsonobject);
    }

    public static NuxDisplayData c()
    {
        ExperienceValue experiencevalue = Experiences.a(Experiences.b);
        if (experiencevalue == null)
        {
            return null;
        } else
        {
            return (NuxDisplayData)experiencevalue.f;
        }
    }

    public final NuxStep a()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            NuxStep nuxstep = (NuxStep)iterator.next();
            if (nuxstep.c())
            {
                return nuxstep;
            }
        }

        return null;
    }

    public final NuxStep a(NuxStep nuxstep)
    {
        if (nuxstep == null || nuxstep.d >= a.size())
        {
            return null;
        }
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            NuxStep nuxstep1 = (NuxStep)iterator.next();
            if (nuxstep1.d == nuxstep.d + 1)
            {
                return nuxstep1;
            }
        }

        return null;
    }

    public final void a(PinterestJsonObject pinterestjsonobject)
    {
        boolean flag = true;
        b = true;
        if (pinterestjsonobject == null)
        {
            return;
        }
        this.j = pinterestjsonobject.a("nux_completion_text", "");
        k = pinterestjsonobject.a("nux_completion_detail_text", "");
        pinterestjsonobject = pinterestjsonobject.e("steps");
        a = new ArrayList();
        int j = pinterestjsonobject.a();
        for (int i = 0; i < j; i++)
        {
            NuxStep nuxstep = new NuxStep(pinterestjsonobject.c(i));
            a.add(nuxstep);
        }

        pinterestjsonobject = a();
        if (pinterestjsonobject == null || ((NuxStep) (pinterestjsonobject)).d != 1)
        {
            flag = false;
        }
        b = flag;
    }

    public final NuxStep b()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            NuxStep nuxstep = (NuxStep)iterator.next();
            if (nuxstep.b())
            {
                return nuxstep;
            }
        }

        return null;
    }
}

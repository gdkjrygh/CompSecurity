// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.ui.swipefilters.FilterPageType;
import java.util.ArrayList;
import java.util.List;

public final class HA
    implements Hz
{

    public List a;

    public HA()
    {
        a = new ArrayList();
    }

    public final Ho a(int i)
    {
        List list;
        int k;
        if (a.size() == 0)
        {
            return null;
        }
        list = a;
        k = a.size();
        if (k != 0) goto _L2; else goto _L1
_L1:
        i = 0;
_L4:
        return (Ho)list.get(i);
_L2:
        int j = i % k;
        i = j;
        if (j < 0)
        {
            i = j + k;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final List a()
    {
        return a;
    }

    public final void a(Ho ho)
    {
        a.add(ho);
    }

    public final int b()
    {
        return a.size();
    }

    public final FilterPageType b(int i)
    {
        Ho ho = a(i);
        if (ho == null)
        {
            return FilterPageType.UNFILTERED;
        } else
        {
            return ho.b();
        }
    }

    public final void c()
    {
        a.clear();
    }
}

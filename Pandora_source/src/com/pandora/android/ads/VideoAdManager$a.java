// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import com.pandora.android.data.p;
import com.pandora.android.data.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.pandora.android.ads:
//            k, VideoAdManager

static class a extends k
{

    private final s a;

    public String[] a()
    {
        String as[] = super.a();
        ArrayList arraylist = new ArrayList();
        String as1[] = a.h();
        int j = as1.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = as1[i];
            if (!com.pandora.android.util.s.a(s1))
            {
                arraylist.add(s1);
            }
        }

        if (as.length > 0)
        {
            arraylist.addAll(Arrays.asList(as));
        }
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    public (Map map, s s1)
    {
        super(map, new p[] {
            s1
        });
        a = s1;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzve

public class zzvj
{

    private final List zzaBY = new ArrayList();

    public zzvj()
    {
    }

    public String getId()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = zzaBY.iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            zzve zzve1 = (zzve)iterator.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append("#");
            }
            stringbuilder.append(zzve1.getContainerId());
        }
        return stringbuilder.toString();
    }

    public zzvj zzb(zzve zzve1)
    {
        zzx.zzl(zzve1);
        for (Iterator iterator = zzaBY.iterator(); iterator.hasNext();)
        {
            if (((zzve)iterator.next()).getContainerId().equals(zzve1.getContainerId()))
            {
                throw new IllegalArgumentException((new StringBuilder("The container is already being requested. ")).append(zzve1.getContainerId()).toString());
            }
        }

        zzaBY.add(zzve1);
        return this;
    }

    public List zzun()
    {
        return zzaBY;
    }
}

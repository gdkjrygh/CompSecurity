// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cq, dh

public static class <init>
{

    private String aeR;
    private final List agW;
    private final Map agX;
    private int agY;

    public <init> a(<init> <init>1)
    {
        String s = dh.j((com.google.android.gms.internal.j)<init>1.mj().get(b.cI.toString()));
        List list = (List)agX.get(s);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            agX.put(s, obj);
        }
        ((List) (obj)).add(<init>1);
        return this;
    }

    public agX a(agX agx)
    {
        agW.add(agx);
        return this;
    }

    public agW ce(String s)
    {
        aeR = s;
        return this;
    }

    public aeR du(int i)
    {
        agY = i;
        return this;
    }

    public agY mp()
    {
        return new <init>(agW, agX, aeR, agY, null);
    }

    private ()
    {
        agW = new ArrayList();
        agX = new HashMap();
        aeR = "";
        agY = 0;
    }

    agY(agY agy)
    {
        this();
    }
}

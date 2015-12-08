// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.internal.fq;
import com.google.android.gms.internal.fs;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.model.moments:
//            Moment, ItemScope

public static class 
{

    private final Set rI = new HashSet();
    private String sD;
    private fq sG;
    private fq sH;
    private String sm;
    private String sx;

    public Moment build()
    {
        return new fs(rI, sm, sG, sx, sH, sD);
    }

    public sD setId(String s)
    {
        sm = s;
        rI.add(Integer.valueOf(2));
        return this;
    }

    public rI setResult(ItemScope itemscope)
    {
        sG = (fq)itemscope;
        rI.add(Integer.valueOf(4));
        return this;
    }

    public rI setStartDate(String s)
    {
        sx = s;
        rI.add(Integer.valueOf(5));
        return this;
    }

    public rI setTarget(ItemScope itemscope)
    {
        sH = (fq)itemscope;
        rI.add(Integer.valueOf(6));
        return this;
    }

    public rI setType(String s)
    {
        sD = s;
        rI.add(Integer.valueOf(7));
        return this;
    }

    public ()
    {
    }
}

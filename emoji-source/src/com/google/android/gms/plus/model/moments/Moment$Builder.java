// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.internal.kn;
import com.google.android.gms.internal.kp;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.model.moments:
//            Moment, ItemScope

public static class 
{

    private final Set acs = new HashSet();
    private String adf;
    private kn adn;
    private kn ado;
    private String qX;
    private String xG;

    public Moment build()
    {
        return new kp(acs, xG, adn, adf, ado, qX);
    }

    public qX setId(String s)
    {
        xG = s;
        acs.add(Integer.valueOf(2));
        return this;
    }

    public acs setResult(ItemScope itemscope)
    {
        adn = (kn)itemscope;
        acs.add(Integer.valueOf(4));
        return this;
    }

    public acs setStartDate(String s)
    {
        adf = s;
        acs.add(Integer.valueOf(5));
        return this;
    }

    public acs setTarget(ItemScope itemscope)
    {
        ado = (kn)itemscope;
        acs.add(Integer.valueOf(6));
        return this;
    }

    public acs setType(String s)
    {
        qX = s;
        acs.add(Integer.valueOf(7));
        return this;
    }

    public ()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation.inmobi;

import com.google.ads.mediation.NetworkExtras;
import com.inmobi.commons.EducationType;
import com.inmobi.commons.EthnicityType;
import com.inmobi.commons.HasChildren;
import com.inmobi.commons.MaritalStatus;
import com.inmobi.commons.SexualOrientation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class InMobiAdapterExtras
    implements NetworkExtras
{

    private String a;
    private String b;
    private String c;
    private EducationType d;
    private EthnicityType e;
    private Integer f;
    private Integer g;
    private Set h;
    private String i;
    private String j;
    private HasChildren k;
    private SexualOrientation l;
    private MaritalStatus m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private int s;
    private Map t;

    public InMobiAdapterExtras()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        t = new HashMap();
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public EducationType d()
    {
        return d;
    }

    public EthnicityType e()
    {
        return e;
    }

    public Integer f()
    {
        return f;
    }

    public Integer g()
    {
        return g;
    }

    public Set h()
    {
        if (h == null)
        {
            return null;
        } else
        {
            return Collections.unmodifiableSet(h);
        }
    }

    public String i()
    {
        return i;
    }

    public HasChildren j()
    {
        return k;
    }

    public SexualOrientation k()
    {
        return l;
    }

    public MaritalStatus l()
    {
        return m;
    }

    public String m()
    {
        return n;
    }

    public String n()
    {
        return q;
    }

    public String o()
    {
        return p;
    }

    public String p()
    {
        return r;
    }

    public int q()
    {
        return s;
    }
}

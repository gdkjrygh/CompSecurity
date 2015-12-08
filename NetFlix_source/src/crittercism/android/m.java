// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import com.crittercism.app.CrittercismConfig;

public final class m extends CrittercismConfig
{

    private String a;
    private String b;

    public m()
    {
        a = "https://api.crittercism.com";
        b = "https://apm.crittercism.com";
    }

    public m(CrittercismConfig crittercismconfig)
    {
        super(crittercismconfig);
        a = "https://api.crittercism.com";
        b = "https://apm.crittercism.com";
    }

    public final String a()
    {
        return a;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof m)
        {
            if (a(a, ((m) (obj = (m)obj)).a) && a(b, ((m) (obj)).b))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return (super.hashCode() * 31 + a.hashCode()) * 31 + b.hashCode();
    }
}

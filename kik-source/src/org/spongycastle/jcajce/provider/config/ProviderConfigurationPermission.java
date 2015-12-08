// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.config;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;
import org.spongycastle.util.Strings;

public class ProviderConfigurationPermission extends BasicPermission
{

    private final String a;
    private final int b;

    public ProviderConfigurationPermission(String s, String s1)
    {
        super(s, s1);
        a = s1;
        b = a(s1);
    }

    private static int a(String s)
    {
        s = new StringTokenizer(Strings.c(s), " ,");
        int i = 0;
        do
        {
            if (!s.hasMoreTokens())
            {
                break;
            }
            String s1 = s.nextToken();
            if (s1.equals("threadlocalecimplicitlyca"))
            {
                i |= 1;
            } else
            if (s1.equals("ecimplicitlyca"))
            {
                i |= 2;
            } else
            if (s1.equals("threadlocaldhdefaultparams"))
            {
                i |= 4;
            } else
            if (s1.equals("dhdefaultparams"))
            {
                i |= 8;
            } else
            if (s1.equals("all"))
            {
                i |= 0xf;
            }
        } while (true);
        if (i == 0)
        {
            throw new IllegalArgumentException("unknown permissions passed to mask");
        } else
        {
            return i;
        }
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof ProviderConfigurationPermission)
            {
                if (b != ((ProviderConfigurationPermission) (obj = (ProviderConfigurationPermission)obj)).b || !getName().equals(((ProviderConfigurationPermission) (obj)).getName()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public String getActions()
    {
        return a;
    }

    public int hashCode()
    {
        return getName().hashCode() + b;
    }

    public boolean implies(Permission permission)
    {
        if ((permission instanceof ProviderConfigurationPermission) && getName().equals(permission.getName()))
        {
            permission = (ProviderConfigurationPermission)permission;
            if ((b & ((ProviderConfigurationPermission) (permission)).b) == ((ProviderConfigurationPermission) (permission)).b)
            {
                return true;
            }
        }
        return false;
    }
}

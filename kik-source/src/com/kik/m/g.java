// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.m;

import com.a.a.a;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.Iterator;
import java.util.Set;
import kik.android.util.bx;

public final class g
{

    private static String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Provider aprovider[] = Security.getProviders();
        if (aprovider != null)
        {
            int j = aprovider.length;
            for (int i = 0; i < j; i++)
            {
                Provider provider = aprovider[i];
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(", ");
                }
                stringbuilder.append(provider.getName());
            }

        }
        return stringbuilder.toString();
    }

    public static void a(NoSuchAlgorithmException nosuchalgorithmexception)
    {
        com.a.a.a.a((new StringBuilder("Available security providers: ")).append(a()).toString());
        com.a.a.a.a((new StringBuilder("Available algorithms: ")).append(b()).toString());
        bx.a(nosuchalgorithmexception);
    }

    private static String b()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Provider aprovider[] = Security.getProviders();
        if (aprovider != null)
        {
            int j = aprovider.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = aprovider[i].getServices();
                if (obj == null)
                {
                    continue;
                }
                java.security.Provider.Service service;
                for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); stringbuilder.append(service.getAlgorithm()))
                {
                    service = (java.security.Provider.Service)((Iterator) (obj)).next();
                    if (stringbuilder.length() > 0)
                    {
                        stringbuilder.append(", ");
                    }
                }

            }

        }
        return stringbuilder.toString();
    }
}

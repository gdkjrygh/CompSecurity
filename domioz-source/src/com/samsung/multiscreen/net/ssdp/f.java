// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.net.ssdp;

import java.net.URI;
import java.util.Scanner;

public final class f
{

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g;
    private String h;

    public f()
    {
    }

    protected static f a(String s)
    {
        f f1;
        try
        {
            f1 = new f();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        try
        {
            f1.a = a(s, "USN");
            f1.c = a(s, "ST");
            f1.d = a(s, "LOCATION");
            f1.b = f1.a.split("::")[0].split("uuid:")[1];
            URI uri = URI.create(f1.d);
            f1.f = uri.getHost();
            f1.g = uri.getPort();
            f1.e = (new StringBuilder()).append(uri.getScheme()).append("://").append(f1.f).append(":").append(f1.g).toString();
            f1.h = a(s, "SERVER");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return f1;
        }
        return f1;
    }

    private static String a(String s, String s1)
    {
        s = new Scanner(s);
        s.nextLine();
        String s2;
        int i;
        do
        {
            if (s.hasNextLine())
            {
                s2 = s.nextLine();
                i = s2.indexOf(':');
                if (i >= 0)
                {
                    continue;
                }
            }
            return null;
        } while (!s1.equalsIgnoreCase(s2.substring(0, i).trim()));
        return s2.substring(i + 1).trim();
    }

    public final String a()
    {
        return d;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (f)obj;
            if (g != ((f) (obj)).g)
            {
                return false;
            }
            if (e == null ? ((f) (obj)).e != null : !e.equals(((f) (obj)).e))
            {
                return false;
            }
            if (f == null ? ((f) (obj)).f != null : !f.equals(((f) (obj)).f))
            {
                return false;
            }
            if (d == null ? ((f) (obj)).d != null : !d.equals(((f) (obj)).d))
            {
                return false;
            }
            if (c == null ? ((f) (obj)).c != null : !c.equals(((f) (obj)).c))
            {
                return false;
            }
            if (h == null ? ((f) (obj)).h != null : !h.equals(((f) (obj)).h))
            {
                return false;
            }
            if (a == null ? ((f) (obj)).a != null : !a.equals(((f) (obj)).a))
            {
                return false;
            }
            if (b == null ? ((f) (obj)).b != null : !b.equals(((f) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int k1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int l1;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b != null)
        {
            j = b.hashCode();
        } else
        {
            j = 0;
        }
        if (c != null)
        {
            k = c.hashCode();
        } else
        {
            k = 0;
        }
        if (d != null)
        {
            l = d.hashCode();
        } else
        {
            l = 0;
        }
        if (e != null)
        {
            i1 = e.hashCode();
        } else
        {
            i1 = 0;
        }
        if (f != null)
        {
            j1 = f.hashCode();
        } else
        {
            j1 = 0;
        }
        l1 = g;
        if (h != null)
        {
            k1 = h.hashCode();
        }
        return ((j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31 + l1) * 31 + k1;
    }

    public final String toString()
    {
        String s = (new StringBuilder()).append("[SSDPSearchResult]").append("\nuniqueServiceName: ").append(a).toString();
        s = (new StringBuilder()).append(s).append("\nuuid: ").append(b).toString();
        s = (new StringBuilder()).append(s).append("\nsearchTarget: ").append(c).toString();
        s = (new StringBuilder()).append(s).append("\nlocation: ").append(d).toString();
        s = (new StringBuilder()).append(s).append("\ndeviceUri: ").append(e).toString();
        s = (new StringBuilder()).append(s).append("\nhost: ").append(f).append(", port: ").append(g).toString();
        return (new StringBuilder()).append(s).append("\nserver: ").append(h).toString();
    }
}

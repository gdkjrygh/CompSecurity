// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class yz
{

    public static final yz c = new yz(new Bundle(), null);
    public final Bundle a;
    List b;

    yz(Bundle bundle, List list)
    {
        a = bundle;
        b = list;
    }

    public static yz a(Bundle bundle)
    {
        if (bundle != null)
        {
            return new yz(bundle, null);
        } else
        {
            return null;
        }
    }

    static void a(yz yz1)
    {
        yz1.b();
    }

    static List b(yz yz1)
    {
        return yz1.b;
    }

    public final List a()
    {
        b();
        return b;
    }

    public final boolean a(List list)
    {
        if (list != null)
        {
            b();
            int k = b.size();
            if (k != 0)
            {
                int l = list.size();
label0:
                for (int i = 0; i < l; i++)
                {
                    IntentFilter intentfilter = (IntentFilter)list.get(i);
                    if (intentfilter == null)
                    {
                        continue;
                    }
                    int j = 0;
                    do
                    {
                        if (j >= k)
                        {
                            continue label0;
                        }
                        if (intentfilter.hasCategory((String)b.get(j)))
                        {
                            return true;
                        }
                        j++;
                    } while (true);
                }

            }
        }
        return false;
    }

    void b()
    {
        if (b == null)
        {
            b = a.getStringArrayList("controlCategories");
            if (b == null || b.isEmpty())
            {
                b = Collections.emptyList();
            }
        }
    }

    public final boolean c()
    {
        b();
        return b.isEmpty();
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof yz)
        {
            obj = (yz)obj;
            b();
            ((yz) (obj)).b();
            return b.equals(((yz) (obj)).b);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        b();
        return b.hashCode();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("MediaRouteSelector{ ");
        stringbuilder.append("controlCategories=").append(Arrays.toString(a().toArray()));
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }

}

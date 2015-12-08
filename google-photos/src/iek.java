// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class iek
{

    private static final List a = Collections.unmodifiableList(Arrays.asList(new String[] {
        "com.facebook.katana", "com.facebook.orca", "com.google.android.apps.plus", "com.pinterest", "com.tumblr", "com.twitter.android"
    }));
    private static final List b = Collections.singletonList("com.facebook.katana");
    private static final List c = Collections.singletonList("com.whatsapp");
    private static final List d = Collections.unmodifiableList(Arrays.asList(new String[] {
        "com.facebook.katana", "com.twitter.android", "com.instagram.android", "com.google.android.apps.plus", "com.tumblr"
    }));

    iek()
    {
    }

    static boolean a(ifc ifc1)
    {
        if (ifc1.a())
        {
            ifc1 = ifc1.b.getComponent().getPackageName();
        } else
        {
            ifc1 = null;
        }
        return a.contains(ifc1);
    }

    static boolean a(ifc ifc1, List list)
    {
        if (ifc1.a())
        {
            ifc1 = ifc1.b.getComponent().getPackageName();
        } else
        {
            ifc1 = null;
        }
        return b.contains(ifc1) && list.size() == 1 && ((ekp)list.get(0)).c().g == njx.d;
    }

    static boolean b(ifc ifc1)
    {
        if (ifc1.a())
        {
            ifc1 = ifc1.b.getComponent().getPackageName();
        } else
        {
            ifc1 = ifc1.c.getComponent().getPackageName();
        }
        return d.contains(ifc1);
    }

    static boolean b(ifc ifc1, List list)
    {
label0:
        {
            elt elt1;
            if (ifc1.b())
            {
                ifc1 = ifc1.c.getComponent().getPackageName();
            } else
            {
                ifc1 = null;
            }
            if (!c.contains(ifc1))
            {
                break label0;
            }
            ifc1 = list.iterator();
            do
            {
                if (!ifc1.hasNext())
                {
                    break label0;
                }
                list = (ekp)ifc1.next();
                elt1 = (elt)list.b(elt);
            } while (list.c().g != njx.d || elt1 == null || !elt1.e().f());
            return true;
        }
        return false;
    }

}

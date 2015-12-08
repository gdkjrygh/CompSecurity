// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.kik.cards.util.b;
import java.util.ArrayList;
import java.util.Iterator;
import org.c.c;

public final class cw
{
    private final class a
    {

        private final String a;
        private final String b;

        static String a(a a1)
        {
            return a1.b;
        }

        static String b(a a1)
        {
            return a1.a;
        }

        public final boolean a()
        {
            return b != null;
        }
    }


    private static org.c.b a = org.c.c.a("PopupFragmentManager");
    private final FragmentManager b;
    private int c;
    private ArrayList d;
    private String e;
    private int f;

    public final void a(Fragment fragment)
    {
        if (fragment != null)
        {
            fragment = fragment.getTag();
            Iterator iterator = d.iterator();
label0:
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                a a1 = (a)iterator.next();
                if (a1 == null || kik.android.widget.a.b(a1) == null || !kik.android.widget.a.b(a1).equalsIgnoreCase(fragment))
                {
                    continue;
                }
                if (!a1.a())
                {
                    Iterator iterator1 = d.iterator();
                    do
                    {
                        a a2;
                        do
                        {
                            if (!iterator1.hasNext())
                            {
                                continue label0;
                            }
                            a2 = (a)iterator1.next();
                        } while (a2.a());
                        b.popBackStack(kik.android.widget.a.b(a2), 1);
                    } while (true);
                }
                b.popBackStack(fragment, 1);
            } while (true);
        }
    }

    public final boolean a(String s)
    {
        s = com.kik.cards.util.b.b(s);
        boolean flag;
        if (f < c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return false;
        }
        if (s != null && s.equalsIgnoreCase(e))
        {
            return false;
        }
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            a a1 = (a)iterator.next();
            if (a1 != null && s != null && s.equalsIgnoreCase(a.a(a1)))
            {
                return false;
            }
        }

        return true;
    }

}

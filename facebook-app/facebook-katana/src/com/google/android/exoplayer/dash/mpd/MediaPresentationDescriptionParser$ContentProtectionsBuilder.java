// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash.mpd;

import com.google.android.exoplayer.util.Assertions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//            ContentProtection

public final class 
    implements Comparator
{

    private ArrayList a;
    private ArrayList b;
    private ArrayList c;
    private boolean d;

    private static int a(ContentProtection contentprotection, ContentProtection contentprotection1)
    {
        return contentprotection.a.compareTo(contentprotection1.a);
    }

    private static void a(List list, ContentProtection contentprotection)
    {
        if (!list.contains(contentprotection))
        {
            int i = 0;
            while (i < list.size()) 
            {
                boolean flag;
                if (!((ContentProtection)list.get(i)).a.equals(contentprotection.a))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Assertions.b(flag);
                i++;
            }
            list.add(contentprotection);
        }
    }

    public final void a()
    {
        boolean flag = true;
        if (!d)
        {
            if (c != null)
            {
                Collections.sort(c, this);
            }
            b = c;
            d = true;
        } else
        if (c == null)
        {
            if (b != null)
            {
                flag = false;
            }
            Assertions.b(flag);
        } else
        {
            Collections.sort(c, this);
            Assertions.b(c.equals(b));
        }
        c = null;
    }

    public final void a(ContentProtection contentprotection)
    {
        if (a == null)
        {
            a = new ArrayList();
        }
        a(((List) (a)), contentprotection);
    }

    public final ArrayList b()
    {
        if (a == null)
        {
            return b;
        }
        if (b == null)
        {
            return a;
        }
        for (int i = 0; i < b.size(); i++)
        {
            a(a, (ContentProtection)b.get(i));
        }

        return a;
    }

    public final void b(ContentProtection contentprotection)
    {
        if (c == null)
        {
            c = new ArrayList();
        }
        a(c, contentprotection);
    }

    public final int compare(Object obj, Object obj1)
    {
        return a((ContentProtection)obj, (ContentProtection)obj1);
    }

    protected ()
    {
    }
}

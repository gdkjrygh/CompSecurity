// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import android.view.ViewGroup;
import java.util.LinkedList;

// Referenced classes of package com.facebook.contacts.picker:
//            s, p, q

public class r
{

    private final ViewGroup a;
    private LinkedList b;
    private q c;

    public r(ViewGroup viewgroup)
    {
        a = viewgroup;
        b = new LinkedList();
        c = new s(this);
    }

    private void a()
    {
        if (b.size() > 0)
        {
            p p1 = (p)b.getFirst();
            if (p1.a())
            {
                p1.a(a, c);
            }
            b.removeFirst();
        }
    }

    static void a(r r1)
    {
        r1.a();
    }

    public void a(p p1)
    {
        int i = b.size();
        b.add(p1);
        if (i == 0)
        {
            a();
        }
    }
}

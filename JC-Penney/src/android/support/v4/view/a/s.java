// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.view.a:
//            y, p, a, r

class s
    implements y
{

    final p a;
    final r b;

    s(r r, p p1)
    {
        b = r;
        a = p1;
        super();
    }

    public Object a(int i)
    {
        a a1 = a.a(i);
        if (a1 == null)
        {
            return null;
        } else
        {
            return a1.a();
        }
    }

    public List a(String s1, int i)
    {
        s1 = a.a(s1, i);
        ArrayList arraylist = new ArrayList();
        int j = s1.size();
        for (i = 0; i < j; i++)
        {
            arraylist.add(((a)s1.get(i)).a());
        }

        return arraylist;
    }

    public boolean a(int i, int j, Bundle bundle)
    {
        return a.a(i, j, bundle);
    }
}

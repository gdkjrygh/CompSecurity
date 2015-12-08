// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.f;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package p.f:
//            e, g, a

static class  extends 
{

    public Object a(e e1)
    {
        return g.a(new g.a(e1) {

            final e a;
            final e.c b;

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

            public List a(String s, int i)
            {
                s = a.a(s, i);
                ArrayList arraylist = new ArrayList();
                int j = s.size();
                for (i = 0; i < j; i++)
                {
                    arraylist.add(((a)s.get(i)).a());
                }

                return arraylist;
            }

            public boolean a(int i, int j, Bundle bundle)
            {
                return a.a(i, j, bundle);
            }

            public Object b(int i)
            {
                a a1 = a.b(i);
                if (a1 == null)
                {
                    return null;
                } else
                {
                    return a1.a();
                }
            }

            
            {
                b = e.c.this;
                a = e1;
                super();
            }
        });
    }

    ()
    {
    }
}

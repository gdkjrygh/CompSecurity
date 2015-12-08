// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import com.kik.g.as;
import com.kik.n.a.b.c;
import com.kik.n.a.b.i;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package kik.android.b:
//            s

private static final class a
    implements as
{

    com.kik.n.a.b.ls a;

    public final Object a(Object obj)
    {
label0:
        {
            obj = (c)obj;
            if (obj == null || a == null)
            {
                return null;
            }
            obj = ((c) (obj)).b();
            if (obj == null)
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            i j;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                j = (i)((Iterator) (obj)).next();
            } while (!a.equals(j.c()));
            return j;
        }
        return null;
    }

    public (com.kik.n.a.b. )
    {
        a = ;
    }
}

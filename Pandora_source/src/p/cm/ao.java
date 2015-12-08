// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import com.pandora.android.provider.b;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.h;
import com.pandora.radio.data.y;
import p.bz.o;
import p.cn.e;
import p.cw.c;
import p.dd.bc;
import p.di.i;

public class ao extends i
{

    private y c;
    private h d;
    private p.ci.b e;

    public ao()
    {
    }

    public ao(y y1, h h1, p.ci.b b1)
    {
        c = y1;
        d = h1;
        e = b1;
    }

    public void a()
    {
        if (a) goto _L2; else goto _L1
_L1:
        int j;
        String s = c.h();
        Object obj = d.j();
        Object obj1 = b.a.b().d().s();
        Object obj2;
        int k;
        boolean flag;
        if (obj1 == null || !((aa) (obj1)).U().equals(obj))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = p.cn.e.a();
        k = ((e) (obj1)).b(s);
        j = 0;
_L8:
        if (j >= k) goto _L4; else goto _L3
_L3:
        obj2 = ((e) (obj1)).a(s, j);
        if (!((aa) (obj2)).U().equals(obj)) goto _L6; else goto _L5
_L5:
        ((aa) (obj2)).b(0);
        b.a.b().a(new bc(((aa) (obj2)), 0, flag));
_L4:
        obj1 = p.cn.c.a();
        obj2 = b.a.b().d().t();
        if (obj2 != null && !c.c().equals(((y) (obj2)).c()))
        {
            obj = ((p.cn.c) (obj1)).a(c.b(), ((String) (obj)));
            if (obj != null)
            {
                ((aa) (obj)).b(0);
                ((p.cn.c) (obj1)).a(((aa) (obj)));
                b.a.e().a(new o(s));
            }
        }
_L2:
        return;
_L6:
        j++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void a(aa aa1)
    {
        if (!a)
        {
            e.remove(d);
        }
    }

    public void onPostExecute(Object obj)
    {
        a((aa)obj);
    }
}

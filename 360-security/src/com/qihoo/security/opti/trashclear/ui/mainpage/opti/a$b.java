// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage.opti;

import android.text.TextUtils;
import com.android.core.AsyncTask;
import com.qihoo360.mobilesafe.b.i;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage.opti:
//            a

private class a extends AsyncTask
{

    final a c;
    private final String d;
    private final String e;
    private final d f;
    private final HashMap g = new HashMap();

    protected volatile Object a(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected transient Void a(String as[])
    {
        if (i.a(com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.a(c), d))
        {
            as = i.b(com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.a(c), d);
        } else
        {
            as = i.d(com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.a(c), e);
        }
        com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.b(c).put(d, new SoftReference(as));
        d(new String[] {
            as
        });
        return null;
    }

    protected void a()
    {
        super.a();
    }

    public void a(d d1, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            g.put(d, d1);
            return;
        } else
        {
            g.put((new StringBuilder()).append(s).append("_").append(d).toString(), d1);
            return;
        }
    }

    protected volatile void a(Object obj)
    {
        a((Void)obj);
    }

    protected void a(Void void1)
    {
        super.a(void1);
    }

    protected volatile void b(Object aobj[])
    {
        b((String[])aobj);
    }

    protected transient void b(String as[])
    {
        super.b(as);
        if (f != null)
        {
            for (Iterator iterator = g.entrySet().iterator(); iterator.hasNext(); ((g)((java.util.Entry)iterator.next()).getValue()).a(as[0], d)) { }
        }
        com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.a(c, d);
    }

    public (a a1,  , String s, String s1, String s2)
    {
        c = a1;
        super();
        f = ;
        d = s1;
        e = s2;
        a(, s);
    }
}

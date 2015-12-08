// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import android.content.ContentValues;
import com.vungle.log.Logger;
import com.vungle.publisher.bi;
import com.vungle.publisher.bj;
import com.vungle.publisher.db.DatabaseHelper;

// Referenced classes of package com.vungle.publisher.db.model:
//            Ad

public abstract class Viewable extends bi
    implements bj
{
    public static class Factory
    {

        public DatabaseHelper a;

        public Factory()
        {
        }
    }


    protected String o;
    protected com.vungle.publisher.bj.a p;
    protected com.vungle.publisher.bj.b q;
    protected Ad r;

    protected Viewable()
    {
    }

    public final Integer D()
    {
        return (Integer)t;
    }

    protected ContentValues a(boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        if (flag)
        {
            contentvalues.put("id", (Integer)t);
            contentvalues.put("ad_id", o);
            contentvalues.put("type", q.toString());
        }
        contentvalues.put("status", p.toString());
        return contentvalues;
    }

    public final void a(com.vungle.publisher.bj.a a1)
    {
        Logger.v("VunglePrepare", (new StringBuilder("setting ")).append(q).append(" status from ").append(p).append(" to ").append(a1).append(" for ad_id: ").append(o).toString());
        p = a1;
    }

    protected final String b()
    {
        return "viewable";
    }

    public final void b(com.vungle.publisher.bj.a a1)
    {
        Logger.v("VunglePrepare", (new StringBuilder("updating ")).append(q).append(" status from ").append(p).append(" to ").append(a1).append(" for ad_id: ").append(o).toString());
        p = a1;
        m();
    }

    public final Ad c()
    {
        if (r == null)
        {
            r = (Ad)v().a(o);
        }
        return r;
    }

    public final String d()
    {
        return o;
    }

    public final com.vungle.publisher.bj.a e()
    {
        return p;
    }

    public final com.vungle.publisher.bj.b f()
    {
        return q;
    }

    protected StringBuilder p()
    {
        StringBuilder stringbuilder = super.p();
        bi.a(stringbuilder, "ad_id", o, false);
        bi.a(stringbuilder, "status", p, false);
        bi.a(stringbuilder, "type", q, false);
        return stringbuilder;
    }

    public final volatile Object s()
    {
        return (Integer)t;
    }

    protected abstract Ad.Factory v();

    protected final String z()
    {
        return String.valueOf(q);
    }

    // Unreferenced inner class com/vungle/publisher/db/model/Viewable$BaseFactory
    /* block-local class not found */
    class BaseFactory {}

}

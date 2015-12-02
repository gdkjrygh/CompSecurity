// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.tasklist;

import com.facebook.common.json.jsonmirror.g;
import com.facebook.debug.log.b;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.google.common.a.es;
import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.bugreporter.activity.tasklist:
//            f, Task

public class e
    implements f
{

    private static final Class a = com/facebook/bugreporter/activity/tasklist/e;

    public e()
    {
    }

    public n a(com.facebook.bugreporter.activity.tasklist.f f1)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("app", "android"));
        arraylist.add(new BasicNameValuePair("format", "json-strings"));
        arraylist.add(new BasicNameValuePair("limit", "10"));
        arraylist.add(new BasicNameValuePair("category_id", f1.b()));
        ArrayNode arraynode = new ArrayNode(JsonNodeFactory.instance);
        for (f1 = f1.a().iterator(); f1.hasNext(); arraynode.add((Long)f1.next())) { }
        arraylist.add(new BasicNameValuePair("tag_ids", arraynode.toString()));
        return new n("taskListFetcher", "POST", "method/bug.searchbytags", arraylist, t.STRING);
    }

    public volatile n a(Object obj)
    {
        return a((com.facebook.bugreporter.activity.tasklist.f)obj);
    }

    public es a(com.facebook.bugreporter.activity.tasklist.f f1, r r1)
    {
        if (r1.a() != 200)
        {
            b.d(a, "TaskListFetching failed: error code: %d, msg: %s", new Object[] {
                Integer.valueOf(r1.a()), r1.d()
            });
            return es.d();
        } else
        {
            return es.a(g.b((new JsonFactory()).createJsonParser(r1.b()), com/facebook/bugreporter/activity/tasklist/Task));
        }
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((com.facebook.bugreporter.activity.tasklist.f)obj, r1);
    }

}

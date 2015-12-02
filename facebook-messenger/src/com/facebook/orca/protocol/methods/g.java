// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.orca.server.DeleteMessagesParams;
import com.google.common.a.hq;
import com.google.common.base.Joiner;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class g
    implements f
{

    public g()
    {
    }

    public n a(DeleteMessagesParams deletemessagesparams)
    {
        deletemessagesparams = Joiner.on(",").join(deletemessagesparams.b());
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("ids", deletemessagesparams));
        arraylist.add(new BasicNameValuePair("format", "json"));
        return new n("deleteMessages", "DELETE", "", arraylist, t.STRING);
    }

    public volatile n a(Object obj)
    {
        return a((DeleteMessagesParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((DeleteMessagesParams)obj, r1);
    }

    public Void a(DeleteMessagesParams deletemessagesparams, r r1)
    {
        r1.f();
        return null;
    }
}

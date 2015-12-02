// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g;

import com.facebook.common.w.e;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class b
    implements f
{

    public b()
    {
    }

    public volatile n a(Object obj)
    {
        return a((Void)obj);
    }

    public n a(Void void1)
    {
        void1 = hq.a();
        void1.add(new BasicNameValuePair("method", "delete"));
        return new n("bulkDeleteImportedContacts", "POST", "me/bulkcontacts", void1, t.JSON);
    }

    public Boolean a(Void void1, r r1)
    {
        return Boolean.valueOf(e.g(r1.c()));
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((Void)obj, r1);
    }
}

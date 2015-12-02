// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g.a;

import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.contacts.g.a:
//            b

public class a
    implements f
{

    public a()
    {
    }

    public n a(b b1)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("profile_id", b.a(b1)));
        return new n("addUserToRolodexMethod", "POST", "/contacts", arraylist, t.STRING);
    }

    public volatile n a(Object obj)
    {
        return a((b)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((b)obj, r1);
    }

    public Void a(b b1, r r1)
    {
        r1.f();
        return null;
    }
}

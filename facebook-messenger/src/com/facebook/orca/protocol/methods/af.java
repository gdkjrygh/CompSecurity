// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.orca.server.RemoveMemberParams;
import com.google.common.a.hq;
import com.google.common.base.Objects;
import java.util.List;
import javax.inject.a;
import org.apache.http.message.BasicNameValuePair;

public class af
    implements f
{

    private final a a;

    public af(a a1)
    {
        a = a1;
    }

    public n a(RemoveMemberParams removememberparams)
    {
        if (!Objects.equal(removememberparams.b(), a.b()))
        {
            throw new IllegalArgumentException("Can only unsubscribe the user");
        } else
        {
            java.util.ArrayList arraylist = hq.a();
            arraylist.add(new BasicNameValuePair("id", removememberparams.a()));
            return new n("removeMembers", "DELETE", "/participants", arraylist, t.STRING);
        }
    }

    public volatile n a(Object obj)
    {
        return a((RemoveMemberParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((RemoveMemberParams)obj, r1);
    }

    public Void a(RemoveMemberParams removememberparams, r r1)
    {
        r1.f();
        return null;
    }
}

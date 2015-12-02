// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g;

import com.facebook.common.w.e;
import com.facebook.contacts.server.BlockContactParams;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.user.UserKey;
import com.google.common.a.hq;

public class a
    implements f
{

    public a()
    {
    }

    public n a(BlockContactParams blockcontactparams)
    {
        java.util.ArrayList arraylist = hq.a();
        blockcontactparams = blockcontactparams.a().b();
        return new n("blockContact", "POST", (new StringBuilder()).append("me/blocked/").append(blockcontactparams).toString(), arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((BlockContactParams)obj);
    }

    public Boolean a(BlockContactParams blockcontactparams, r r1)
    {
        return Boolean.valueOf(e.g(r1.c()));
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((BlockContactParams)obj, r1);
    }
}

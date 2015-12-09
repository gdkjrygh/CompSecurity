// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.useraccounts;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.google.a.a.ao;
import java.util.Iterator;
import org.c.c.c;
import org.c.d.b;

// Referenced classes of package com.dominos.android.sdk.common.dom.useraccounts:
//            UserAuthorization

class val.accessToken extends c
{

    final UserAuthorization this$0;
    final String val$accessToken;

    public String getHeaderValue()
    {
        String s = String.format("Bearer %s", new Object[] {
            val$accessToken
        });
        LogUtil.v("UserAuthorization", (new StringBuilder("Authorization: ")).append(s).toString(), new Object[0]);
        for (Iterator iterator = ao.a(".").a().a(StringHelper.substringBeforeLast(val$accessToken, ".")).iterator(); iterator.hasNext(); LogUtil.v("UserAuthorization", String.format("Decoded: %s", new Object[] {
    new String(b.decode((String)iterator.next()))
}), new Object[0])) { }
        return s;
    }

    I()
    {
        this$0 = final_userauthorization;
        val$accessToken = String.this;
        super();
    }
}

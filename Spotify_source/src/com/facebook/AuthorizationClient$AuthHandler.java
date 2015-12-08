// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook:
//            AuthorizationClient

abstract class this._cls0
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    Map methodLoggingExtras;
    final AuthorizationClient this$0;

    abstract String a();

    protected final void a(String s, Object obj)
    {
        if (methodLoggingExtras == null)
        {
            methodLoggingExtras = new HashMap();
        }
        Map map = methodLoggingExtras;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = obj.toString();
        }
        map.put(s, obj);
    }

    boolean a(int i, Intent intent)
    {
        return false;
    }

    abstract boolean a(nRequest nrequest);

    boolean b()
    {
        return false;
    }

    boolean c()
    {
        return false;
    }

    void d()
    {
    }

    nRequest()
    {
        this$0 = AuthorizationClient.this;
        super();
    }
}

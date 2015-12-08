// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;

import com.addlive.impl.Log;

// Referenced classes of package com.addlive.service:
//            Responder

public class ResponderAdapter
    implements Responder
{

    private static final String LOG_TAG = "AddLive_SDK";
    private String method;

    public ResponderAdapter()
    {
        method = "unknown method";
    }

    public ResponderAdapter(String s)
    {
        method = "unknown method";
        method = s;
    }

    public void errHandler(int i, String s)
    {
        Log.e("AddLive_SDK", (new StringBuilder("Got an error while calling method: ")).append(method).append(" cause: ").append(s).append("(").append(i).append(")").toString());
    }

    public void resultHandler(Object obj)
    {
        Log.d("AddLive_SDK", (new StringBuilder("Got successful result of method call: ")).append(method).toString());
    }
}

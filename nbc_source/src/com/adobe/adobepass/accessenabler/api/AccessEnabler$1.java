// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.adobe.adobepass.accessenabler.api:
//            AccessEnabler

class this._cls0 extends Handler
{

    final AccessEnabler this$0;

    public void handleMessage(Message message)
    {
        message = message.getData();
        String s = message.getString("url");
        Object obj = message.getStringArrayList("domains");
        HashMap hashmap = new HashMap();
        String s1;
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); hashmap.put(s1, message.getStringArrayList(s1)))
        {
            s1 = (String)((Iterator) (obj)).next();
        }

        AccessEnabler.access$200(AccessEnabler.this, s, hashmap);
    }

    ()
    {
        this$0 = AccessEnabler.this;
        super();
    }
}

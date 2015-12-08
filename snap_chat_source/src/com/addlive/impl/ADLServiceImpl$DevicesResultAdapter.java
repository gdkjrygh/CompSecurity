// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import com.addlive.service.Device;
import com.addlive.service.Responder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.addlive.impl:
//            BaseResultAdapter, ADLServiceImpl

class this._cls0 extends BaseResultAdapter
{

    final ADLServiceImpl this$0;

    void handleSuccess(Object obj)
    {
        LinkedList linkedlist;
        if (responder == null)
        {
            return;
        }
        obj = (JSONObject)obj;
        Iterator iterator = ((JSONObject) (obj)).keys();
        linkedlist = new LinkedList();
        try
        {
            String s;
            for (; iterator.hasNext(); linkedlist.add(new Device(s, ((JSONObject) (obj)).getString(s))))
            {
                s = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            responder.errHandler(1006, "Failed to parse devices list");
            return;
        }
        responder.resultHandler(linkedlist);
        return;
    }

    (Responder responder)
    {
        this$0 = ADLServiceImpl.this;
        super(responder);
    }
}

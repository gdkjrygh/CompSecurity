// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.model.GraphMultiResult;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.facebook:
//            AuthorizationClient, Response

class val.tokenPermissions
    implements val.tokenPermissions
{

    final AuthorizationClient this$0;
    final ArrayList val$tokenPermissions;

    public void onCompleted(Response response)
    {
        try
        {
            response = (GraphMultiResult)response.getGraphObjectAs(com/facebook/model/GraphMultiResult);
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            return;
        }
        if (response == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        response = response.getData();
        if (response == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (response.size() == 1)
        {
            response = (GraphObject)response.get(0);
            val$tokenPermissions.addAll(response.asMap().keySet());
        }
    }

    ()
    {
        this$0 = final_authorizationclient;
        val$tokenPermissions = ArrayList.this;
        super();
    }
}

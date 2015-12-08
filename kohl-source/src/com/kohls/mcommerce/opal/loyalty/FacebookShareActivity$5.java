// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import com.facebook.Response;
import com.facebook.model.GraphUser;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            FacebookShareActivity

class this._cls0
    implements com.facebook.k
{

    final FacebookShareActivity this$0;

    public void onCompleted(GraphUser graphuser, Response response)
    {
        response = null;
        if (graphuser != null)
        {
            response = graphuser.getName();
        }
        didFinishFBUserDetailsRequest(response);
    }

    ()
    {
        this$0 = FacebookShareActivity.this;
        super();
    }
}

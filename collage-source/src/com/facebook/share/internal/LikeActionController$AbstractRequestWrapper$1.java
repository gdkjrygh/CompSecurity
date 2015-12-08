// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.GraphResponse;

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

class this._cls1
    implements com.facebook.questWrapper._cls1
{

    final ocessSuccess this$1;

    public void onCompleted(GraphResponse graphresponse)
    {
        ror = graphresponse.getError();
        if (ror != null)
        {
            ocessError(ror);
            return;
        } else
        {
            ocessSuccess(graphresponse);
            return;
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}

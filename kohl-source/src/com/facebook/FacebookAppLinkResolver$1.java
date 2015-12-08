// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.net.Uri;
import bolts.AppLink;
import bolts.Continuation;
import bolts.Task;
import java.util.Map;

// Referenced classes of package com.facebook:
//            FacebookAppLinkResolver

class val.uri
    implements Continuation
{

    final FacebookAppLinkResolver this$0;
    final Uri val$uri;

    public AppLink then(Task task)
        throws Exception
    {
        return (AppLink)((Map)task.getResult()).get(val$uri);
    }

    public volatile Object then(Task task)
        throws Exception
    {
        return then(task);
    }

    ()
    {
        this$0 = final_facebookapplinkresolver;
        val$uri = Uri.this;
        super();
    }
}

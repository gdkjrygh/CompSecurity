// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.viewercontext;

import android.app.Activity;
import android.content.Intent;
import com.facebook.base.activity.a;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.auth.viewercontext:
//            ViewerContext, e

public class h extends a
{

    public h()
    {
    }

    public void f(Activity activity)
    {
        super.f(activity);
        ViewerContext viewercontext = (ViewerContext)activity.getIntent().getParcelableExtra("com.facebook.orca.auth.OVERRIDDEN_VIEWER_CONTEXT");
        if (viewercontext != null)
        {
            ((e)t.a(activity).a(com/facebook/auth/viewercontext/e)).a(viewercontext);
        }
    }
}

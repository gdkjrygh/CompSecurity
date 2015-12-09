// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.jcp.activities.PrivacyPolicyActivity;
import java.lang.ref.WeakReference;

// Referenced classes of package com.jcp.widget:
//            i

class j
    implements android.view.View.OnClickListener
{

    final i a;

    j(i k)
    {
        a = k;
        super();
    }

    public void onClick(View view)
    {
        if (i.a(a) != null && i.a(a).get() != null)
        {
            ((Activity)i.a(a).get()).startActivity(new Intent((Context)i.a(a).get(), com/jcp/activities/PrivacyPolicyActivity));
        }
    }
}

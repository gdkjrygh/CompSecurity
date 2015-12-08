// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.net.Uri;
import android.view.View;
import java.util.Locale;

// Referenced classes of package com.soundcloud.android.profile:
//            UserDetailsView

class val.myspaceName
    implements android.view.er
{

    final UserDetailsView this$0;
    final String val$myspaceName;

    public void onClick(View view)
    {
        if (UserDetailsView.access$000(UserDetailsView.this) != null)
        {
            UserDetailsView.access$000(UserDetailsView.this).onViewUri(Uri.parse(String.format(Locale.US, "http://www.myspace.com/%s", new Object[] {
                val$myspaceName
            })));
        }
    }

    erDetailsListener()
    {
        this$0 = final_userdetailsview;
        val$myspaceName = String.this;
        super();
    }
}

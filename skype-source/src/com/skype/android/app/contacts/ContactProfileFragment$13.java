// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.view.View;
import com.skype.PROPKEY;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.Navigation;
import com.skype.android.util.permission.Permission;
import com.skype.android.util.permission.PermissionHandlerAdapter;
import com.skype.android.util.permission.PermissionRequest;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactProfileFragment

final class val.phoneKey
    implements android.view.rofileFragment._cls13
{

    final ContactProfileFragment this$0;
    final PROPKEY val$phoneKey;

    public final void onClick(View view)
    {
        permissionRequest.a(Permission.n, true, new PermissionHandlerAdapter() {

            final ContactProfileFragment._cls13 this$1;

            public final void onGranted()
            {
                analytics.c(AnalyticsEvent.d);
                navigation.placeCall(ContactProfileFragment.access$100(this$0), phoneKey);
            }

            
            {
                this$1 = ContactProfileFragment._cls13.this;
                super();
            }
        });
    }

    r()
    {
        this$0 = final_contactprofilefragment;
        val$phoneKey = PROPKEY.this;
        super();
    }
}

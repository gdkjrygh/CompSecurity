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

final class <init> extends PermissionHandlerAdapter
{

    final l.phoneKey this$1;

    public final void onGranted()
    {
        analytics.c(AnalyticsEvent.d);
        navigation.placeCall(ContactProfileFragment.access$100(_fld0), phoneKey);
    }

    l.phoneKey()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/skype/android/app/contacts/ContactProfileFragment$13

/* anonymous class */
    final class ContactProfileFragment._cls13
        implements android.view.View.OnClickListener
    {

        final ContactProfileFragment this$0;
        final PROPKEY val$phoneKey;

        public final void onClick(View view)
        {
            permissionRequest.a(Permission.n, true, new ContactProfileFragment._cls13._cls1());
        }

            
            {
                this$0 = final_contactprofilefragment;
                phoneKey = PROPKEY.this;
                super();
            }
    }

}

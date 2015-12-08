// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.Intent;
import android.view.View;
import com.skype.PROPKEY;
import com.skype.android.app.Navigation;
import com.skype.android.app.main.EditPropertyActivity;
import com.skype.android.util.permission.Permission;
import com.skype.android.util.permission.PermissionHandlerAdapter;
import com.skype.android.util.permission.PermissionRequest;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactProfileFragment

final class val.phone
    implements android.view.ProfileFragment._cls2
{

    final ContactProfileFragment this$0;
    final String val$phone;
    final PROPKEY val$phoneKey;
    final int val$position;

    public final void onClick(View view)
    {
        if (ContactProfileFragment.access$300(ContactProfileFragment.this))
        {
            view = navigation.intentFor(ContactProfileFragment.access$100(ContactProfileFragment.this), com/skype/android/app/main/EditPropertyActivity);
            view.putExtra("com.skype.propkey", val$phoneKey);
            view.putExtra("editMode", ContactProfileFragment.access$300(ContactProfileFragment.this));
            view.putExtra("phonePosition", val$position + 1);
            startActivity(view);
            return;
        } else
        {
            permissionRequest.a(Permission.n, true, new PermissionHandlerAdapter() {

                final ContactProfileFragment._cls2 this$1;

                public final void onGranted()
                {
                    navigation.placeCall(phone);
                }

            
            {
                this$1 = ContactProfileFragment._cls2.this;
                super();
            }
            });
            return;
        }
    }

    er()
    {
        this$0 = final_contactprofilefragment;
        val$phoneKey = propkey;
        val$position = i;
        val$phone = String.this;
        super();
    }
}

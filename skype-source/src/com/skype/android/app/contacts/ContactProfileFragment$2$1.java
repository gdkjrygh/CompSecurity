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

final class  extends PermissionHandlerAdapter
{

    final l.phone this$1;

    public final void onGranted()
    {
        navigation.placeCall(phone);
    }

    l.phone()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/skype/android/app/contacts/ContactProfileFragment$2

/* anonymous class */
    final class ContactProfileFragment._cls2
        implements android.view.View.OnClickListener
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
                view.putExtra("com.skype.propkey", phoneKey);
                view.putExtra("editMode", ContactProfileFragment.access$300(ContactProfileFragment.this));
                view.putExtra("phonePosition", position + 1);
                startActivity(view);
                return;
            } else
            {
                permissionRequest.a(Permission.n, true, new ContactProfileFragment._cls2._cls1());
                return;
            }
        }

            
            {
                this$0 = final_contactprofilefragment;
                phoneKey = propkey;
                position = i;
                phone = String.this;
                super();
            }
    }

}

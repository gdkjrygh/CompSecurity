// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.content.Intent;
import com.skype.ContactImpl;
import com.skype.SkyLib;
import com.skype.android.app.Navigation;
import com.skype.android.util.permission.PermissionHandlerAdapter;

// Referenced classes of package com.skype.android:
//            SkypeIntentHandler

final class ssionHandlerAdapter extends PermissionHandlerAdapter
{

    final Intent a;
    final SkypeIntentHandler b;

    public final void onGranted()
    {
        String s = a.getStringExtra("com.skype.identitiy");
        String s1 = a.getStringExtra("android.intent.extra.PHONE_NUMBER");
        ContactImpl contactimpl = new ContactImpl();
        SkypeIntentHandler.a(b).getContact(s, contactimpl);
        if (s1 == null)
        {
            SkypeIntentHandler.b(b).placeCall(contactimpl);
            return;
        } else
        {
            SkypeIntentHandler.b(b).placeCall(contactimpl, s1);
            return;
        }
    }

    ssionHandlerAdapter(SkypeIntentHandler skypeintenthandler, Intent intent)
    {
        b = skypeintenthandler;
        a = intent;
        super();
    }
}

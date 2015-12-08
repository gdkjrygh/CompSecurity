// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.app.Navigation;
import com.skype.android.util.permission.PermissionHandlerAdapter;
import java.util.ArrayList;

// Referenced classes of package com.skype.android:
//            SkypeIntentHandler

final class ssionHandlerAdapter extends PermissionHandlerAdapter
{

    final ArrayList a;
    final String b;
    final SkypeIntentHandler c;

    public final void onGranted()
    {
        SkypeIntentHandler.b(c).placeCall(a, b);
    }

    ssionHandlerAdapter(SkypeIntentHandler skypeintenthandler, ArrayList arraylist, String s)
    {
        c = skypeintenthandler;
        a = arraylist;
        b = s;
        super();
    }
}

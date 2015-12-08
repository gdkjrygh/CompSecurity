// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.z;
import com.tinder.model.User;

// Referenced classes of package com.tinder.fragments:
//            u

final class a
    implements android.view..OnClickListener
{

    final u a;

    public final void onClick(View view)
    {
        view = a.E.b();
        if (view != null)
        {
            Object obj = view.getUsername();
            if (ManagerApp.a)
            {
                view = "https://prodtest2-website.gotinder.com/@";
            } else
            {
                view = a.getString(0x7f06021e);
            }
            view = (new StringBuilder()).append(view).append(((String) (obj))).toString();
            obj = new Intent("android.intent.action.SEND");
            ((Intent) (obj)).setType("text/plain");
            ((Intent) (obj)).putExtra("android.intent.extra.TEXT", view);
            a.startActivity(Intent.createChooser(((Intent) (obj)), a.getResources().getString(0x7f0601d6)));
            com.tinder.managers.a.a("DeepLink.ShareID");
        }
    }

    rces(u u1)
    {
        a = u1;
        super();
    }
}

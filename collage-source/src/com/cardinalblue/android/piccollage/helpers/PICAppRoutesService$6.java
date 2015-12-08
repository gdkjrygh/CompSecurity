// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.helpers;

import android.content.Intent;
import android.os.Bundle;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.activities.HomeActivity;
import com.cardinalblue.android.piccollage.activities.PicUsersListActivity;
import com.cardinalblue.android.piccollage.model.gson.PicUser;

// Referenced classes of package com.cardinalblue.android.piccollage.helpers:
//            PICAppRoutesService

class a
    implements i
{

    final Bundle a;
    final PICAppRoutesService b;

    public Void a(j j1)
        throws Exception
    {
        if (j1.c() || j1.d())
        {
            j1 = new Intent(b, com/cardinalblue/android/piccollage/activities/HomeActivity);
            j1.putExtras(a);
        } else
        {
            PicUser picuser = (PicUser)j1.e();
            j1 = new Intent(b, com/cardinalblue/android/piccollage/activities/PicUsersListActivity);
            j1.putExtras(a);
            j1.putExtra("type", 0);
            j1.putExtra("user_name", picuser.getDisplayName());
            j1.putExtra("user_list_path", String.format("users/%s/followers", new Object[] {
                picuser.getId()
            }));
        }
        j1.addFlags(0x10000000);
        b.startActivity(j1);
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    y(PICAppRoutesService picapproutesservice, Bundle bundle)
    {
        b = picapproutesservice;
        a = bundle;
        super();
    }
}

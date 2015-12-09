// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.view.View;
import com.cardinalblue.android.piccollage.model.gson.PicUser;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            r

class b
    implements android.view..OnClickListener
{

    final PicUser a;
    final PicUser b;
    final r c;

    public void onClick(View view)
    {
        if (r.a(c) != null)
        {
            r.a(c).a(c, a);
        }
        view = a;
        boolean flag;
        if (!a.isFollowing().booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setIsFollowing(flag);
        r.a(c, a, b.c);
    }

    PicUser(r r1, PicUser picuser, PicUser picuser1)
    {
        c = r1;
        a = picuser;
        b = picuser1;
        super();
    }
}

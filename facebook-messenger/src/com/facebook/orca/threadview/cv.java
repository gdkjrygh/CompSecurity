// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.messages.model.threads.Message;
import com.facebook.user.UserKey;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.OverlayItem;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewMapActivityImpl

class cv extends OverlayItem
{

    final ThreadViewMapActivityImpl a;
    private final UserKey b;
    private final float c;
    private final Message d;

    public cv(ThreadViewMapActivityImpl threadviewmapactivityimpl, GeoPoint geopoint, float f, String s, String s1, UserKey userkey, Message message)
    {
        a = threadviewmapactivityimpl;
        super(geopoint, s, s1);
        b = userkey;
        c = f;
        d = message;
    }

    public UserKey a()
    {
        return b;
    }

    public Message b()
    {
        return d;
    }

    public float c()
    {
        return c;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Intent;
import android.os.Parcelable;
import bolts.i;
import bolts.j;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PublicCollageActivity

class a
    implements i
{

    final PublicCollageActivity a;

    public Void a(j j1)
        throws Exception
    {
        Intent intent = new Intent(a, com/cardinalblue/android/piccollage/activities/PublicCollageActivity);
        intent.setAction("piccollage.intent.action.VIEW_COLLAGE");
        intent.putExtra("web_photo_data", (Parcelable)j1.e());
        a.startActivity(intent);
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (PublicCollageActivity publiccollageactivity)
    {
        a = publiccollageactivity;
        super();
    }
}

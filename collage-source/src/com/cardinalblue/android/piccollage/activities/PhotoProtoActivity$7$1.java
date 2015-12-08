// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import bolts.i;
import bolts.j;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            StickersActivity, PhotoProtoActivity

class a
    implements Runnable
{

    final tActivityForResult a;

    public void run()
    {
        Intent intent = new Intent(a., com/cardinalblue/android/piccollage/activities/StickersActivity);
        intent.setAction("com.cardinalblue.sticker.moveto");
        intent.putExtra("max_choices", 30);
        intent.putExtra("from", PhotoProtoActivity.h(a.));
        intent.putExtra("key_memento", a..a);
        boolean flag = a..getBoolean("extra_from_iap", false);
        if (flag)
        {
            intent.putExtra("key_purchase_bundle", a.);
        }
        PhotoProtoActivity photoprotoactivity = a.;
        byte byte0;
        if (flag)
        {
            byte0 = 7;
        } else
        {
            byte0 = 3;
        }
        photoprotoactivity.startActivityForResult(intent, byte0);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/activities/PhotoProtoActivity$43

/* anonymous class */
    class PhotoProtoActivity._cls43
        implements i
    {

        final Bundle a;
        final String b;
        final PhotoProtoActivity c;

        public Void a(j j)
            throws Exception
        {
            PhotoProtoActivity.b(c).post(new PhotoProtoActivity._cls7._cls1(this));
            return null;
        }

        public Object then(j j)
            throws Exception
        {
            return a(j);
        }

            
            {
                c = photoprotoactivity;
                a = bundle;
                b = s;
                super();
            }
    }

}

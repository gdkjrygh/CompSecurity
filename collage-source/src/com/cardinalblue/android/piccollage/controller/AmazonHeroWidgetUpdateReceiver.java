// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.squareup.a.b;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            d

public class AmazonHeroWidgetUpdateReceiver extends BroadcastReceiver
{

    private static final String a = com/cardinalblue/android/piccollage/controller/AmazonHeroWidgetUpdateReceiver.getSimpleName();

    public AmazonHeroWidgetUpdateReceiver()
    {
    }

    private j a()
    {
        return j.a(new Callable() {

            final AmazonHeroWidgetUpdateReceiver a;

            public CBCollagesResponse a()
                throws Exception
            {
                CBCollagesResponse cbcollagesresponse;
                try
                {
                    cbcollagesresponse = f.i();
                }
                catch (Exception exception)
                {
                    com.cardinalblue.android.piccollage.a.f.a(exception);
                    return null;
                }
                return cbcollagesresponse;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = AmazonHeroWidgetUpdateReceiver.this;
                super();
            }
        });
    }

    private j b()
    {
        return j.a(new Callable() {

            final AmazonHeroWidgetUpdateReceiver a;

            public CBCollagesResponse a()
                throws Exception
            {
                CBCollagesResponse cbcollagesresponse;
                try
                {
                    cbcollagesresponse = f.l();
                }
                catch (Exception exception)
                {
                    com.cardinalblue.android.piccollage.a.f.a(exception);
                    return null;
                }
                return cbcollagesresponse;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = AmazonHeroWidgetUpdateReceiver.this;
                super();
            }
        });
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!"piccollage.intent.action.UPDATE_HERO".equals(intent.getAction()))
        {
            return;
        }
        context.getString(0x7f0701ad);
        String s = context.getString(0x7f07021c);
        if (PicAuth.h().b())
        {
            intent = context.getString(0x7f0701b6);
            context = b();
        } else
        {
            intent = context.getString(0x7f0701ad);
            context = a();
        }
        context.c(new i(intent, s) {

            final String a;
            final String b;
            final AmazonHeroWidgetUpdateReceiver c;

            public Void a(j j1)
                throws Exception
            {
                CBCollagesResponse cbcollagesresponse = (CBCollagesResponse)j1.e();
                j1 = cbcollagesresponse;
                if (cbcollagesresponse == null)
                {
                    j1 = new CBCollagesResponse();
                }
                d.a().c(new com.cardinalblue.android.piccollage.amazon.HomeHeroWidgetManager.UpdateHeroWidgetEvent(a, b, j1.getPhotos()));
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                c = AmazonHeroWidgetUpdateReceiver.this;
                a = s;
                b = s1;
                super();
            }
        }, k.a);
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package com.thetransitapp.droid:
//            TransitActivity

public class MapsLaunchActivity extends Activity
{

    public MapsLaunchActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
label0:
        {
            super.onCreate(bundle);
            Object obj1 = super.getIntent();
            Object obj = ((Intent) (obj1)).getData().getQueryParameter("saddr");
            String s1 = ((Intent) (obj1)).getData().getQueryParameter("daddr");
            String s;
            if (obj != null)
            {
                bundle = ((Bundle) (obj));
                s = s1;
                if (s1 != null)
                {
                    break label0;
                }
            }
            obj1 = ((Intent) (obj1)).getData().getQueryParameter("myl");
            bundle = ((Bundle) (obj));
            s = s1;
            if (obj1 != null)
            {
                if (((String) (obj1)).equals("saddr"))
                {
                    bundle = "myl";
                    s = s1;
                } else
                {
                    s = "myl";
                    bundle = ((Bundle) (obj));
                }
            }
        }
        obj = new Intent(this, com/thetransitapp/droid/TransitActivity);
        ((Intent) (obj)).putExtra("from", bundle);
        ((Intent) (obj)).putExtra("to", s);
        super.startActivity(((Intent) (obj)));
        super.finish();
    }
}

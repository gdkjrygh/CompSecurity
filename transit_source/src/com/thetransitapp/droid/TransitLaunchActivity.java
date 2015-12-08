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

public class TransitLaunchActivity extends Activity
{

    public TransitLaunchActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        Intent intent;
        Object obj;
        super.onCreate(bundle);
        obj = super.getIntent();
        bundle = ((Intent) (obj)).getData().getHost();
        intent = new Intent(this, com/thetransitapp/droid/TransitActivity);
        if (!"routes".equals(bundle)) goto _L2; else goto _L1
_L1:
        intent.putExtra("query", ((Intent) (obj)).getData().getQueryParameter("q"));
_L4:
        super.startActivity(intent);
        super.finish();
        return;
_L2:
label0:
        {
            if (!"directions".equals(bundle))
            {
                continue; /* Loop/switch isn't completed */
            }
            String s1 = ((Intent) (obj)).getData().getQueryParameter("from");
            String s2 = ((Intent) (obj)).getData().getQueryParameter("to");
            String s;
            if (s1 != null)
            {
                bundle = s1;
                s = s2;
                if (s2 != null)
                {
                    break label0;
                }
            }
            obj = ((Intent) (obj)).getData().getQueryParameter("myl");
            bundle = s1;
            s = s2;
            if (obj != null)
            {
                if (((String) (obj)).equals("saddr"))
                {
                    bundle = "myl";
                    s = s2;
                } else
                {
                    s = "myl";
                    bundle = s1;
                }
            }
        }
        intent.putExtra("from", bundle);
        intent.putExtra("to", s);
        if (true) goto _L4; else goto _L3
_L3:
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.facebook.FacebookRequestError;
import com.facebook.GraphResponse;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.a;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            FbLoginActivity

final class ae
    implements com.facebook.GraphRequest.GraphJSONObjectCallback
{

    final FbLoginActivity a;

    private ae(FbLoginActivity fbloginactivity)
    {
        a = fbloginactivity;
        super();
    }

    ae(FbLoginActivity fbloginactivity, byte byte0)
    {
        this(fbloginactivity);
    }

    public final void onCompleted(JSONObject jsonobject, GraphResponse graphresponse)
    {
        Object obj;
        String s1;
        if (a.isFinishing())
        {
            return;
        }
        if (FbLoginActivity.c(a) != null)
        {
            FbLoginActivity.c(a).dismiss();
        }
        if (jsonobject == null)
        {
            if (graphresponse.getError() != null)
            {
                com.roidapp.cloudlib.facebook.FbLoginActivity.a(a, graphresponse.getError().getException());
                return;
            } else
            {
                Toast.makeText(a, a.getString(at.h), 1).show();
                a.setResult(0);
                a.finish();
                return;
            }
        }
        graphresponse = jsonobject.optString("id");
        obj = jsonobject.optString("name");
        com.roidapp.cloudlib.common.a.a(a, ((String) (obj)), graphresponse);
        graphresponse = a.getIntent();
        obj = new Bundle();
        String s = jsonobject.optString("email");
        s1 = jsonobject.optString("gender");
        jsonobject = jsonobject.optString("locale");
        ((Bundle) (obj)).putString("email", s);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (!s1.equalsIgnoreCase("male")) goto _L4; else goto _L3
_L3:
        ((Bundle) (obj)).putString("gender", "1");
_L2:
        ((Bundle) (obj)).putString("locale", jsonobject);
        graphresponse.putExtra("signData", ((Bundle) (obj)));
        a.setResult(-1, graphresponse);
        a.finish();
        return;
_L4:
        if (s1.equalsIgnoreCase("female"))
        {
            ((Bundle) (obj)).putString("gender", "0");
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.login;

import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.c;
import com.cardinalblue.android.piccollage.a.i;
import com.cardinalblue.android.piccollage.view.fragments.ae;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import org.json.JSONObject;

// Referenced classes of package com.cardinalblue.android.piccollage.activities.login:
//            FbLoginForReadActivity

class a
    implements com.facebook.tCallback
{

    final sh a;

    public void onCompleted(JSONObject jsonobject, GraphResponse graphresponse)
    {
        if (graphresponse.getError() != null)
        {
            k.a(a.a, 0x7f0700f8, 1);
            a.a.setResult(0);
            a.a.finish();
        }
        c.a(a.a.getApplicationContext(), jsonobject);
        i.a(a.a);
        a.a.setResult(-1);
        a.a.finish();
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/activities/login/FbLoginForReadActivity$1

/* anonymous class */
    class FbLoginForReadActivity._cls1
        implements FacebookCallback
    {

        final FbLoginForReadActivity a;

        public void a(LoginResult loginresult)
        {
            ae ae1 = ae.a(0x7f0701fa, false, 0);
            k.a(a, ae1, a.getString(0x7f0701fa));
            GraphRequest.newMeRequest(loginresult.getAccessToken(), new FbLoginForReadActivity._cls1._cls1(this)).executeAsync();
        }

        public void onCancel()
        {
            a.setResult(0);
            a.finish();
        }

        public void onError(FacebookException facebookexception)
        {
            k.a(a, 0x7f0700f8, 1);
            a.setResult(0);
            a.finish();
        }

        public void onSuccess(Object obj)
        {
            a((LoginResult)obj);
        }

            
            {
                a = fbloginforreadactivity;
                super();
            }
    }

}

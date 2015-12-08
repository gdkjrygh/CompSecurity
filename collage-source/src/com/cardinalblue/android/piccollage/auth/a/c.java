// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.auth.a;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.activities.login.FbLoginActivity;
import com.cardinalblue.android.piccollage.activities.login.FbLoginForReadActivity;
import com.facebook.AccessToken;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.cardinalblue.android.piccollage.auth.a:
//            b

public class c extends com.cardinalblue.android.piccollage.auth.a.b
{

    private boolean a;

    public c()
    {
        super("facebook");
        a = false;
        a = false;
    }

    public void a()
    {
        com.cardinalblue.android.piccollage.a.c.a(k.a());
    }

    public void a(Fragment fragment, int i, String s)
    {
        com.cardinalblue.android.piccollage.a.b.aj(s);
        android.support.v4.app.FragmentActivity fragmentactivity = fragment.getActivity();
        if (a)
        {
            s = com/cardinalblue/android/piccollage/activities/login/FbLoginActivity;
        } else
        {
            s = com/cardinalblue/android/piccollage/activities/login/FbLoginForReadActivity;
        }
        fragment.startActivityForResult(new Intent(fragmentactivity, s), i);
    }

    public boolean a(Context context)
    {
        return AccessToken.getCurrentAccessToken() != null;
    }

    public List b()
    {
        ArrayList arraylist = new ArrayList();
        if (AccessToken.getCurrentAccessToken() == null)
        {
            return arraylist;
        } else
        {
            arraylist.add(new BasicNameValuePair("auth[facebook][token]", AccessToken.getCurrentAccessToken().getToken()));
            arraylist.add(new BasicNameValuePair("target[]", "facebook"));
            return arraylist;
        }
    }
}

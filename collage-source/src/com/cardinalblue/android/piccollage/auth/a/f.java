// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.auth.a;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.activities.login.TwitterLoginActivity;
import com.cardinalblue.android.piccollage.controller.r;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import twitter4j.auth.AccessToken;

// Referenced classes of package com.cardinalblue.android.piccollage.auth.a:
//            b

public class f extends b
{

    private r a;

    public f()
    {
        super("twitter");
        a = new r(k.a(), null);
    }

    public void a()
    {
        a.d();
        k.a(k.a(), "twitter.com");
    }

    public void a(Fragment fragment, int i, String s)
    {
        s = new Intent(fragment.getActivity(), com/cardinalblue/android/piccollage/activities/login/TwitterLoginActivity);
        s.putExtra("caption", "");
        fragment.startActivityForResult(s, i);
    }

    public boolean a(Context context)
    {
        return a.c();
    }

    public List b()
    {
        ArrayList arraylist = new ArrayList();
        AccessToken accesstoken;
        try
        {
            accesstoken = a.b();
        }
        catch (Throwable throwable)
        {
            return arraylist;
        }
        if (accesstoken == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        arraylist.add(new BasicNameValuePair("auth[twitter][token]", accesstoken.getToken()));
        arraylist.add(new BasicNameValuePair("auth[twitter][token_secret]", accesstoken.getTokenSecret()));
        arraylist.add(new BasicNameValuePair("target[]", "twitter"));
        return arraylist;
    }
}

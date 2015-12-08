// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.auth.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.activities.login.TumblrLoginActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.a.d.f;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.cardinalblue.android.piccollage.auth.a:
//            b

public class e extends b
{

    public e()
    {
        super("tumblr");
    }

    public static f a(String s)
        throws Exception
    {
        String as[] = s.split("&");
        HashMap hashmap = new HashMap();
        for (int i = 0; i < as.length; i++)
        {
            String as1[] = as[i].split("=");
            if (as1.length < 2)
            {
                throw new Exception((new StringBuilder()).append("parts < 2: ").append(s).toString());
            }
            hashmap.put(as1[0], as1[1]);
        }

        if (!hashmap.containsKey("oauth_token"))
        {
            throw new Exception((new StringBuilder()).append("no oauth_token in ").append(s).toString());
        }
        if (!hashmap.containsKey("oauth_token_secret"))
        {
            throw new Exception((new StringBuilder()).append("no oauth_token_secret in ").append(s).toString());
        } else
        {
            return new f((String)hashmap.get("oauth_token"), (String)hashmap.get("oauth_token_secret"), s);
        }
    }

    public static boolean a(f f1, String s)
    {
        return k.j().edit().putString("pref_tumblr_token", f1.f()).putString("pref_tumblr_user_name", s).commit();
    }

    public static f d()
    {
        f f1;
        try
        {
            f1 = a(k.j().getString("pref_tumblr_token", ""));
        }
        catch (Exception exception)
        {
            k.j().edit().remove("pref_tumblr_token").commit();
            return null;
        }
        return f1;
    }

    public void a()
    {
        k.j().edit().remove("pref_tumblr_token").remove("pref_tumblr_user_name").commit();
    }

    public void a(Activity activity, int i, String s)
    {
        activity.startActivityForResult(new Intent(activity, com/cardinalblue/android/piccollage/activities/login/TumblrLoginActivity), i);
    }

    public void a(Fragment fragment, int i, String s)
    {
        fragment.startActivityForResult(new Intent(fragment.getActivity(), com/cardinalblue/android/piccollage/activities/login/TumblrLoginActivity), i);
    }

    public boolean a(Context context)
    {
        return d() != null;
    }

    public List b()
    {
        ArrayList arraylist = new ArrayList();
        f f1 = d();
        if (f1 == null)
        {
            return arraylist;
        } else
        {
            arraylist.add(new BasicNameValuePair("auth[tumblr][token]", f1.d()));
            arraylist.add(new BasicNameValuePair("auth[tumblr][token_secret]", f1.e()));
            arraylist.add(new BasicNameValuePair("target[]", "tumblr"));
            return arraylist;
        }
    }
}

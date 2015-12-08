// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.auth.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.auth.PicLoginActivity;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.cardinalblue.android.piccollage.auth.a:
//            b

public class d extends b
{

    public d()
    {
        super("cb");
    }

    public void a()
    {
        PicAuth.h().a();
    }

    public void a(Activity activity, int i, String s)
    {
        Intent intent = new Intent(activity, com/cardinalblue/android/piccollage/auth/PicLoginActivity);
        intent.putExtra("from", s);
        activity.startActivityForResult(intent, i);
    }

    public void a(Fragment fragment, int i, String s)
    {
        Intent intent = new Intent(fragment.getActivity(), com/cardinalblue/android/piccollage/auth/PicLoginActivity);
        intent.putExtra("from", s);
        fragment.startActivityForResult(intent, i);
    }

    public boolean a(Context context)
    {
        context = PicAuth.h();
        return context != null && context.b();
    }

    public List b()
    {
        PicAuth picauth = PicAuth.h();
        ArrayList arraylist = new ArrayList();
        if (picauth != null && picauth.b())
        {
            arraylist.add(new BasicNameValuePair("cb_access_token", picauth.d()));
            arraylist.add(new BasicNameValuePair("target[]", "cb"));
        }
        return arraylist;
    }
}

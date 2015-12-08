// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.auth.a;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.activities.KddiLoginActivity;
import com.cardinalblue.android.piccollage.controller.b.c;
import com.cardinalblue.android.piccollage.model.j;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.cardinalblue.android.piccollage.auth.a:
//            b

public class a extends b
{

    public a()
    {
        super("au");
    }

    public void a()
    {
        j.a(k.a()).b();
        k.a(k.a(), "auone.jp");
    }

    public void a(Fragment fragment, int i, String s)
    {
        fragment.startActivityForResult(new Intent(fragment.getActivity(), com/cardinalblue/android/piccollage/activities/KddiLoginActivity), i);
    }

    public boolean a(Context context)
    {
        return j.a(context).c();
    }

    public List b()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("auth[kddi][token]", j.a(k.a()).a().d()));
        arraylist.add(new BasicNameValuePair("target[]", "kddi"));
        return arraylist;
    }
}

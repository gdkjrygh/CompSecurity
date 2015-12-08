// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.a.d;
import com.google.android.gms.a.f;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;

// Referenced classes of package com.dominos.activities:
//            BaseActivity

public abstract class IndexingActivity extends BaseActivity
{

    private String mAppUrl;
    private l mClient;
    private String mTitle;
    private String mWebUrl;

    public IndexingActivity()
    {
    }

    private a constructViewAction()
    {
        Object obj = Uri.parse(mWebUrl);
        Uri uri = Uri.parse(mAppUrl);
        Object obj1 = mTitle;
        b b1 = new b("http://schema.org/ViewAction");
        obj1 = (new f()).a(((String) (obj1)));
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((Uri) (obj)).toString();
        }
        if (obj != null)
        {
            ((f) (obj1)).a("id", ((String) (obj)));
        }
        return b1.a(((f) (obj1)).a(uri).b()).a();
    }

    public abstract int getIndexingResourceId();

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getResources().getStringArray(getIndexingResourceId());
        if (bundle != null)
        {
            mTitle = bundle[0];
            mAppUrl = bundle[1];
            mWebUrl = bundle[2];
            mClient = (new m(this)).a(c.a).c();
        }
    }

    protected void onStart()
    {
        super.onStart();
        if (mClient != null)
        {
            mClient.c();
            c.c.a(mClient, constructViewAction());
        }
    }

    protected void onStop()
    {
        if (mClient != null)
        {
            c.c.b(mClient, constructViewAction());
            mClient.e();
        }
        super.onStop();
    }
}

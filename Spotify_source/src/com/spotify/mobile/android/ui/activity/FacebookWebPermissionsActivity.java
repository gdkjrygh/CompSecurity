// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import aa;
import ah;
import an;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import ctz;
import cu;
import da;
import dty;
import dzs;
import fou;
import fov;
import foy;
import gdh;
import gfl;
import java.util.Set;

public class FacebookWebPermissionsActivity extends fou
    implements an
{

    private dzs d;
    private fov i;
    private String j;
    private String k;
    private String l;
    private gfl m;

    public FacebookWebPermissionsActivity()
    {
        d = new dzs();
    }

    private static String a(Uri uri, String s, String s1)
    {
        if (uri.getQueryParameterNames().contains(s))
        {
            s1 = uri.getQueryParameter(s);
        }
        return s1;
    }

    public final da a(Bundle bundle)
    {
        return new cu(this, dty.a(TextUtils.join(",", gdh.a)), new String[] {
            "request_permissions_url", "auth_success_url"
        }, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        ctz.a(obj);
        if (((Cursor) (obj)).moveToFirst())
        {
            j = ((Cursor) (obj)).getString(0);
            k = ((Cursor) (obj)).getString(1);
            d.a();
            i.b(j);
        }
    }

    protected final boolean a(Uri uri)
    {
        byte byte0 = 0;
        if (!uri.toString().startsWith(k))
        {
            return false;
        }
        Object obj = new StringBuilder(k);
        if (!k.endsWith("?"))
        {
            ((StringBuilder) (obj)).append('?');
        }
        obj = Uri.parse(((StringBuilder) (obj)).append(uri.getFragment()).toString());
        l = a(((Uri) (obj)), "access_token", l);
        uri = a(((Uri) (obj)), "denied_scopes", "");
        obj = a(((Uri) (obj)), "granted_scopes", "");
        Object obj1 = m;
        boolean flag = ((String) (obj)).contains("publish_actions");
        String s = l;
        gfl.a(((gfl) (obj1)).d, flag, s);
        obj1 = getIntent();
        ((Intent) (obj1)).putExtra("access_token", l);
        ((Intent) (obj1)).putExtra("denied_scopes", uri);
        ((Intent) (obj1)).putExtra("granted_scopes", ((String) (obj)));
        if (!TextUtils.isEmpty(l))
        {
            byte0 = -1;
        }
        setResult(byte0, ((Intent) (obj1)));
        finish();
        return true;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030022);
        if (bundle != null)
        {
            return;
        }
        m = new gfl(this);
        i = fov.F();
        i.a = new foy() {

            private FacebookWebPermissionsActivity a;

            public final boolean a(Uri uri)
            {
                return a.a(uri);
            }

            public final void b(Uri uri)
            {
                a.a(uri);
            }

            
            {
                a = FacebookWebPermissionsActivity.this;
                super();
            }
        };
        a_().a().b(0x7f1102b0, i).c();
        bundle = getIntent();
        if (bundle != null && bundle.hasExtra("auth_url") && bundle.hasExtra("success_url"))
        {
            j = bundle.getStringExtra("auth_url");
            k = bundle.getStringExtra("success_url");
            i.b(j);
            return;
        } else
        {
            d.a(this);
            return;
        }
    }

    public void onDestroy()
    {
        d.a();
        super.onDestroy();
    }
}

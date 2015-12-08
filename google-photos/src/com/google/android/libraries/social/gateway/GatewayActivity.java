// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.gateway;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import mmr;
import myc;
import myf;
import myi;
import mzz;
import naa;
import nab;
import nac;
import nad;
import nfw;
import olm;
import omr;

public final class GatewayActivity extends omr
    implements mzz
{

    private static myc f;
    private nfw g;
    private nac h;

    public GatewayActivity()
    {
        g = (new nfw(this, e)).a(d);
    }

    private void a(Intent intent, boolean flag)
    {
        if (((myf)olm.a(this, myf)).a(f, ((mmr)olm.a(this, mmr)).d()) && intent != null && (naa)olm.b(this, naa) != null)
        {
            String s = null;
            String s1 = intent.getDataString();
            if (s1 != null && s1.length() > 256)
            {
                s1.substring(0, 256);
            }
            if (!TextUtils.isEmpty(intent.getStringExtra("android.intent.extra.REFERRER_NAME")))
            {
                s = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
            } else
            if (!TextUtils.isEmpty(intent.getStringExtra("android.intent.extra.REFERRER")))
            {
                s = intent.getStringExtra("android.intent.extra.REFERRER").toString();
            }
            if (s == null || !s.contains("android-app:"))
            {
                intent.getStringExtra("com.android.browser.application_id");
                return;
            }
        }
    }

    public final void a(int i)
    {
        a(getIntent(), false);
        setResult(i);
        finish();
    }

    public final void a(Intent intent)
    {
        if (intent == null) goto _L2; else goto _L1
_L1:
        if (intent.getPackage() != null) goto _L4; else goto _L3
_L3:
        Object obj = getPackageManager().queryIntentActivities(intent, 0x10080);
        if (obj == null) goto _L6; else goto _L5
_L5:
        int i = 0;
_L13:
        if (i >= ((List) (obj)).size()) goto _L6; else goto _L7
_L7:
        ActivityInfo activityinfo;
        Bundle bundle;
        activityinfo = ((ResolveInfo)((List) (obj)).get(i)).activityInfo;
        bundle = activityinfo.metaData;
        if (bundle == null || !bundle.getBoolean("native_handler")) goto _L9; else goto _L8
_L8:
        obj = activityinfo.packageName;
_L11:
        if (obj != null)
        {
            intent.setPackage(((String) (obj)));
        }
_L4:
        intent.addFlags(0x2010000);
        for (obj = d.c(nad).iterator(); ((Iterator) (obj)).hasNext(); ((nad)((Iterator) (obj)).next()).a(getIntent(), intent)) { }
        break; /* Loop/switch isn't completed */
_L9:
        i++;
        continue; /* Loop/switch isn't completed */
_L6:
        obj = null;
        if (true) goto _L11; else goto _L10
_L10:
        Object obj1 = intent.getComponent();
        if (obj1 == null)
        {
            obj1 = "";
        } else
        {
            obj1 = ((ComponentName) (obj1)).flattenToShortString();
        }
        if ("com.google.android.apps.plus".equals(intent.getPackage()) || ((String) (obj1)).startsWith("com.google.android.apps.plus") && !((String) (obj1)).contains("sandbox"))
        {
            a(getIntent(), true);
        } else
        {
            a(getIntent(), false);
        }
        startActivity(intent);
        overridePendingTransition(0, 0);
_L2:
        finish();
        return;
        if (true) goto _L13; else goto _L12
_L12:
    }

    protected final void onCreate(Bundle bundle)
    {
        Object obj1;
        Object obj2;
        List list;
        int i;
        boolean flag;
        int j;
        obj1 = null;
        flag = false;
        super.onCreate(bundle);
        obj2 = getIntent();
        list = d.c(nab);
        j = list.size();
        i = 0;
_L17:
        if (i >= j) goto _L2; else goto _L1
_L1:
        Object obj = ((nab)list.get(i)).a(((Intent) (obj2)));
        if (obj == null) goto _L4; else goto _L3
_L3:
        h = ((nac) (obj));
        if (h != null) goto _L6; else goto _L5
_L5:
        a(getIntent(), false);
        obj = getIntent().getData();
        bundle = obj1;
        if (obj == null) goto _L8; else goto _L7
_L7:
        obj2 = getIntent().getStringExtra("viewerid");
        bundle = ((Bundle) (obj));
        if (obj2 != null)
        {
            bundle = ((Uri) (obj)).buildUpon();
            bundle.appendQueryParameter("viewerid", ((String) (obj2)));
            obj = getIntent().getStringExtra("effectiveid");
            if (obj != null)
            {
                bundle.appendQueryParameter("effectiveid", ((String) (obj)));
            }
            bundle = bundle.build();
        }
        obj = new Intent("android.intent.action.VIEW", bundle);
        ((Intent) (obj)).addFlags(0x80000);
        obj2 = getPackageManager().queryIntentActivities(((Intent) (obj)), 0x10000);
        bundle = obj1;
        if (obj2 == null) goto _L8; else goto _L9
_L9:
        i = ((flag) ? 1 : 0);
_L13:
        bundle = obj1;
        if (i >= ((List) (obj2)).size()) goto _L8; else goto _L10
_L10:
        bundle = ((ResolveInfo)((List) (obj2)).get(i)).activityInfo;
        if (bundle == null || getPackageName().equals(((ActivityInfo) (bundle)).packageName)) goto _L12; else goto _L11
_L11:
        ((Intent) (obj)).setComponent(new ComponentName(((ActivityInfo) (bundle)).packageName, ((ActivityInfo) (bundle)).name));
        bundle = ((Bundle) (obj));
_L8:
        a(bundle);
_L15:
        return;
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        obj = null;
          goto _L3
_L12:
        i++;
          goto _L13
_L6:
        h.a(this, e, this, g);
        if (bundle != null) goto _L15; else goto _L14
_L14:
        h.a();
        return;
        if (true) goto _L17; else goto _L16
_L16:
    }

    static 
    {
        f = new myc("debug.plus.deep_link_logging", "false", "9a19393", myi.b);
    }
}

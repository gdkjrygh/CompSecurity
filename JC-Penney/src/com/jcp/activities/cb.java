// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.content.res.Resources;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.jcp.JCP;
import com.jcp.b.a;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.http.b;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.util.aa;
import com.jcp.util.ae;
import com.jcp.util.au;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.List;

// Referenced classes of package com.jcp.activities:
//            ViewPagerWithZoomActivity

class cb extends AsyncTask
{

    final ViewPagerWithZoomActivity a;
    private String b;
    private String c;
    private int d;

    public cb(ViewPagerWithZoomActivity viewpagerwithzoomactivity, String s)
    {
        a = viewpagerwithzoomactivity;
        super();
        c = s;
    }

    protected transient Void a(Void avoid[])
    {
        try
        {
            avoid = JCP.k().newCall(com.jcp.http.b.a(c.trim())).execute();
            d = avoid.code();
            b = com.jcp.http.b.a(avoid);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            ae.a(ViewPagerWithZoomActivity.g(), "Exception while encoding the lProductDetailsAPI into url object : ", avoid);
            avoid.printStackTrace();
        }
        return null;
    }

    protected void a(Void void1)
    {
        if (!a.isFinishing())
        {
            com.jcp.b.a.i();
        }
        if (d != 200) goto _L2; else goto _L1
_L1:
        if (TextUtils.isEmpty(b)) goto _L4; else goto _L3
_L3:
        void1 = new InputStreamReader(new ByteArrayInputStream(b.getBytes()));
        com.jcp.activities.ViewPagerWithZoomActivity.a(a, (ProductEntityContainer)aa.a(void1, com/jcp/productentity/ProductEntityContainer));
        if (ViewPagerWithZoomActivity.c(a) == null) goto _L6; else goto _L5
_L5:
        if (ViewPagerWithZoomActivity.c(a).getOptions() != null)
        {
            com.jcp.activities.ViewPagerWithZoomActivity.a(a, ViewPagerWithZoomActivity.c(a).getOptions());
        }
        ViewPagerWithZoomActivity.h().clear();
        if (ViewPagerWithZoomActivity.c(a).getImages() != null)
        {
            com.jcp.activities.ViewPagerWithZoomActivity.a(a, true);
        }
_L8:
        return;
_L6:
        au.a(a, a.getResources().getString(0x7f0703c6), a.getResources().getString(0x7f0702b4));
        return;
_L4:
        au.a(a, a.getResources().getString(0x7f0703c6), a.getResources().getString(0x7f0702b4));
        return;
_L2:
        if (d >= 400)
        {
            if (!TextUtils.isEmpty(b))
            {
                void1 = com.jcp.f.a.a(b);
                if (void1 != null)
                {
                    au.a(a, a.getResources().getString(0x7f0703c6), void1.getErrorMessage());
                    return;
                }
            } else
            {
                au.a(a, a.getResources().getString(0x7f0703c6), a.getResources().getString(0x7f0702b4));
                return;
            }
        } else
        {
            au.a(a, a.getResources().getString(0x7f0702a6), a.getResources().getString(0x7f070120));
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        com.jcp.b.a.a(a, 0x7f070276);
    }
}

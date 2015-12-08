// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            c, cx, ct, dm, 
//            co, f, g

class e extends AsyncTask
{

    final dm a;
    final c b;

    e(c c1, dm dm1)
    {
        b = c1;
        a = dm1;
        super();
    }

    protected transient Boolean a(Void avoid[])
    {
        boolean flag;
        try
        {
            flag = c.e(b).a(b.a);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            ct.a(avoid);
            flag = false;
        }
        if (flag)
        {
            b.a.sendBroadcast(new Intent("android.intent.action.MEDIA_MOUNTED", Uri.parse((new StringBuilder()).append("file://").append(Environment.getExternalStorageDirectory()).toString())));
        }
        return Boolean.valueOf(flag);
    }

    protected void a(Boolean boolean1)
    {
        a.dismiss();
        co co1 = new co(b.a, b.c, co.a.a, new f(this));
        if (boolean1.booleanValue())
        {
            co1.a("The coupon has been saved to the gallery.");
            co1.setTitle("Save Complete");
        } else
        {
            co1.a("An error occurred while saving.");
            co1.setTitle("Save Error");
        }
        co1.a("Ok", "");
        co1.setOnDismissListener(new g(this));
        co1.show();
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }
}

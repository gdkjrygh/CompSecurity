// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//            aw

final class ax extends AsyncTask
{

    final String a;
    final Context b;
    final String c;

    ax(String s, Context context, String s1)
    {
        a = s;
        b = context;
        c = s1;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        return aw.f(a);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (JSONObject)obj;
        if (obj != null)
        {
            aw.a(a, ((JSONObject) (obj)));
            b.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).edit().putString(c, ((JSONObject) (obj)).toString()).apply();
        }
        aw.a();
    }
}

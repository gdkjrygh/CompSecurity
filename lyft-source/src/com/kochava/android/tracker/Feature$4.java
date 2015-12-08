// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.os.AsyncTask;
import android.util.Log;

// Referenced classes of package com.kochava.android.tracker:
//            Feature, Global

class a extends AsyncTask
{

    final Feature a;

    protected transient String a(Void avoid[])
    {
        avoid = null;
        String s = Feature.o(a);
        avoid = s;
_L2:
        return avoid;
        Error error;
        error;
        if (Global.b)
        {
            Log.e("KochavaTracker", "*****NOTICE***** \nAn error has occured when trying to gather the Google Advertising Id. Please make sure you have the Google Play Services Library integrated in your app! \n*****NOTICE*****");
            return null;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void a(String s)
    {
        Feature.d(s);
        if (Global.a)
        {
            Log.i("KochavaTracker", "ADID retrevial finished and gathered if available.");
        }
    }

    protected transient Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((String)obj);
    }

    (Feature feature)
    {
        a = feature;
        super();
    }
}

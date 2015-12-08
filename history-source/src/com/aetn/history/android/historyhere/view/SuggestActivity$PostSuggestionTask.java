// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.view;

import android.os.AsyncTask;
import android.util.Log;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.model.Configuration;
import com.aetn.history.android.historyhere.utils.Signing;
import com.aetn.history.android.historyhere.utils.Utils;
import com.localytics.android.LocalyticsAmpSession;
import java.util.Date;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

// Referenced classes of package com.aetn.history.android.historyhere.view:
//            SuggestActivity

private class <init> extends AsyncTask
{

    final SuggestActivity this$0;

    protected transient Boolean doInBackground(<init> a_3C_init>[])
    {
        int i = a_3C_init>.length;
        i = Math.round((new Date()).getTime() / 1000L);
        Object obj = a_3C_init>[0];
        Object obj1 = Signing.signRequestForSuggestAPlaceService(HistoryHereApplication.getConfiguration().suggestServiceHost, "/v1/suggestaplace/create?", "hh_android_3", "nd78tYq6e4", i);
        Utils.logger("SuggestActivity", (new StringBuilder()).append("PostSuggestionTask():finalRequestString: ").append(((String) (obj1))).toString());
        a_3C_init> = new DefaultHttpClient();
        HttpConnectionParams.setConnectionTimeout(a_3C_init>.getParams(), 10000);
        JSONObject jsonobject = new JSONObject();
        try
        {
            obj1 = new HttpPost(((String) (obj1)));
            jsonobject.put("lat", ((eService) (obj)).eService);
            jsonobject.put("lng", ((eService) (obj)).eService);
            jsonobject.put("placeName", ((eService) (obj)).eName);
            jsonobject.put("address", ((eName) (obj)).ess);
            jsonobject.put("city", ((ess) (obj)).);
            jsonobject.put("state", (() (obj)).e);
            jsonobject.put("zip", ((e) (obj)).e);
            jsonobject.put("historicalSignificance", ((e) (obj)).oricalSignificance);
            obj = new StringEntity(jsonobject.toString());
            Utils.logger("SuggestActivity", (new StringBuilder()).append("PostSuggestionTask():json.toString(): ").append(jsonobject.toString()).toString());
            ((StringEntity) (obj)).setContentType(new BasicHeader("Content-Type", "application/json"));
            ((HttpPost) (obj1)).setEntity(((org.apache.http.HttpEntity) (obj)));
            a_3C_init> = a_3C_init>.execute(((org.apache.http.client.methods.HttpUriRequest) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (<init> a_3C_init>[])
        {
            a_3C_init>.printStackTrace();
            Utils.logger("SuggestActivity", "PostSuggestionTask():ERROR: ");
            return Boolean.valueOf(false);
        }
        if (a_3C_init> == null)
        {
            break MISSING_BLOCK_LABEL_360;
        }
        a_3C_init> = EntityUtils.toString(a_3C_init>.getEntity(), "UTF-8");
        Log.i("SuggestActivity", (new StringBuilder()).append("sendJson() response:").append(a_3C_init>).toString());
        if (a_3C_init>.indexOf("OK") > -1)
        {
            Utils.logger("SuggestActivity", "PostSuggestionTask():SUCCESS: ");
            return Boolean.valueOf(true);
        }
        Utils.logger("SuggestActivity", "PostSuggestionTask():OOPS: ");
        return Boolean.valueOf(false);
        return Boolean.valueOf(true);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((doInBackground[])aobj);
    }

    protected void onPostExecute(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            Utils.logger("SuggestActivity", "PostSuggestionTask():onPostExecute:TRUE -- show success message: ");
            SuggestActivity.access$1300(SuggestActivity.this);
            SuggestActivity.access$1400(SuggestActivity.this).tagEvent("Submit Suggestion");
            return;
        } else
        {
            Utils.logger("SuggestActivity", "PostSuggestionTask():onPostExecute:TRUE -- show error message: ");
            SuggestActivity.access$1500(SuggestActivity.this);
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Boolean)obj);
    }

    protected transient void onProgressUpdate(Integer ainteger[])
    {
    }

    protected volatile void onProgressUpdate(Object aobj[])
    {
        onProgressUpdate((Integer[])aobj);
    }

    private ()
    {
        this$0 = SuggestActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}

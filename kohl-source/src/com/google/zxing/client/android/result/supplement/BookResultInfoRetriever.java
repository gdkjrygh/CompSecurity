// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result.supplement;

import android.content.Context;
import android.widget.TextView;
import com.google.zxing.client.android.HttpHelper;
import com.google.zxing.client.android.LocaleManager;
import com.google.zxing.client.android.history.HistoryManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.google.zxing.client.android.result.supplement:
//            SupplementalInfoRetriever

final class BookResultInfoRetriever extends SupplementalInfoRetriever
{

    private final Context context;
    private final String isbn;
    private final String source;

    BookResultInfoRetriever(TextView textview, String s, HistoryManager historymanager, Context context1)
    {
        super(textview, historymanager);
        isbn = s;
        source = context1.getString(com.google.zxing.client.android.R.string.msg_google_books);
        context = context1;
    }

    void retrieveSupplementalInfo()
        throws IOException
    {
        Object obj = HttpHelper.downloadViaHttp((new StringBuilder()).append("https://www.googleapis.com/books/v1/volumes?q=isbn:").append(isbn).toString(), com.google.zxing.client.android.HttpHelper.ContentType.JSON);
        if (((CharSequence) (obj)).length() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj1 = null;
        obj = ((JSONObject)(new JSONTokener(((CharSequence) (obj)).toString())).nextValue()).optJSONArray("items");
        if (obj == null) goto _L1; else goto _L3
_L3:
        if (((JSONArray) (obj)).isNull(0)) goto _L1; else goto _L4
_L4:
        obj = ((JSONObject)((JSONArray) (obj)).get(0)).getJSONObject("volumeInfo");
        if (obj == null) goto _L1; else goto _L5
_L5:
        String s;
        String s1;
        JSONArray jsonarray;
        s = ((JSONObject) (obj)).optString("title");
        s1 = ((JSONObject) (obj)).optString("pageCount");
        jsonarray = ((JSONObject) (obj)).optJSONArray("authors");
        obj = obj1;
        if (jsonarray == null) goto _L7; else goto _L6
_L6:
        obj = obj1;
        if (jsonarray.isNull(0)) goto _L7; else goto _L8
_L8:
        obj = new ArrayList(jsonarray.length());
        int i = 0;
_L9:
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        ((Collection) (obj)).add(jsonarray.getString(i));
        i++;
        if (true) goto _L9; else goto _L7
        obj;
_L11:
        throw new IOException(((Throwable) (obj)));
_L7:
        ArrayList arraylist = new ArrayList();
        maybeAddText(s, arraylist);
        maybeAddTextSeries(((Collection) (obj)), arraylist);
        if (s1 == null || s1.isEmpty())
        {
            obj = null;
        } else
        {
            obj = (new StringBuilder()).append(s1).append("pp.").toString();
        }
        maybeAddText(((String) (obj)), arraylist);
        obj = (new StringBuilder()).append("http://www.google.").append(LocaleManager.getBookSearchCountryTLD(context)).append("/search?tbm=bks&source=zxing&q=").toString();
        append(isbn, source, (String[])arraylist.toArray(new String[arraylist.size()]), (new StringBuilder()).append(((String) (obj))).append(isbn).toString());
        return;
        obj;
        if (true) goto _L11; else goto _L10
_L10:
    }
}

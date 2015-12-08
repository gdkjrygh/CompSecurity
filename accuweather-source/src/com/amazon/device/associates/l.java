// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.RemoteException;
import android.util.Log;
import com.amazon.venezia.command.SuccessResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.amazon.device.associates:
//            ao, SearchRequest, SortType, FilterType, 
//            SearchResponse, ay, x, aw, 
//            RequestId

final class l extends ao
{

    private static final String b = com/amazon/device/associates/l.getSimpleName();

    l(RequestId requestid, SearchRequest searchrequest, ay ay1)
    {
        super("physical_search", "1.0", requestid, ay1);
        a("category", searchrequest.getCategory());
        a("searchTerm", searchrequest.getSearchTerm());
        a("sortType", searchrequest.getSortType().toString());
        a("filters", a(searchrequest.getFilters()));
        a("page", Integer.toString(searchrequest.getPage()));
        a(false);
    }

    private static Map a(Map map)
    {
        if (map == null)
        {
            return null;
        }
        HashMap hashmap = new HashMap(map.size());
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            FilterType filtertype = (FilterType)entry.getKey();
            if (filtertype != null)
            {
                hashmap.put(filtertype.toString(), entry.getValue());
            }
        } while (true);
        return hashmap;
    }

    protected void a()
    {
        SearchResponse searchresponse = new SearchResponse(b(), SearchResponse.Status.NOT_SUPPORTED);
        a.a(ay.a.c, searchresponse);
    }

    protected void onSuccess(SuccessResult successresult)
        throws RemoteException
    {
        SearchResponse searchresponse;
        x.b(b, "onSuccess");
        searchresponse = new SearchResponse(b(), SearchResponse.Status.FAILED);
        SearchResponse.Status status;
        Object obj;
        successresult = successresult.getData();
        x.b(b, (new StringBuilder()).append("data: ").append(successresult).toString());
        if (successresult.containsKey("errorMessage"))
        {
            Log.e(b, (String)successresult.get("errorMessage"));
        }
        status = SearchResponse.Status.valueOf((String)successresult.get("requestStatus"));
        if (status != SearchResponse.Status.SUCCESSFUL)
        {
            break MISSING_BLOCK_LABEL_285;
        }
        obj = (String)successresult.get("userId");
        obj = new ArrayList();
        aw.c(new JSONArray((String)successresult.get("products")), ((java.util.Collection) (obj)));
_L1:
        int i = Integer.parseInt((String)successresult.get("page"));
        int j = Integer.parseInt((String)successresult.get("totalPages"));
        successresult = new SearchResponse(b(), status, ((java.util.List) (obj)), i, j);
_L2:
        a.a(ay.a.c, successresult);
        return;
        JSONException jsonexception;
        jsonexception;
        x.a(b, (new StringBuilder()).append("Error parsing JSON for products: ").append(jsonexception.getMessage()).toString());
          goto _L1
        try
        {
            successresult = new SearchResponse(b(), status);
        }
        // Misplaced declaration of an exception variable
        catch (SuccessResult successresult)
        {
            x.a(b, (new StringBuilder()).append("error in onSuccess: ").append(successresult.getMessage()).toString());
            successresult = searchresponse;
        }
          goto _L2
    }

}

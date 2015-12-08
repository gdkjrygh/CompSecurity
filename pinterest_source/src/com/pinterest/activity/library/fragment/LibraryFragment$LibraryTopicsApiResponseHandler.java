// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import com.pinterest.activity.library.adapter.LibraryAdapter;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.InterestsFeed;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.pinterest.activity.library.fragment:
//            LibraryFragment

public class _boardIds extends ApiResponseHandler
{

    private ArrayList _boardIds;
    final LibraryFragment this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        apiresponse = (PinterestJsonObject)apiresponse.getData();
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = _boardIds.iterator(); iterator.hasNext(); hashmap.put(s, new InterestsFeed(apiresponse.c(String.format("GET:/v3/boards/%s/interests/", new Object[] {
    s
})), "")))
        {
            s = (String)iterator.next();
        }

        ((LibraryAdapter)LibraryFragment.access$3500(LibraryFragment.this)).updateInterestsLists(hashmap);
    }

    public (ArrayList arraylist)
    {
        this$0 = LibraryFragment.this;
        super();
        _boardIds = arraylist;
    }
}

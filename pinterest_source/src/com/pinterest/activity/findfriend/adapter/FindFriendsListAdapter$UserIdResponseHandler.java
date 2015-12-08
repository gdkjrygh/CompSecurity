// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend.adapter;

import android.text.TextUtils;
import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.pinterest.activity.findfriend.adapter:
//            FindFriendsListAdapter

public class this._cls0 extends ApiResponseHandler
{

    protected Map emailToUserMap;
    final FindFriendsListAdapter this$0;

    public void onFinish()
    {
        super.onFinish();
        if (FindFriendsListAdapter.access$500(FindFriendsListAdapter.this).decrementAndGet() == 0)
        {
            notifyDataSetChanged();
        }
    }

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        super.onSuccess(pinterestjsonobject);
        pinterestjsonobject = pinterestjsonobject.c("data");
        if (pinterestjsonobject != null)
        {
            pinterestjsonobject = pinterestjsonobject.b().values().iterator();
            while (pinterestjsonobject.hasNext()) 
            {
                PinterestJsonObject pinterestjsonobject1 = ((PinterestJsonObject)pinterestjsonobject.next()).c("data");
                if (pinterestjsonobject1 != null)
                {
                    String s = pinterestjsonobject1.a("user_id", "");
                    String s1 = pinterestjsonobject1.a("email", "");
                    if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && emailToUserMap.containsKey(s1))
                    {
                        setPinterestDataOnContact(pinterestjsonobject1, s, s1);
                    }
                }
            }
        }
    }

    protected TypeAheadItem setPinterestDataOnContact(PinterestJsonObject pinterestjsonobject, String s, String s1)
    {
        s1 = (TypeAheadItem)emailToUserMap.get(s1);
        if (TextUtils.isEmpty(s1.getPinterestUid()))
        {
            s1.setPinterestUid(s);
            s1.setFollowedByMe(pinterestjsonobject.a("followed_by_me").booleanValue());
        }
        return s1;
    }

    protected ()
    {
        this$0 = FindFriendsListAdapter.this;
        super();
    }
}

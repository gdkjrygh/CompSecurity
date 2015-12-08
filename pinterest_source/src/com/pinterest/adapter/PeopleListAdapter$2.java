// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.User;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.pinterest.adapter:
//            PeopleListAdapter

class init> extends BaseApiResponseHandler
{

    final PeopleListAdapter this$0;

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        super.onSuccess(pinterestjsonobject);
        pinterestjsonobject = pinterestjsonobject.c("data");
        if (pinterestjsonobject == null)
        {
            return;
        }
        pinterestjsonobject = pinterestjsonobject.b().values().iterator();
        do
        {
            if (!pinterestjsonobject.hasNext())
            {
                break;
            }
            User user = User.make((PinterestJsonObject)pinterestjsonobject.next(), false);
            User user1 = (User)PeopleListAdapter.access$000(PeopleListAdapter.this).get(user.getUid());
            if (user1 != null)
            {
                user1.setExplicitFollowing(user.getExplicitFollowing());
                user1.setImplicitFollowing(user.getImplicitFollowing());
            }
        } while (true);
        notifyDataSetChanged();
    }

    ject()
    {
        this$0 = PeopleListAdapter.this;
        super();
    }
}

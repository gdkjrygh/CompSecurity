// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.model.Friend;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class lang.String extends mf
{

    final Jm this$0;
    final _cls0 val$onLoadListener;
    final String val$query;

    protected final void a(List list)
    {
        val$onLoadListener.a(val$query, list);
    }

    protected final void b(List list)
    {
        Jm jm = Jm.this;
        String s = val$query;
        ArrayList arraylist = new ArrayList();
        String s1;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); arraylist.add(s1))
        {
            Friend friend = (Friend)iterator.next();
            s1 = friend.mUserId;
            jm.mUserIdFriendMap.put(s1, friend);
        }

        jm.mQueryVerifiedUsersMap.put(s, arraylist);
        val$onLoadListener.a(val$query, list);
    }

    >(String s2)
    {
        this$0 = final_jm;
        val$query = String.this;
        val$onLoadListener = s2;
        super(final_s);
    }
}

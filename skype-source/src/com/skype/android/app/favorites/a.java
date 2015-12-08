// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.favorites;

import com.skype.Proptable;
import com.skype.ProptableImpl;
import com.skype.SkyLib;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.favorites:
//            Favorite, FavoriteNameComparator

final class a
    implements Callable
{

    private SkyLib lib;

    public a(SkyLib skylib)
    {
        lib = skylib;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    public final List call()
    {
        ProptableImpl proptableimpl = new ProptableImpl();
        lib.getConversationTable(com.skype.Conversation.LIST_TYPE.PINNED_CONVERSATIONS, Favorite.CONVERSATION_PROPKEYS, proptableimpl);
        int j = proptableimpl.getCount();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new Favorite(proptableimpl, i));
        }

        Collections.sort(arraylist, new FavoriteNameComparator());
        return arraylist;
    }
}

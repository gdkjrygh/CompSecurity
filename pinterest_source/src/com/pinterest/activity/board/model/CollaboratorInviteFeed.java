// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.model;

import com.pinterest.api.model.Board;
import com.pinterest.api.model.Feed;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.pinterest.activity.board.model:
//            CollaboratorInvite

public class CollaboratorInviteFeed extends Feed
{

    public CollaboratorInviteFeed()
    {
        super(null, null);
    }

    public CollaboratorInviteFeed(PinterestJsonObject pinterestjsonobject, String s, Board board, boolean flag)
    {
        super(pinterestjsonobject, s);
        s = Collections.emptyList();
        pinterestjsonobject = CollaboratorInvite.makeAll(pinterestjsonobject.e("data"));
        Object obj;
        obj = pinterestjsonobject;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj = pinterestjsonobject;
        if (board == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj = pinterestjsonobject;
        s = pinterestjsonobject;
        if (board.getUser() == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        s = pinterestjsonobject;
        obj = new CollaboratorInvite();
        s = pinterestjsonobject;
        ((CollaboratorInvite) (obj)).setInvitedUser(board.getUser());
        s = pinterestjsonobject;
        ((CollaboratorInvite) (obj)).setStatus(CollaboratorInvite.Status.OWNER);
        s = pinterestjsonobject;
        pinterestjsonobject.add(0, obj);
        obj = pinterestjsonobject;
_L2:
        setItems(((List) (obj)));
        return;
        pinterestjsonobject;
        obj = s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected List getPersistedItems()
    {
        return null;
    }
}
